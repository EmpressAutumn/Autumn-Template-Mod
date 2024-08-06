package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TitaniumItemGroup {
    private static final CreativeModeTab TITANIUM_GROUP = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
            .icon(() -> new ItemStack(TitaniumItems.TITANIUM_INGOT))
            .title(Component.translatable("itemGroup.titanium.titanium_group"))
            .displayItems((context, entries) -> {
                entries.accept(TitaniumBlocks.TITANIUM_BLOCK);
                entries.accept(TitaniumBlocks.TITANIUM_ORE);
                entries.accept(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
                entries.accept(TitaniumBlocks.END_TITANIUM_ORE);
                entries.accept(TitaniumBlocks.RAW_TITANIUM_BLOCK);
                entries.accept(TitaniumBlocks.TITANIUM_LANTERN);
                entries.accept(TitaniumItems.TITANIUM_SHOVEL);
                entries.accept(TitaniumItems.TITANIUM_PICKAXE);
                entries.accept(TitaniumItems.TITANIUM_AXE);
                entries.accept(TitaniumItems.TITANIUM_HOE);
                entries.accept(TitaniumItems.FLIGHT_CHARGE);
                entries.accept(TitaniumItems.TITANIUM_SWORD);
                entries.accept(TitaniumItems.TITANIUM_HELMET);
                entries.accept(TitaniumItems.TITANIUM_CHESTPLATE);
                entries.accept(TitaniumItems.TITANIUM_LEGGINGS);
                entries.accept(TitaniumItems.TITANIUM_BOOTS);
                entries.accept(TitaniumItems.TITANIUM_HORSE_ARMOR);
                entries.accept(TitaniumItems.RAW_TITANIUM);
                entries.accept(TitaniumItems.TITANIUM_NUGGET);
                entries.accept(TitaniumItems.TITANIUM_INGOT);
                entries.accept(TitaniumItems.END_POWDER);
                entries.accept(TitaniumItems.MUSIC_DISC_AMETHYST);
            })
            .build();

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Titanium.MOD_ID, "titanium_group"), TITANIUM_GROUP);
        /*ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumBlocks.TITANIUM_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL).register(content -> {
            content.addAfter(Items.DEEPSLATE_GOLD_ORE, TitaniumBlocks.TITANIUM_ORE);
            content.addAfter(TitaniumBlocks.TITANIUM_ORE, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
            content.addAfter(Items.NETHER_QUARTZ_ORE, TitaniumBlocks.END_TITANIUM_ORE);
            content.addAfter(Items.RAW_GOLD_BLOCK, TitaniumBlocks.RAW_TITANIUM_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.LANTERN, TitaniumBlocks.TITANIUM_LANTERN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.GOLDEN_HOE, TitaniumItems.TITANIUM_SHOVEL);
            content.addAfter(TitaniumItems.TITANIUM_SHOVEL, TitaniumItems.TITANIUM_PICKAXE);
            content.addAfter(TitaniumItems.TITANIUM_PICKAXE, TitaniumItems.TITANIUM_AXE);
            content.addAfter(TitaniumItems.TITANIUM_AXE, TitaniumItems.TITANIUM_HOE);
            content.addAfter(Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE);
            content.addAfter(Items.MUSIC_DISC_PIGSTEP, TitaniumItems.MUSIC_DISC_AMETHYST);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.GOLDEN_SWORD, TitaniumItems.TITANIUM_SWORD);
            content.addAfter(Items.GOLDEN_AXE, TitaniumItems.TITANIUM_AXE);
            content.addAfter(Items.GOLDEN_BOOTS, TitaniumItems.TITANIUM_HELMET);
            content.addAfter(TitaniumItems.TITANIUM_HELMET, TitaniumItems.TITANIUM_CHESTPLATE);
            content.addAfter(TitaniumItems.TITANIUM_CHESTPLATE, TitaniumItems.TITANIUM_LEGGINGS);
            content.addAfter(TitaniumItems.TITANIUM_LEGGINGS, TitaniumItems.TITANIUM_BOOTS);
            content.addAfter(Items.DIAMOND_HORSE_ARMOR, TitaniumItems.TITANIUM_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.RAW_GOLD, TitaniumItems.RAW_TITANIUM);
            content.addAfter(Items.GOLD_NUGGET, TitaniumItems.TITANIUM_NUGGET);
            content.addAfter(Items.GOLD_INGOT, TitaniumItems.TITANIUM_INGOT);
            content.addAfter(Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE);
            content.addAfter(Items.BLAZE_POWDER, TitaniumItems.END_POWDER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(content -> {
            content.addAfter(Items.DEBUG_STICK, TitaniumItems.TESTING_WAND);
        });*/
    }
}
