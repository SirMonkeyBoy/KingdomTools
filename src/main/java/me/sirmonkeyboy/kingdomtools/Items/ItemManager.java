package me.sirmonkeyboy.kingdomtools.Items;

import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

import static net.kyori.adventure.text.Component.*;

public class ItemManager {

    public static ItemStack phoenixpick;

    public static void init() {
        createPhoenixPick();
    }

    private static void createPhoenixPick() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pick").color(TextColor.color(0x0000AA)).decoration(TextDecoration.BOLD, true));
        mata.lore(Collections.singletonList(text("test").color(TextColor.color(0xAAAAAA))));
        item.setItemMeta(mata);
        item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 11);
        item.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
        item.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        phoenixpick = item;
    }
}