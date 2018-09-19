package feilena.OnewithNature.util.handlers;


import feilena.OnewithNature.init.ModBlocks;
import feilena.OnewithNature.init.ModItems;
import feilena.OnewithNature.util.IHasModel;
import feilena.OnewithNature.util.compat.OreDictonaryCompat;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(ModItems.items.toArray(new Item[0]));
	}
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event){
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event){
		for(Item item : ModItems.items)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
	}

	public static void preInitRegistries() {
		
	}
	
	public static void initRegistries() {
		OreDictonaryCompat.registerOres();
	}
	
	public static void postInitRegistries() {
		
	}
	public static void serverRegistries(FMLServerStartingEvent event) {
		
	}
}
