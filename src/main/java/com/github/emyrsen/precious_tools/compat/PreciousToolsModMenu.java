package com.github.emyrsen.precious_tools.compat;

import net.fabricmc.api.Environment;

import com.github.emyrsen.precious_tools.config.PreciousToolsConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PreciousToolsModMenu implements ModMenuApi {

  @Override
  public ConfigScreenFactory<?> getModConfigScreenFactory() {
    return parent -> AutoConfig.getConfigScreen(PreciousToolsConfig.class, parent).get();
  }

}
