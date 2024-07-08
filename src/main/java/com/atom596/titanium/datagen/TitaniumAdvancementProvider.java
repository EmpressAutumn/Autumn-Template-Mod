package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class TitaniumAdvancementProvider extends FabricAdvancementProvider {
    public TitaniumAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry getTitaniumAdvancement = Advancement.Builder.create()
                .display(
                        TitaniumItems.TITANIUM_INGOT,
                        Text.translatable("advancements.titanium.get_titanium.title"),
                        Text.translatable("advancements.titanium.get_titanium.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .parent(new AdvancementEntry(new Identifier("minecraft", "story/iron_tools"), null))
                .criterion("got_titanium", InventoryChangedCriterion.Conditions.items(TitaniumItems.TITANIUM_INGOT))
                .build(consumer, Titanium.MOD_ID + "/get_titanium");

        AdvancementEntry titaniumToolsAdvancement = Advancement.Builder.create()
                .display(
                        TitaniumItems.TITANIUM_PICKAXE,
                        Text.translatable("advancements.titanium.titanium_tools.title"),
                        Text.translatable("advancements.titanium.titanium_tools.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .parent(getTitaniumAdvancement)
                .criterion("get_titanium_tools", InventoryChangedCriterion.Conditions.items(
                        TitaniumItems.TITANIUM_PICKAXE,
                        TitaniumItems.TITANIUM_SHOVEL,
                        TitaniumItems.TITANIUM_AXE,
                        TitaniumItems.TITANIUM_HOE
                ))
                .build(consumer, Titanium.MOD_ID + "/titanium_tools");

        AdvancementEntry titaniumArmorAdvancement = Advancement.Builder.create()
                .display(
                        TitaniumItems.TITANIUM_CHESTPLATE,
                        Text.translatable("advancements.titanium.titanium_armor.title"),
                        Text.translatable("advancements.titanium.titanium_armor.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .parent(getTitaniumAdvancement)
                .criterion("titanium_armor", InventoryChangedCriterion.Conditions.items(
                        TitaniumItems.TITANIUM_HELMET,
                        TitaniumItems.TITANIUM_CHESTPLATE,
                        TitaniumItems.TITANIUM_LEGGINGS,
                        TitaniumItems.TITANIUM_BOOTS
                ))
                .build(consumer, Titanium.MOD_ID + "/titanium_armor");
    }
}
