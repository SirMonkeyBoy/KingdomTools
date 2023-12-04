package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.ItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixShovelSilk extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixShovelSilk";
    }

    @Override
    public String getDescription() {
        return "Gives you a silk phoenix shovel";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixShovelSilk";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixShovelSilk")){
            p.getInventory().addItem(ItemManager.PhoenixShovelSilk);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
