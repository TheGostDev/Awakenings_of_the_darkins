package com.darkins.awakenings_of_the_darkins.item;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.darkins.awakenings_of_the_darkins.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS)));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS)));

    public static final RegistryObject<Item> SILICON_PLATE = ITEMS.register("silicon_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS)));

    public static final RegistryObject<Item> SILICON_BUCKET = ITEMS.register("silicon_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SILICON_WATER,
                    new Item.Properties().tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
