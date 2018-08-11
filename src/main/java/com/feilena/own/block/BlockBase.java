package com.feilena.own.block;



import com.feilena.own.Main;
import com.feilena.own.init.ModBlocks;
import com.feilena.own.init.ModItems;
import com.feilena.own.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.owntab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		}
	}