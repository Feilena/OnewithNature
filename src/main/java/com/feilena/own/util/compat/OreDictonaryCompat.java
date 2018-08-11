package com.feilena.own.util.compat;

import com.feilena.own.init.ModBlocks;
import com.feilena.own.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictonaryCompat {

	public static void registerOres() {
		OreDictionary.registerOre("oreCopper", ModBlocks.copper_block);
		OreDictionary.registerOre("ingotCopper", ModItems.copper_ingot);
		
	}
}
