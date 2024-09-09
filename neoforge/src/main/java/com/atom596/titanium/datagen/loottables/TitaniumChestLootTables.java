package com.atom596.titanium.datagen.loottables;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.NumberProviders;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class TitaniumChestLootTables extends LootTableProvider {
    public TitaniumChestLootTables(PackOutput p_254123_, Set<ResourceKey<LootTable>> p_254481_, List<SubProviderEntry> p_253798_, CompletableFuture<HolderLookup.Provider> p_323798_) {
        super(p_254123_, p_254481_, p_253798_, p_323798_);
    }

    /*@Override
    public void generate(HolderLookup.Provider registryLookup, BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
        consumer.accept(ResourceKey.create(Registries.LOOT_TABLE, new ResourceLocation(Titanium.MOD_ID, "chests/amethyst_barrel")), new LootTable.Builder()
                .withPool(new LootPool.Builder().setRolls(NumberProviders.CONSTANT).rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(ItemEntry.builder(TitaniumItems.MUSIC_DISC_AMETHYST)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)))
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .with(ItemEntry.builder(TitaniumItems.TITANIUM_PICKAXE)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)))
                                .apply(EnchantRandomlyLootFunction.create())
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(1.0f, 3.0f))
                        .with(ItemEntry.builder(TitaniumItems.TITANIUM_INGOT)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)))
                        ).with(ItemEntry.builder(TitaniumItems.RAW_TITANIUM)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)))
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(1.0f, 2.0f))
                        .with(ItemEntry.builder(TitaniumItems.TITANIUM_NUGGET)
                                .apply(LootItemFunction.Builder(UniformLootNumberProvider.create(1.0f, 4.0f)))
                        ).with(ItemEntry.builder(TitaniumItems.RAW_TITANIUM)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)))
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(1.0f, 2.0f))
                        .with(ItemEntry.builder(Items.AMETHYST_BLOCK)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                        ).with(ItemEntry.builder(Items.AMETHYST_SHARD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(1.0f, 2.0f))
                        .with(ItemEntry.builder(TitaniumBlocks.TITANIUM_LANTERN)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)))
                        )
                )
        );
    }*/
}
