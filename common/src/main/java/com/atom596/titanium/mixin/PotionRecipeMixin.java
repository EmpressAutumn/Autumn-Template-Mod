package com.atom596.titanium.mixin;

import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.item.TitaniumPotions;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PotionBrewing.class)
public class PotionRecipeMixin {
    @Inject(at = @At("TAIL"), method = "addVanillaMixes")
    private static void registerPotionRecipes(PotionBrewing.Builder builder, CallbackInfo ci) {
        //builder.addMix(Potions.MUNDANE, TitaniumItems.END_POWDER, TitaniumPotions.LEVITATION);
        //builder.addMix(TitaniumPotions.LEVITATION, Items.REDSTONE, TitaniumPotions.LONG_LEVITATION);
    }
}
