# Autumn's Minecraft Modding Template

### Overview

A fully operational Minecraft mod template for Fabric and NeoForge, with NeoForge Data Generation already configured.

### Setup

1. Generate a GitHub repository from this template.
2. Clone your repository and open it in your preferred IDE.
3. Change the mod's name in all of these files:
   - build.gradle (line 12)
   - gradle.properties (lines 6, 11, and 13)
   - settings.gradle (line 49)
   - com.atom596.template.Template (lines 7 and 8)
4. Replace "EmpressAutumn" with your username in these files:
   - gradle.properties (line 12)
   - com.atom596.template.TemplateFabric (line 10)
   - com.atom596.template.TemplateNeoForge (line 10)
5. Change the name of these files to match your mod:
   - common/src/main/resources/template.mixins.json
   - fabric/src/main/resources/template.fabric.mixins.json
   - fabric/src/main/resources/services/com.atom596.template.platform.services.IPlatformHelper
   - neoforge/src/main/resources/template.neoforge.mixins.json
   - neoforge/src/main/resources/services/com.atom596.template.platform.services.IPlatformHelper
6. Change these classes to match your mod's name:
   - com.atom596.template.Template
   - com.atom596.template.TemplateFabric
   - com.atom596.template.TemplateDataGenerator
   - com.atom596.template.TemplateNeoForge
7. Change the name of the package com.atom596.template to match your username and mod's name
8. Enjoy adding content to your mod!

### License
This mod template is available under the CC0 license.
