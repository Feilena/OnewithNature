package com.feilena.own.block;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class OWNBlocks {

	private static final HashMap<Block, Item> blocks = new HashMap<Block, Item>();
	public static Block OWNGenerator;
	
	public static final void commonPreinit() {
		OWNGenerator = registerBlock(new OWNGenerator(), "Generator");
	}
	
	private static final Block registerBlock (Block block, String name) {
		block.setUnlocalizedName(name);
		GameRegistry.register(block, new ResourceLocation(ModInfo.MODID, name));
		Item blockItem