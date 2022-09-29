package com.darkins.awakenings_of_the_darkins.block;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.darkins.awakenings_of_the_darkins.fluid.ModFluids;
import com.darkins.awakenings_of_the_darkins.item.ModCreativeTab;
import com.darkins.awakenings_of_the_darkins.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<Block> SILICIUM_ORE = registerBlock("silicium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0f).requiresCorrectToolForDrops(),
                    UniformInt.of(2,4)), ModCreativeTab.AWAKENINGS_OF_THE_DARKINS);

    public static final RegistryObject<Block> DEEPSLATE_SILICIUM_ORE = registerBlock("deepslate_silicium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0f).requiresCorrectToolForDrops(),
                    UniformInt.of(2,4)), ModCreativeTab.AWAKENINGS_OF_THE_DARKINS);

    public static final RegistryObject<LiquidBlock> SILICON_WATER_BLOCK = BLOCKS.register("silicon_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SILICON_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
