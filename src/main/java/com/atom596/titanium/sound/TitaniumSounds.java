package com.atom596.titanium.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class TitaniumSounds {
    public static final SoundEvent MUSIC_DISC_AMETHYST = SoundEvent.of(new Identifier("titanium:music_disc_amethyst"));

    public static void register() {
        Registry.register(Registries.SOUND_EVENT, new Identifier("titanium:music_disc_amethyst"), MUSIC_DISC_AMETHYST);
    }
}
