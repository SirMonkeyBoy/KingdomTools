package me.sirmonkeyboy.kingdomtools.commands.GiveToolMSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.MythicalItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class MythicalSword extends SubCommand {
    @Override
    public String getName() {
        return "MythicalSword";
    }

    @Override
    public String getDescription() {
        return "Gives you a mythical sword";
    }

    @Override
    public String getSyntax() {
        return "/givetool MythicalSword";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.MythicalSword")){
            p.getInventory().addItem(MythicalItemManager.MythicalSword);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
