package com.darkins.awakenings_of_the_darkins.item;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.darkins.awakenings_of_the_darkins.fluid.ModFluids;
import com.darkins.awakenings_of_the_darkins.sounds.SoundInit;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

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

    public static final RegistryObject<Item> MUSIC_DISC_IDOL = ITEMS.register("music_disc_idol",
            () -> new RecordItem(1, SoundInit.MUSIC_DISC_IDOL, (new Item.Properties()).stacksTo(1).tab(ModCreativeTab.AWAKENINGS_OF_THE_DARKINS).rarity(Rarity.RARE), 178));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
