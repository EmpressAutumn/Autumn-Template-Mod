package com.atom596.titanium.mixin;

import com.atom596.titanium.Titanium;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GeodeFeature.class)
public class GeodeBarrelMixin {
	@Inject(at = @At("RETURN"), method = "place")
	private void gen_barrel(FeaturePlaceContext<GeodeConfiguration> context, CallbackInfoReturnable<Boolean> cir) {
		WorldGenLevel structureWorldAccess = context.level();
		RandomSource random = context.random();
		int radius = context.config().outerWallDistance.sample(random);

		BlockPos barrelPos = context.origin().offset(radius, 0, radius);
		for(int i = 0; i < 2 * radius; i++) {
			if(!structureWorldAccess.isEmptyBlock(barrelPos)) {
				barrelPos = barrelPos.offset(0, 1, 0);
			}
		}

		structureWorldAccess.setBlock(barrelPos, Blocks.BARREL.defaultBlockState(), Block.UPDATE_CLIENTS);
		((ChestBlockEntity) structureWorldAccess.getBlockEntity(barrelPos)).setLootTable(ResourceKey.create(Registries.LOOT_TABLE, new ResourceLocation(Titanium.MOD_ID, "chests/amethyst_barrel")));
	}
}
