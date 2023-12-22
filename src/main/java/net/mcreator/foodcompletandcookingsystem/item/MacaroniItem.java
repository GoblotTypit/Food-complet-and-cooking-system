
package net.mcreator.foodcompletandcookingsystem.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MacaroniItem extends Item {
	public MacaroniItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
