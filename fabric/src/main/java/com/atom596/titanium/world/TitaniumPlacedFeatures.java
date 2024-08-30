package com.atom596.titanium.world;

import java.util.List;

public class TitaniumPlacedFeatures {/*
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> END_TITANIUM_ORE_PLACED_KEY = registerKey("end_titanium_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TitaniumConfiguredFeatures.TITANIUM_ORE_KEY),
                TitaniumOrePlacement.modifiersWithCount(10, HeightRangePlacementModifier.trapezoid(YOffset.BOTTOM, YOffset.fixed(50))));
        register(context, END_TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TitaniumConfiguredFeatures.END_TITANIUM_ORE_KEY),
                TitaniumOrePlacement.modifiersWithCount(48, HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.TOP)));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Titanium.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
*/}
