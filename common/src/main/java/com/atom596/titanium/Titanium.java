package com.atom596.titanium;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumArmorMaterial;
import com.atom596.titanium.item.TitaniumItemGroup;
import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.item.TitaniumPotions;
import org.slf4j.LoggerFactory;

public class Titanium {
	public static final String MOD_ID = "titanium";
	public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void initialize() {
		TitaniumArmorMaterial.init();
		TitaniumPotions.init();
		TitaniumBlocks.init();
		TitaniumItems.init();
		TitaniumItemGroup.init();
	}
}
