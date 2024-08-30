package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItemGroup;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class TitaniumItemGroupRegistry {
    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Titanium.MOD_ID, "titanium_group"), TitaniumItemGroup.TITANIUM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumBlocks.TITANIUM_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> {
            content.addAfter(Items.DEEPSLATE_GOLD_ORE, TitaniumBlocks.TITANIUM_ORE);
            content.addAfter(TitaniumBlocks.TITANIUM_ORE, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
            content.addAfter(Items.NETHER_QUARTZ_ORE, TitaniumBlocks.END_TITANIUM_ORE);
            content.addAfter(Items.RAW_GOLD_BLOCK, TitaniumBlocks.RAW_TITANIUM_BLOCK);
        });
        /*ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> {
            content.addAfter(Items.LANTERN, TitaniumBlocks.TITANIUM_LANTERN);
        });*/
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> {
            content.addAfter(Items.GOLDEN_HOE, TitaniumItems.TITANIUM_SHOVEL);
            content.addAfter(TitaniumItems.TITANIUM_SHOVEL, TitaniumItems.TITANIUM_PICKAXE);
            content.addAfter(TitaniumItems.TITANIUM_PICKAXE, TitaniumItems.TITANIUM_AXE);
            content.addAfter(TitaniumItems.TITANIUM_AXE, TitaniumItems.TITANIUM_HOE);
            content.addAfter(Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE);
            //content.addAfter(Items.MUSIC_DISC_PIGSTEP, TitaniumItems.MUSIC_DISC_AMETHYST);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> {
            content.addAfter(Items.GOLDEN_SWORD, TitaniumItems.TITANIUM_SWORD);
            content.addAfter(Items.GOLDEN_AXE, TitaniumItems.TITANIUM_AXE);
            content.addAfter(Items.GOLDEN_BOOTS, TitaniumItems.TITANIUM_HELMET);
            content.addAfter(TitaniumItems.TITANIUM_HELMET, TitaniumItems.TITANIUM_CHESTPLATE);
            content.addAfter(TitaniumItems.TITANIUM_CHESTPLATE, TitaniumItems.TITANIUM_LEGGINGS);
            content.addAfter(TitaniumItems.TITANIUM_LEGGINGS, TitaniumItems.TITANIUM_BOOTS);
            content.addAfter(Items.DIAMOND_HORSE_ARMOR, TitaniumItems.TITANIUM_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> {
            content.addAfter(Items.RAW_GOLD, TitaniumItems.RAW_TITANIUM);
            content.addAfter(Items.GOLD_NUGGET, TitaniumItems.TITANIUM_NUGGET);
            content.addAfter(Items.GOLD_INGOT, TitaniumItems.TITANIUM_INGOT);
            content.addAfter(Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE);
            content.addAfter(Items.BLAZE_POWDER, TitaniumItems.END_POWDER);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.OP_BLOCKS).register(content -> {
            content.addAfter(Items.DEBUG_STICK, TitaniumItems.TESTING_WAND);
        });
    }
}
