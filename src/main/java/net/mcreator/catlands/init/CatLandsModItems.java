/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catlands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.catlands.item.ArtifactItem;
import net.mcreator.catlands.CatLandsMod;

public class CatLandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CatLandsMod.MODID);
	public static final RegistryObject<Item> SHINYBRICK = block(CatLandsModBlocks.SHINYBRICK, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> KOTEGOLEM_SPAWN_EGG = REGISTRY.register("kotegolem_spawn_egg", () -> new ForgeSpawnEggItem(CatLandsModEntities.KOTEGOLEM, -11053225, -3574443, new Item.Properties()));
	public static final RegistryObject<Item> ARTIFACT = REGISTRY.register("artifact", () -> new ArtifactItem());
	public static final RegistryObject<Item> KOTEGOLDENGOLEM_SPAWN_EGG = REGISTRY.register("kotegoldengolem_spawn_egg", () -> new ForgeSpawnEggItem(CatLandsModEntities.KOTEGOLDENGOLEM, -11053225, -410082, new Item.Properties()));
	public static final RegistryObject<Item> STAR_BLOSSOM = block(CatLandsModBlocks.STAR_BLOSSOM);
	public static final RegistryObject<Item> ANGEL_KITTEN_SPAWN_EGG = REGISTRY.register("angel_kitten_spawn_egg", () -> new ForgeSpawnEggItem(CatLandsModEntities.ANGEL_KITTEN, -668382, -73402, new Item.Properties()));
	public static final RegistryObject<Item> BIG_SHINY_BRICK = block(CatLandsModBlocks.BIG_SHINY_BRICK, new Item.Properties().fireResistant());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}