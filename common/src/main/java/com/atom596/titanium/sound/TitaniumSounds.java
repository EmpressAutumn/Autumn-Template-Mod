package com.atom596.titanium.sound;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class TitaniumSounds {
    public static final RegistrationProvider<SoundEvent> SOUND_EVENTS = RegistrationProvider.get(BuiltInRegistries.SOUND_EVENT, Titanium.MOD_ID);

    public static final RegistryObject<SoundEvent, SoundEvent> MUSIC_DISC_AMETHYST = SOUND_EVENTS.register("music_disc_amethyst",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Titanium.MOD_ID, "music_disc_amethyst")));

    public static void init() {
    }
}
