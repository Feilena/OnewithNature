package com.feilena.own.init;

import java.util.ArrayList;
import java.util.List;

import com.feilena.own.block.BlockBase;
import com.feilena.own.block.BoronOre;
import com.feilena.own.block.CobaltOre;
import com.feilena.own.block.CopperOre;
import com.feilena.own.block.MagnesiumOre;
import com.feilena.own.block.ManganeseOre;
import com.feilena.own.block.MolybdenumOre;
import com.feilena.own.block.PhosphorousOre;
import com.feilena.own.block.SeleniumOre;
import com.feilena.own.block.SodiumOre;
import com.feilena.own.block.ZincOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block magnesium_block = new MagnesiumOre("magnesium_block", Material.ROCK);
	public static final Block sodium_block = new SodiumOre("sodium_block", Material.SAND);
	public static final Block phosphorous_block = new PhosphorousOre("phosphorous_block", Material.ROCK);
	public static final Block copper_block = new CopperOre("copper_block", Material.ROCK);
	public static final Block manganese_block = new ManganeseOre("manganese_block", Material.ROCK);
	public static final Block boron_block = new BoronOre("boron_block", Material.ROCK);
	public static final Block zinc_block = new ZincOre("zinc_block", Material.ROCK);
	public static final Block cobalt_block = new CobaltOre("cobalt_block", Material.ROCK);
	public static final Block selenium_block = new SeleniumOre("selenium_block", Material.ROCK);
	public static final Block molybdenum_block = new MolybdenumOre("molybdenum_block", Material.ROCK);
}
