package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class TitaniumItems {
    public static final ToolItem TITANIUM_SHOVEL = new ShovelItem(TitaniumTools.INSTANCE, 1.5F, -3.0F, new FabricItemSettings());
    public static final ToolItem TITANIUM_SWORD = new SwordItem(TitaniumTools.INSTANCE, 3, -2.4F, new FabricItemSettings());
    public static final ToolItem TITANIUM_PICKAXE = new PickaxeItem(TitaniumTools.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static final ToolItem TITANIUM_AXE = new AxeItem(TitaniumTools.INSTANCE, 6.0F, -3.1F, new FabricItemSettings());
    public static final ToolItem TITANIUM_HOE = new HoeItem(TitaniumTools.INSTANCE, -2, -1.0F, new FabricItemSettings());
    public static final ArmorItem TITANIUM_HELMET = new ArmorItem(TitaniumArmor.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final ArmorItem TITANIUM_CHESTPLATE = new ArmorItem(TitaniumArmor.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final ArmorItem TITANIUM_LEGGINGS = new ArmorItem(TitaniumArmor.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final ArmorItem TITANIUM_BOOTS = new ArmorItem(TitaniumArmor.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static final Item RAW_TITANIUM = new Item(new FabricItemSettings());
    public static final Item TITANIUM_INGOT = new Item(new FabricItemSettings());
    public static final Item MUSIC_DISC_AMETHYST = new MusicDiscItem(
            14,
            TitaniumSounds.MUSIC_DISC_AMETHYST,
            new FabricItemSettings().maxCount(1).rarity(Rarity.RARE),
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
