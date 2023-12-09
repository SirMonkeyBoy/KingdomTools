package me.sirmonkeyboy.kingdomtools.commands;

import me.sirmonkeyboy.kingdomtools.commands.GiveToolPSubCommands.*;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;


public class GiveToolPCommand implements TabExecutor {

    // I would like to credit the person who made this command manager, but I can't find them.
    // it might be this https://www.youtube.com/watch?v=WyFN_jTS4nU&list=PLfu_Bpi_zcDNEKmR82hnbv9UxQ16nUBF7&index=61 one,
    // but it doesn't have the tab complete.

    private ArrayList<SubCommand> subcommands = new ArrayList<>();

    public GiveToolPCommand(){
        //Tools
        subcommands.add(new PhoenixPickSilk());
        subcommands.add(new PhoenixPickFortune());
        subcommands.add(new PhoenixShovelSilk());
        subcommands.add(new PhoenixAxeSilk());
        subcommands.add(new PhoenixAxeCombat());
        subcommands.add(new PhoenixSword());
        subcommands.add(new PhoenixRod());
        subcommands.add(new PhoenixHoeFortune());
        subcommands.add(new PhoenixBow());
        //Armor
        subcommands.add(new PhoenixHelmet());
        subcommands.add(new PhoenixElytra());
        subcommands.add(new PhoenixLeggings());
        subcommands.add(new PhoenixBoots());
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(sender instanceof Player p) {
            if (p.hasPermission("KingdomTools.commands.giveTools")) {
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
            }else if (!p.hasPermission("KingdomTools.commands.giveTools")){
                p.sendMessage(Component.text("You Don't have permission to use this command").color(TextColor.color(0xAA0000)));
            }
        }else if (sender instanceof  ConsoleCommandSender c){
            c.sendMessage(Component.text("Console can't run this command").color(TextColor.color(0xAA0000)));
        }else if (sender instanceof BlockCommandSender cb){
            ConsoleCommandSender c = org.bukkit.Bukkit.getServer().getConsoleSender();
            cb.sendMessage(Component.text("Command Blocks can't run this command").color(TextColor.color(0xAA0000)));
            c.sendMessage(Component.text("Command Blocks can't run giveTools").color(TextColor.color(0xAA0000)));
        }
        return true;
    }

    public ArrayList<SubCommand> getSubcommands(){
        return subcommands;
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