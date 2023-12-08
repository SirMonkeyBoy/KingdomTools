package me.sirmonkeyboy.kingdomtools;

import me.sirmonkeyboy.kingdomtools.commands.GiveToolCommand;
import me.sirmonkeyboy.kingdomtools.commands.KingdomTool;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class KingdomTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("KingdomTools")).setExecutor(new KingdomTool(this));
        Objects.requireNonNull(getCommand("givetool")).setExecutor(new GiveToolCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
