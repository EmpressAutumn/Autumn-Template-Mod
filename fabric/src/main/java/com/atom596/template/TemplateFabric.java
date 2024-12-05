package com.atom596.template;

import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Template.initialize();

        Template.LOGGER.info("Initialized " + Template.MOD_NAME + " by EmpressAutumn");
    }
}
