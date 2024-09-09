package com.atom596.titanium.datagen;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TitaniumItemModelProvider extends ItemModelProvider {
    public TitaniumItemModelProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Titanium.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(TitaniumItems.TITANIUM_HELMET);
        simpleItem(TitaniumItems.TITANIUM_CHESTPLATE);
        simpleItem(TitaniumItems.TITANIUM_LEGGINGS);
        simpleItem(TitaniumItems.TITANIUM_BOOTS);
        simpleItem(TitaniumItems.RAW_TITANIUM);
        simpleItem(TitaniumItems.TITANIUM_NUGGET);
        simpleItem(TitaniumItems.TITANIUM_INGOT);
        simpleItem(TitaniumItems.MUSIC_DISC_AMETHYST);
        simpleItem(TitaniumItems.TITANIUM_HORSE_ARMOR);
        simpleItem(TitaniumItems.END_POWDER);
        simpleItem(TitaniumItems.FLIGHT_CHARGE);
        simpleItem(TitaniumItems.TITANIUM_LANTERN);

        handheldItem(TitaniumItems.TITANIUM_SHOVEL);
        handheldItem(TitaniumItems.TITANIUM_SWORD);
        handheldItem(TitaniumItems.TITANIUM_PICKAXE);
        handheldItem(TitaniumItems.TITANIUM_AXE);
        handheldItem(TitaniumItems.TITANIUM_HOE);
        handheldItem(TitaniumItems.TESTING_WAND);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item, Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Titanium.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item, Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Titanium.MOD_ID, "item/" + item.getId().getPath()));
    }
}
