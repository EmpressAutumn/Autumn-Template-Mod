package com.atom596.titanium;

import com.atom596.titanium.datagen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

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

        generator.addProvider(true, new TitaniumAdvancementProvider(output, completableFuture, exFileHelper));
        generator.addProvider(true, new TitaniumBlockStateProvider(output, exFileHelper));
        generator.addProvider(true, new TitaniumBlockTagProvider(output, completableFuture, exFileHelper));
        generator.addProvider(true, new TitaniumItemModelProvider(output, exFileHelper));
        generator.addProvider(true, new TitaniumItemTagProvider(output, completableFuture, blockTagsProvider.contentsGetter(), exFileHelper));
        generator.addProvider(true, new TitaniumLootTableProvider(output, completableFuture));
        generator.addProvider(true, new TitaniumRecipeProvider(output, completableFuture));
        generator.addProvider(true, new TitaniumWorldGenProvider(output, completableFuture));
    }
}
