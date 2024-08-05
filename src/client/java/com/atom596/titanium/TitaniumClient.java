package com.atom596.titanium;

import com.atom596.titanium.block.TitaniumBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TitaniumClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(TitaniumBlocks.TITANIUM_LANTERN,
				RenderLayer.getTranslucent());
	}
}