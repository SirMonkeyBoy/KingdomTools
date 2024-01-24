package me.sirmonkeyboy.kingdomtools.events;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.KingdomTools;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.bukkit.Bukkit.getServer;

public class PhoenixHoeListener implements Listener {
    private final KingdomTools plugin;

    public PhoenixHoeListener(KingdomTools plugin) {
        this.plugin = plugin;
    }
    private final Map<UUID, Boolean> autoReplantMap = new HashMap<>();
    private final Map<UUID, Material> cropToReplantMap = new HashMap<>();
    private final Map<UUID, Long> shiftRightClickCooldown = new HashMap<>();

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();

        // Check if the player has a Phoenix Hoe
        if (isPhoenixHoe(player.getInventory().getItemInMainHand())) {
            // Check if the broken block is a crop
            if (isCrop(block.getType())) {
                // Auto-replant the crop if auto-replant is enabled
                if (autoReplantMap.getOrDefault(player.getUniqueId(), false)) {
                    // Call autoReplant immediately for immediate replanting
                    autoReplant(block, player);
                }
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlockAgainst();

        // Check if the player has a Phoenix Hoe and is auto-replanting
        if (isPhoenixHoe(player.getInventory().getItemInMainHand()) &&
                autoReplantMap.getOrDefault(player.getUniqueId(), false)) {
            // Check if the block being placed is the one we want to replant
            if (cropToReplantMap.containsKey(player.getUniqueId()) &&
                    cropToReplantMap.get(player.getUniqueId()) == block.getType()) {
                cropToReplantMap.remove(player.getUniqueId()); // Reset the crop to replant

                // Schedule the replanting task with a delay
                getServer().getScheduler().runTaskLater(
                        JavaPlugin.getPlugin(KingdomTools.class),
                        () -> autoReplant(block, player),
                        1
                );
            }
        }
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        // Check if the player has a Phoenix Hoe
        if (isPhoenixHoe(player.getInventory().getItemInMainHand())) {
            // Toggle auto-replant on shift-right-click
            if (event.getAction().name().contains("RIGHT") && isSneaking(player)) {
                // Check if the player has the required permission
                if (player.hasPermission("KingdomTools.HoeAutoReplant")) {
                    if (canToggleAutoReplant(player.getUniqueId())) {
                        toggleAutoReplant(player.getUniqueId());
                        player.sendMessage("Auto-Replant: " + (autoReplantMap.getOrDefault(player.getUniqueId(), false) ? "Enabled" : "Disabled"));
                    }
                } else {
                    // Player does not have the required permission
                    player.sendMessage("You do not have permission to use auto-replant.");
                }
            }
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Remove player data on quit to prevent memory leaks
        UUID playerId = event.getPlayer().getUniqueId();
        autoReplantMap.remove(playerId);
        cropToReplantMap.remove(playerId);
        shiftRightClickCooldown.remove(playerId);
    }

    private void autoReplant(Block block, Player player) {
        Material cropType = getCropForHarvestedBlock(block.getType());
        Material seedType = getSeedForCrop(cropType);

        if (cropType != null && seedType != null) {
            // Deduct one seed from the player's inventory
            if (deductSeedFromInventory(player, seedType)) {
                // Clear drops from the block

                // Set the block to the planted state, considering block state
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        block.setType(cropType);
                    }
                }.runTaskLater(plugin, 1);
            }
        }
    }

    private boolean deductSeedFromInventory(Player player, Material seedType) {
        ItemStack seeds = new ItemStack(seedType, 1);
        // Check if the player has the seed before removing
        if (player.getInventory().containsAtLeast(seeds, 1)) {
            player.getInventory().removeItem(seeds);
            return true;
        }
        return false;
    }

    private Material getSeedForCrop(Material cropType) {
        // Retrieve the corresponding seed for the given crop type
        switch (cropType) {
            case WHEAT:
                return Material.WHEAT_SEEDS;
            case CARROTS:
                return Material.CARROT;
            case POTATOES:
                return Material.POTATO;
            // Add more cases for other crop types if needed
            default:
                return null;
        }
    }

    private boolean isCrop(Material material) {
        // Check if the material is a crop block
        return getCropForHarvestedBlock(material) != null;
    }

    private Material getCropForHarvestedBlock(Material harvestedBlock) {
        // Implement your mapping or logic to get the corresponding crop for the harvested block
        // For example, use a switch statement or a map
        switch (harvestedBlock) {
            case WHEAT:
            case CARROTS:
            case POTATOES:
                return harvestedBlock;
            default:
                return null;
        }
    }

    private boolean isPhoenixHoe(ItemStack item) {
        return item != null && (item.isSimilar(PhoenixItemManager.createPhoenixHoeFortune())
                || item.getType() == Material.NETHERITE_HOE
                || item.getType() == Material.DIAMOND_HOE);
    }

    private boolean isSneaking(Player player) {
        // Check if the player is sneaking
        return player.isSneaking();
    }

    private void toggleAutoReplant(UUID playerId) {
        // Toggle the auto-replant state for the player
        autoReplantMap.put(playerId, !autoReplantMap.getOrDefault(playerId, false));
    }

    private boolean canToggleAutoReplant(UUID playerId) {
        long lastToggleTime = shiftRightClickCooldown.getOrDefault(playerId, 0L);
        long currentTime = System.currentTimeMillis();
        long cooldownDuration = 500; // 0.5 seconds

        if (currentTime - lastToggleTime >= cooldownDuration) {
            shiftRightClickCooldown.put(playerId, currentTime);
            return true;
        }
        return false;
    }
}
