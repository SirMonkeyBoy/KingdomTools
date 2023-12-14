package me.sirmonkeyboy.kingdomtools.Items;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static net.kyori.adventure.text.Component.text;

public class MythicalItemManager {

    //Tools
    public static ItemStack MythicalPickSilk;

    public static ItemStack MythicalPickFortune;

    public static ItemStack MythicalShovelSilk;

    public static ItemStack MythicalAxeSilk;

    static {
        createMythicalPickSilk();
        createMythicalPickFortune();
        createMythicalShovelSilk();
        createMythicalAxeSilk();
    }

    private static void createMythicalPickSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Mythical Pick").color(TextColor.color(0xAA0000)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 7);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        MythicalPickSilk = item;
    }

    private static void createMythicalPickFortune() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Mythical Pick").color(TextColor.color(0xAA0000)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fortune IV").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 7);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 4);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        MythicalPickFortune = item;
    }
    private static void createMythicalShovelSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Mythical Shovel").color(TextColor.color(0xAA0000)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 7);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH,1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        MythicalShovelSilk = item;
    }

    private static void createMythicalAxeSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Mythical Axe").color(TextColor.color(0xAA0000)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency X").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH,1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
       MythicalAxeSilk = item;
    }
}