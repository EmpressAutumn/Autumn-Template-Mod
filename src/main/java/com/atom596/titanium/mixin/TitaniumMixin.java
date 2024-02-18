package com.atom596.titanium.mixin;

import com.atom596.titanium.Titanium;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.LootableInventory;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.FeatureContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GeodeFeature.class)
public class TitaniumMixin {
	@Inject(at = @At("RETURN"), method = "generate")
	private void gen_barrel(FeatureContext<GeodeFeatureConfig> context, CallbackInfoReturnable<Boolean> cir) {
		StructureWorldAccess structureWorldAccess = context.getWorld();
		Random random = context.getRandom();
		int radius = context.getConfig().outerWallDistance.get(random);

		BlockPos barrelPos = context.getOrigin().add(radius, 0, radius);
		for(int i = 0; i < 2 * radius; i++) {
			if(!structureWorldAccess.isAir(barrelPos)) {
				barrelPos = barrelPos.add(0, 1, 0);
			}
		}

		structureWorldAccess.setBlockState(barrelPos, Blocks.BARREL.getDefaultState(), Block.NOTIFY_LISTENERS);
		LootableInventory.setLootTable(structureWorldAccess, random, barrelPos, new Identifier(Titanium.MOD_ID, "chests/amethyst_barrel"));
	}
}
