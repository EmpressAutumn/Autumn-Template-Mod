package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TitaniumItemGroup {
    private static final ItemGroup TITANIUM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(TitaniumItems.TITANIUM_INGOT))
            .displayName(Text.translatable("itemGroup.titanium.titanium_group"))
            .entries((context, entries) -> {
                entries.add(TitaniumBlocks.TITANIUM_BLOCK);
                entries.add(TitaniumBlocks.TITANIUM_ORE);
                entries.add(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
                entries.add(TitaniumBlocks.END_TITANIUM_ORE);
                entries.add(TitaniumBlocks.RAW_TITANIUM_BLOCK);
                entries.add(TitaniumBlocks.TITANIUM_LANTERN);
                entries.add(TitaniumItems.TITANIUM_SHOVEL);
                entries.add(TitaniumItems.TITANIUM_PICKAXE);
                entries.add(TitaniumItems.TITANIUM_AXE);
                entries.add(TitaniumItems.TITANIUM_HOE);
                entries.add(TitaniumItems.FLIGHT_CHARGE);
                entries.add(TitaniumItems.TITANIUM_SWORD);
                entries.add(TitaniumItems.TITANIUM_HELMET);
                entries.add(TitaniumItems.TITANIUM_CHESTPLATE);
                entries.add(TitaniumItems.TITANIUM_LEGGINGS);
                entries.add(TitaniumItems.TITANIUM_BOOTS);
                entries.add(TitaniumItems.TITANIUM_HORSE_ARMOR);
                entries.add(TitaniumItems.RAW_TITANIUM);
                entries.add(TitaniumItems.TITANIUM_NUGGET);
                entries.add(TitaniumItems.TITANIUM_INGOT);
                entries.add(TitaniumItems.END_POWDER);
                entries.add(TitaniumItems.MUSIC_DISC_AMETHYST);
            })
            .build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Titanium.MOD_ID, "titanium_group"), TITANIUM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumBlocks.TITANIUM_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
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
    }
}
