/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catlands.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.catlands.CatLandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatLandsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CatLandsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CatLandsModBlocks.SHINYBRICK.get().asItem());
			tabData.accept(CatLandsModBlocks.BIG_SHINY_BRICK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CatLandsModItems.KOTEGOLEM_SPAWN_EGG.get());
			tabData.accept(CatLandsModItems.KOTEGOLDENGOLEM_SPAWN_EGG.get());
			tabData.accept(CatLandsModItems.ANGEL_KITTEN_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CatLandsModItems.KOTEGOLEM_SPAWN_EGG.get());
			tabData.accept(CatLandsModItems.ARTIFACT.get());
			tabData.accept(CatLandsModItems.KOTEGOLDENGOLEM_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CatLandsModBlocks.STAR_BLOSSOM.get().asItem());
		}
	}
}