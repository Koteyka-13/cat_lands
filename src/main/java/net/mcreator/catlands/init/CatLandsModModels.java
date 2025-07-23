/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catlands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.catlands.client.model.ModelKote_golem;
import net.mcreator.catlands.client.model.ModelAngel_Kitten;
import net.mcreator.catlands.client.model.Kote_golem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CatLandsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelKote_golem.LAYER_LOCATION, ModelKote_golem::createBodyLayer);
		event.registerLayerDefinition(Kote_golem.LAYER_LOCATION, Kote_golem::createBodyLayer);
		event.registerLayerDefinition(ModelAngel_Kitten.LAYER_LOCATION, ModelAngel_Kitten::createBodyLayer);
	}
}