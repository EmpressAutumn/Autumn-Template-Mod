package com.atom596.titanium;

import net.fabricmc.api.ModInitializer;

public class TitaniumFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Titanium.LOGGER.info("Hello Fabric world!");
        Titanium.init();
    }
}
