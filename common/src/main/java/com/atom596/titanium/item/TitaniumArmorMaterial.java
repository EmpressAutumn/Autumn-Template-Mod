package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.Map;

public class TitaniumArmorMaterial {
    public static final RegistrationProvider<ArmorMaterial> ARMOR_MATERIALS = RegistrationProvider.get(BuiltInRegistries.ARMOR_MATERIAL, Titanium.MOD_ID);

    public static final RegistryObject<ArmorMaterial, ArmorMaterial> INSTANCE = ARMOR_MATERIALS.register("titanium",
            () -> new ArmorMaterial(
                    Map.of(ArmorItem.Type.HELMET, 3,
                            ArmorItem.Type.CHESTPLATE, 5,
                            ArmorItem.Type.LEGGINGS, 7,
                            ArmorItem.Type.BOOTS, 3,
                            ArmorItem.Type.BODY, 8),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(TitaniumItems.TITANIUM_INGOT.get()),
                    List.of(new ArmorMaterial.Layer(new ResourceLocation(Titanium.MOD_ID, "titanium"))),
                    1.0f,
                    0.0f
            )
    );

    public static void init() {}
}
