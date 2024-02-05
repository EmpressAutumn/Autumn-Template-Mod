package com.atom596.titanium.block;

import com.atom596.titanium.Titanium;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class TitaniumBlocks {
    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.create().strength(4.0F).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block DEEPSLATE_TITANIUM_ORE = new Block(FabricBlockSettings.create().strength(4.0F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool());
    public static final Block END_TITANIUM_ORE = new Block(FabricBlockSettings.create().strength(4.0F).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block RAW_TITANIUM_BLOCK = new Block(FabricBlockSettings.create().strength(4.0F).sounds(BlockSoundGroup.STONE).requiresTool());
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.create().strength(4.0F).sounds(BlockSoundGroup.METAL).requiresTool());

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(Titanium.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_ore"), new BlockItem(TITANIUM_ORE, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier(Titanium.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "deepslate_titanium_ore"), new BlockItem(DEEPSLATE_TITANIUM_ORE, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier(Titanium.MOD_ID, "end_titanium_ore"), END_TITANIUM_ORE);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "end_titanium_ore"), new BlockItem(END_TITANIUM_ORE, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier(Titanium.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "raw_titanium_block"), new BlockItem(RAW_TITANIUM_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier(Titanium.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Titanium.MOD_ID, "titanium_block"), new BlockItem(TITANIUM_BLOCK, new FabricItemSettings()));
    }
}
