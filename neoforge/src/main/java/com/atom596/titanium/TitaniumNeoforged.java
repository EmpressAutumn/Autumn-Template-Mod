package com.atom596.titanium;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Titanium.MOD_ID)
public class TitaniumNeoforged {
    public TitaniumNeoforged(IEventBus eventBus) {
        Titanium.LOGGER.info("Hello NeoForge world!");
        Titanium.init();
    }
}
