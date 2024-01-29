package me.sirmonkeyboy.kingdomtools.commands.GiveToolMSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.MythicalItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class MythicalShovelSilk extends SubCommand {
    @Override
    public String getName() {
        return "MythicalShovelSilk";
    }

    @Override
    public String getDescription() {
        return "Gives you a mythical shovel silk";
    }

    @Override
    public String getSyntax() {
        return "/givetool MythicalShovelSilk";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.MythicalShovelSilk")){
            if (args.length == 1) {
                p.getInventory().addItem(MythicalItemManager.MythicalShovelSilk);
            }else {
                if (args.length == 2) {
                    Player targetPlayer = Bukkit.getPlayer(args[1]);

                    if (targetPlayer == null) {
                        p.sendMessage("Player not found or not online.");
                    }else {
                        targetPlayer.getInventory().addItem(MythicalItemManager.MythicalShovelSilk);
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
