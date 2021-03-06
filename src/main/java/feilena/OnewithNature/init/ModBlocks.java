package feilena.OnewithNature.init;

import java.util.ArrayList;
import java.util.List;

import feilena.OnewithNature.block.BoronBlock;
import feilena.OnewithNature.block.BoronOre;
import feilena.OnewithNature.block.CobaltBlock;
import feilena.OnewithNature.block.CobaltOre;
import feilena.OnewithNature.block.CopperBlock;
import feilena.OnewithNature.block.CopperOre;
import feilena.OnewithNature.block.MagnesiumBlock;
import feilena.OnewithNature.block.MagnesiumOre;
import feilena.OnewithNature.block.ManganeseBlock;
import feilena.OnewithNature.block.ManganeseOre;
import feilena.OnewithNature.block.MolybdenumBlock;
import feilena.OnewithNature.block.MolybdenumOre;
import feilena.OnewithNature.block.PhosphorousBlock;
import feilena.OnewithNature.block.PhosphorousOre;
import feilena.OnewithNature.block.SeleniumBlock;
import feilena.OnewithNature.block.SeleniumOre;
import feilena.OnewithNature.block.SodiumOre;
import feilena.OnewithNature.block.ZincBlock;
import feilena.OnewithNature.block.ZincOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	//Ore
	public static final Block magnesium_ore = new MagnesiumOre("magnesium_ore", Material.IRON);
	public static final Block sodium_ore = new SodiumOre("sodium_ore", Material.SAND);
	public static final Block phosphorous_ore = new PhosphorousOre("phosphorous_ore", Material.IRON);
	public static final Block copper_ore = new CopperOre("copper_ore", Material.IRON);
	public static final Block manganese_ore = new ManganeseOre("manganese_ore", Material.IRON);
	public static final Block boron_ore = new BoronOre("boron_ore", Material.IRON);
	public static final Block zinc_ore = new ZincOre("zinc_ore", Material.IRON);
	public static final Block cobalt_ore = new CobaltOre("cobalt_ore", Material.IRON);
	public static final Block selenium_ore = new SeleniumOre("selenium_ore", Material.IRON);
	public static final Block molybdenum_ore = new MolybdenumOre("molybdenum_ore", Material.IRON);
	
	
	//Smelted Blocks
	public static final Block magnesium_block = new MagnesiumBlock("magnesium_block", Material.IRON);
	public static final Block phosphorous_block = new PhosphorousBlock("phosphorous_block", Material.IRON);
	public static final Block copper_block = new CopperBlock("copper_block", Material.IRON);
	public static final Block manganese_block = new ManganeseBlock("manganese_block", Material.IRON);
	public static final Block boron_block = new BoronBlock("boron_block", Material.IRON);
	public static final Block zinc_block = new ZincBlock("zinc_block", Material.IRON);
	public static final Block cobalt_block = new CobaltBlock("cobalt_block", Material.IRON);
	public static final Block selenium_block = new SeleniumBlock("selenium_block", Material.IRON);
	public static final Block molybdenum_block = new MolybdenumBlock("molybdenum_block", Material.IRON);
	
	//Saplings
	
	
}
