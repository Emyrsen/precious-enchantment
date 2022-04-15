package com.github.emyrsen.precious_tools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import com.github.emyrsen.precious_tools.config.PreciousToolsConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class PreciousToolsMod implements ModInitializer {
	public static final String MOD_ID = "precious_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static ConfigHolder<PreciousToolsConfig> configHolder;

	@Override
	public void onInitialize() {
		registerConfig();
		Registries.registerAll();
	}

	// #region helpers ============================================================

	static Identifier makeIdentifier(String path) {
		return new Identifier(MOD_ID, path);
	}

	private void registerConfig() {
		AutoConfig.register(PreciousToolsConfig.class, GsonConfigSerializer::new);
		configHolder = AutoConfig.getConfigHolder(PreciousToolsConfig.class);
	}

	public static PreciousToolsConfig getConfig() {
		return configHolder.getConfig();
	}

	// #endregion helpers =========================================================
}
