package com.atom596.titanium.datagen;

public class TitaniumAdvancementProvider /*extends FabricAdvancementProvider*/ {/*
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
*/}
