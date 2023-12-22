
package net.mcreator.foodcompletandcookingsystem.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FleshItem extends Item {
	public FleshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
