package com.atom596.titanium.world;

import com.atom596.titanium.Titanium;
import com.atom596.titanium.block.TitaniumBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class TitaniumConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_TITANIUM_ORE_KEY = registerKey("end_titanium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TitaniumBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTitaniumOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, TitaniumBlocks.END_TITANIUM_ORE.getDefaultState()));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 12));
        register(context, END_TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endTitaniumOre, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Titanium.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    /*public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TitaniumBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TitaniumBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endTitaniumOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, TitaniumBlocks.END_TITANIUM_ORE.getDefaultState()));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 8));
    }

    private static class_2975<?, ?> OVERWORLD_TITANIUM_ORE_CONFIGURED_FEATURE = class_3031.field_13517.method_23397(new class_3124(new class_3819(class_2246.field_10340), TITANIUM_ORE.method_9564(), 8));
    public static class_6796 OVERWORLD_TITANIUM_ORE_PLACED_FEATURE = OVERWORLD_TITANIUM_ORE_CONFIGURED_FEATURE.method_39594(new class_6797[]{class_6793.method_39623(2), class_5450.method_39639(), class_6795.method_39634(class_5843.method_33840(), class_5843.method_33841(16))});
    private static class_2975<?, ?> OVERWORLD_DEEPSLATE_TITANIUM_ORE_CONFIGURED_FEATURE = class_3031.field_13517.method_23397(new class_3124(new class_3819(class_2246.field_28888), DEEPSLATE_TITANIUM_ORE.method_9564(), 8));
    public static class_6796 OVERWORLD_DEEPSLATE_TITANIUM_ORE_PLACED_FEATURE = OVERWORLD_DEEPSLATE_TITANIUM_ORE_CONFIGURED_FEATURE.method_39594(new class_6797[]{class_6793.method_39623(2), class_5450.method_39639(), class_6795.method_39634(class_5843.method_33840(), class_5843.method_33841(0))});
    private static class_2975<?, ?> END_TITANIUM_ORE_CONFIGURED_FEATURE = class_3031.field_13517.method_23397(new class_3124(new class_3819(class_2246.field_10471), END_TITANIUM_ORE.method_9564(), 8));
    public static class_6796 END_TITANIUM_ORE_PLACED_FEATURE = END_TITANIUM_ORE_CONFIGURED_FEATURE.method_39594(new class_6797[]{class_6793.method_39623(8), class_5450.method_39639(), class_6795.method_39634(class_5843.method_33840(), class_5843.method_33841(128))});

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Titanium.MOD_ID, name));
    }

    public static void register() {
        Registry.register(Registries.FEATURE, new Identifier(MOD_ID, "overworld_titanium_ore"), OVERWORLD_TITANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(Registries.FEATURE, new Identifier(MOD_ID, "overworld_titanium_ore"), OVERWORLD_TITANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), class_2895.field_13176, class_5321.method_29179(class_2378.field_35758, new class_2960("titanium", "overworld_titanium_ore")));
        Registry.register(Registries.FEATURE, new Identifier(MOD_ID, "overworld_deepslate_titanium_ore"), OVERWORLD_DEEPSLATE_TITANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(Registries.FEATURE, new Identifier(MOD_ID, "overworld_deepslate_titanium_ore"), OVERWORLD_DEEPSLATE_TITANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), class_2895.field_13176, class_5321.method_29179(class_2378.field_35758, new class_2960("titanium", "overworld_deepslate_titanium_ore")));
        Registry.register(Registries.FEATURE, new Identifier(MOD_ID, "end_titanium_ore"), END_TITANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(Registries.FEATURE, new Identifier(MOD_ID, "end_titanium_ore"), END_TITANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), class_2895.field_13176, class_5321.method_29179(class_2378.field_35758, new class_2960("titanium", "end_titanium_ore")));
    }*/
}
