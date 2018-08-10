package com.feilena.mods.OWN.gui;

import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		return null;
	}
	
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		if(OWNGui.ID == id) {
			return new OWNGui();
		} else if (GuiGenerator.ID == id) {
			return new GuiGenerator(new ContainerGenerator());
		}
		return null;
	}
}