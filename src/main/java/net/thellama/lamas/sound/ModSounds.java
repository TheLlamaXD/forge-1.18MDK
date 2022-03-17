package net.thellama.lamas.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thellama.lamas.LlamasAdventuresMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LlamasAdventuresMod.MOD_ID);

public static RegistryObject<SoundEvent> WENGE_WOOD_PLANKS_BREAK = registerSoundEvents("wemge_wood_planks_break");




private static RegistryObject<SoundEvent> registerSoundEvents(String name){
    ResourceLocation id = new ResourceLocation(LlamasAdventuresMod.MOD_ID, name);
    return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
}

    public static void register(IEventBus eventbus){
        SOUND_EVENTS.register(eventbus);
    }

}
