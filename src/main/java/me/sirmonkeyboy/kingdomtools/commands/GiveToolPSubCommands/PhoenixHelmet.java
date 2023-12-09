package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixHelmet extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixHelmet";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix helmet";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixHelmet";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixHelmet")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixHelmet);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
