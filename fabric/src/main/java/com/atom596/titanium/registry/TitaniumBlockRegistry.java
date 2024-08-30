package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class TitaniumBlockRegistry {
    public static void register() {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_ore"), TitaniumBlocks.TITANIUM_ORE);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "deepslate_titanium_ore"), TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "end_titanium_ore"), TitaniumBlocks.END_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "raw_titanium_block"), TitaniumBlocks.RAW_TITANIUM_BLOCK);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_block"), TitaniumBlocks.TITANIUM_BLOCK);
        //Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_lantern"), TitaniumBlocks.TITANIUM_LANTERN);
    }
}
