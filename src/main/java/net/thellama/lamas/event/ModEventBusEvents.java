package net.thellama.lamas.event;


import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.common.Mod;
import net.thellama.lamas.LlamasAdventuresMod;
import net.thellama.lamas.entity.ModEntityTypes;
import net.thellama.lamas.entity.custom.WanderBirdEntity;

@Mod.EventBusSubscriber(modid = LlamasAdventuresMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
 public class ModEventBusEvents {

    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.WANDERBIRD.get(), WanderBirdEntity.setAttributes());
    }
}

