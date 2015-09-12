package com.Zombi3MC.strongertoolsmod.creativetab;

import com.Zombi3MC.strongertoolsmod.init.ModBlocks;
import com.Zombi3MC.strongertoolsmod.init.ModItems;
import com.Zombi3MC.strongertoolsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Zombi3MC.
 */
public class CreativeTabSTM {
    public static final CreativeTabs STM_ITEMS = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.zombieIngot;
        }
        @Override
        public String getTranslatedTabLabel() {
            return "Stronger Tools Mod: Items";
        }
    };

    public static final CreativeTabs STM_BLOCKS = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.zombieBlock);
        }
        public String getTranslatedTabLabel() {
            return "Stronger Tools Mod: Blocks";
        }
    };
}
