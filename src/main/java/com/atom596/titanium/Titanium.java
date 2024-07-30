package com.atom596.titanium;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumArmorMaterial;
import com.atom596.titanium.item.TitaniumItemGroup;
import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.item.TitaniumPotions;
import com.atom596.titanium.sound.TitaniumSounds;
import com.atom596.titanium.world.gen.TitaniumWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Titanium implements ModInitializer {
	public static final String MOD_ID = "titanium";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public void onInitialize() {
		TitaniumArmorMaterial.initialize();
		TitaniumPotions.initialize();

		TitaniumSounds.register();
		TitaniumItems.register();
		TitaniumBlocks.register();
		TitaniumItemGroup.register();

		TitaniumWorldGeneration.generateModWorldGen();
		LOGGER.info("Initialized Titanium by EmpressAutumn");
	}
}
