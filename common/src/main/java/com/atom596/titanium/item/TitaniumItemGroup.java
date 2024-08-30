package com.atom596.titanium.item;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TitaniumItemGroup {
    public static final RegistrationProvider<CreativeModeTab> ITEM_GROUPS = RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, Titanium.MOD_ID);

    public static final RegistryObject<CreativeModeTab, CreativeModeTab> TITANIUM_GROUP = ITEM_GROUPS.register("titanium_group",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .icon(() -> new ItemStack(TitaniumItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("itemGroup.titanium.titanium_group"))
                    .displayItems((context, entries) -> {
                        entries.accept(TitaniumBlocks.TITANIUM_BLOCK.get());
                        entries.accept(TitaniumBlocks.TITANIUM_ORE.get());
                        entries.accept(TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        entries.accept(TitaniumBlocks.END_TITANIUM_ORE.get());
                        entries.accept(TitaniumBlocks.RAW_TITANIUM_BLOCK.get());
                        //entries.accept(TitaniumBlocks.TITANIUM_LANTERN.get());
                        entries.accept(TitaniumItems.TITANIUM_SHOVEL.get());
                        entries.accept(TitaniumItems.TITANIUM_PICKAXE.get());
                        entries.accept(TitaniumItems.TITANIUM_AXE.get());
                        entries.accept(TitaniumItems.TITANIUM_HOE.get());
                        entries.accept(TitaniumItems.FLIGHT_CHARGE.get());
                        entries.accept(TitaniumItems.TITANIUM_SWORD.get());
                        entries.accept(TitaniumItems.TITANIUM_HELMET.get());
                        entries.accept(TitaniumItems.TITANIUM_CHESTPLATE.get());
                        entries.accept(TitaniumItems.TITANIUM_LEGGINGS.get());
                        entries.accept(TitaniumItems.TITANIUM_BOOTS.get());
                        entries.accept(TitaniumItems.TITANIUM_HORSE_ARMOR.get());
                        entries.accept(TitaniumItems.RAW_TITANIUM.get());
                        entries.accept(TitaniumItems.TITANIUM_NUGGET.get());
                        entries.accept(TitaniumItems.TITANIUM_INGOT.get());
                        entries.accept(TitaniumItems.END_POWDER.get());
                        //entries.accept(TitaniumItems.MUSIC_DISC_AMETHYST.get());
                    })
                    .build());

    public static void init() {}
}
