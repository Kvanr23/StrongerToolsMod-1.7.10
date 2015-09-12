package com.Zombi3MC.strongertoolsmod;

import com.Zombi3MC.strongertoolsmod.handler.ConfigurationHandler;
import com.Zombi3MC.strongertoolsmod.init.ModBlocks;
import com.Zombi3MC.strongertoolsmod.init.ModItems;
import com.Zombi3MC.strongertoolsmod.proxy.IProxy;
import com.Zombi3MC.strongertoolsmod.reference.Reference;
import com.Zombi3MC.strongertoolsmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zombi3MC.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class StrongerToolsMod {

    @Mod.Instance(Reference.MOD_ID)
    public static StrongerToolsMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent e) {
        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();

        LogHelper.info("-=############ Preinit complete!############=-");
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent e) {
        LogHelper.info("-=############ Init complete!############=-");
    }
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent e) {
        LogHelper.info("-=############ Postinit complete!############=-");
    }
}

