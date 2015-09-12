package com.Zombi3MC.strongertoolsmod.init;

import com.Zombi3MC.strongertoolsmod.block.*;
import com.Zombi3MC.strongertoolsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zombi3MC.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockSTM comObsidian = new ComObsidian();
    public static final BlockSTM zombieBlock = new ZombieBlock();
    public static final BlockSTM zombieOreEnd = new ZombieOreEnd();
    public static final BlockSTM zombieOreNether = new ZombieOreNether();
    public static final BlockSTM zombieOreOverworld = new ZombieOreOverworld();

    public static void init() {
        GameRegistry.registerBlock(comObsidian, "comObsidian");
        GameRegistry.registerBlock(zombieBlock, "zombieBlock");
        GameRegistry.registerBlock(zombieOreEnd, "zombieOreEnd");
        GameRegistry.registerBlock(zombieOreNether, "zombieOreNether");
        GameRegistry.registerBlock(zombieOreOverworld, "zombieOreOverworld");
    }
}
