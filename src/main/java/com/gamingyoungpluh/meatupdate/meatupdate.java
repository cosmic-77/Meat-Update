package com.gamingyoungpluh.meatupdate;



import com.gamingyoungpluh.meatupdate.init.blockinit;
import com.gamingyoungpluh.meatupdate.init.iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;;

@Mod("meatupdate")
public class meatupdate {

    public static final String MEAT_ID = "meatupdate";

    public static final CreativeModeTab MEAT_ITEM_TAB = new CreativeModeTab(MEAT_ID + "Items") {

        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            
            return new ItemStack(iteminit.SILICA_PACKET.get());
        }
        
    };

      public static final CreativeModeTab MEAT_BLOCK_TAB = new CreativeModeTab(MEAT_ID + "Blocks") {

        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            
            return new ItemStack(blockinit.GROUND_MEAT_BLOCK.get());
        }
        
    };






    public meatupdate() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        iteminit.ITEMS.register(bus);
        blockinit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.register(this);



    }

    
}