package com.atom596.template;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Template.MOD_ID)
public class TemplateDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {

    }
}
