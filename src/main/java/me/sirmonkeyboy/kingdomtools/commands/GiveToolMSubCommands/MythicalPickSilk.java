package me.sirmonkeyboy.kingdomtools.commands.GiveToolMSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.MythicalItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class MythicalPickSilk extends SubCommand {
    @Override
    public String getName() {
        return "MythicalPickSilk";
    }

    @Override
    public String getDescription() {
        return "Gives you a mythical pick silk";
    }

    @Override
    public String getSyntax() {
        return "/givetool MythicalPickSilk";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.MythicalPickSilk")){
            if (args.length == 1) {
                p.getInventory().addItem(MythicalItemManager.MythicalPickSilk);
            }else {
                if (args.length == 2) {
                    Player targetPlayer = Bukkit.getPlayer(args[1]);

                    if (targetPlayer == null) {
                        p.sendMessage("Player not found or not online.");
                    }else {
                        targetPlayer.getInventory().addItem(MythicalItemManager.MythicalPickSilk);
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
