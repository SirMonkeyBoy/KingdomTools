package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixHoeFortune extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixHoeFortune";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix hoe fortune";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixHoeFortune";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixHoeFortune")){
            if (args.length == 1) {
                p.getInventory().addItem(PhoenixItemManager.PhoenixHoeFortune);
            }else {
                if (args.length == 2) {
                    Player targetPlayer = Bukkit.getPlayer(args[1]);

                    if (targetPlayer == null) {
                        p.sendMessage("Player not found or not online.");
                    }else {
                        targetPlayer.getInventory().addItem(PhoenixItemManager.PhoenixHoeFortune);
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
