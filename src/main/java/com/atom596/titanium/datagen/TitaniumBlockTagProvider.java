package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class TitaniumBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TitaniumBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier(Titanium.MOD_ID, "titanium_ores")))
                .add(TitaniumBlocks.TITANIUM_ORE)
                .add(TitaniumBlocks.TITANIUM_BLOCK)
                .add(TitaniumBlocks.END_TITANIUM_ORE);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(TitaniumBlocks.TITANIUM_ORE)
                .add(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(TitaniumBlocks.END_TITANIUM_ORE)
                .add(TitaniumBlocks.RAW_TITANIUM_BLOCK)
                .add(TitaniumBlocks.TITANIUM_BLOCK)
                .add(TitaniumBlocks.TITANIUM_LANTERN);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(TitaniumBlocks.TITANIUM_ORE)
                .add(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(TitaniumBlocks.END_TITANIUM_ORE)
                .add(TitaniumBlocks.RAW_TITANIUM_BLOCK)
                .add(TitaniumBlocks.TITANIUM_BLOCK);
    }
}
