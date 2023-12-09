package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixRod extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixRod";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix rod";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixRod";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixRod")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixRod);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
