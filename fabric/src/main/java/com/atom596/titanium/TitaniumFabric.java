package com.atom596.titanium;

import com.atom596.titanium.sound.TitaniumSounds;
import net.fabricmc.api.ModInitializer;

public class TitaniumFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Titanium.initialize();

        //TitaniumWorldGeneration.generateModWorldGen();

        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }
}
