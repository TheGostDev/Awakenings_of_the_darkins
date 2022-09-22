package com.darkins.awakenings_of_the_darkins.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab AWAKENINGS_OF_THE_DARKINS = new CreativeModeTab("awakenings_of_the_darkins") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILICIUM.get());
        }
    };
}
