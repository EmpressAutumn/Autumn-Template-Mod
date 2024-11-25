package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.datagen.loottables.TitaniumBlockLootTables;
import com.atom596.titanium.datagen.loottables.TitaniumChestLootTables;
import com.google.common.collect.Sets;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class TitaniumLootTableProvider extends LootTableProvider {
    public TitaniumLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, Set.of(), List.of(
                //new SubProviderEntry(TitaniumBlockLootTables::new, LootContextParamSets.BLOCK)
                //new SubProviderEntry(TitaniumChestLootTables::new, LootContextParamSets.CHEST)
        ), completableFuture);
    }

    @Override
    protected void validate(WritableRegistry<LootTable> writableregistry, ValidationContext validationcontext, ProblemReporter.Collector problemreporter$collector) {
        var titaniumLootTablesId = BuiltInLootTables.all()
                .stream()
                .filter(id -> id.registry().getNamespace().equals(Titanium.MOD_ID))
                .collect(Collectors.toSet());

        for (var id: Sets.difference(titaniumLootTablesId, writableregistry.keySet())) {
            validationcontext.reportProblem("Missing built-in table: " + id);
        }

        writableregistry.forEach(lootTable -> lootTable.validate(validationcontext));
    }
}
