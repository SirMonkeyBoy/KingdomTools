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

public class PhoenixItemManager {

    //Tools

    public static ItemStack PhoenixPickSilk;

    public static ItemStack PhoenixPickFortune;

    public static ItemStack PhoenixShovelSilk;

    public static ItemStack PhoenixAxe;

    public static ItemStack PhoenixSword;

    public static ItemStack PhoenixBow;

    public static ItemStack PhoenixRod;

    public static ItemStack PhoenixHoeFortune;

    static {
        createPhoenixPickSilk();
        createPhoenixPickFortune();
        createPhoenixShovelSilk();
        createPhoenixAxe();
        createPhoenixSword();
        createPhoenixBow();
        createPhoenixRod();
        createPhoenixHoeFortune();
    }

    //Armor

    public static ItemStack PhoenixHelmet;

    public static ItemStack PhoenixElytra;

    public static ItemStack PhoenixPants;

    public static ItemStack PhoenixBoots;

    static {
        createPhoenixHelmet();
        createPhoenixElytra();
        createPhoenixPants();
        createPhoenixBoots();
    }

    private static void createPhoenixPickSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pick").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency XI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 12);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
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
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 11);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPickFortune = item;
    }

    private static void createPhoenixShovelSilk() {
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Shovel").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
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
        PhoenixShovelSilk = item;
    }

    private static void createPhoenixAxe(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Axe").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Sharpness VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Smite V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Bane of Arthropods V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Looting VI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Sweeping Edge III").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Knockback II").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Efficiency X").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Silk Touch").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6);
        item.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
        item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixAxe = item;
    }

    private static void createPhoenixSword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Sword").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Sharpness VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Smite VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Bane of Arthropods VII").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Looting VI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Sweeping Edge III").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Knockback II").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 7);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,7);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6);
        item.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
        item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixSword = item;
    }

    private static void createPhoenixBow() {
        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Bow").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Infinity").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Power VI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Punch III").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Looting VI").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Flame").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 5);
        item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6);
        item.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 3);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS,6);
        item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixBow = item;
    }

    private static void createPhoenixRod() {
        ItemStack item = new ItemStack(Material.FISHING_ROD);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Rod").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Lure V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Luck of the Sea V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.LURE, 5);
        item.addUnsafeEnchantment(Enchantment.LUCK,5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixRod = item;
    }

    private static void createPhoenixHoeFortune() {
        ItemStack item = new ItemStack(Material.DIAMOND_HOE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Hoe").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Efficiency V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fortune V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        mata.lore(lore);
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixHoeFortune = item;
    }

    private static void createPhoenixHelmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Helmet").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Aqua Affinity V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Blast Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fire Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Projectile Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Respiration V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.WATER_WORKER, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.OXYGEN, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixHelmet = item;
    }

    private static void createPhoenixElytra() {
        ItemStack item = new ItemStack(Material.ELYTRA);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Elytra").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Blast Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fire Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Projectile Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixElytra = item;
    }

    private static void createPhoenixPants() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Pants").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Blast Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fire Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Projectile Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixPants = item;
    }

    private static void createPhoenixBoots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("Phoenix Boots").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        ArrayList<Component> lore = new ArrayList<>();
        lore.add(text("Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Blast Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Fire Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Projectile Protection V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Feather Falling V").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Mending").color(TextColor.color(0xAAAAAA)));
        lore.add(text("Unbreaking V").color(TextColor.color(0xAAAAAA)));
        meta.lore(lore);
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 5);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 5);
        item.addUnsafeEnchantment(Enchantment.MENDING, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        PhoenixBoots = item;
    }
}