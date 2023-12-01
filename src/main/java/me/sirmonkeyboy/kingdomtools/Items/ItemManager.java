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

import static net.kyori.adventure.text.Component.*;

public class ItemManager {

    public static ItemStack PhoenixPickSilk;
    public static ItemStack PhoenixPickFortune;

    static {
        createPhoenixPickSilk();
        createPhoenixPickFortune();
        createPhoenixShovelSilk();
    }

    private static void createPhoenixPickSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pick").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency XI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 12);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPickSilk = item;
    }

    private static void createPhoenixPickFortune() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pick").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency XI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fortune V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPickFortune = item;
    }

    private static void createPhoenixShovelSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Shovel").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency XI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 11);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH,1);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPickFortune = item;
    }
}