package com.atom596.titanium;

import com.atom596.titanium.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TitaniumDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TitaniumBlockTagProvider::new);
		pack.addProvider(TitaniumItemTagProvider::new);
		pack.addProvider(TitaniumLootTableProvider::new);
		pack.addProvider(TitaniumModelProvider::new);
		pack.addProvider(TitaniumRecipeProvider::new);
	}
}
