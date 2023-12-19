
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodcompletandcookingsystem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.foodcompletandcookingsystem.FoodCompletAndCookingSystemMod;

public class FoodCompletAndCookingSystemModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodCompletAndCookingSystemMod.MODID);
	public static final RegistryObject<CreativeModeTab> FCACS = REGISTRY.register("fcacs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.food_complet_and_cooking_system.fcacs")).icon(() -> new ItemStack(Blocks.WHEAT)).displayItems((parameters, tabData) -> {
				tabData.accept(FoodCompletAndCookingSystemModItems.FLOUR.get());
				tabData.accept(FoodCompletAndCookingSystemModBlocks.SALT_STONE_BLOCK.get().asItem());
				tabData.accept(FoodCompletAndCookingSystemModItems.SALT.get());
				tabData.accept(FoodCompletAndCookingSystemModItems.YEAST.get());
				tabData.accept(FoodCompletAndCookingSystemModItems.CHOCOLATE_MILK.get());
				tabData.accept(FoodCompletAndCookingSystemModItems.PEPPER.get());
				tabData.accept(FoodCompletAndCookingSystemModItems.SKIMMED_MILK.get());
				tabData.accept(FoodCompletAndCookingSystemModItems.BUTTER.get());
				tabData.accept(FoodCompletAndCookingSystemModItems.BAKING_SODA.get());
			}).withSearchBar().build());
}
