package com.atom596.titanium.sound;

import com.atom596.titanium.Titanium;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TitaniumSounds {
    public static final SoundEvent MUSIC_DISC_AMETHYST = SoundEvent.createVariableRangeEvent(new ResourceLocation(Titanium.MOD_ID, "music_disc_amethyst"));

    public static void register() {
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation(Titanium.MOD_ID, "music_disc_amethyst"), MUSIC_DISC_AMETHYST);
    }
}
