package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;

public class TitaniumItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, Titanium.MOD_ID);

    public static final RegistryObject<Item, ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(ShovelItem.createAttributes(TitaniumToolMaterial.INSTANCE, 1.5f, -3.0f))));
    public static final RegistryObject<Item, SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(SwordItem.createAttributes(TitaniumToolMaterial.INSTANCE, 3, -2.4f))));
    public static final RegistryObject<Item, PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(TitaniumToolMaterial.INSTANCE,  new Item.Properties().attributes(PickaxeItem.createAttributes(TitaniumToolMaterial.INSTANCE, 1.0f, -2.8f))));
    public static final RegistryObject<Item, AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(AxeItem.createAttributes(TitaniumToolMaterial.INSTANCE, 6.0f, -3.1f))));
    public static final RegistryObject<Item, HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(TitaniumToolMaterial.INSTANCE, new Item.Properties().attributes(HoeItem.createAttributes(TitaniumToolMaterial.INSTANCE, -2.0f, -1.0f))));
    public static final RegistryObject<Item, ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(TitaniumArmorMaterial.INSTANCE.asHolder(), ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item, ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(TitaniumArmorMaterial.INSTANCE.asHolder(), ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item, ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(TitaniumArmorMaterial.INSTANCE.asHolder(), ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item, ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(TitaniumArmorMaterial.INSTANCE.asHolder(), ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item, Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item, Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item, Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item, TitaniumRecordItem> MUSIC_DISC_AMETHYST = ITEMS.register("music_disc_amethyst",
            TitaniumRecordItem::new);
    public static final RegistryObject<Item, AnimalArmorItem> TITANIUM_HORSE_ARMOR = ITEMS.register("titanium_horse_armor",
            () -> new AnimalArmorItem(TitaniumArmorMaterial.INSTANCE.asHolder(), AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item, Item> END_POWDER = ITEMS.register("end_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item, FlightChargeItem> FLIGHT_CHARGE = ITEMS.register("flight_charge",
            FlightChargeItem::new);
    public static final RegistryObject<Item, Item> TESTING_WAND = ITEMS.register("testing_wand",
            TestingWandItem::new);

    public static final RegistryObject<Item, BlockItem> TITANIUM_ORE = ITEMS.register("titanium_ore",
            () -> new BlockItem(TitaniumBlocks.TITANIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item, BlockItem> DEEPSLATE_TITANIUM_ORE = ITEMS.register("deepslate_titanium_ore",
            () -> new BlockItem(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item, BlockItem> END_TITANIUM_ORE = ITEMS.register("end_titanium_ore",
            () -> new BlockItem(TitaniumBlocks.END_TITANIUM_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item, BlockItem> RAW_TITANIUM_BLOCK = ITEMS.register("raw_titanium_block",
            () -> new BlockItem(TitaniumBlocks.RAW_TITANIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item, BlockItem> TITANIUM_BLOCK = ITEMS.register("titanium_block",
            () -> new BlockItem(TitaniumBlocks.TITANIUM_BLOCK.get(), new Item.Properties()));
    //public static final RegistryObject<Item, BlockItem> TITANIUM_LANTERN = ITEMS.register("titanium_lantern",
            //() -> new BlockItem(TitaniumBlocks.TITANIUM_LANTERN.get(), new Item.Properties()));

    public static void init() {}
}
