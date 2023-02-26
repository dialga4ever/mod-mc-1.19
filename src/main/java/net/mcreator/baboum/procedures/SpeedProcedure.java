package net.mcreator.baboum.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SpeedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.WATER) {
		}
	}
}
