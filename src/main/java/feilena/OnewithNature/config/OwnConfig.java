package feilena.OnewithNature.config;

import java.io.File;

import com.mojang.authlib.properties.Property;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;

public class OwnConfig {
	
		private static Configuration config = null;
		
		public static final String CATEGORY_NAME_BLOCKS = "blocks";
		
		public static void preInit() {
			File configFile = new File(Loader.instance().getConfigDir(), "OnewithNature.cfg");
			config = new Configuration(configFile);
			syncFromFiles();
		}
		
		public static Configuration getConfig() {
			return config;
		}
		
		public static void clientPreInit() {
			
		
		}
		
		public static void syncFromFiles() {
			syncConfig(true, true);
		}
		
		public static void syncFromGui() {
			syncConfig(false, true);
		}
		
		public static void syncFromFields() {
			syncConfig(false, false);
		}
		
		private static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig) {
			if(loadFromConfigFile)
				config.load();
			
			
			
				
		}
}
