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
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.TITANIUM_ORE);
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.END_TITANIUM_ORE);
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(TitaniumBlocks.TITANIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_BOOTS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.RAW_TITANIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.MUSIC_DISC_AMETHYST, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.END_POWDER, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.FLIGHT_CHARGE, ModelTemplates.FLAT_ITEM);
        //itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_LANTERN, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TITANIUM_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(TitaniumItems.TESTING_WAND, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
