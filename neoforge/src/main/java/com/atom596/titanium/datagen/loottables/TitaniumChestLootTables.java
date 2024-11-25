package com.atom596.titanium.datagen.loottables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

public class TitaniumChestLootTables extends EntityLootSubProvider {
    public TitaniumChestLootTables(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {

    }
/*
    @Override
    public void generate(HolderLookup.Provider registryLookup, BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
        consumer.accept(ResourceKey.create(Registries.LOOT_TABLE, new ResourceLocation(Titanium.MOD_ID, "chests/amethyst_barrel")), new LootTable.Builder()
                .withPool(new LootPool.Builder().setRolls(LootNumberProviderType.CONSTANT).rolls(ConstantLootNumberProvider.create(1.0f))
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
