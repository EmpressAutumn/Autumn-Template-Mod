package com.atom596.titanium.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TitaniumTools implements ToolMaterial {
    public static final ToolMaterial INSTANCE = new TitaniumTools();

    private TitaniumTools() {}

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0F;
    }

    @Override
    public int getDurability() {
        return 512;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public float getAttackDamage() {
        return 9.0F;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TitaniumItems.TITANIUM_INGOT);
    }
}
