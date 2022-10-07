package com.darkins.awakenings_of_the_darkins;

import com.darkins.awakenings_of_the_darkins.block.ModBlocks;
import com.darkins.awakenings_of_the_darkins.fluid.ModFluidTypes;
import com.darkins.awakenings_of_the_darkins.fluid.ModFluids;
import com.darkins.awakenings_of_the_darkins.item.ModItems;
import com.darkins.awakenings_of_the_darkins.world.feature.ModConfigureFeatures;
import com.darkins.awakenings_of_the_darkins.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Awakenings_Of_The_Darkins.MOD_ID)
public class Awakenings_Of_The_Darkins {

    public static final String MOD_ID = "awakenings_of_the_darkins";
    private static final Logger LOGGER = LogUtils.getLogger();

    /*

    Le texte du chalet 134 (pcq il est chiant)

     */

    public Awakenings_Of_The_Darkins()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModConfigureFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SILICON_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SILICON_WATER.get(), RenderType.translucent());
        }
    }
}
