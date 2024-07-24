package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.sound.TitaniumSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class TitaniumItems {
    public static final Item TITANIUM_SHOVEL = new ShovelItem(TitaniumToolMaterial.INSTANCE, new Item.Settings());
    public static final Item TITANIUM_SWORD = new SwordItem(TitaniumToolMaterial.INSTANCE, new Item.Settings());
    public static final Item TITANIUM_PICKAXE = new PickaxeItem(TitaniumToolMaterial.INSTANCE,  new Item.Settings());
    public static final Item TITANIUM_AXE = new AxeItem(TitaniumToolMaterial.INSTANCE, new Item.Settings());
    public static final Item TITANIUM_HOE = new HoeItem(TitaniumToolMaterial.INSTANCE, new Item.Settings());
    public static final Item TITANIUM_HELMET = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1));
    public static final Item TITANIUM_CHESTPLATE = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1));
    public static final Item TITANIUM_LEGGINGS = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1));
    public static final Item TITANIUM_BOOTS = new ArmorItem(TitaniumArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1));
    public static final Item RAW_TITANIUM = new Item(new Item.Settings());
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings());
    public static final Item MUSIC_DISC_AMETHYST = new MusicDiscItem(
            14,
            TitaniumSounds.MUSIC_DISC_AMETHYST,
            new Item.Settings().maxCount(1).rarity(Rarity.RARE),
            144
    );

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
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "music_disc_amethyst"), MUSIC_DISC_AMETHYST);
    }
}
