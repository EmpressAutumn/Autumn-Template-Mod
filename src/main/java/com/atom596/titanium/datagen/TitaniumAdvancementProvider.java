package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class TitaniumAdvancementProvider extends FabricAdvancementProvider {
    public TitaniumAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement getTitaniumAdvancement = Advancement.Builder.create()
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
                .parent(new Identifier("minecraft", "story/iron_tools"))
                .criterion("got_titanium", InventoryChangedCriterion.Conditions.items(TitaniumItems.TITANIUM_INGOT))
                .build(consumer, Titanium.MOD_ID + "/get_titanium");

        Advancement titaniumToolsAdvancement = Advancement.Builder.create()
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

        Advancement titaniumArmorAdvancement = Advancement.Builder.create()
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
