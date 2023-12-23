package net.mcreator.foodcompletandcookingsystem.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.foodcompletandcookingsystem.init.FoodCompletAndCookingSystemModBlocks;

public class Cropsstage6UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_7.get().defaultBlockState(), 3);
	}
}
