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
	
	//Soil Sample Items/Natural Minerals
	public static Item dirt_sample = new ItemBase("dirt_sample");
	public static Item magnesium_powder = new ItemBase("magnesium_powder");
	public static Item sodium_powder = new ItemBase("sodium_powder");
	public static Item phosphorous_powder = new ItemBase("phosphorous_powder");
	public static Item iron_powder = new ItemBase("iron_powder");
	public static Item copper_powder = new ItemBase("copper_powder");
	public static Item manganese_powder = new ItemBase("manganese_powder");
	public static Item boron_powder = new ItemBase("boron_powder");
	public static Item zinc_powder = new ItemBase("zinc_powder");
	public static Item cobalt_powder = new ItemBase("cobalt_powder");
	public static Item selenium_powder = new ItemBase("selenium_powder");
	public static Item silicon_dust = new ItemBase("silicon_dust");
	public static Item molybdenum_powder = new ItemBase("molybdenum_powder");
	public static Item magnesium = new ItemBase("magnesium");
	public static Item sodium = new ItemBase("sodium");
	public static Item phosphorous = new ItemBase("phosphorous");
	public static Item copper = new ItemBase("copper");
	public static Item manganese = new ItemBase("manganese");
	public static Item boron = new ItemBase("boron");
	public static Item zinc = new ItemBase("zinc");
	public static Item cobalt = new ItemBase("cobalt");
	public static Item selenium = new ItemBase("selenium");
	public static Item silicon = new ItemBase("silicon");
	public static Item molybdenum = new ItemBase("molybdenum");
	
	
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

