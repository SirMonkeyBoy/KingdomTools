package me.sirmonkeyboy.kingdomtools;

import me.sirmonkeyboy.kingdomtools.commands.GiveToolMCommand;
import me.sirmonkeyboy.kingdomtools.commands.GiveToolPCommand;
import me.sirmonkeyboy.kingdomtools.commands.KingdomTool;
import me.sirmonkeyboy.kingdomtools.events.PhoenixHoeListener;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class KingdomTools extends JavaPlugin {
    private static KingdomTools pluginInstance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        pluginInstance = this;
        Objects.requireNonNull(getCommand("KingdomTools")).setExecutor(new KingdomTool(this));
        Objects.requireNonNull(getCommand("givetoolp")).setExecutor(new GiveToolPCommand());
        Objects.requireNonNull(getCommand("givetoolm")).setExecutor(new GiveToolMCommand());
        getServer().getPluginManager().registerEvents(new PhoenixHoeListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static KingdomTools getPluginInstance() {
        return pluginInstance;
    }
}
