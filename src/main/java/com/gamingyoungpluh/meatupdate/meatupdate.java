package com.gamingyoungpluh.meatupdate;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;;

@Mod("meatupdate")
public class meatupdate {

    public meatupdate() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    
}