package com.darkins.awakenings_of_the_darkins.world.feature;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<PlacedFeature> SILICIUM_ORE_PLACED = PLACED_FEATURE.register("silicium_ore_placed",
            () -> new PlacedFeature(ModConfigureFeatures.SILICIUM_ORE.getHolder().get(),
                    commonOrePlacement(15, //Veins per chunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier placementModifier, PlacementModifier modifier) {
        return List.of(placementModifier, InSquarePlacement.spread(), modifier, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int i, PlacementModifier placementModifier) {
        return orePlacement(CountPlacement.of(i), placementModifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int i, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(i), placementModifier);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURE.register(eventBus);
    }
}
