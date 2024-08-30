package com.atom596.titanium.registry;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TitaniumBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Titanium.MOD_ID);

    public static final DeferredHolder TITANIUM_ORE_HOLDER = BLOCKS.register("titanium_ore", () -> TitaniumBlocks.TITANIUM_ORE);
    public static final DeferredHolder DEEPSLATE_TITANIUM_ORE_HOLDER = BLOCKS.register("deepslate_titanium_ore", () -> TitaniumBlocks.DEEPSLATE_TITANIUM_ORE);
    public static final DeferredHolder END_TITANIUM_ORE_HOLDER = BLOCKS.register("end_titanium_ore", () -> TitaniumBlocks.END_TITANIUM_ORE);
    public static final DeferredHolder RAW_TITANIUM_BLOCK_HOLDER = BLOCKS.register("raw_titanium_block", () -> TitaniumBlocks.RAW_TITANIUM_BLOCK);
    public static final DeferredHolder TITANIUM_BLOCK_HOLDER = BLOCKS.register("titanium_block", () -> TitaniumBlocks.TITANIUM_BLOCK);
    //public static final DeferredHolder TITANIUM_LANTERN_HOLDER = BLOCKS.register("titanium_lantern", () -> TitaniumBlocks.TITANIUM_LANTERN);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
