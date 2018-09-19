package com.feilena.own.block;

import java.util.Random;

import com.feilena.own.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SodiumOre extends BlockBase {

public SodiumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
		
	}
		//Dropping Custom Items
		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return ModItems.sodium;
		}
		
		@Override
		public int quantityDropped(Random rand) {
			int max = 4;
			int min = 1;
			return rand.nextInt(max) + min;
		}

}