package com.atom596.titanium.datagen;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TitaniumBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TitaniumBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    public void generate() {
        addDrop(TitaniumBlocks.TITANIUM_BLOCK);
        addDrop(TitaniumBlocks.RAW_TITANIUM_BLOCK);

        addDrop(TitaniumBlocks.TITANIUM_ORE, oreDrops(TitaniumBlocks.TITANIUM_ORE, TitaniumItems.RAW_TITANIUM));
        addDrop(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE, oreDrops(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE, TitaniumItems.RAW_TITANIUM));
        addDrop(TitaniumBlocks.END_TITANIUM_ORE, oreDrops(TitaniumBlocks.END_TITANIUM_ORE, TitaniumItems.RAW_TITANIUM));
    }
}
