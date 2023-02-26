
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.baboum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.baboum.item.RenforcedpaperItem;
import net.mcreator.baboum.item.LAnneauxItem;
import net.mcreator.baboum.BaboumMod;

public class BaboumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BaboumMod.MODID);
	public static final RegistryObject<Item> PLATYPUS = REGISTRY.register("platypus_spawn_egg",
			() -> new ForgeSpawnEggItem(BaboumModEntities.PLATYPUS, -16724788, -52429, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RENFORCEDPAPER = REGISTRY.register("renforcedpaper", () -> new RenforcedpaperItem());
	public static final RegistryObject<Item> L_ANNEAUX = REGISTRY.register("l_anneaux", () -> new LAnneauxItem());
}
