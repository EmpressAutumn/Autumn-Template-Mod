package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class TitaniumAdvancementProvider extends AdvancementProvider {

    private static final List<AdvancementGenerator> advancements = null;

    public TitaniumAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, ExistingFileHelper exFileHelper) {
        super(output, completableFuture, exFileHelper, advancements);
    }

    void generate(HolderLookup.Provider completableFuture, Consumer<AdvancementHolder> consumer, ExistingFileHelper exFileHelper) {
        AdvancementHolder getTitaniumAdvancement = new Advancement.Builder()
                .display(
                        TitaniumItems.TITANIUM_INGOT.get(),
                        Component.translatable("advancements.titanium.get_titanium.title"),
                        Component.translatable("advancements.titanium.get_titanium.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .parent(new AdvancementHolder(new ResourceLocation("minecraft", "story/iron_tools"), null))
                .addCriterion("got_titanium", InventoryChangeTrigger.TriggerInstance.hasItems(TitaniumItems.TITANIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(Titanium.MOD_ID, "get_titanium"), exFileHelper);

        AdvancementHolder titaniumToolsAdvancement = new Advancement.Builder()
                .display(
                        TitaniumItems.TITANIUM_PICKAXE.get(),
                        Component.translatable("advancements.titanium.titanium_tools.title"),
                        Component.translatable("advancements.titanium.titanium_tools.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .parent(getTitaniumAdvancement)
                .addCriterion("get_titanium_tools", InventoryChangeTrigger.TriggerInstance.hasItems(
                        TitaniumItems.TITANIUM_PICKAXE.get(),
                        TitaniumItems.TITANIUM_SHOVEL.get(),
                        TitaniumItems.TITANIUM_AXE.get(),
                        TitaniumItems.TITANIUM_HOE.get()
                ))
                .save(consumer, new ResourceLocation(Titanium.MOD_ID, "/titanium_tools"), exFileHelper);

        AdvancementHolder titaniumArmorAdvancement = new Advancement.Builder()
                .display(
                        TitaniumItems.TITANIUM_CHESTPLATE.get(),
                        Component.translatable("advancements.titanium.titanium_armor.title"),
                        Component.translatable("advancements.titanium.titanium_armor.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .parent(getTitaniumAdvancement)
                .addCriterion("titanium_armor", InventoryChangeTrigger.TriggerInstance.hasItems(
                        TitaniumItems.TITANIUM_HELMET.get(),
                        TitaniumItems.TITANIUM_CHESTPLATE.get(),
                        TitaniumItems.TITANIUM_LEGGINGS.get(),
                        TitaniumItems.TITANIUM_BOOTS.get()
                ))
                .save(consumer, new ResourceLocation(Titanium.MOD_ID, "/titanium_armor"), exFileHelper);
    }
}
