package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.sound.TitaniumSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class TitaniumItems {
    public static final Item TITANIUM_SHOVEL = new ShovelItem(TitaniumToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(TitaniumToolMaterial.INSTANCE, 1.5f, -3.0f)));
    public static final Item TITANIUM_SWORD = new SwordItem(TitaniumToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(TitaniumToolMaterial.INSTANCE, 3, -2.4f)));
    public static final Item TITANIUM_PICKAXE = new PickaxeItem(TitaniumToolMaterial.INSTANCE,  new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(TitaniumToolMaterial.INSTANCE, 1.0f, -2.8f)));
    public static final Item TITANIUM_AXE = new AxeItem(TitaniumToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(TitaniumToolMaterial.INSTANCE, 6.0f, -3.1f)));
    public static final Item TITANIUM_HOE = new HoeItem(TitaniumToolMaterial.INSTANCE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(TitaniumToolMaterial.INSTANCE, -2.0f, -1.0f)));
    public static final Item TITANIUM_HELMET = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1));
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1));
    public static final Item TITANIUM_BOOTS = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1));
    public static final Item RAW_TITANIUM = new Item(new Item.Settings());
    public static final Item TITANIUM_NUGGET = new Item(new Item.Settings());
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings());
    public static final Item MUSIC_DISC_AMETHYST = new MusicDiscItem(
            14,
            TitaniumSounds.MUSIC_DISC_AMETHYST,
            new Item.Settings().maxCount(1).rarity(Rarity.RARE),
            144
    );
    public static final Item TITANIUM_HORSE_ARMOR = new AnimalArmorItem(TitaniumArmorMaterial.INSTANCE, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1));
    public static final Item END_POWDER = new Item(new Item.Settings());
    public static final Item FLIGHT_CHARGE = new FlightChargeItem(new Item.Settings());
    public static final Item TESTING_WAND = new TestingWandItem();

    public static final Item TITANIUM_ORE = new BlockItem(TitaniumBlocks.TITANIUM_ORE, new Item.Settings());
    public static final Item DEEPSLATE_TITANIUM_ORE = new BlockItem(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE, new Item.Settings());
    public static final Item END_TITANIUM_ORE = new BlockItem(TitaniumBlocks.END_TITANIUM_ORE, new Item.Settings());
    public static final Item RAW_TITANIUM_BLOCK = new BlockItem(TitaniumBlocks.RAW_TITANIUM_BLOCK, new Item.Settings());
    public static final Item TITANIUM_BLOCK = new BlockItem(TitaniumBlocks.TITANIUM_BLOCK, new Item.Settings());
    public static final Item TITANIUM_LANTERN = new BlockItem(TitaniumBlocks.TITANIUM_LANTERN, new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_helmet"), TITANIUM_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_leggings"), TITANIUM_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_boots"), TITANIUM_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_shovel"), TITANIUM_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_sword"), TITANIUM_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_pickaxe"), TITANIUM_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_axe"), TITANIUM_AXE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_hoe"), TITANIUM_HOE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "raw_titanium"), RAW_TITANIUM);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_nugget"), TITANIUM_NUGGET);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "music_disc_amethyst"), MUSIC_DISC_AMETHYST);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_horse_armor"), TITANIUM_HORSE_ARMOR);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "end_powder"), END_POWDER);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "flight_charge"), FLIGHT_CHARGE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "testing_wand"), TESTING_WAND);

        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "end_titanium_ore"), END_TITANIUM_ORE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_lantern"), TITANIUM_LANTERN);
    }
}
