package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class TitaniumArmorMaterial {
    public static void initialize() {};

    public static RegistryEntry<ArmorMaterial> registerMaterial(String id, Map<ArmorItem.Type, Integer> defensePoints, int enchantability, RegistryEntry<SoundEvent> equipSound, Supplier<Ingredient> repairIngredientSupplier, float toughness, float knockbackResistance, boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(Identifier.of(Titanium.MOD_ID, id), "", dyeable)
        );

        ArmorMaterial material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredientSupplier, layers, toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(Titanium.MOD_ID, id), material);

        return RegistryEntry.of(material);
    }

    public static final RegistryEntry<ArmorMaterial> INSTANCE = registerMaterial(
            "titanium",
            Map.of(ArmorItem.Type.HELMET, 3,
                    ArmorItem.Type.CHESTPLATE, 5,
                    ArmorItem.Type.LEGGINGS, 7,
                    ArmorItem.Type.BOOTS, 3),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(TitaniumItems.TITANIUM_INGOT),
            1.0f,
            0.0f,
            false);
}
