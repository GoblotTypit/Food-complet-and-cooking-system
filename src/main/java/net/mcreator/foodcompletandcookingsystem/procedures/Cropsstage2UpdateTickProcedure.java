package net.mcreator.foodcompletandcookingsystem.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.foodcompletandcookingsystem.init.FoodCompletAndCookingSystemModBlocks;

public class Cropsstage2UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_3.get().defaultBlockState(), 3);
	}
}
