package net.mcreator.catlands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.catlands.entity.KotegoldengolemEntity;
import net.mcreator.catlands.client.model.Kote_golem;

public class KotegoldengolemRenderer extends MobRenderer<KotegoldengolemEntity, Kote_golem<KotegoldengolemEntity>> {
	public KotegoldengolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Kote_golem<KotegoldengolemEntity>(context.bakeLayer(Kote_golem.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(KotegoldengolemEntity entity) {
		return ResourceLocation.parse("cat_lands:textures/entities/golden_kote_golem.png");
	}
}