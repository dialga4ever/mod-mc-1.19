
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baboum.init;

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

import net.mcreator.baboum.entity.PlatypusEntity;
import net.mcreator.baboum.BaboumMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BaboumModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BaboumMod.MODID);
	public static final RegistryObject<EntityType<PlatypusEntity>> PLATYPUS = register("platypus",
			EntityType.Builder.<PlatypusEntity>of(PlatypusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlatypusEntity::new).fireImmune().sized(0.6f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PlatypusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PLATYPUS.get(), PlatypusEntity.createAttributes().build());
	}
}
