package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.item.TitaniumArmorMaterial;
import com.atom596.titanium.item.TitaniumItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class TitaniumArmorMaterialRegistry {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(BuiltInRegistries.ARMOR_MATERIAL, Titanium.MOD_ID);

    public static final Holder<ArmorMaterial> I = ARMOR_MATERIALS.register(
            "titanium",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                            map.put(ArmorItem.Type.HELMET, 3);
                            map.put(ArmorItem.Type.CHESTPLATE, 5);
                            map.put(ArmorItem.Type.LEGGINGS, 7);
                            map.put(ArmorItem.Type.BOOTS, 3);
                            map.put(ArmorItem.Type.BODY, 8);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(TitaniumItems.TITANIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(new ResourceLocation(Titanium.MOD_ID, "titanium"))),
                    1.0f,
                    0.0f
            )
    );

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
        TitaniumArmorMaterial.INSTANCE = I;
    }
}
