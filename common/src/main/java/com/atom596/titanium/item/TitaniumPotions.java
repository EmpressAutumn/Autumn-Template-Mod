package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class TitaniumPotions {
    public static final Holder<Potion> LEVITATION = Registry.registerForHolder(BuiltInRegistries.POTION,
            new ResourceLocation(Titanium.MOD_ID, "levitation"),
            new Potion(new MobEffectInstance(MobEffects.LEVITATION, 320))
    );
    public static final Holder<Potion> LONG_LEVITATION = Registry.registerForHolder(BuiltInRegistries.POTION,
            new ResourceLocation(Titanium.MOD_ID, "long_levitation"),
            new Potion(new MobEffectInstance(MobEffects.LEVITATION, 480))
    );

    public static void initialize() {
        //BrewingRecipeRegistry.Builder builder = new BrewingRecipeRegistry.Builder(FeatureFlags.VANILLA_FEATURES);
    }
}
