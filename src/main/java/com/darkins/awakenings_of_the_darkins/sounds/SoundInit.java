package com.darkins.awakenings_of_the_darkins.sounds;

import com.darkins.awakenings_of_the_darkins.Awakenings_Of_The_Darkins;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Awakenings_Of_The_Darkins.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_IDOL = registerSoundEvent("music_disc_idol");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation("awakenings_of_the_darkins", name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
