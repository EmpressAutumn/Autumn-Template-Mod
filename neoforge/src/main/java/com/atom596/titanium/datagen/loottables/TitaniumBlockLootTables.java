package com.atom596.titanium.datagen.loottables;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class TitaniumBlockLootTables extends BlockLootSubProvider {
    public TitaniumBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.createOreDrop(TitaniumBlocks.TITANIUM_ORE.get(), TitaniumItems.TITANIUM_INGOT.get());
        this.createOreDrop(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(), TitaniumItems.TITANIUM_INGOT.get());
        this.createOreDrop(TitaniumBlocks.END_TITANIUM_ORE.get(), TitaniumItems.TITANIUM_NUGGET.get());
        this.dropSelf(TitaniumBlocks.RAW_TITANIUM_BLOCK.get());
        this.dropSelf(TitaniumBlocks.TITANIUM_BLOCK.get());
        this.dropSelf(TitaniumBlocks.TITANIUM_LANTERN.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TitaniumBlocks.BLOCKS.getRegistry();
    }
}
