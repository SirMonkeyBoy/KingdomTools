package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixAxe extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixAxeCombat";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix axe combat";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixAxeCombat";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixAxeCombat")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixAxe);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
