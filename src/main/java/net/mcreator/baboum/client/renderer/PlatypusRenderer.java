
package net.mcreator.baboum.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.baboum.procedures.PlatypusModelProcedure;
import net.mcreator.baboum.entity.PlatypusEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PlatypusRenderer extends GeoEntityRenderer<PlatypusEntity> {
	public PlatypusRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PlatypusModelProcedure());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PlatypusEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer,
			VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1.0F, 1.0F, 1.0F);
		return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
	}
}
