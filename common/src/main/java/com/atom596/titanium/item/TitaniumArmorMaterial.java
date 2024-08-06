package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.Map;

public class TitaniumArmorMaterial {
    public static void initialize() {}

    public static final Holder<ArmorMaterial> INSTANCE = Registry.registerForHolder(
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
