package com.atom596.titanium;

import com.atom596.titanium.datagen.*;
import com.atom596.titanium.datagen.loottables.TitaniumBlockLootTables;
import com.atom596.titanium.datagen.loottables.TitaniumChestLootTables;
import com.atom596.titanium.datagen.loottables.TitaniumMobLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Titanium.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class TitaniumDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper exFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> completableFuture = event.getLookupProvider();
        BlockTagsProvider blockTagsProvider = new TitaniumBlockTagProvider(output, completableFuture, exFileHelper);

        generator.addProvider(true, new AdvancementProvider(output, completableFuture, exFileHelper, List.of(
                new TitaniumAdvancementGenerator()
        )));
        generator.addProvider(true, new TitaniumBlockStateProvider(output, exFileHelper));
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new TitaniumItemModelProvider(output, exFileHelper));
        generator.addProvider(true, new TitaniumItemTagProvider(output, completableFuture, blockTagsProvider.contentsGetter(), exFileHelper));
        generator.addProvider(true, new LootTableProvider(output, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(TitaniumBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(TitaniumChestLootTables::new, LootContextParamSets.CHEST),
                new LootTableProvider.SubProviderEntry(TitaniumMobLootTables::new, LootContextParamSets.ENTITY)
        ), completableFuture));
        generator.addProvider(true, new TitaniumRecipeProvider(output, completableFuture));
        generator.addProvider(true, new TitaniumWorldGenProvider(output, completableFuture));
    }
}
