package net.mcreator.catlands.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Kote_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("cat_lands", "kote_golem"), "main");
	public final ModelPart body;
	public final ModelPart rleg;
	public final ModelPart lleg;
	public final ModelPart rarm;
	public final ModelPart larm;

	public Kote_golem(ModelPart root) {
		this.body = root.getChild("body");
		this.rleg = root.getChild("rleg");
		this.lleg = root.getChild("lleg");
		this.rarm = root.getChild("rarm");
		this.larm = root.getChild("larm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror()
				.addBox(1.0F, -13.0F, -7.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-7.0F, -13.0F, -7.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition rleg = partdefinition.addOrReplaceChild("rleg", CubeListBuilder.create().texOffs(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 17.0F, 0.0F));
		PartDefinition lleg = partdefinition.addOrReplaceChild("lleg", CubeListBuilder.create().texOffs(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 17.0F, 0.0F));
		PartDefinition rarm = partdefinition.addOrReplaceChild("rarm",
				CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(-2.0F, 11.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 8.0F, 0.0F));
		PartDefinition larm = partdefinition.addOrReplaceChild("larm",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 2).mirror().addBox(2.0F, 11.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(8.0F, 8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.lleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.larm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}