package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TitaniumRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemLike> TITANIUM_SMELTABLES = List.of(
            TitaniumItems.RAW_TITANIUM,
            TitaniumBlocks.TITANIUM_ORE,
            TitaniumBlocks.DEEPSLATE_TITANIUM_ORE,
            TitaniumBlocks.END_TITANIUM_ORE
    );

    public TitaniumRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        oreSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT,
                0.1f, 200, "titanium");
        oreBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT,
                0.1f, 100, "titanium");

        nineBlockStorageRecipes(exporter, RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, TitaniumBlocks.TITANIUM_BLOCK);
        nineBlockStorageRecipes(exporter, RecipeCategory.MISC, TitaniumItems.RAW_TITANIUM,
                RecipeCategory.BUILDING_BLOCKS, TitaniumBlocks.RAW_TITANIUM_BLOCK);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.TITANIUM_INGOT, 1)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', TitaniumItems.TITANIUM_NUGGET)
                .unlockedBy("titanium_nugget_from_ingot", has(TitaniumItems.TITANIUM_NUGGET))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, "titanium_nugget_from_ingot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.TITANIUM_NUGGET, 9)
                .pattern("T")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .unlockedBy("titanium_ingot_from_nugget", has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, "titanium_ingot_from_nugget"));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_HELMET, 1)
                .pattern("TTT")
                .pattern("T T")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_HELMET), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_HELMET)));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_CHESTPLATE, 1)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_CHESTPLATE), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_CHESTPLATE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_LEGGINGS, 1)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_LEGGINGS), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_LEGGINGS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_BOOTS, 1)
                .pattern("T T")
                .pattern("T T")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_BOOTS), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_BOOTS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_SWORD, 1)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_SWORD), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_SWORD)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_PICKAXE, 1)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_PICKAXE), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_PICKAXE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_SHOVEL, 1)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_SHOVEL), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_SHOVEL)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_AXE, 1)
                .pattern("TT")
                .pattern("TS")
                .pattern(" S")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_AXE), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_AXE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, TitaniumItems.TITANIUM_HOE, 1)
                .pattern("TT")
                .pattern(" S")
                .pattern(" S")
                .define('T', TitaniumItems.TITANIUM_INGOT)
                .define('S', Items.STICK)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_HOE), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_HOE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, TitaniumItems.TITANIUM_HORSE_ARMOR, 1)
                .pattern("NLN")
                .pattern("IIN")
                .define('I', TitaniumItems.TITANIUM_INGOT)
                .define('N', TitaniumItems.TITANIUM_NUGGET)
                .define('L', Items.LEATHER)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_HORSE_ARMOR), has(TitaniumItems.TITANIUM_INGOT))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_HORSE_ARMOR)));

        /*ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, TitaniumBlocks.TITANIUM_LANTERN, 1)
                .pattern("NNN")
                .pattern("NTN")
                .pattern("NNN")
                .input('N', TitaniumItems.TITANIUM_NUGGET)
                .input('T', Items.REDSTONE_TORCH)
                .unlockedBy(getItemName(TitaniumItems.TITANIUM_LANTERN), has(TitaniumItems.TITANIUM_NUGGET))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.TITANIUM_LANTERN)));*/

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.END_POWDER, 2)
                .pattern("T")
                .define('T', Items.ENDER_PEARL)
                .unlockedBy(getItemName(TitaniumItems.END_POWDER), has(Items.ENDER_PEARL))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.END_POWDER)));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TitaniumItems.FLIGHT_CHARGE, 1)
                .pattern("TTT")
                .pattern("TST")
                .pattern("TTT")
                .define('T', TitaniumItems.TITANIUM_NUGGET)
                .define('S', TitaniumItems.END_POWDER)
                .unlockedBy(getItemName(TitaniumItems.FLIGHT_CHARGE), has(TitaniumItems.END_POWDER))
                .save(exporter, new ResourceLocation(Titanium.MOD_ID, getItemName(TitaniumItems.FLIGHT_CHARGE)));
    }
}
