package net.mcreator.baboum.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("baboum", "modelcustom_model"), "main");
	public final ModelPart bone;

	public Modelcustom_model(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition corp2 = bone.addOrReplaceChild("corp2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, -2.0F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pied = corp2.addOrReplaceChild("pied",
				CubeListBuilder.create().texOffs(0, 3).addBox(3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pied2 = corp2.addOrReplaceChild("pied2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pied3 = corp2.addOrReplaceChild("pied3",
				CubeListBuilder.create().texOffs(21, 21).addBox(-8.0F, -1.0F, 6.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pied4 = corp2.addOrReplaceChild("pied4",
				CubeListBuilder.create().texOffs(21, 18).addBox(2.0F, -1.0F, 6.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition queue = corp2.addOrReplaceChild("queue",
				CubeListBuilder.create().texOffs(0, 18).addBox(-3.0F, -1.0F, -5.0F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -3.0F, 13.5F));
		PartDefinition corp = bone.addOrReplaceChild("corp",
				CubeListBuilder.create().texOffs(26, 25).addBox(-5.0F, -6.0F, -8.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 7)
						.addBox(1.0F, -5.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-4.0F, -5.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone2 = corp.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(27, 0).addBox(-3.0F, -3.0F, -13.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
