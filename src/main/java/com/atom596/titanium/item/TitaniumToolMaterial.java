package com.atom596.titanium.item;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class TitaniumToolMaterial implements ToolMaterial {

    public static final TitaniumToolMaterial INSTANCE = new TitaniumToolMaterial();

    @Override
    public int getDurability() {
        return 768;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.2f;
    }

    @Override
    public float getAttackDamage() {
        return 2.0f;  // 2 more than default
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TitaniumItems.TITANIUM_INGOT);
    }
}
