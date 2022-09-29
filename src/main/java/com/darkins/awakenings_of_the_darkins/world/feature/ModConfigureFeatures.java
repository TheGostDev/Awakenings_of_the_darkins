package com.darkins.awakenings_of_the_darkins.world.feature;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import com.darkins.awakenings_of_the_darkins.block.ModBlocks;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfigureFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Awakenings_Of_The_Darkins.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILICIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILICIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILICIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SILICIUM_ORE = CONFIGURED_FEATURES.register("silicium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILICIUM_ORES.get(), 7)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
