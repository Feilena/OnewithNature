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
	
	
	//Tool Materials
	//public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantablity);
	
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
	public static Item magnesium_ingot = new ItemBase("magnesium_ingot");
	public static Item sodium = new ItemBase("sodium");
	public static Item phosphorous_ingot = new ItemBase("phosphorous_ingot");
	public static Item copper_ingot = new ItemBase("copper_ingot");
	public static Item manganese_ingot = new ItemBase("manganese_ingot");
	public static Item boron_ingot = new ItemBase("boron_ingot");
	public static Item zinc_ingot = new ItemBase("zinc_ingot");
	public static Item cobalt_ingot = new ItemBase("cobalt_ingot");
	public static Item selenium_ingot = new ItemBase("selenium_ingot");
	public static Item silicon = new ItemBase("silicon");
	public static Item molybdenum_ingot = new ItemBase("molybdenum_ingot");
	
	//Custom Tool (Spade)
	public static Item dirt_spade = new ItemBase("dirt_spade");
	
	//Tools
	//public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	//public static final ItemSpade COPPER_SPADE = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	//public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	//public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	//public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
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

