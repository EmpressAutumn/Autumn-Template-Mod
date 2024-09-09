package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TitaniumBlockStateProvider extends BlockStateProvider {
    public TitaniumBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Titanium.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(TitaniumBlocks.TITANIUM_ORE);
        blockWithItem(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
        blockWithItem(TitaniumBlocks.END_TITANIUM_ORE);
        blockWithItem(TitaniumBlocks.RAW_TITANIUM_BLOCK);
        blockWithItem(TitaniumBlocks.TITANIUM_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
