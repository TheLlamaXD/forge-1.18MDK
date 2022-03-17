package net.thellama.lamas.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.thellama.lamas.LlamasAdventuresMod;
import net.thellama.lamas.entity.custom.WanderBirdEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WanderBirdRenderer extends GeoEntityRenderer<WanderBirdEntity> {
    public WanderBirdRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WanderBirdModel());
        this.shadowRadius = 0.3f;

    }

    @Override
    public ResourceLocation getTextureLocation(WanderBirdEntity instance) {
        return new ResourceLocation(LlamasAdventuresMod.MOD_ID,"textures/entity/wander_bird/wanderbirdtextureredishbrown.png");
    }

    @Override
    public RenderType getRenderType(WanderBirdEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F,0.8F,0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
