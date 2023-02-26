
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baboum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.baboum.BaboumMod;

public class BaboumModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, BaboumMod.MODID);
	public static final RegistryObject<PaintingVariant> ZOO = REGISTRY.register("zoo", () -> new PaintingVariant(176, 96));
}
