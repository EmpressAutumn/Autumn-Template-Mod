package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TitaniumItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Titanium.MOD_ID);

    public static final DeferredHolder<Item, Item> TITANIUM_SHOVEL_HOLDER = ITEMS.register("titanium_shovel", () -> TitaniumItems.TITANIUM_SHOVEL);
    public static final DeferredHolder<Item, Item> TITANIUM_SWORD_HOLDER = ITEMS.register("titanium_sword", () -> TitaniumItems.TITANIUM_SWORD);
    public static final DeferredHolder<Item, Item> TITANIUM_PICKAXE_HOLDER = ITEMS.register("titanium_pickaxe", () -> TitaniumItems.TITANIUM_PICKAXE);
    public static final DeferredHolder<Item, Item> TITANIUM_AXE_HOLDER = ITEMS.register("titanium_axe", () -> TitaniumItems.TITANIUM_AXE);
    public static final DeferredHolder<Item, Item> TITANIUM_HOE_HOLDER = ITEMS.register("titanium_hoe", () -> TitaniumItems.TITANIUM_HOE);
    public static final DeferredHolder<Item, Item> TITANIUM_HELMET_HOLDER = ITEMS.register("titanium_helmet", () -> TitaniumItems.TITANIUM_HELMET);
    public static final DeferredHolder<Item, Item> TITANIUM_CHESTPLATE_HOLDER = ITEMS.register("titanium_chestplate", () -> TitaniumItems.TITANIUM_CHESTPLATE);
    public static final DeferredHolder<Item, Item> TITANIUM_LEGGINGS_HOLDER = ITEMS.register("titanium_leggings", () -> TitaniumItems.TITANIUM_LEGGINGS);
    public static final DeferredHolder<Item, Item> TITANIUM_BOOTS_HOLDER = ITEMS.register("titanium_boots", () -> TitaniumItems.TITANIUM_BOOTS);
    public static final DeferredHolder<Item, Item> RAW_TITANIUM_HOLDER = ITEMS.register("raw_titanium", () -> TitaniumItems.RAW_TITANIUM);
    public static final DeferredHolder<Item, Item> TITANIUM_NUGGET_HOLDER = ITEMS.register("titanium_nugget", () -> TitaniumItems.TITANIUM_NUGGET);
    public static final DeferredHolder<Item, Item> TITANIUM_INGOT_HOLDER = ITEMS.register("titanium_ingot", () -> TitaniumItems.TITANIUM_INGOT);
    //public static final DeferredHolder<Item, Item> MUSIC_DISC_AMETHYST_HOLDER = ITEMS.register("music_disc_amethyst", () -> TitaniumItems.MUSIC_DISC_AMETHYST);
    public static final DeferredHolder<Item, Item> TITANIUM_HORSE_ARMOR_HOLDER = ITEMS.register("titanium_horse_armor", () -> TitaniumItems.TITANIUM_HORSE_ARMOR);
    public static final DeferredHolder<Item, Item> END_POWDER_HOLDER = ITEMS.register("end_powder", () -> TitaniumItems.END_POWDER);
    public static final DeferredHolder<Item, Item> FLIGHT_CHARGE_HOLDER = ITEMS.register("flight_charge", () -> TitaniumItems.FLIGHT_CHARGE);
    public static final DeferredHolder<Item, Item> TESTING_WAND_HOLDER = ITEMS.register("testing_wand", () -> TitaniumItems.TESTING_WAND);

    public static final DeferredHolder<Item, Item> TITANIUM_ORE_HOLDER = ITEMS.register("titanium_ore", () -> TitaniumItems.TITANIUM_ORE);
    public static final DeferredHolder<Item, Item> DEEPSLATE_TITANIUM_ORE_HOLDER = ITEMS.register("deepslate_titanium_ore", () -> TitaniumItems.DEEPSLATE_TITANIUM_ORE);
    public static final DeferredHolder<Item, Item> END_TITANIUM_ORE_HOLDER = ITEMS.register("end_titanium_ore", () -> TitaniumItems.END_TITANIUM_ORE);
    public static final DeferredHolder<Item, Item> RAW_TITANIUM_BLOCK_HOLDER = ITEMS.register("raw_titanium_block", () -> TitaniumItems.RAW_TITANIUM_BLOCK);
    public static final DeferredHolder<Item, Item> TITANIUM_BLOCK_HOLDER = ITEMS.register("titanium_block", () -> TitaniumItems.TITANIUM_BLOCK);
    //public static final DeferredHolder<Item, Item> TITANIUM_LANTERN_HOLDER = ITEM_REGISTRY.register("titanium_lantern", () -> TitaniumItems.TITANIUM_LANTERN);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
