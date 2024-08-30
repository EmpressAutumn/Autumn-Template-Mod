package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class TitaniumPotions {
    public static final RegistrationProvider<Potion> POTIONS = RegistrationProvider.get(BuiltInRegistries.POTION, Titanium.MOD_ID);

    public static final RegistryObject<Potion, Potion> LEVITATION = POTIONS.register("levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 320)));
    public static final RegistryObject<Potion, Potion> LONG_LEVITATION = POTIONS.register("long_levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 480)));

    public static void init() {}
}
