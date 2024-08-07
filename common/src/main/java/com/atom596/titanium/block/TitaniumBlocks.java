package com.atom596.titanium.block;


import com.atom596.titanium.Titanium;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
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

    public static void register() {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "end_titanium_ore"), END_TITANIUM_ORE);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        //Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Titanium.MOD_ID, "titanium_lantern"), TITANIUM_LANTERN);
    }
}
