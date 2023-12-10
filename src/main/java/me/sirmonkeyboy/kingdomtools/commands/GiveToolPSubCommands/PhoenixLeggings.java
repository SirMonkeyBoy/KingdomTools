package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixLeggings extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixLeggings";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix leggings";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixLeggings";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixLeggings")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixPants);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
