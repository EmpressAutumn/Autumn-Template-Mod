package com.atom596.titanium.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class TitaniumBlocks {
    public static final Block TITANIUM_ORE = new Block(Properties.of().strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final Block DEEPSLATE_TITANIUM_ORE = new Block(Properties.of().strength(4.0F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final Block END_TITANIUM_ORE = new Block(Properties.of().strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final Block RAW_TITANIUM_BLOCK = new Block(Properties.of().strength(4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final Block TITANIUM_BLOCK = new Block(Properties.of().strength(4.0F).sound(SoundType.METAL).requiresCorrectToolForDrops());
    //public static final Block TITANIUM_LANTERN = new TitaniumLanternBlock();

    public static void initialize() {}
}
