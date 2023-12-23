package net.mcreator.foodcompletandcookingsystem.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.foodcompletandcookingsystem.init.FoodCompletAndCookingSystemModItems;
import net.mcreator.foodcompletandcookingsystem.init.FoodCompletAndCookingSystemModBlocks;

public class CornRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FARMLAND && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FoodCompletAndCookingSystemModItems.CORN.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FoodCompletAndCookingSystemModItems.CORN.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), FoodCompletAndCookingSystemModBlocks.CROPSSTAGE_0.get().defaultBlockState(), 3);
		}
	}
}
