package com.github.emyrsen.precious_tools.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "precious_tools")
public class PreciousToolsConfig implements ConfigData {
	@ConfigEntry.Category("category.precious_tools")
	@ConfigEntry.Gui.Tooltip(count = 4)
	public int minimumFlatDurability = 1;
	@ConfigEntry.Category("category.precious_tools")
	@ConfigEntry.BoundedDiscrete(min = 0, max = 100)
	@ConfigEntry.Gui.Tooltip(count = 4)
	public int minimumPercentageDurability = 0;
}