package com.github.emyrsen.precious_tools.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;

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

  @Override
  public boolean isAcceptableItem(ItemStack stack) {
    Item item = stack.getItem();
    return super.isAcceptableItem(stack) && !(item instanceof Wearable);
  }
}
