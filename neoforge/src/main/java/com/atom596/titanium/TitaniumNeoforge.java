package com.atom596.titanium;

import com.atom596.titanium.item.TitaniumItems;
import it.unimi.dsi.fastutil.objects.ObjectSortedSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(Titanium.MOD_ID)
public class TitaniumNeoforge {
    public TitaniumNeoforge(IEventBus eventBus) {
        Titanium.initialize();
        eventBus.addListener(this::addCreative);
        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }

    @SubscribeEvent
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility v = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        ObjectSortedSet<ItemStack> entries = event.getSearchEntries();
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            putAfter(event, Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumItems.TITANIUM_BLOCK.get());
        }
        else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            putAfter(event, Items.DEEPSLATE_GOLD_ORE, TitaniumItems.TITANIUM_ORE.get());
            putAfter(event, TitaniumItems.TITANIUM_ORE.get(), TitaniumItems.DEEPSLATE_TITANIUM_ORE.get());
            putAfter(event, Items.NETHER_QUARTZ_ORE, TitaniumItems.END_TITANIUM_ORE.get());
            putAfter(event, Items.RAW_GOLD_BLOCK, TitaniumItems.RAW_TITANIUM_BLOCK.get());
        }
        else if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            putAfter(event, Items.LANTERN, TitaniumItems.TITANIUM_LANTERN.get());
        }
        else if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            putAfter(event, Items.GOLDEN_HOE, TitaniumItems.TITANIUM_SHOVEL.get());
            putAfter(event, TitaniumItems.TITANIUM_SHOVEL.get(), TitaniumItems.TITANIUM_PICKAXE.get());
            putAfter(event, TitaniumItems.TITANIUM_PICKAXE.get(), TitaniumItems.TITANIUM_AXE.get());
            putAfter(event, TitaniumItems.TITANIUM_AXE.get(), TitaniumItems.TITANIUM_HOE.get());
            putAfter(event, Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE.get());
            putAfter(event, Items.MUSIC_DISC_PIGSTEP, TitaniumItems.MUSIC_DISC_AMETHYST.get());
        }
        else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            putAfter(event, Items.GOLDEN_SWORD, TitaniumItems.TITANIUM_SWORD.get());
            putAfter(event, Items.GOLDEN_AXE, TitaniumItems.TITANIUM_AXE.get());
            putAfter(event, Items.GOLDEN_BOOTS, TitaniumItems.TITANIUM_HELMET.get());
            putAfter(event, TitaniumItems.TITANIUM_HELMET.get(), TitaniumItems.TITANIUM_CHESTPLATE.get());
            putAfter(event, TitaniumItems.TITANIUM_CHESTPLATE.get(), TitaniumItems.TITANIUM_LEGGINGS.get());
            putAfter(event, TitaniumItems.TITANIUM_LEGGINGS.get(), TitaniumItems.TITANIUM_BOOTS.get());
            putAfter(event, Items.GOLDEN_HORSE_ARMOR, TitaniumItems.TITANIUM_HORSE_ARMOR.get());
        }
        else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            putAfter(event, Items.RAW_GOLD, TitaniumItems.RAW_TITANIUM.get());
            putAfter(event, Items.GOLD_NUGGET, TitaniumItems.TITANIUM_NUGGET.get());
            putAfter(event, Items.GOLD_INGOT, TitaniumItems.TITANIUM_INGOT.get());
            putAfter(event, Items.BLAZE_POWDER, TitaniumItems.END_POWDER.get());
        }
        else if (event.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
            putAfter(event, Items.DEBUG_STICK, TitaniumItems.TESTING_WAND.get());
        }
    }

    private static void putAfter(BuildCreativeModeTabContentsEvent event, ItemLike existing, ItemLike item) {
        event.insertAfter(existing.asItem().getDefaultInstance(),
                item.asItem().getDefaultInstance(),
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
