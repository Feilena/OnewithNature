package com.feilena.own.creativetabs;

import com.feilena.own.init.ModBlocks;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OWNTab extends CreativeTabs {
	
	public OWNTab(String label) {
		super("owntab");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.zinc_ore));
		
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
}
