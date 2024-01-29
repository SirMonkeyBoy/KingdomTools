package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixBow extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixBow";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix bow";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixBow";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixBow")){
            if (args.length == 1) {
                p.getInventory().addItem(PhoenixItemManager.PhoenixBow);
            }else {
                if (args.length == 2) {
                    Player targetPlayer = Bukkit.getPlayer(args[1]);

                    if (targetPlayer == null) {
                        p.sendMessage("Player not found or not online.");
                    }else {
                        targetPlayer.getInventory().addItem(PhoenixItemManager.PhoenixBow);
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
