
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodcompletandcookingsystem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.foodcompletandcookingsystem.item.SaltItem;
import net.mcreator.foodcompletandcookingsystem.item.FlourItem;
import net.mcreator.foodcompletandcookingsystem.FoodCompletAndCookingSystemMod;

public class FoodCompletAndCookingSystemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FoodCompletAndCookingSystemMod.MODID);
	public static final RegistryObject<Item> FLOUR = REGISTRY.register("flour", () -> new FlourItem());
	public static final RegistryObject<Item> SALT_STONE_BLOCK = block(FoodCompletAndCookingSystemModBlocks.SALT_STONE_BLOCK);
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
