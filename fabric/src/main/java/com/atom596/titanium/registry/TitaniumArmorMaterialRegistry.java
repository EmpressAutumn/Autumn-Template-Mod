package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumArmorMaterial;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.Map;

public class TitaniumArmorMaterialRegistry {
    public static void register() {
        TitaniumArmorMaterial.INSTANCE = Registry.registerForHolder(
                BuiltInRegistries.ARMOR_MATERIAL,
                new ResourceLocation(Titanium.MOD_ID, "titanium"),
                new ArmorMaterial(
                        Map.of(ArmorItem.Type.HELMET, 3,
                                ArmorItem.Type.CHESTPLATE, 5,
                                ArmorItem.Type.LEGGINGS, 7,
                                ArmorItem.Type.BOOTS, 3,
                                ArmorItem.Type.BODY, 8),
                        15,
                        SoundEvents.ARMOR_EQUIP_IRON,
                        () -> Ingredient.of(TitaniumItems.TITANIUM_INGOT),
                        List.of(new ArmorMaterial.Layer(new ResourceLocation(Titanium.MOD_ID, "titanium"))),
                        1.0f,
                        0.0f
                )
        );
    }
}
