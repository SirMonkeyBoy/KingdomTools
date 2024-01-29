package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixShovelSilk extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixShovelSilk";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix shovel silk";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixShovelSilk";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixShovelSilk")){
            if (args.length == 1) {
                p.getInventory().addItem(PhoenixItemManager.PhoenixShovelSilk);
            }else {
                if (args.length == 2) {
                    Player targetPlayer = Bukkit.getPlayer(args[1]);

                    if (targetPlayer == null) {
                        p.sendMessage("Player not found or not online.");
                    }else {
                        targetPlayer.getInventory().addItem(PhoenixItemManager.PhoenixShovelSilk);
                    }
                }
            }
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
