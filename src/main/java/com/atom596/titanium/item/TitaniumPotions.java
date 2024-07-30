package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class TitaniumPotions {
    public static final RegistryEntry<Potion> LEVITATION = Registry.registerReference(Registries.POTION,
            new Identifier(Titanium.MOD_ID, "levitation"),
            new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 320))
    );
    public static final RegistryEntry<Potion> LONG_LEVITATION = Registry.registerReference(Registries.POTION,
            new Identifier(Titanium.MOD_ID, "long_levitation"),
            new Potion(new StatusEffectInstance(StatusEffects.LEVITATION, 480))
    );

    public static void initialize() {
        BrewingRecipeRegistry.Builder builder = new BrewingRecipeRegistry.Builder(FeatureFlags.VANILLA_FEATURES);
    }
}
