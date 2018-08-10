package com.feilena.own;


import com.feilena.own.proxy.CommonProxy;
import com.feilena.own.util.ModInfo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import java.util.Random;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, useMetadata = true, version = ModInfo.VERSION)

public class Main {
	
	@Instance
    public static Main instance;
    public static CreativeTabs creativeTab;
    
    @SidedProxy(clientSide = ModInfo.PROXY_BASE + ".ClientProxy", serverSide = ModInfo.PROXY_BASE + ".ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent e){
        proxy.preinit(e);
    }
    @EventHandler
    public static void init(FMLInitializationEvent e) {
        proxy.init(e);
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent e) {
        proxy.postinit(e);
    }

    private static void registerForgeAndFML(Object o){
        registerForge(o);
    }
    private static void registerForge(Object o){
        MinecraftForge.EVENT_BUS.register(o);
    }
}