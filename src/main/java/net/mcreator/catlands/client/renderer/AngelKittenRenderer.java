package net.mcreator.catlands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.catlands.entity.AngelKittenEntity;
import net.mcreator.catlands.client.model.ModelAngel_Kitten;

import com.mojang.blaze3d.vertex.PoseStack;

public class AngelKittenRenderer extends MobRenderer<AngelKittenEntity, ModelAngel_Kitten<AngelKittenEntity>> {
	public AngelKittenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAngel_Kitten<AngelKittenEntity>(context.bakeLayer(ModelAngel_Kitten.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AngelKittenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(AngelKittenEntity entity) {
		return ResourceLocation.parse("cat_lands:textures/entities/angel_kitten.png");
	}
}