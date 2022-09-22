package com.darkins.awakenings_of_the_darkins.item;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<Item> RAW_SILICIUM = ITEMS.register("raw_silicium",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS).stacksTo(1)));

    public static final RegistryObject<Item> SILICIUM = ITEMS.register("silicium",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS).stacksTo(1)));

    public static final RegistryObject<Item> SILICIUM_PLATE = ITEMS.register("silicium_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS).stacksTo(1)));

    public static final RegistryObject<Item> SILICIUM_BUCKET = ITEMS.register("silicium_bucket",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
