package com.gamingyoungpluh.meatupdate.init;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

import com.gamingyoungpluh.meatupdate.meatupdate;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,meatupdate.MEAT_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(meatupdate.MEAT_TAB)));

    private static <T extends Items> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
