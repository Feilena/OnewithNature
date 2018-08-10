package com.feilena.mods.OWN.item;

import com.feilena.mods.OWN.OWN;
import com.feilena.mods.OWN.gui.OWNGui;
import com.feilena.mods.OWN.Tab.OWNTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class OWNGui extends Item {

	public ItemNameGui() {
			this.setCreativeTab(OWNTab.tabItems);
	}
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if(!world.isRemote) {
			player.openGui(OWN.instance, OWN.ID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
			}
		return new ActionResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
		}
