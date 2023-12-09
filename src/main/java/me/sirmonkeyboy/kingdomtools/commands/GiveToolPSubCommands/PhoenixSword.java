package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixSword extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixSword";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix sword";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixSword";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixSword")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixSword);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
