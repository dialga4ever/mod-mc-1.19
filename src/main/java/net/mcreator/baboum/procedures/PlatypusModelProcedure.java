package net.mcreator.baboum.procedures;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.baboum.entity.PlatypusEntity;

/**
public static void execute(
) {
execute(null);
}
private static void execute(
@Nullable Event event
) {
**/
public class PlatypusModelProcedure extends AnimatedGeoModel<PlatypusEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlatypusEntity entity) {
		return new ResourceLocation("baboum", "animations/platypus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlatypusEntity entity) {
		return new ResourceLocation("baboum", "geo/platypus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlatypusEntity entity) {
		return new ResourceLocation("baboum", "textures/entities/platypus.png");
		/**
		}
		@Override
		public void setLivingAnimations(PlatypusEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = entity.getFactory().getOrCreateAnimationData(uniqueID);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
		/** **/
	}
}
