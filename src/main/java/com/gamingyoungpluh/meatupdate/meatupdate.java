package com.gamingyoungpluh.meatupdate;



import com.gamingyoungpluh.meatupdate.init.iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;;

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
        MinecraftForge.EVENT_BUS.register(this);
    }

    
}