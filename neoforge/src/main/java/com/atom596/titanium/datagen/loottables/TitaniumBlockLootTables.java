package com.atom596.titanium.datagen.loottables;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TitaniumBlockLootTables extends BlockLootSubProvider {
    public TitaniumBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(TitaniumBlocks.RAW_TITANIUM_BLOCK.get());
        dropSelf(TitaniumBlocks.TITANIUM_BLOCK.get());
        dropSelf(TitaniumBlocks.TITANIUM_LANTERN.get());
        add(TitaniumBlocks.TITANIUM_ORE.get(),
                block -> createOreDrop(TitaniumBlocks.TITANIUM_ORE.get(), TitaniumItems.RAW_TITANIUM.get()));
        add(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(),
                block -> createOreDrop(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(), TitaniumItems.RAW_TITANIUM.get()));
        add(TitaniumBlocks.END_TITANIUM_ORE.get(),
                block -> createCopperLikeOreDrop(TitaniumBlocks.END_TITANIUM_ORE.get(), TitaniumItems.TITANIUM_NUGGET.get(), 2.0f, 6.0f));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter(key -> key.getNamespace().equals(Titanium.MOD_ID))
                        .isPresent())
                .collect(Collectors.toSet());
    }

    protected LootTable.Builder createCopperLikeOreDrop(Block block, Item item, float min, float max) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
}
