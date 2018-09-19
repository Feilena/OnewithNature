package feilena.OnewithNature;
import feilena.OnewithNature.util.Reference;


import feilena.OnewithNature.creativetabs.OWNTab;
import feilena.OnewithNature.integration.ModChecker;
import feilena.OnewithNature.proxy.CommonProxy;
import feilena.OnewithNature.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {
		
	@Instance
    public static Main instance;
    public static final CreativeTabs owntab = new OWNTab("owntab");
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    
    //Integration
    public static ModChecker modChecker;
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        proxy.preinit(event);
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
        
        modChecker = new ModChecker();
        //ModChecker.printSuccessMessage();
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postinit(event);
    }
}