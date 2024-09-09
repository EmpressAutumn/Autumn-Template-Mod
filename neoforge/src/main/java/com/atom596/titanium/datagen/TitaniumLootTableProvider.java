package com.atom596.titanium.datagen;

import com.atom596.titanium.datagen.loottables.TitaniumBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class TitaniumLootTableProvider extends LootTableProvider {
    public TitaniumLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(TitaniumBlockLootTables::new, LootContextParamSets.BLOCK)
        ), completableFuture);
    }
}
