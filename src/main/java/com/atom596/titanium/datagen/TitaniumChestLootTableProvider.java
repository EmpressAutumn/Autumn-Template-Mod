package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class TitaniumChestLootTableProvider extends SimpleFabricLootTableProvider {
    public TitaniumChestLootTableProvider(FabricDataOutput output) {
        super(output, LootContextTypes.CHEST);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> biConsumer) {
        biConsumer.accept(new Identifier(Titanium.MOD_ID, "chests/amethyst_barrel"), LootTable.builder()
                .pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0f))
                        .with(ItemEntry.builder(TitaniumItems.MUSIC_DISC_AMETHYST)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)))
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .with(ItemEntry.builder(TitaniumItems.TITANIUM_PICKAXE)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)))
                                .apply(EnchantRandomlyLootFunction.create())
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(2.0f, 3.0f))
                        .with(ItemEntry.builder(TitaniumItems.TITANIUM_INGOT)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)))
                        ).with(ItemEntry.builder(TitaniumItems.RAW_TITANIUM)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)))
                        )
                ).pool(LootPool.builder().rolls(UniformLootNumberProvider.create(1.0f, 2.0f))
                        .with(ItemEntry.builder(Items.LANTERN)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f)))
                        )
                )
        );
    }
}
