package com.atom596.titanium.datagen;

public class TitaniumChestLootTableProvider /*extends SimpleFabricLootTableProvider*/ {/*
    public TitaniumChestLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture, LootContextTypes.CHEST);
    }

    @Override
    public void accept(RegistryWrapper.WrapperLookup registryLookup, BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer) {
        consumer.accept(RegistryKey.of(RegistryKeys.LOOT_TABLE, new Identifier(Titanium.MOD_ID, "chests/amethyst_barrel")), LootTable.builder()
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
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
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)))
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
    }
*/}
