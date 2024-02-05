package com.atom596.titanium.datagen;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class TitaniumModelProvider extends FabricModelProvider {
    public TitaniumModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(TitaniumBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(TitaniumBlocks.END_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(TitaniumBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(TitaniumBlocks.TITANIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TitaniumItems.TITANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(TitaniumItems.TITANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(TitaniumItems.TITANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(TitaniumItems.TITANIUM_BOOTS, Models.GENERATED);
        itemModelGenerator.register(TitaniumItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(TitaniumItems.TITANIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(TitaniumItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TitaniumItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TitaniumItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TitaniumItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(TitaniumItems.TITANIUM_HOE, Models.HANDHELD);
    }
}
