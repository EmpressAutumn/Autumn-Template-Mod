package com.atom596.template;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.LoggerFactory;

public class Template {
	public static final String MOD_ID = "template";
	public static final String MOD_NAME = "Template";
	public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static void initialize() {}

	public static ResourceLocation resourceLocation(String id) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
	}
}
