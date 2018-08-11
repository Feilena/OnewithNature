package com.feilena.own.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CobaltBlock extends BlockBase {

public CobaltBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}