package net.thellama.lamas.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thellama.lamas.LlamasAdventuresMod;
import net.thellama.lamas.entity.custom.WanderBirdEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, LlamasAdventuresMod.MOD_ID);


    public static final RegistryObject<EntityType<WanderBirdEntity>> WANDERBIRD = ENTITY_TYPES.register("snipebird",
    () -> EntityType.Builder.of(WanderBirdEntity::new, MobCategory.AMBIENT)
            .sized(0.4f, 0.3f)
            .build(new ResourceLocation(LlamasAdventuresMod.MOD_ID, "wanderbird").toString()));




    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
