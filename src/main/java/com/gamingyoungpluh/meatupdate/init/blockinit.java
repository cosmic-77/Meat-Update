package com.gamingyoungpluh.meatupdate.init;

import com.gamingyoungpluh.meatupdate.meatupdate;
import com.google.common.base.Function;
import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.food.FoodProperties;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockinit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
    meatupdate.MEAT_ID); 

    public static final DeferredRegister<Item> ITEMS = iteminit.ITEMS;

    public static final RegistryObject<Block> GROUND_MEAT_BLOCK = register("ground_meat_block",
    () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.COLOR_RED).strength(1.0f).sound(SoundType.HONEY_BLOCK)), 
    object -> () -> new BlockItem(object.get(), new Item.Properties().tab(meatupdate.MEAT_BLOCK_TAB).food(new FoodProperties.Builder().nutrition(20).saturationMod(1.0f).build())));


    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
    }

  
    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, 
    Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
		
    }





}
