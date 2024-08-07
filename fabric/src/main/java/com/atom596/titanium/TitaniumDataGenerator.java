package com.atom596.titanium;

import com.atom596.titanium.datagen.TitaniumAdvancementProvider;
import com.atom596.titanium.datagen.TitaniumBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;

public class TitaniumDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(TitaniumAdvancementProvider::new);
		//pack.addProvider(TitaniumBlockLootTableProvider::new);
		//pack.addProvider(TitaniumBlockTagProvider::new);
		//pack.addProvider(TitaniumChestLootTableProvider::new);
		//pack.addProvider(TitaniumItemTagProvider::new);
		//pack.addProvider(TitaniumModelProvider::new);
		//pack.addProvider(TitaniumRecipeProvider::new);
		//pack.addProvider(TitaniumWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {/*
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TitaniumConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TitaniumPlacedFeatures::bootstrap);
	*/}
}
