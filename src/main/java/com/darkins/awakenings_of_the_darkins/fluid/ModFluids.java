package com.darkins.awakenings_of_the_darkins.fluid;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.darkins.awakenings_of_the_darkins.block.ModBlocks;
import com.darkins.awakenings_of_the_darkins.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_SILICON_WATER = FLUIDS.register("silicon_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.SILICON_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SILICON_WATER = FLUIDS.register("flowing_silicon_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SILICON_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties SILICON_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.SILICON_WATER_FLUID_TYPE, SOURCE_SILICON_WATER, FLOWING_SILICON_WATER)
            .slopeFindDistance(7).levelDecreasePerBlock(1).block(ModBlocks.SILICON_WATER_BLOCK)
            .bucket(ModItems.SILICON_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
