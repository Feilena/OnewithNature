package com.feilena.own.proxy;

import com.feilena.own.init.ModItems;
import com.feilena.own.items.ItemBase;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public void preinit (FMLPreInitializationEvent e) {
		super.preinit(e);
	}

	public void init (FMLInitializationEvent e) {
		super.init(e);
		
	}

	public void postinit (FMLPostInitializationEvent e) {
		super.postinit(e);
		
	}
	
	public void registerItemRenderer(ItemBase item, int meta, String id) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}

}