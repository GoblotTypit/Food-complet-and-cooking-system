
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

import net.mcreator.foodcompletandcookingsystem.item.YeastItem;
import net.mcreator.foodcompletandcookingsystem.item.SkimmedMilkItem;
import net.mcreator.foodcompletandcookingsystem.item.SaltItem;
import net.mcreator.foodcompletandcookingsystem.item.PepperItem;
import net.mcreator.foodcompletandcookingsystem.item.MacaroniItem;
import net.mcreator.foodcompletandcookingsystem.item.FlourItem;
import net.mcreator.foodcompletandcookingsystem.item.FleshItem;
import net.mcreator.foodcompletandcookingsystem.item.FleshCookedItem;
import net.mcreator.foodcompletandcookingsystem.item.DeputrifierItem;
import net.mcreator.foodcompletandcookingsystem.item.CornItem;
import net.mcreator.foodcompletandcookingsystem.item.ChocolateMilkItem;
import net.mcreator.foodcompletandcookingsystem.item.ButterItem;
import net.mcreator.foodcompletandcookingsystem.item.BrownSugarItem;
import net.mcreator.foodcompletandcookingsystem.item.BakingSodaItem;
import net.mcreator.foodcompletandcookingsystem.FoodCompletAndCookingSystemMod;

public class FoodCompletAndCookingSystemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FoodCompletAndCookingSystemMod.MODID);
	public static final RegistryObject<Item> FLOUR = REGISTRY.register("flour", () -> new FlourItem());
	public static final RegistryObject<Item> SALT_STONE_BLOCK = block(FoodCompletAndCookingSystemModBlocks.SALT_STONE_BLOCK);
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> YEAST = REGISTRY.register("yeast", () -> new YeastItem());
	public static final RegistryObject<Item> CHOCOLATE_MILK = REGISTRY.register("chocolate_milk", () -> new ChocolateMilkItem());
	public static final RegistryObject<Item> PEPPER = REGISTRY.register("pepper", () -> new PepperItem());
	public static final RegistryObject<Item> SKIMMED_MILK = REGISTRY.register("skimmed_milk", () -> new SkimmedMilkItem());
	public static final RegistryObject<Item> BUTTER = REGISTRY.register("butter", () -> new ButterItem());
	public static final RegistryObject<Item> BAKING_SODA = REGISTRY.register("baking_soda", () -> new BakingSodaItem());
	public static final RegistryObject<Item> DEPUTRIFIER = REGISTRY.register("deputrifier", () -> new DeputrifierItem());
	public static final RegistryObject<Item> FLESH = REGISTRY.register("flesh", () -> new FleshItem());
	public static final RegistryObject<Item> FLESH_COOKED = REGISTRY.register("flesh_cooked", () -> new FleshCookedItem());
	public static final RegistryObject<Item> BROWN_SUGAR = REGISTRY.register("brown_sugar", () -> new BrownSugarItem());
	public static final RegistryObject<Item> MACARONI = REGISTRY.register("macaroni", () -> new MacaroniItem());
	public static final RegistryObject<Item> CORN = REGISTRY.register("corn", () -> new CornItem());
	public static final RegistryObject<Item> CROPSSTAGE_0 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_0);
	public static final RegistryObject<Item> CROPSSTAGE_1 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_1);
	public static final RegistryObject<Item> CROPSSTAGE_2 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_2);
	public static final RegistryObject<Item> CROPSSTAGE_3 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_3);
	public static final RegistryObject<Item> CROPSSTAGE_4 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_4);
	public static final RegistryObject<Item> CROPSSTAGE_5 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_5);
	public static final RegistryObject<Item> CROPSSTAGE_6 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_6);
	public static final RegistryObject<Item> CROPSSTAGE_7 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_7);
	public static final RegistryObject<Item> CROPSSTAGE_8 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_8);
	public static final RegistryObject<Item> CROPSSTAGE_9 = block(FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_9);
	public static final RegistryObject<Item> CROSSSTAGE_10 = block(FoodCompletAndCookingSystemModBlocks.CROSSSTAGE_10);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
