package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.PhoenixItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;
import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixElytra extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixElytra";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix elytra";
    }

    @Override
    public String getSyntax() {
        return "/givetool PhoenixElytra";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.PhoenixElytra")){
            p.getInventory().addItem(PhoenixItemManager.PhoenixElytra);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
