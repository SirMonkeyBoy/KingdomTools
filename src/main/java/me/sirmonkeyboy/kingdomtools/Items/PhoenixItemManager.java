package me.sirmonkeyboy.kingdomtools.Items;

import me.sirmonkeyboy.kingdomtools.KingdomTools;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

import static net.kyori.adventure.text.Component.*;

public class PhoenixItemManager {

    private static final KingdomTools plugin = KingdomTools.getPluginInstance();


    //Tools

    public static ItemStack PhoenixPickSilk;

    public static ItemStack PhoenixPickFortune;

    public static ItemStack PhoenixShovelSilk;

    public static ItemStack PhoenixAxe;

    public static ItemStack PhoenixSword;

    public static ItemStack PhoenixBow;

    public static ItemStack PhoenixRod;

    public static ItemStack PhoenixHoeFortune;

    static {
        createPhoenixPickSilk();
        createPhoenixPickFortune();
        createPhoenixShovelSilk();
        createPhoenixAxe();
        createPhoenixSword();
        createPhoenixBow();
        createPhoenixRod();
        createPhoenixHoeFortune();
    }

    //Armor

    public static ItemStack PhoenixHelmet;

    public static ItemStack PhoenixElytra;

    public static ItemStack PhoenixPants;

    public static ItemStack PhoenixBoots;

    static {
        createPhoenixHelmet();
        createPhoenixElytra();
        createPhoenixPants();
        createPhoenixBoots();
    }

    private static void createPhoenixPickSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pick").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("XI").color(TextColor.color(0x007CFF))));
        lore.add(text("Silk Touch").color(TextColor.color(0x555555)));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 12);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPickSilk = item;
    }

    private static void createPhoenixPickFortune() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pick").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("XI").color(TextColor.color(0x007CFF))));
        lore.add(text("Fortune ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 11);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPickFortune = item;
    }

    private static void createPhoenixShovelSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Shovel").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("X").color(TextColor.color(0x007CFF))));
        lore.add(text("Silk Touch").color(TextColor.color(0x555555)));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH,1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixShovelSilk = item;
    }

    private static void createPhoenixAxe(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Axe").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Sharpness ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0x007CFF))));
        lore.add(text("Smite ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0x007CFF))));
        lore.add(text("Bane of Arthropods ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0x007CFF))));
        lore.add(text("Looting ").color(TextColor.color(0x555555)).append(text("VI").color(TextColor.color(0x007CFF))));
        lore.add(text("Sweeping Edge ").color(TextColor.color(0x555555)).append(text("III").color(TextColor.color(0x007CFF))));
        lore.add(text("Knockback ").color(TextColor.color(0x555555)).append(text("II").color(TextColor.color(0x007CFF))));
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("X").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,7);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6);
        item.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
        item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixAxe = item;
    }

    private static void createPhoenixSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Sword").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Sharpness ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0x007CFF))));
        lore.add(text("Smite ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0x007CFF))));
        lore.add(text("Bane of Arthropods ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0x007CFF))));
        lore.add(text("Looting ").color(TextColor.color(0x555555)).append(text("VI").color(TextColor.color(0x007CFF))));
        lore.add(text("Sweeping Edge ").color(TextColor.color(0x555555)).append(text("III").color(TextColor.color(0x007CFF))));
        lore.add(text("Knockback ").color(TextColor.color(0x555555)).append(text("II").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,7);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6);
        item.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
        item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixSword = item;
    }

    private static void createPhoenixBow() {
        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Bow").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Infinity").color(TextColor.color(0x555555)));
        lore.add(text("Power ").color(TextColor.color(0x555555)).append(text("VI").color(TextColor.color(0x007CFF))));
        lore.add(text("Punch ").color(TextColor.color(0x555555)).append(text("III").color(TextColor.color(0x007CFF))));
        lore.add(text("Looting ").color(TextColor.color(0x555555)).append(text("VI").color(TextColor.color(0x007CFF))));
        lore.add(text("Flame").color(TextColor.color(0x555555)));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 5);
        item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6);
        item.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 3);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS,6);
        item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixBow = item;
    }

    private static void createPhoenixRod() {
        ItemStack item = new ItemStack(Material.FISHING_ROD);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Rod").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Lure ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Luck of the Sea ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.LURE, 5);
        item.addUnsafeEnchantment(Enchantment.LUCK,5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixRod = item;
    }

    public static void createPhoenixHoeFortune() {
        ItemStack item = new ItemStack(Material.DIAMOND_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Hoe").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Fortune ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        meta.lore(lore);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "AutoReplant"), PersistentDataType.BYTE, (byte) 0);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        PhoenixHoeFortune = item;
    }

    private static void createPhoenixHelmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Helmet").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Aqua Affinity ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Blast Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Fire Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Projectile Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Respiration ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.WATER_WORKER, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.OXYGEN, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixHelmet = item;
    }

    private static void createPhoenixElytra() {
        ItemStack item = new ItemStack(Material.ELYTRA);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Elytra").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Blast Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Fire Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Projectile Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixElytra = item;
    }

    private static void createPhoenixPants() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Pants").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Blast Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Fire Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Projectile Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPants = item;
    }

    private static void createPhoenixBoots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Boots").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Blast Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Fire Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Projectile Protection ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Feather Falling ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0x007CFF))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0x007CFF)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixBoots = item;
    }
}