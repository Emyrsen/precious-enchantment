package com.github.emyrsen.precious_tools;

import com.github.emyrsen.precious_tools.enchantment.PreciousEnchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

public abstract class Registries {
  public static void registerAll() {
    registerEnchantments();
  }

  // #region enchantments ======================================================

  public static final Enchantment PRECIOUS = new PreciousEnchantment();

  public static void registerEnchantments() {
    Registry.register(Registry.ENCHANTMENT, PreciousToolsMod.makeIdentifier("precious"), PRECIOUS);
  }

  // #endregion enchantments ===================================================
}
