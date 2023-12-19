
package net.mcreator.foodcompletandcookingsystem.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PepperItem extends Item {
	public PepperItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
