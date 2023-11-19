package me.sirmonkeyboy.kingdomtools.commands.GiveToolSubcommands;

import me.sirmonkeyboy.kingdomtools.commands.SubCommand;
import org.bukkit.entity.Player;

import java.util.List;

public class PhoenixPick extends SubCommand {
    @Override
    public String getName() {
        return "PhoenixPick";
    }

    @Override
    public String getDescription() {
        return "Gives you a phoenix pick";
    }

    @Override
    public String getSyntax() {
        return "/givetool phoenixpick";
    }

    @Override
    public void perform(Player p, String[] args) {
        if (p.hasPermission("KingdomTools.command.GiveTools.PhoenixPick")){

        }
    }

    @Override
    public List<String> getSubCommandArguments(Player p, String[] args) {
        return null;
    }
}
