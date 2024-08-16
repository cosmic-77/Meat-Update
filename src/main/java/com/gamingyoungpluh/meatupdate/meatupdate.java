package com.gamingyoungpluh.meatupdate;



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

    public static final CreativeModeTab MEAT_TAB = new CreativeModeTab(MEAT_ID) {

        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            
            return new ItemStack(iteminit.EXAMPLE_ITEM.get());
        }
        
    };

    public meatupdate() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        iteminit.ITEMS.register(bus);
        
        MinecraftForge.EVENT_BUS.register(this);



    }

    
}