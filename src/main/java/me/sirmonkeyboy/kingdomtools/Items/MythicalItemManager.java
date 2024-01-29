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

    public static ItemStack MythicalSword;

    static {
        createMythicalPickSilk();
        createMythicalPickFortune();
        createMythicalShovelSilk();
        createMythicalAxeSilk();
        createMythicalSword();
    }

    private static void createMythicalPickSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Mythical Pick").color(TextColor.color(0xAA0000)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0xAF0000))));
        lore.add(text("Silk Touch").color(TextColor.color(0x555555)));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0xAF0000)));
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
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0xAF0000))));
        lore.add(text("Fortune ").color(TextColor.color(0x555555)).append(text("IV").color(TextColor.color(0xAF0000))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0xAF0000)));
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
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("VII").color(TextColor.color(0xAF0000))));
        lore.add(text("Silk Touch").color(TextColor.color(0x555555)));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0xAF0000)));
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
        lore.add(text("Efficiency ").color(TextColor.color(0x555555)).append(text("X").color(TextColor.color(0xAF0000))));
        lore.add(text("Silk Touch").color(TextColor.color(0x555555)));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0xAF0000)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH,1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
       MythicalAxeSilk = item;
    }

    private static void createMythicalSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Mythical Sword").color(TextColor.color(0xAA0000)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Sharpness ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("Smite ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("Bane of Arthropods ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("Looting ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("Sweeping Edge ").color(TextColor.color(0x555555)).append(text("III").color(TextColor.color(0xAF0000))));
        lore.add(text("Knockback ").color(TextColor.color(0x555555)).append(text("II").color(TextColor.color(0xAF0000))));
        lore.add(text("Mending").color(TextColor.color(0x555555)));
        lore.add(text("Unbreaking ").color(TextColor.color(0x555555)).append(text("V").color(TextColor.color(0xAF0000))));
        lore.add(text("").color(TextColor.color(0x555555)));
        lore.add(text("v1").color(TextColor.color(0xAF0000)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 5);
        item.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
        item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        MythicalSword = item;
    }
}