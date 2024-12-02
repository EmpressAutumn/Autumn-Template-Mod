package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.function.Consumer;

public class TitaniumAdvancementGenerator implements AdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider provider, Consumer<AdvancementHolder> consumer, ExistingFileHelper existingFileHelper) {
        AdvancementHolder getTitaniumAdvancement = Advancement.Builder.advancement()
                .display(
                        new ItemStack(TitaniumItems.TITANIUM_INGOT.get()),
                        Component.translatable("advancements.titanium.get_titanium.title"),
                        Component.translatable("advancements.titanium.get_titanium.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .parent(new AdvancementHolder(
                        ResourceLocation.fromNamespaceAndPath("minecraft", "story/iron_tools"), null
                ))
                .addCriterion("got_titanium",
                        InventoryChangeTrigger.TriggerInstance.hasItems(TitaniumItems.TITANIUM_INGOT.get())
                )
                .requirements(AdvancementRequirements.allOf(List.of("got_titanium")))
                .save(consumer,
                        ResourceLocation.fromNamespaceAndPath(Titanium.MOD_ID, "get_titanium"), existingFileHelper
                );

        AdvancementHolder titaniumToolsAdvancement = Advancement.Builder.advancement()
                .display(
                        new ItemStack(TitaniumItems.TITANIUM_PICKAXE.get()),
                        Component.translatable("advancements.titanium.titanium_tools.title"),
                        Component.translatable("advancements.titanium.titanium_tools.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .parent(getTitaniumAdvancement)
                .addCriterion("get_titanium_tools",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                TitaniumItems.TITANIUM_PICKAXE.get(),
                                TitaniumItems.TITANIUM_SHOVEL.get(),
                                TitaniumItems.TITANIUM_AXE.get(),
                                TitaniumItems.TITANIUM_HOE.get()
                        )
                )
                .requirements(AdvancementRequirements.allOf(List.of("get_titanium_tools")))
                .save(consumer,
                        ResourceLocation.fromNamespaceAndPath(Titanium.MOD_ID, "titanium_tools"), existingFileHelper
                );

        AdvancementHolder titaniumArmorAdvancement = Advancement.Builder.advancement()
                .display(
                        new ItemStack(TitaniumItems.TITANIUM_CHESTPLATE.get()),
                        Component.translatable("advancements.titanium.titanium_armor.title"),
                        Component.translatable("advancements.titanium.titanium_armor.description"),
                        null,
                        AdvancementType.TASK,
                        true,
                        true,
                        false
                )
                .parent(getTitaniumAdvancement)
                .addCriterion("get_titanium_armor",
                        InventoryChangeTrigger.TriggerInstance.hasItems(
                                TitaniumItems.TITANIUM_HELMET.get(),
                                TitaniumItems.TITANIUM_CHESTPLATE.get(),
                                TitaniumItems.TITANIUM_LEGGINGS.get(),
                                TitaniumItems.TITANIUM_BOOTS.get()
                        )
                )
                .requirements(AdvancementRequirements.allOf(List.of("get_titanium_armor")))
                .save(consumer,
                        ResourceLocation.fromNamespaceAndPath(Titanium.MOD_ID, "titanium_armor"), existingFileHelper
                );
    }
}
