package com.feilena.own.util.compat.jei;

import java.util.IllegalFormatException;

import akka.util.Helpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.util.text.translation.I18n;

public class JEICompat implements IModPlugin{
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry)
	{
		final IJeiHelpers helps = registry.getJeiHelpers();
		final IGuiHelper gui = Helpers.getGuiHelper();
		
		registry.addRecipeCategories(new e);
	}
	
	@Override
	public void register(IModRegistry registry) {
		
	}
	
	public static String translateToLocal(String key)
	{
		if(I18n.canTranslate(key)) return I18n.translateToLocal(key);
		else return I18n.translateToFallback(key);
		
	}

	
	public static String translateToLocalFormatted(String key, Object... format)
	{
		String s = translateToLocal(key);
		try
		{
			return String.format(s, format);
		
		}catch (IllegalFormatException e)
		{
			return "Format error: " + s;
		}
	}
}
