
package net.mcreator.foodcompletandcookingsystem.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ButterItem extends Item {
	public ButterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
