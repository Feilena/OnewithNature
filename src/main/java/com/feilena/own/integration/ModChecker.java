package com.feilena.own.integration;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {

	public static boolean isBiomesOPlentyLoaded;
	public static boolean isThaumcraftLoaded;
	public static boolean isAgricraftLoaded;
	public static boolean isPamsHarvestcraftLoaded;
	public static boolean isTinkersConstructLoaded;
	
	@SuppressWarnings("static-access")
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
		
		if(isThaumcraftLoaded) {
			com.feilena.own.Main.logger.info("Thaumcraft has been discovered.");
		}
		
		if(isAgricraftLoaded) {
			com.feilena.own.Main.logger.info("Agricraft has been discovered.");
		}
		
		if(isBiomesOPlentyLoaded) {
			com.feilena.own.Main.logger.info("Biomes 'O Plenty has been discovered.");
		}
		
		if(isPamsHarvestcraftLoaded) {
			com.feilena.own.Main.logger.info("Pam's Harvestcraft has been discovered.");
		}
	}
}
