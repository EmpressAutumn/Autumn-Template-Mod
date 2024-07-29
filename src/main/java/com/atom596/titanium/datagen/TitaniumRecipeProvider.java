package com.atom596.titanium.datagen;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class TitaniumRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TITANIUM_SMELTABLES = List.of(
            TitaniumItems.RAW_TITANIUM,
            TitaniumBlocks.TITANIUM_ORE,
            TitaniumBlocks.DEEPSLATE_TITANIUM_ORE,
            TitaniumBlocks.END_TITANIUM_ORE
    );

    public TitaniumRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT,
                0.1f, 200, "titanium");
        offerBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT,
                0.1f, 100, "titanium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TitaniumItems.TITANIUM_INGOT,
                RecipeCategory.DECORATIONS, TitaniumBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, TitaniumItems.RAW_TITANIUM,
                RecipeCategory.DECORATIONS, TitaniumBlocks.RAW_TITANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_HELMET, 1)
                .pattern("TTT")
                .pattern("T T")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_CHESTPLATE, 1)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_LEGGINGS, 1)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_BOOTS, 1)
                .pattern("T T")
                .pattern("T T")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_SWORD, 1)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_PICKAXE, 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_SHOVEL, 1)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_AXE, 1)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_HOE, 1)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .input('T', TitaniumItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(TitaniumItems.TITANIUM_INGOT), conditionsFromItem(TitaniumItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(TitaniumItems.TITANIUM_HOE)));
    }
}
