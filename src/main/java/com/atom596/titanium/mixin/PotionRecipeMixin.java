package com.atom596.titanium.mixin;

import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.item.TitaniumPotions;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class PotionRecipeMixin {
    @Inject(at = @At("TAIL"), method = "registerDefaults")
    private static void registerPotionRecipes(BrewingRecipeRegistry.Builder builder, CallbackInfo ci) {
        builder.registerPotionRecipe(Potions.MUNDANE, TitaniumItems.END_POWDER, TitaniumPotions.LEVITATION);
        builder.registerPotionRecipe(TitaniumPotions.LEVITATION, Items.REDSTONE, TitaniumPotions.LONG_LEVITATION);
    }
}
