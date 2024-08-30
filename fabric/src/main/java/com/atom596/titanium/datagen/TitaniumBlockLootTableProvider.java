package com.atom596.titanium.datagen;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class TitaniumBlockLootTableProvider extends FabricBlockLootTableProvider {
    public TitaniumBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        createSelfDropDispatchTable(TitaniumBlocks.TITANIUM_BLOCK.get(), null, null);
        createSelfDropDispatchTable(TitaniumBlocks.RAW_TITANIUM_BLOCK.get(), null, null);
        //createSelfDropDispatchTable(TitaniumBlocks.TITANIUM_LANTERN.get(), null, null);

        createOreDrop(TitaniumBlocks.TITANIUM_ORE.get(), TitaniumItems.RAW_TITANIUM.get());
        createOreDrop(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(), TitaniumItems.RAW_TITANIUM.get());
        createOreDrop(TitaniumBlocks.END_TITANIUM_ORE.get(), TitaniumItems.RAW_TITANIUM.get());
    }
}
