package com.darkins.awakenings_of_the_darkins.block;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.darkins.awakenings_of_the_darkins.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<LiquidBlock> SILICON_WATER_BLOCK = BLOCKS.register("silicon_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_SILICON_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));
}
