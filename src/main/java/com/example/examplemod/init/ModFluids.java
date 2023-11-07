package com.example.examplemod.init;

import javax.annotation.Nullable;

import biomesoplenty.api.block.BOPFluids;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class ModFluids {

	public static void register() {
	}

	@Nullable
	public static BlockState getLavaInteraction(FluidState fluidState) {
		if (fluidState.is(BOPFluids.BLOOD.get()))
			return Blocks.NETHERRACK.defaultBlockState();
		return null;
	}
}
