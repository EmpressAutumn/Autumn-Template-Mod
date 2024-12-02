package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.world.TitaniumConfiguredFeatures;
import com.atom596.titanium.world.TitaniumPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class TitaniumWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public TitaniumWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture, new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, TitaniumConfiguredFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, TitaniumPlacedFeatures::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, TitaniumBiomeModifiers::bootstrap),
                Set.of(Titanium.MOD_ID)
        );
    }
}
