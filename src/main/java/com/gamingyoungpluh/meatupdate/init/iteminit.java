package com.gamingyoungpluh.meatupdate.init;
import com.google.common.base.Supplier;
import com.gamingyoungpluh.meatupdate.meatupdate;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class iteminit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			meatupdate.MEAT_ID);

	public static final RegistryObject<Item> SILICA_PACKET = register("silica_packet",
			() -> new Item(new Item.Properties().tab(meatupdate.MEAT_ITEM_TAB).food(new FoodProperties.Builder().nutrition(-10).alwaysEat().build())
      ));

	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}















