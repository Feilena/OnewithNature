package com.feilena.own.creativetabs;

import com.feilena.own.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OWNTab extends CreativeTabs {
	
	public OWNTab(String label) {
		super("owntab");
		this.setBackgroundImageName("onewithnature.png");
	}
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(Item.getItemFromBlock(ModBlocks.zinc_block));
	}
	
}
