package com.feilena.own.integration;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {

	public static boolean isBiomesOPlentyLoaded;
	public static boolean isThaumcraftLoaded;
	public static boolean isAgricraftLoaded;
	public static boolean isPamsHarvestcraftLoaded;
	public static boolean isTinkersConstructLoaded;
	
	public ModChecker() {
		this.isTinkersConstructLoaded = Loader.isModLoaded("tconstruct");
		this.isThaumcraftLoaded = Loader.isModLoaded("");
		this.isAgricraftLoaded = Loader.isModLoaded("");
		this.isBiomesOPlentyLoaded = Loader.isModLoaded("");
		this.isPamsHarvestcraftLoaded = Loader.isModLoaded("");
		
	}
	
	public static void printSuccessMessage() {
		if(isTinkersConstructLoaded) {
			com.feilena.own.Main.logger.info("TConstruct has been discovered.");
		}
		
	}
}
