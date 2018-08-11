package com.feilena.own.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BoronOre extends BlockBase {

public BoronOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
		
	}
		//Dropping Custom Items
		//@Override
		//public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			//return ModItems.Name;
		//}

}
