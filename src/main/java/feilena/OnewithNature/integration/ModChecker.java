package feilena.OnewithNature.integration;

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
			feilena.OnewithNature.Main.logger.info("TConstruct has been discovered.");
		}
		
		if(isThaumcraftLoaded) {
			feilena.OnewithNature.Main.logger.info("Thaumcraft has been discovered.");
		}
		
		if(isAgricraftLoaded) {
			feilena.OnewithNature.Main.logger.info("Agricraft has been discovered.");
		}
		
		if(isBiomesOPlentyLoaded) {
			feilena.OnewithNature.Main.logger.info("Biomes 'O Plenty has been discovered.");
		}
		
		if(isPamsHarvestcraftLoaded) {
			feilena.OnewithNature.Main.logger.info("Pam's Harvestcraft has been discovered.");
		}
	}
}
