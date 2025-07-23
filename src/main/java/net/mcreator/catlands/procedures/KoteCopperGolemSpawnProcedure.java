package net.mcreator.catlands.procedures;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.catlands.init.CatLandsModEntities;
import net.mcreator.catlands.CatLandsMod;

import javax.annotation.Nullable;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class KoteCopperGolemSpawnProcedure {
	@SubscribeEvent
	public static void onRightClick(PlayerInteractEvent.RightClickEmpty event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		CatLandsMod.PACKET_HANDLER.sendToServer(new KoteCopperGolemSpawnMessage());
		execute(event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class KoteCopperGolemSpawnMessage {
		public KoteCopperGolemSpawnMessage() {
		}

		public KoteCopperGolemSpawnMessage(FriendlyByteBuf buffer) {
		}

		public static void buffer(KoteCopperGolemSpawnMessage message, FriendlyByteBuf buffer) {
		}

		public static void handler(KoteCopperGolemSpawnMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getSender().level().hasChunkAt(context.getSender().blockPosition()))
					return;
				execute(context.getSender().level(), context.getSender().getX(), context.getSender().getY(), context.getSender().getZ());
			});
			context.setPacketHandled(true);
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			CatLandsMod.addNetworkMessage(KoteCopperGolemSpawnMessage.class, KoteCopperGolemSpawnMessage::buffer, KoteCopperGolemSpawnMessage::new, KoteCopperGolemSpawnMessage::handler);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (Blocks.COPPER_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() && Blocks.SMOOTH_STONE_SLAB == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() && Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CatLandsModEntities.KOTEGOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		} else if (Blocks.COPPER_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() && Blocks.SMOOTH_STONE_SLAB == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() && Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CatLandsModEntities.KOTEGOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		} else if (Blocks.GOLD_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() && Blocks.SMOOTH_STONE_SLAB == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() && Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CatLandsModEntities.KOTEGOLDENGOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		} else if (Blocks.GOLD_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() && Blocks.SMOOTH_STONE_SLAB == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() && Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock()
				&& Blocks.STONE_BRICKS == (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CatLandsModEntities.KOTEGOLDENGOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		}
	}
}