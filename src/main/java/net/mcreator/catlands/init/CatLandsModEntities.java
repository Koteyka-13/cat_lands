/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catlands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.catlands.entity.KotegolemEntity;
import net.mcreator.catlands.entity.KotegoldengolemEntity;
import net.mcreator.catlands.entity.AngelKittenEntity;
import net.mcreator.catlands.CatLandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CatLandsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CatLandsMod.MODID);
	public static final RegistryObject<EntityType<KotegolemEntity>> KOTEGOLEM = register("kotegolem",
			EntityType.Builder.<KotegolemEntity>of(KotegolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KotegolemEntity::new).fireImmune().sized(1f, 1.5f));
	public static final RegistryObject<EntityType<KotegoldengolemEntity>> KOTEGOLDENGOLEM = register("kotegoldengolem", EntityType.Builder.<KotegoldengolemEntity>of(KotegoldengolemEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KotegoldengolemEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<AngelKittenEntity>> ANGEL_KITTEN = register("angel_kitten", EntityType.Builder.<AngelKittenEntity>of(AngelKittenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngelKittenEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KotegolemEntity.init();
			KotegoldengolemEntity.init();
			AngelKittenEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KOTEGOLEM.get(), KotegolemEntity.createAttributes().build());
		event.put(KOTEGOLDENGOLEM.get(), KotegoldengolemEntity.createAttributes().build());
		event.put(ANGEL_KITTEN.get(), AngelKittenEntity.createAttributes().build());
	}
}