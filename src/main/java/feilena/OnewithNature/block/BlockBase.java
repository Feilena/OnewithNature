package feilena.OnewithNature.block;



import feilena.OnewithNature.Main;
import feilena.OnewithNature.init.ModBlocks;
import feilena.OnewithNature.init.ModItems;
import feilena.OnewithNature.util.IHasModel;

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