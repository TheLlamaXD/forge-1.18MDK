package net.thellama.lamas.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thellama.lamas.LlamasAdventuresMod;
import net.thellama.lamas.entity.custom.WanderBirdEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WanderBirdModel extends AnimatedGeoModel<WanderBirdEntity> {
    @Override
    public ResourceLocation getModelLocation(WanderBirdEntity object) {
        return new ResourceLocation(LlamasAdventuresMod.MOD_ID, "geo/wanderbird.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WanderBirdEntity object) {
        return new ResourceLocation(LlamasAdventuresMod.MOD_ID, "textures/entity/wander_bird/wanderbirdtextureredishbrown.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WanderBirdEntity animatable) {
        return new ResourceLocation(LlamasAdventuresMod.MOD_ID,"animations/wanderbird.animation.json");
    }
}
