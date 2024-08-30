package com.atom596.titanium;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumArmorMaterial;
import com.atom596.titanium.item.TitaniumItemGroup;
import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.item.TitaniumPotions;
import com.atom596.titanium.registry.TitaniumArmorMaterialRegistry;
import com.atom596.titanium.registry.TitaniumBlockRegistry;
import com.atom596.titanium.registry.TitaniumItemGroupRegistry;
import com.atom596.titanium.registry.TitaniumItemRegistry;
import com.atom596.titanium.sound.TitaniumSounds;
import net.fabricmc.api.ModInitializer;

public class TitaniumFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Titanium.initialize();

        TitaniumArmorMaterial.initialize();
        TitaniumArmorMaterialRegistry.register();

        TitaniumPotions.initialize();

        TitaniumSounds.register();

        TitaniumItems.initialize();
        TitaniumItemRegistry.register();

        TitaniumBlocks.initialize();
        TitaniumBlockRegistry.register();

        TitaniumItemGroup.initialize();
        TitaniumItemGroupRegistry.register();

        //TitaniumWorldGeneration.generateModWorldGen();

        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }
}
