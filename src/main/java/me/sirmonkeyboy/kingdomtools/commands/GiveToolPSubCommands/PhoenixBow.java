package me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

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
            p.getInventory().addItem(PhoenixItemManager.PhoenixBow);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
