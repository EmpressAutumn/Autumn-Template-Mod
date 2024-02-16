package com.atom596.titanium.datagen;

import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TitaniumItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TitaniumItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "axes")))
                .add(TitaniumItems.TITANIUM_AXE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "hoes")))
                .add(TitaniumItems.TITANIUM_HOE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "pickaxes")))
                .add(TitaniumItems.TITANIUM_PICKAXE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "shovels")))
                .add(TitaniumItems.TITANIUM_SHOVEL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("fabric", "swords")))
                .add(TitaniumItems.TITANIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(TitaniumItems.MUSIC_DISC_AMETHYST);
    }
}
