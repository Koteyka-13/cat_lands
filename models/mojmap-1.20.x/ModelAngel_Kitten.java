// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAngel_Kitten<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "angel_kitten"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart arms;
	private final ModelPart larm;
	private final ModelPart rwing;
	private final ModelPart lwing;
	private final ModelPart bb_main;

	public ModelAngel_Kitten(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.arms = root.getChild("arms");
		this.larm = root.getChild("larm");
		this.rwing = root.getChild("rwing");
		this.lwing = root.getChild("lwing");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 18).addBox(
				-3.0F, -2.0F, -3.5F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.5F, -9.0F, -5.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 2).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8F, -8.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(1, 2).mirror()
						.addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8F, -8.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 10.0F, 1.0F));

		PartDefinition cube_r3 = arms.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 32).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, 1.0F, -1.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition larm = partdefinition.addOrReplaceChild("larm", CubeListBuilder.create(),
				PartPose.offset(2.5F, 10.0F, 1.0F));

		PartDefinition cube_r4 = larm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 1.0F, -1.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rwing = partdefinition.addOrReplaceChild("rwing", CubeListBuilder.create(),
				PartPose.offset(-0.5F, 5.0F, 2.5F));

		PartDefinition cube_r5 = rwing.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(27, -9).mirror()
						.addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 5.0F, 0.5F, 0.0132F, -0.9597F, 0.1644F));

		PartDefinition lwing = partdefinition.addOrReplaceChild("lwing", CubeListBuilder.create(),
				PartPose.offset(0.5F, 8.5F, 2.5F));

		PartDefinition cube_r6 = lwing.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(27, -9).addBox(-0.3469F, -0.8335F, 0.2324F, 0.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5F, -0.5F, 0.0132F, 0.9597F, -0.1644F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(9, 33).addBox(-2.0F, -1.0F, -1.3F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -13.0F, -7.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(28, 5).addBox(-1.0F, -1.0F, -1.2F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -6.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(24, 18).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -6.5F, 0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rwing.yRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.lwing.yRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}