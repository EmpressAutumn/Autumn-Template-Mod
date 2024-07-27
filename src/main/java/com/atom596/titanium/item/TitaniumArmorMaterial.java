package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import java.util.List;
import java.util.Map;

public class TitaniumArmorMaterial {
    public static void initialize() {
    }

    public static final RegistryEntry<ArmorMaterial> INSTANCE = Registry.registerReference(
            Registries.ARMOR_MATERIAL,
            new Identifier(Titanium.MOD_ID, "titanium"),
            new ArmorMaterial(
                    Map.of(ArmorItem.Type.HELMET, 3,
                            ArmorItem.Type.CHESTPLATE, 5,
                            ArmorItem.Type.LEGGINGS, 7,
                            ArmorItem.Type.BOOTS, 3,
                            ArmorItem.Type.BODY, 8),
                    15,
                    SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                    () -> Ingredient.ofItems(TitaniumItems.TITANIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(new Identifier(Titanium.MOD_ID, "titanium"))),
                    1.0f,
                    0.0f
            )
    );
}
