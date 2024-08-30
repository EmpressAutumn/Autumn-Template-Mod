package com.atom596.titanium.block;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.regutils.RegistrationProvider;
import com.atom596.titanium.regutils.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TitaniumBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, Titanium.MOD_ID);

    public static final RegistryObject<Block, Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new Block(Properties.of().strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block, Block> DEEPSLATE_TITANIUM_ORE = BLOCKS.register("deepslate_titanium_ore", () -> new Block(Properties.of().strength(4.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block, Block> END_TITANIUM_ORE = BLOCKS.register("end_titanium_ore", () -> new Block(Properties.of().strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block, Block> RAW_TITANIUM_BLOCK = BLOCKS.register("raw_titanium_block", () -> new Block(Properties.of().strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block, Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new Block(Properties.of().strength(4.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    //public static final RegistryObject<Block, TitaniumLanternBlock> TITANIUM_LANTERN = BLOCKS.register("titanium_lantern", () -> new TitaniumLanternBlock());

    public static void init() {}
}
