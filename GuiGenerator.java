package com.feilena.mods.OWN.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class GuiGenerator extends GuiContainer {
	
		public GuiContainer(Container, inventorySlotsIn) {
			super(inventorySlotsIn);
			
			//Set the size of the GUI for your furnace/generator/etc here.
			this.xSize = 175;
			this.ySize = 165;
		}
		
		protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
			GLStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
			this.mc.getTextureManager().bindTexture(new ResourceLocation("OWN:textures/gui/container/OWNgenerator.png:));
			this.drawTextureModealRect(this.guiLeft, this.guiTop, 0,0,this.xSize, this.ySize);
		}
		
}