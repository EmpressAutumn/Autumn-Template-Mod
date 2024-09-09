package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TitaniumRecipeProvider extends RecipeProvider {
    private static final List<ItemLike> TITANIUM_SMELTABLES = List.of(
            TitaniumItems.RAW_TITANIUM.get(),
            TitaniumBlocks.TITANIUM_ORE.get(),
            TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(),
            TitaniumBlocks.END_TITANIUM_ORE.get()
    );

    public TitaniumRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        oreSmelting(recipeOutput, TITANIUM_SMELTABLES, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT.get(),
                0.1f, 200, "titanium");
        oreBlasting(recipeOutput, TITANIUM_SMELTABLES, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT.get(),
                0.1f, 100, "titanium");

        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT.get(),
                RecipeCategory.BUILDING_BLOCKS, TitaniumBlocks.TITANIUM_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, TitaniumItems.RAW_TITANIUM.get(),
                RecipeCategory.BUILDING_BLOCKS, TitaniumBlocks.RAW_TITANIUM_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT.get(), 1)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', TitaniumItems.TITANIUM_NUGGET.get())
                .unlockedBy("titanium_nugget_from_ingot", has(TitaniumItems.TITANIUM_NUGGET.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, "titanium_nugget_from_ingot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.TITANIUM_NUGGET.get(), 9)
                .pattern("T")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .unlockedBy("titanium_ingot_from_nugget", has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, "titanium_ingot_from_nugget"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_HELMET.get(), 1)
                .pattern("TTT")
                .pattern("T T")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_HELMET.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_HELMET.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_CHESTPLATE.get(), 1)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_CHESTPLATE.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_CHESTPLATE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_LEGGINGS.get(), 1)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_LEGGINGS.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_LEGGINGS.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_BOOTS.get(), 1)
                .pattern("T T")
                .pattern("T T")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_BOOTS.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_BOOTS.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_SWORD.get(), 1)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_SWORD.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_SWORD.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_PICKAXE.get(), 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_PICKAXE.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_PICKAXE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_SHOVEL.get(), 1)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_SHOVEL.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_SHOVEL.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_AXE.get(), 1)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_AXE.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_AXE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_HOE.get(), 1)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .define('T', TitaniumItems.TITANIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_HOE.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_HOE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_HORSE_ARMOR.get(), 1)
                .pattern("NLN")
                .pattern("IIN")
                .define('I', TitaniumItems.TITANIUM_INGOT.get())
                .define('N', TitaniumItems.TITANIUM_NUGGET.get())
                .define('L', Items.LEATHER)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_HORSE_ARMOR.get()), has(TitaniumItems.TITANIUM_INGOT.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_HORSE_ARMOR.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, TitaniumBlocks.TITANIUM_LANTERN.get(), 1)
                .pattern("NNN")
                .pattern("NTN")
                .pattern("NNN")
                .define('N', TitaniumItems.TITANIUM_NUGGET.get())
                .define('T', Items.REDSTONE_TORCH)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_LANTERN.get()), has(TitaniumItems.TITANIUM_NUGGET.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_LANTERN.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.END_POWDER.get(), 2)
                .pattern("T")
                .define('T', Items.ENDER_PEARL)
                .unlockedBy(getItemName(TitaniumItems.END_POWDER.get()), has(Items.ENDER_PEARL))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.END_POWDER.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.FLIGHT_CHARGE.get(), 1)
                .pattern("TTT")
                .pattern("TST")
                .pattern("TTT")
                .define('T', TitaniumItems.TITANIUM_NUGGET.get())
                .define('S', TitaniumItems.END_POWDER.get())
                .unlockedBy(getItemName(TitaniumItems.FLIGHT_CHARGE.get()), has(TitaniumItems.END_POWDER.get()))
                .save(recipeOutput, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.FLIGHT_CHARGE.get())));
    }
}
