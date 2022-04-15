package com.github.emyrsen.precious_tools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreciousToolsMod implements ModInitializer {
	public static final String MOD_ID = "precious_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Registries.registerAll();
	}

	// #region helpers ============================================================
	
	static Identifier makeIdentifier(String path) {
		return new Identifier(MOD_ID, path);
	}
	
	// #endregion helpers =========================================================
}
