package com.Zombi3MC.strongertoolsmod.init;

import com.Zombi3MC.strongertoolsmod.item.ComObsidianStick;
import com.Zombi3MC.strongertoolsmod.item.ItemSTM;
import com.Zombi3MC.strongertoolsmod.item.ItemZombieIngot;
import com.Zombi3MC.strongertoolsmod.item.ObsidianStick;
import com.Zombi3MC.strongertoolsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Zombi3MC.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemSTM zombieIngot = new ItemZombieIngot();
    public static final ItemSTM obsidianStick = new ObsidianStick();
    public static final ItemSTM comObsidianStick = new ComObsidianStick();

    public static void init() {
        GameRegistry.registerItem(zombieIngot, "zombieIngot");
        GameRegistry.registerItem(obsidianStick, "obsidianStick");
        GameRegistry.registerItem(comObsidianStick, "comObsidianStick");
    }
}
