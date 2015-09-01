package com.Zombi3MC.strongertoolsmod;

import com.Zombi3MC.strongertoolsmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zombi3MC.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class StrongerToolsMod {

    @Mod.Instance(Reference.MOD_ID)
    public static StrongerToolsMod instance;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent e) {
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent e) {

    }
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent e) {

    }
}

