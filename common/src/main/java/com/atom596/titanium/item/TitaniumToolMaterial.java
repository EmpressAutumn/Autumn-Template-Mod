package com.atom596.titanium.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class TitaniumToolMaterial implements Tier {

    public static final TitaniumToolMaterial INSTANCE = new TitaniumToolMaterial();

    @Override
    public int getUses() {
        return 768;
    }

    @Override
    public float getSpeed() {
        return 7.2f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 2.5f;  // 2 more than default
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(TitaniumItems.TITANIUM_INGOT);
    }
}
