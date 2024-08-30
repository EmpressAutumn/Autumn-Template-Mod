package com.atom596.titanium.datagen;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;

public class TitaniumModelProvider extends FabricModelProvider {
    public TitaniumModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.TITANIUM_ORE.get());
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get());
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.END_TITANIUM_ORE.get());
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.RAW_TITANIUM_BLOCK.get());
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.TITANIUM_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.RAW_TITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        //itemModelGenerator.generateFlatItem(TitaniumItems.MUSIC_DISC_AMETHYST.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.END_POWDER.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.FLIGHT_CHARGE.get(), ModelTemplates.FLAT_ITEM);
        //itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_LANTERN.get(), ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TESTING_WAND.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
