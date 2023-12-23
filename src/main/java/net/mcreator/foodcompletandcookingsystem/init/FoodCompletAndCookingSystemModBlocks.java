
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodcompletandcookingsystem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.foodcompletandcookingsystem.block.SaltStoneBlockBlock;
import net.mcreator.foodcompletandcookingsystem.block.Crossstage10Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage9Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage8Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage7Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage6Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage5Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage4Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage3Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage2Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage1Block;
import net.mcreator.foodcompletandcookingsystem.block.Cropsstage0Block;
import net.mcreator.foodcompletandcookingsystem.FoodCompletAndCookingSystemMod;

public class FoodCompletAndCookingSystemModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodCompletAndCookingSystemMod.MODID);
	public static final RegistryObject<Block> SALT_STONE_BLOCK = REGISTRY.register("salt_stone_block", () -> new SaltStoneBlockBlock());
	public static final RegistryObject<Block> CROPSSTAGE_0 = REGISTRY.register("cropsstage_0", () -> new Cropsstage0Block());
	public static final RegistryObject<Block> CROPSSTAGE_1 = REGISTRY.register("cropsstage_1", () -> new Cropsstage1Block());
	public static final RegistryObject<Block> CROPSSTAGE_2 = REGISTRY.register("cropsstage_2", () -> new Cropsstage2Block());
	public static final RegistryObject<Block> CROPSSTAGE_3 = REGISTRY.register("cropsstage_3", () -> new Cropsstage3Block());
	public static final RegistryObject<Block> CROPSSTAGE_4 = REGISTRY.register("cropsstage_4", () -> new Cropsstage4Block());
	public static final RegistryObject<Block> CROPSSTAGE_5 = REGISTRY.register("cropsstage_5", () -> new Cropsstage5Block());
	public static final RegistryObject<Block> CROPSSTAGE_6 = REGISTRY.register("cropsstage_6", () -> new Cropsstage6Block());
	public static final RegistryObject<Block> CROPSSTAGE_7 = REGISTRY.register("cropsstage_7", () -> new Cropsstage7Block());
	public static final RegistryObject<Block> CROPSSTAGE_8 = REGISTRY.register("cropsstage_8", () -> new Cropsstage8Block());
	public static final RegistryObject<Block> CROPSSTAGE_9 = REGISTRY.register("cropsstage_9", () -> new Cropsstage9Block());
	public static final RegistryObject<Block> CROSSSTAGE_10 = REGISTRY.register("crossstage_10", () -> new Crossstage10Block());
}
