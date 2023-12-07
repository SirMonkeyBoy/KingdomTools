package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixAxeSilk extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixAxeSilk";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix axe silk";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixAxeSilk";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixAxeSilk")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixAxeSilk);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
