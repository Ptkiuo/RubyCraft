package com.ptk671.rubycraft.item;

import com.ptk671.rubycraft.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.pitan76.mcpitanlib.api.item.ArmorEquipmentType;
import net.pitan76.mcpitanlib.api.item.CompatibleArmorMaterial;

import java.util.HashMap;
import java.util.Map;

public class RubyArmorMaterial implements CompatibleArmorMaterial {
    private final Map<ArmorEquipmentType, int[]> ARMOR_SETTINGS = new HashMap<>();
    private final int[] PROTECTION_VALUES = new int[]{4, 7, 6, 4};

    public RubyArmorMaterial() {
        ARMOR_SETTINGS.put(ArmorEquipmentType.HEAD, new int[]{13, 4});
        ARMOR_SETTINGS.put(ArmorEquipmentType.CHEST, new int[]{15, 7});
        ARMOR_SETTINGS.put(ArmorEquipmentType.LEGS, new int[]{16, 6});
        ARMOR_SETTINGS.put(ArmorEquipmentType.FEET, new int[]{11, 4});
    }

    @Override
    public int getDurability(ArmorEquipmentType type) {
        return ARMOR_SETTINGS.get(type)[0] * 30;
    }

    @Override
    public int getProtection(ArmorEquipmentType type) {
        return ARMOR_SETTINGS.get(type)[1];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.RUBY_INGOT.get());
    }

    @Override
    public String getName() {
        return "ruby";
    }

    @Override
    public Identifier getId() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0.3F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
