package me.sirmonkeyboy.kingdomtools.commands;

import org.bukkit.entity.Player;

import java.util.List;

public abstract class SubCommand {

    public abstract String getName();

    public abstract String getDescription();

    public abstract String getSyntax();

    public abstract void perform(Player p, String args[]);

    public abstract List<String> getSubCommandArguments(Player p, String args[]);

}