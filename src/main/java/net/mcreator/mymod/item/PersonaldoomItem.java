
package net.mcreator.mymod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mymod.init.MyModModTabs;

public class PersonaldoomItem extends RecordItem {
	public PersonaldoomItem() {
		super(6, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("my_mod:personaldoom")), new Item.Properties().tab(MyModModTabs.TAB_FILEDS_OF_MEMORY).stacksTo(1).rarity(Rarity.RARE), 3840);
	}
}