package feilena.OnewithNature.items;

import feilena.OnewithNature.Main;
import feilena.OnewithNature.init.ModItems;
import feilena.OnewithNature.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.owntab);
		
		ModItems.items.add(this);
	}
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
