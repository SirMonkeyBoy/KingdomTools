package me.sirmonkeyboy.kingdomtools.commands.GiveToolMSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.MythicalItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class MythicalAxeSilk extends SubCommand {
    @Override
    public String getName() {
        return "MythicalAxeSilk";
    }

    @Override
    public String getDescription() {
        return "Gives you a mythical axe silk";
    }

    @Override
    public String getSyntax() {
        return "/givetool MythicalAxeSilk";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.MythicalAxeSilk")){
            p.getInventory().addItem(MythicalItemManager.MythicalAxeSilk);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
