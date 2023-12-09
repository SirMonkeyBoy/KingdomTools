package me.sirmonkeyboy.kingdomtools.commands.GiveToolMSubCommands;

import me.sirmonkeyboy.kingdomtools.Items.MythicalItemManager;
import me.sirmonkeyboy.kingdomtools.commands.SubCommand;

import org.bukkit.entity.Player;

import java.util.List;

public class MythicalPickFortune extends SubCommand {
    @Override
    public String getName() {
        return "MythicalPickFortune";
    }

    @Override
    public String getDescription() {
        return "Gives you a mythical pick fortune";
    }

    @Override
    public String getSyntax() {
        return "/givetool MythicalPickFortune";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.giveTools.MythicalPickFortune")){
            p.getInventory().addItem(MythicalItemManager.MythicalPickFortune);
        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
