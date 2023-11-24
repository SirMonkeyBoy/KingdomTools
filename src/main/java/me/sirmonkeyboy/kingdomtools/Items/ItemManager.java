package me.sirmonkeyboy.kingdomtools.Items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import static net.kyori.adventure.text.Component.*;

public class ItemManager {

    public static ItemStack phoenixpick;

    public static void init() {
        createPhoenixPick();
    }

    private static void createPhoenixPick() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta mata = item.getItemMeta();
        mata.displayName(text("Phoenix Pickaxe"));
        item.setItemMeta(mata);
        phoenixpick = item;
    }
}