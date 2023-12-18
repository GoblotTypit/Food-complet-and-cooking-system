
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodcompletandcookingsystem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.foodcompletandcookingsystem.world.features.ores.SaltStoneBlockFeature;
import net.mcreator.foodcompletandcookingsystem.FoodCompletAndCookingSystemMod;

@Mod.EventBusSubscriber
public class FoodCompletAndCookingSystemModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FoodCompletAndCookingSystemMod.MODID);
	public static final RegistryObject<Feature<?>> SALT_STONE_BLOCK = REGISTRY.register("salt_stone_block", SaltStoneBlockFeature::new);
}
