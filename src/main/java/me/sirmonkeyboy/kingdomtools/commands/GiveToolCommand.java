package me.sirmonkeyboy.kingdomtools.commands;

import me.sirmonkeyboy.kingdomtools.KingdomTools;
import me.sirmonkeyboy.kingdomtools.commands.GiveToolSubcommands.PhoenixPick;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.ChatColor.translateAlternateColorCodes;

public class GiveToolCommand implements TabExecutor {

    @SuppressWarnings("FieldCanBeLocal")
    private final KingdomTools plugin;
    private ArrayList<SubCommand> rankupsubcommands = new ArrayList<>();

    public GiveToolCommand(KingdomTools plugin){
        this.plugin = plugin;
        rankupsubcommands.add(new PhoenixPick());
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(sender instanceof Player p) {
            if (p.hasPermission("GoldenKingdomUtils.commands.Rankup")) {
                if (args.length > 0) {
                    for (int i = 0; i < getSubcommands().size(); i++) {
                        if (args[0].equalsIgnoreCase(getSubcommands().get(i).getName())) {
                            getSubcommands().get(i).perform(p, args);
                        }
                    }
                } else //noinspection ConstantValue
                    if (args.length == 0) {
                        for (int i = 0; i < getSubcommands().size(); i++) {
                            p.sendMessage(getSubcommands().get(i).getSyntax() + " - " + getSubcommands().get(i).getDescription());
                        }
                    }
            }
        }else if (sender instanceof  ConsoleCommandSender c){
            c.sendMessage(translateAlternateColorCodes('&', "&cConsole can't run this command"));
        }else if (sender instanceof BlockCommandSender){
            ConsoleCommandSender c = org.bukkit.Bukkit.getServer().getConsoleSender();
            c.sendMessage(translateAlternateColorCodes('&', "&cCommand Blocks can't run this command"));
        }
        return true;
    }

    public ArrayList<SubCommand> getSubcommands(){
        return rankupsubcommands;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (args.length == 1) {
            ArrayList<String> subcommandArguments = new ArrayList<>();

            for (int i = 0; i < getSubcommands().size(); i++){
                subcommandArguments.add(getSubcommands().get(i).getName());
            }
            return subcommandArguments;
        }else if (args.length >= 2){
            for (int i = 0; i < getSubcommands().size(); i++) {
                if (args[0].equalsIgnoreCase(getSubcommands().get(i).getName())) {
                    return getSubcommands().get(i).getSubCommandArguments((Player) sender, args);
                }
            }
        }
        return null;
    }
}
