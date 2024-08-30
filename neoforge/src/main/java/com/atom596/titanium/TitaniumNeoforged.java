package com.atom596.titanium;

import com.atom596.titanium.block.TitaniumBlocks;
import com.atom596.titanium.item.TitaniumArmorMaterial;
import com.atom596.titanium.item.TitaniumItems;
import com.atom596.titanium.registry.TitaniumArmorMaterialRegistry;
import com.atom596.titanium.registry.TitaniumBlockRegistry;
import com.atom596.titanium.registry.TitaniumItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Titanium.MOD_ID)
public class TitaniumNeoforged {
    public TitaniumNeoforged(IEventBus eventBus) {
        Titanium.initialize();

        TitaniumArmorMaterial.initialize();
        TitaniumArmorMaterialRegistry.register(eventBus);

        TitaniumItems.initialize();
        TitaniumItemRegistry.register(eventBus);

        TitaniumBlocks.initialize();
        TitaniumBlockRegistry.register(eventBus);

        Titanium.LOGGER.info("Initialized Titanium by EmpressAutumn");
    }
}
