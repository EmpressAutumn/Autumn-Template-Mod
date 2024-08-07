package com.atom596.titanium;

import net.fabricmc.api.ModInitializer;

public class TitaniumFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Titanium.initialize();
        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }
}
