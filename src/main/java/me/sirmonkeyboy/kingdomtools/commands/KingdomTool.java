package me.sirmonkeyboy.kingdomtools.commands;

import me.sirmonkeyboy.kingdomtools.KingdomTools;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.jetbrains.annotations.NotNull;

public class KingdomTool implements CommandExecutor {

    private final KingdomTools plugin;

    public KingdomTool(KingdomTools plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        var mm = MiniMessage.miniMessage();
        if (sender instanceof Player p) {
            String version = plugin.getPluginMeta().getVersion();
            Component l1 = mm.deserialize("About KingdomTools");
            Component l2 = mm.deserialize("Version " + version);
            p.sendMessage(l1);
            p.sendMessage(l2);
        }else {
            sender.sendMessage("Only a Player can use this");
        }

        return true;
    }
}
