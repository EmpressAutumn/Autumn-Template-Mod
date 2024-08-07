package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;

public class TitaniumItems {
    public static final Item TITANIUM_SHOVEL = new ShovelItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(ShovelItem.createAttributes(TitaniumToolMaterial.INSTANCE, 1.5f, -3.0f)));
    public static final Item TITANIUM_SWORD = new SwordItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(SwordItem.createAttributes(TitaniumToolMaterial.INSTANCE, 3, -2.4f)));
    public static final Item TITANIUM_PICKAXE = new PickaxeItem(TitaniumToolMaterial.INSTANCE,  new Item.Properties().attributes(PickaxeItem.createAttributes(TitaniumToolMaterial.INSTANCE, 1.0f, -2.8f)));
    public static final Item TITANIUM_AXE = new AxeItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(AxeItem.createAttributes(TitaniumToolMaterial.INSTANCE, 6.0f, -3.1f)));
    public static final Item TITANIUM_HOE = new HoeItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(HoeItem.createAttributes(TitaniumToolMaterial.INSTANCE, -2.0f, -1.0f)));
    public static final Item TITANIUM_HELMET = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1));
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1));
    public static final Item TITANIUM_BOOTS = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1));
    public static final Item RAW_TITANIUM = new Item(new Item.Properties());
    public static final Item TITANIUM_NUGGET = new Item(new Item.Properties());
    public static final Item TITANIUM_INGOT = new Item(new Item.Properties());
    public static final Item MUSIC_DISC_AMETHYST = new TitaniumRecordItem();
    public static final Item TITANIUM_HORSE_ARMOR = new AnimalArmorItem(TitaniumArmorMaterial.INSTANCE, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1));
    public static final Item END_POWDER = new Item(new Item.Properties());
    public static final Item FLIGHT_CHARGE = new FlightChargeItem(new Item.Properties());
    public static final Item TESTING_WAND = new TestingWandItem();

    public static final Item TITANIUM_ORE = new BlockItem(TitaniumBlocks.TITANIUM_ORE, new Item.Properties());
    public static final Item DEEPSLATE_TITANIUM_ORE = new BlockItem(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE, new Item.Properties());
    public static final Item END_TITANIUM_ORE = new BlockItem(TitaniumBlocks.END_TITANIUM_ORE, new Item.Properties());
    public static final Item RAW_TITANIUM_BLOCK = new BlockItem(TitaniumBlocks.RAW_TITANIUM_BLOCK, new Item.Properties());
    public static final Item TITANIUM_BLOCK = new BlockItem(TitaniumBlocks.TITANIUM_BLOCK, new Item.Properties());
    //public static final Item TITANIUM_LANTERN = new BlockItem(TitaniumBlocks.TITANIUM_LANTERN, new Item.Properties());

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_helmet"), TITANIUM_HELMET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_leggings"), TITANIUM_LEGGINGS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_boots"), TITANIUM_BOOTS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_shovel"), TITANIUM_SHOVEL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_sword"), TITANIUM_SWORD);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_pickaxe"), TITANIUM_PICKAXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_axe"), TITANIUM_AXE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_hoe"), TITANIUM_HOE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "raw_titanium"), RAW_TITANIUM);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_nugget"), TITANIUM_NUGGET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "music_disc_amethyst"), MUSIC_DISC_AMETHYST);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_horse_armor"), TITANIUM_HORSE_ARMOR);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "end_powder"), END_POWDER);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "flight_charge"), FLIGHT_CHARGE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "testing_wand"), TESTING_WAND);

        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "end_titanium_ore"), END_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        //Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Titanium.MOD_ID, "titanium_lantern"), TITANIUM_LANTERN);
    }
}
