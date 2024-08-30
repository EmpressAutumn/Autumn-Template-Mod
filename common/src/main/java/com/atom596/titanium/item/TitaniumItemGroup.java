package com.atom596.titanium.item;

import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TitaniumItemGroup {
    public static final CreativeModeTab TITANIUM_GROUP = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
            .icon(() -> new ItemStack(TitaniumItems.TITANIUM_INGOT))
            .title(Component.translatable("itemGroup.titanium.titanium_group"))
            .displayItems((context, entries) -> {
                entries.accept(TitaniumBlocks.TITANIUM_BLOCK);
                entries.accept(TitaniumBlocks.TITANIUM_ORE);
                entries.accept(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
                entries.accept(TitaniumBlocks.END_TITANIUM_ORE);
                entries.accept(TitaniumBlocks.RAW_TITANIUM_BLOCK);
                //entries.accept(TitaniumBlocks.TITANIUM_LANTERN);
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
                //entries.accept(TitaniumItems.MUSIC_DISC_AMETHYST);
            })
            .build();

    public static void initialize() {}
}
