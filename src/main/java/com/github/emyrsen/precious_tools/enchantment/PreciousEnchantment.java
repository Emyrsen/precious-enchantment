package com.github.emyrsen.precious_tools.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class PreciousEnchantment extends Enchantment {

  public PreciousEnchantment() {
    super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.BREAKABLE,
        new EquipmentSlot[] { EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND });
  }

  @Override
  public int getMaxLevel() {
    return 1;
  }

  @Override
  public int getMinPower(int level) {
    return 1;
  }
}
