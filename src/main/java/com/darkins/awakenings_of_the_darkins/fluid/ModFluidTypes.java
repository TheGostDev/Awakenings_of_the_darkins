package com.darkins.awakenings_of_the_darkins.fluid;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation SILICON_STILL_RL = new ResourceLocation(Awakenings_Of_The_Darkins.MOD_ID,"block/silicon_still");
    public static final ResourceLocation SILICON_FLOWING_RL = new ResourceLocation(Awakenings_Of_The_Darkins.MOD_ID,"block/silicon_flow");
    public static final ResourceLocation SILICON_OVERLAY_RL = new ResourceLocation(Awakenings_Of_The_Darkins.MOD_ID, "misc/in_silicon_water");

    public final static DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<FluidType> SILICON_WATER_FLUID_TYPE = register("silicon_water_fluid",
            FluidType.Properties.create().lightLevel(2).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(SILICON_STILL_RL, SILICON_FLOWING_RL, SILICON_OVERLAY_RL,
                0xD9FFFFFF, new Vector3f(161f / 255f, 158f / 255f, 156f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
