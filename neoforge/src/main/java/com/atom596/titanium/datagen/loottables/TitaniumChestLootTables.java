package com.atom596.titanium.datagen.loottables;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public class TitaniumChestLootTables implements LootTableSubProvider {
    public TitaniumChestLootTables(HolderLookup.Provider registries) {}

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
        consumer.accept(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(Titanium.MOD_ID, "chests/amethyst_barrel")), LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(TitaniumItems.MUSIC_DISC_AMETHYST.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                        )
                ).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0.0f, 1.0f))
                        .add(LootItem.lootTableItem(TitaniumItems.TITANIUM_PICKAXE.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                .apply(EnchantRandomlyFunction.randomEnchantment())
                        )
                ).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0f, 3.0f))
                        .add(LootItem.lootTableItem(TitaniumItems.TITANIUM_INGOT.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f)))
                        )
                        .add(LootItem.lootTableItem(TitaniumItems.RAW_TITANIUM.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 4.0f)))
                        )
                ).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0f, 2.0f))
                        .add(LootItem.lootTableItem(TitaniumItems.TITANIUM_NUGGET.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 4.0f)))
                        )
                        .add(LootItem.lootTableItem(TitaniumItems.RAW_TITANIUM.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 4.0f)))
                        )
                ).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0f, 2.0f))
                        .add(LootItem.lootTableItem(Items.AMETHYST_BLOCK)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)))
                        )
                        .add(LootItem.lootTableItem(Items.AMETHYST_SHARD)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f)))
                        )
                ).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0f, 2.0f))
                        .add(LootItem.lootTableItem(TitaniumBlocks.TITANIUM_LANTERN.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                        )
                )
        );
    }
}
