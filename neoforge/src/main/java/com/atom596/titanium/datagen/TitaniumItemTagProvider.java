package com.atom596.titanium.datagen;

import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class TitaniumItemTagProvider extends ItemTagsProvider {
    public TitaniumItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, CompletableFuture<TagLookup<Block>> p_275322_) {
        super(output, completableFuture, p_275322_);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(TagKey.create(Registries.ITEM, new ResourceLocation("fabric", "axes")))
                .add(TitaniumItems.TITANIUM_AXE.get());

        this.tag(TagKey.create(Registries.ITEM, new ResourceLocation("fabric", "hoes")))
                .add(TitaniumItems.TITANIUM_HOE.get());

        this.tag(TagKey.create(Registries.ITEM, new ResourceLocation("fabric", "pickaxes")))
                .add(TitaniumItems.TITANIUM_PICKAXE.get());

        this.tag(TagKey.create(Registries.ITEM, new ResourceLocation("fabric", "shovels")))
                .add(TitaniumItems.TITANIUM_SHOVEL.get());

        this.tag(TagKey.create(Registries.ITEM, new ResourceLocation("fabric", "swords")))
                .add(TitaniumItems.TITANIUM_SWORD.get());

        this.tag(ItemTags.MUSIC_DISCS).add(TitaniumItems.MUSIC_DISC_AMETHYST.get());
    }
}
