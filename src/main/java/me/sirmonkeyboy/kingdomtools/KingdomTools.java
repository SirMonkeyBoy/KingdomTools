package me.sirmonkeyboy.kingdomtools;

import me.sirmonkeyboy.kingdomtools.Items.ItemManager;
import me.sirmonkeyboy.kingdomtools.commands.GiveToolCommand;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class KingdomTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemManager.init();
        Objects.requireNonNull(getCommand("givetool")).setExecutor(new GiveToolCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
