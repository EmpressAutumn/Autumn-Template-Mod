package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.commands.arguments.ResourceKeyArgument;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;

import java.util.concurrent.CompletableFuture;

public class TitaniumBlockTagProvider extends BlockTagProvider {
    public TitaniumBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        /*getOrCreateTagBuilder(TagKey.create(ResourceKey.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_ores")))
                .add(TitaniumBlocks.TITANIUM_ORE)
                .add(TitaniumBlocks.TITANIUM_BLOCK)
                .add(TitaniumBlocks.END_TITANIUM_ORE);*/
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(TitaniumBlocks.TITANIUM_ORE)
                .add(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(TitaniumBlocks.END_TITANIUM_ORE)
                .add(TitaniumBlocks.RAW_TITANIUM_BLOCK)
                .add(TitaniumBlocks.TITANIUM_BLOCK);
                //.add(TitaniumBlocks.TITANIUM_LANTERN);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(TitaniumBlocks.TITANIUM_ORE)
                .add(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(TitaniumBlocks.END_TITANIUM_ORE)
                .add(TitaniumBlocks.RAW_TITANIUM_BLOCK)
                .add(TitaniumBlocks.TITANIUM_BLOCK);
    }
}
