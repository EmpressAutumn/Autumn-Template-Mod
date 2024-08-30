package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class TitaniumItemRegistry {
    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_helmet"), TitaniumItems.TITANIUM_HELMET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_chestplate"), TitaniumItems.TITANIUM_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_leggings"), TitaniumItems.TITANIUM_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_boots"), TitaniumItems.TITANIUM_BOOTS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_shovel"), TitaniumItems.TITANIUM_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_sword"), TitaniumItems.TITANIUM_SWORD);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_pickaxe"), TitaniumItems.TITANIUM_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_axe"), TitaniumItems.TITANIUM_AXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_hoe"), TitaniumItems.TITANIUM_HOE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "raw_titanium"), TitaniumItems.RAW_TITANIUM);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_nugget"), TitaniumItems.TITANIUM_NUGGET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_ingot"), TitaniumItems.TITANIUM_INGOT);
        //Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "music_disc_amethyst"), TitaniumItems.MUSIC_DISC_AMETHYST);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_horse_armor"), TitaniumItems.TITANIUM_HORSE_ARMOR);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "end_powder"), TitaniumItems.END_POWDER);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "flight_charge"), TitaniumItems.FLIGHT_CHARGE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "testing_wand"), TitaniumItems.TESTING_WAND);

        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_ore"), TitaniumItems.TITANIUM_ORE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "deepslate_titanium_ore"), TitaniumItems.DEEPSLATE_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "end_titanium_ore"), TitaniumItems.END_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "raw_titanium_block"), TitaniumItems.RAW_TITANIUM_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_block"), TitaniumItems.TITANIUM_BLOCK);
        //Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_lantern"), TitaniumItems.TITANIUM_LANTERN);
    }
}
