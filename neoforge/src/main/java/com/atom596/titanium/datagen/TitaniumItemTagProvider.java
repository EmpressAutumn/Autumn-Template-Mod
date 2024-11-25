package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TitaniumItemTagProvider extends ItemTagsProvider {

    public TitaniumItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper exFileHelper) {
        super(output, lookupProvider, completableFuture, Titanium.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("fabric", "axes")))
                .add(TitaniumItems.TITANIUM_AXE.get());

        this.tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("fabric", "hoes")))
                .add(TitaniumItems.TITANIUM_HOE.get());

        this.tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("fabric", "pickaxes")))
                .add(TitaniumItems.TITANIUM_PICKAXE.get());

        this.tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("fabric", "shovels")))
                .add(TitaniumItems.TITANIUM_SHOVEL.get());

        this.tag(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("fabric", "swords")))
                .add(TitaniumItems.TITANIUM_SWORD.get());
    }
}
