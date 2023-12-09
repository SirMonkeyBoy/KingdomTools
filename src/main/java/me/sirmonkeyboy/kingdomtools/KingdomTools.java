package me.sirmonkeyboy.kingdomtools;

import me.sirmonkeyboy.kingdomtools.commands.GiveToolPCommand;
import me.sirmonkeyboy.kingdomtools.commands.KingdomTool;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class KingdomTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("KingdomTools")).setExecutor(new KingdomTool(this));
        Objects.requireNonNull(getCommand("givetoolP")).setExecutor(new GiveToolPCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
