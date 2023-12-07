package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

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
            p.getInventory().addItem(PhoenixItemManager.PhoenixHoeFortune);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
