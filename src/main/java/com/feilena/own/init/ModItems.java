package com.feilena.own.init;

import java.util.ArrayList;
import java.util.List;

import com.feilena.own.items.ItemBase;
import com.feilena.own.util.ModInfo;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> items = new ArrayList<Item>();
	public static Item dirt_sample = new ItemBase("dirt_sample");
	
	public static final void commonPreinit() {
			dirt_sample = registerItem(new Item(), "dirt_sample");

	}
	private static final void registerRender (Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + item.getRegistryName().getResourcePath(), "inventory"));
	}
	private static final Item registerItem(Item spade, String name) {
			spade.setUnlocalizedName(name);
			return spade;
	}
}

