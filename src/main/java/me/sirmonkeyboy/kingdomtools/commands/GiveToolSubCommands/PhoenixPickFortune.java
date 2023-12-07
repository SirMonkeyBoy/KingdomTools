package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixPickFortune extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixPickFortune";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix pick fortune";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixPickFortune";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixPickFortune")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixPickFortune);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
