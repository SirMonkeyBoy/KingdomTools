package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;
import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixBoots extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixBoots";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix boots";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixBoots";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixBoots")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixBoots);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
