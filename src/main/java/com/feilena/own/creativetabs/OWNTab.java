package com.feilena.own.creativetabs;

import com.feilena.own.init.ModBlocks;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OWNTab extends CreativeTabs {
	
	public OWNTab(String label) {
		super(label);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.zinc_ore));
		
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	

}	
