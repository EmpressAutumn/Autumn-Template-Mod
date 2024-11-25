package com.atom596.titanium;

import com.atom596.titanium.item.TitaniumItems;
import it.unimi.dsi.fastutil.objects.ObjectSortedSet;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import java.util.function.Supplier;

@Mod(Titanium.MOD_ID)
public class TitaniumNeoforge {
    public TitaniumNeoforge(IEventBus eventBus) {
        Titanium.initialize();
        eventBus.addListener(this::addCreative);
        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ObjectSortedSet<ItemStack> entries = event.getSearchEntries();
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            putAfter(entries, Items.LIGHT_WEIGHTED_PRESSURE_PLATE, TitaniumItems.TITANIUM_BLOCK);
            event.accept(TitaniumItems.TITANIUM_BLOCK.get()); // After Light Weighted Pressure Plate
        }
        else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            putAfter(entries, Items.DEEPSLATE_GOLD_ORE, TitaniumItems.TITANIUM_ORE);
            putAfter(entries, TitaniumItems.TITANIUM_ORE.get(), TitaniumItems.DEEPSLATE_TITANIUM_ORE);
            putAfter(entries, Items.NETHER_QUARTZ_ORE, TitaniumItems.END_TITANIUM_ORE);
            putAfter(entries, Items.RAW_GOLD_BLOCK, TitaniumItems.RAW_TITANIUM_BLOCK);
        }
        else if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            putAfter(entries, Items.LANTERN, TitaniumItems.TITANIUM_LANTERN);
        }
        else if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            putAfter(entries, Items.GOLDEN_HOE, TitaniumItems.TITANIUM_SHOVEL);
            putAfter(entries, TitaniumItems.TITANIUM_SHOVEL.get(), TitaniumItems.TITANIUM_PICKAXE);
            putAfter(entries, TitaniumItems.TITANIUM_PICKAXE.get(), TitaniumItems.TITANIUM_AXE);
            putAfter(entries, TitaniumItems.TITANIUM_AXE.get(), TitaniumItems.TITANIUM_HOE);
            putAfter(entries, Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE);
            putAfter(entries, Items.MUSIC_DISC_PIGSTEP, TitaniumItems.MUSIC_DISC_AMETHYST);
        }
        else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            putAfter(entries, Items.GOLDEN_SWORD, TitaniumItems.TITANIUM_SWORD);
            putAfter(entries, Items.GOLDEN_AXE, TitaniumItems.TITANIUM_AXE);
            putAfter(entries, Items.GOLDEN_BOOTS, TitaniumItems.TITANIUM_HELMET);
            putAfter(entries, TitaniumItems.TITANIUM_HELMET.get(), TitaniumItems.TITANIUM_CHESTPLATE);
            putAfter(entries, TitaniumItems.TITANIUM_CHESTPLATE.get(), TitaniumItems.TITANIUM_LEGGINGS);
            putAfter(entries, TitaniumItems.TITANIUM_LEGGINGS.get(), TitaniumItems.TITANIUM_BOOTS);
            putAfter(entries, Items.GOLDEN_HORSE_ARMOR, TitaniumItems.TITANIUM_HORSE_ARMOR);
        }
        else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            putAfter(entries, Items.RAW_GOLD, TitaniumItems.RAW_TITANIUM);
            putAfter(entries, Items.GOLD_NUGGET, TitaniumItems.TITANIUM_NUGGET);
            putAfter(entries, Items.GOLD_INGOT, TitaniumItems.TITANIUM_INGOT);
            putAfter(entries, Items.FIRE_CHARGE, TitaniumItems.FLIGHT_CHARGE);
            putAfter(entries, Items.BLAZE_POWDER, TitaniumItems.END_POWDER);
        }
        else if (event.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
            putAfter(entries, Items.DEBUG_STICK, TitaniumItems.TESTING_WAND);
        }
    }

    private static void putAfter(ObjectSortedSet<ItemStack> entries, ItemLike after, Supplier<? extends ItemLike> supplier) {
        ItemLike key = supplier.get();
        if (!entries.contains(new ItemStack(after))) return;
        ObjectSortedSet<ItemStack> head = entries.headSet(new ItemStack(after));
        ObjectSortedSet<ItemStack> tail = entries.tailSet(new ItemStack(after));
        head.add(new ItemStack(key));
        tail.remove(new ItemStack(after));
        head.addAll(tail);
        entries = head;
    }
}
