package com.feilena.mods.OWN.gui;

import net.minecraft.client.gui.GuiScreen;

public class OWNGui extends GuiScreen{

	public static final int ID = 0;
	
	//Does not pause game while in single player
	public boolean doesGuiPauseGame(){
		return false;
	}
		
	
	public void drawScreen(int mouseX, int mouseY, float partials) {
		this.drawDefaultBackground();
	}

}