package feilena.OnewithNature.util.compat;

import feilena.OnewithNature.init.ModBlocks;
import feilena.OnewithNature.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictonaryCompat {

	public static void registerOres() {
		OreDictionary.registerOre("oreCopper", ModBlocks.copper_block);
		OreDictionary.registerOre("ingotCopper", ModItems.copper_ingot);
		
	}
}
