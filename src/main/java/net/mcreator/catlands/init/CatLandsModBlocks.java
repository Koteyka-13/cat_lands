/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catlands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.catlands.block.StarBlossomBlock;
import net.mcreator.catlands.block.ShinybrickBlock;
import net.mcreator.catlands.CatLandsMod;

public class CatLandsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CatLandsMod.MODID);
	public static final RegistryObject<Block> SHINYBRICK = REGISTRY.register("shinybrick", () -> new ShinybrickBlock());
	public static final RegistryObject<Block> STAR_BLOSSOM = REGISTRY.register("star_blossom", () -> new StarBlossomBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}