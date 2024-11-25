package com.atom596.titanium.datagen.loottables;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TitaniumBlockLootTables extends BlockLootSubProvider {
    public TitaniumBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        createOreDrop(TitaniumBlocks.TITANIUM_ORE.get(), TitaniumItems.TITANIUM_INGOT.get());
        createOreDrop(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(), TitaniumItems.TITANIUM_INGOT.get());
        createOreDrop(TitaniumBlocks.END_TITANIUM_ORE.get(), TitaniumItems.TITANIUM_NUGGET.get());
        dropSelf(TitaniumBlocks.RAW_TITANIUM_BLOCK.get());
        dropSelf(TitaniumBlocks.TITANIUM_BLOCK.get());
        dropSelf(TitaniumBlocks.TITANIUM_LANTERN.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter(key -> key.getNamespace().equals(Titanium.MOD_ID))
                        .isPresent())
                .collect(Collectors.toSet());
    }
}
