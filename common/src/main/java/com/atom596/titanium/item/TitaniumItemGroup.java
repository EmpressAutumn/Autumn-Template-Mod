package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TitaniumItemGroup {
    public static final RegistrationProvider<CreativeModeTab> ITEM_GROUPS = RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, Titanium.MOD_ID);

    public static final RegistryObject<CreativeModeTab, CreativeModeTab> TITANIUM_GROUP = ITEM_GROUPS.register("titanium_group",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .icon(() -> new ItemStack(TitaniumItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("itemGroup.titanium.titanium_group"))
                    .displayItems((context, entries) -> {
                        entries.accept(TitaniumBlocks.TITANIUM_BLOCK.get());
                        entries.accept(TitaniumBlocks.TITANIUM_ORE.get());
                        entries.accept(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        entries.accept(TitaniumBlocks.END_TITANIUM_ORE.get());
                        entries.accept(TitaniumBlocks.RAW_TITANIUM_BLOCK.get());
                        //entries.accept(TitaniumBlocks.TITANIUM_LANTERN.get());
                        entries.accept(TitaniumItems.TITANIUM_SHOVEL.get());
                        entries.accept(TitaniumItems.TITANIUM_PICKAXE.get());
                        entries.accept(TitaniumItems.TITANIUM_AXE.get());
                        entries.accept(TitaniumItems.TITANIUM_HOE.get());
                        entries.accept(TitaniumItems.FLIGHT_CHARGE.get());
                        entries.accept(TitaniumItems.TITANIUM_SWORD.get());
                        entries.accept(TitaniumItems.TITANIUM_HELMET.get());
                        entries.accept(TitaniumItems.TITANIUM_CHESTPLATE.get());
                        entries.accept(TitaniumItems.TITANIUM_LEGGINGS.get());
                        entries.accept(TitaniumItems.TITANIUM_BOOTS.get());
                        entries.accept(TitaniumItems.TITANIUM_HORSE_ARMOR.get());
                        entries.accept(TitaniumItems.RAW_TITANIUM.get());
                        entries.accept(TitaniumItems.TITANIUM_NUGGET.get());
                        entries.accept(TitaniumItems.TITANIUM_INGOT.get());
                        entries.accept(TitaniumItems.END_POWDER.get());
                        entries.accept(TitaniumItems.MUSIC_DISC_AMETHYST.get());
                    })
                    .build());

    public static void init() {}

    /*ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
        content.addAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumBlocks.TITANIUM_BLOCK);
    });
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> {
        content.addAfter(Items.DEEPSLATE_GOLD_ORE, TitaniumBlocks.TITANIUM_ORE);
        content.addAfter(TitaniumBlocks.TITANIUM_ORE, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
        content.addAfter(Items.NETHER_QUARTZ_ORE, TitaniumBlocks.END_TITANIUM_ORE);
        content.addAfter(Items.RAW_GOLD_BLOCK, TitaniumBlocks.RAW_TITANIUM_BLOCK);
    });
    ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> {
        content.addAfter(Items.LANTERN, TitaniumBlocks.TITANIUM_LANTERN);
    });
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
    });*/
}
