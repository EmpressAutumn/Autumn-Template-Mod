package com.atom596.template;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Template.MOD_ID)
public class TemplateNeoforge {
    public TemplateNeoforge(IEventBus eventBus) {
        Template.initialize();
        Template.LOGGER.info("Initialized " + Template.MOD_NAME + " by EmpressAutumn");
    }
}
