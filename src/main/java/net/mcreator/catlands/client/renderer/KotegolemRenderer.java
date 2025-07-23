package net.mcreator.catlands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.catlands.entity.KotegolemEntity;
import net.mcreator.catlands.client.model.ModelKote_golem;

public class KotegolemRenderer extends MobRenderer<KotegolemEntity, ModelKote_golem<KotegolemEntity>> {
	public KotegolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelKote_golem<KotegolemEntity>(context.bakeLayer(ModelKote_golem.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(KotegolemEntity entity) {
		return ResourceLocation.parse("cat_lands:textures/entities/copper_kote_golem.png");
	}
}