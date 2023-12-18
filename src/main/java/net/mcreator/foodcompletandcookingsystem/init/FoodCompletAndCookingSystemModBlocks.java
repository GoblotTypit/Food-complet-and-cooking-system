
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodcompletandcookingsystem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.foodcompletandcookingsystem.block.SaltStoneBlockBlock;
import net.mcreator.foodcompletandcookingsystem.FoodCompletAndCookingSystemMod;

public class FoodCompletAndCookingSystemModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodCompletAndCookingSystemMod.MODID);
	public static final RegistryObject<Block> SALT_STONE_BLOCK = REGISTRY.register("salt_stone_block", () -> new SaltStoneBlockBlock());
}
