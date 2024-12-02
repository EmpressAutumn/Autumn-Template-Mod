package com.atom596.titanium;

import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.world.TitaniumWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class TitaniumFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Titanium.initialize();

        TitaniumWorldGeneration.generateModWorldGen();

        addCreative();

        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }

    private void addCreative() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumItems.TITANIUM_BLOCK.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> {
            content.addAfter(Items.DEEPSLATE_GOLD_ORE, TitaniumItems.TITANIUM_ORE.get());
            content.addAfter(TitaniumItems.TITANIUM_ORE.get(), TitaniumItems.DEEPSLATE_TITANIUM_ORE.get());
            content.addAfter(Items.NETHER_QUARTZ_ORE, TitaniumItems.END_TITANIUM_ORE.get());
            content.addAfter(Items.RAW_GOLD_BLOCK, TitaniumItems.RAW_TITANIUM_BLOCK.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> {
            content.addAfter(Items.LANTERN, TitaniumItems.TITANIUM_LANTERN.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> {
            content.addAfter(Items.GOLDEN_HOE, TitaniumItems.TITANIUM_SHOVEL.get());
            content.addAfter(TitaniumItems.TITANIUM_SHOVEL.get(), TitaniumItems.TITANIUM_PICKAXE.get());
            content.addAfter(TitaniumItems.TITANIUM_PICKAXE.get(), TitaniumItems.TITANIUM_AXE.get());
            content.addAfter(TitaniumItems.TITANIUM_AXE.get(), TitaniumItems.TITANIUM_HOE.get());
            content.addAfter(Items.WIND_CHARGE, TitaniumItems.FLIGHT_CHARGE.get());
            content.addAfter(Items.MUSIC_DISC_PIGSTEP, TitaniumItems.MUSIC_DISC_AMETHYST.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> {
            content.addAfter(Items.GOLDEN_SWORD, TitaniumItems.TITANIUM_SWORD.get());
            content.addAfter(Items.GOLDEN_AXE, TitaniumItems.TITANIUM_AXE.get());
            content.addAfter(Items.GOLDEN_BOOTS, TitaniumItems.TITANIUM_HELMET.get());
            content.addAfter(TitaniumItems.TITANIUM_HELMET.get(), TitaniumItems.TITANIUM_CHESTPLATE.get());
            content.addAfter(TitaniumItems.TITANIUM_CHESTPLATE.get(), TitaniumItems.TITANIUM_LEGGINGS.get());
            content.addAfter(TitaniumItems.TITANIUM_LEGGINGS.get(), TitaniumItems.TITANIUM_BOOTS.get());
            content.addAfter(Items.GOLDEN_HORSE_ARMOR, TitaniumItems.TITANIUM_HORSE_ARMOR.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(content -> {
            content.addAfter(Items.RAW_GOLD, TitaniumItems.RAW_TITANIUM.get());
            content.addAfter(Items.GOLD_NUGGET, TitaniumItems.TITANIUM_NUGGET.get());
            content.addAfter(Items.GOLD_INGOT, TitaniumItems.TITANIUM_INGOT.get());
            content.addAfter(Items.BLAZE_POWDER, TitaniumItems.END_POWDER.get());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.OP_BLOCKS).register(content -> {
            content.addAfter(Items.DEBUG_STICK, TitaniumItems.TESTING_WAND.get());
        });
    }
}
