package com.atom596.titanium.world;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class TitaniumConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TITANIUM_ORE_KEY = registerKey("end_titanium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldTitaniumOres =
                List.of(OreConfiguration.target(stoneReplaceables, TitaniumBlocks.TITANIUM_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> endTitaniumOre =
                List.of(OreConfiguration.target(endReplaceables, TitaniumBlocks.END_TITANIUM_ORE.get().defaultBlockState()));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTitaniumOres, 7));
        register(context, END_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endTitaniumOre, 6));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Titanium.MOD_ID, name));
    }

    private static <FC extends OreConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                   ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
