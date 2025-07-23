/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catlands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.catlands.client.renderer.KotegolemRenderer;
import net.mcreator.catlands.client.renderer.KotegoldengolemRenderer;
import net.mcreator.catlands.client.renderer.AngelKittenRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CatLandsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CatLandsModEntities.KOTEGOLEM.get(), KotegolemRenderer::new);
		event.registerEntityRenderer(CatLandsModEntities.KOTEGOLDENGOLEM.get(), KotegoldengolemRenderer::new);
		event.registerEntityRenderer(CatLandsModEntities.ANGEL_KITTEN.get(), AngelKittenRenderer::new);
	}
}