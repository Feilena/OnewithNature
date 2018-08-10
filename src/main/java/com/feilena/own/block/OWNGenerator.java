package com.feilena.own.block;

import com.feilena.mods.OWN.tab.OWNTab;
import com.feilena.mods.OWN.tile.TileEntityGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

public class OWNGenerator extends BlockContainer {

	public OWNGenerator () {
		super(Material.IRON);
		this.setHardness(2.0f);
		this.setResistance(2.0f);
		this.setCreativeTab(OWNTab.tabBlocks);
	}
	
	public TileEntity createNewTileEntity(World, worldIn, int meta) {
		return null;
	}
	public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
	}
	public boolean onBlockActivated(World w, BlockPos bp, IBlockState st, EntityPlayer ply, EnumHand h, EnumFacing f, float x, float y, float z) {
		ply.openGui(OWN.instance, GuiGenerator.ID, w, (int) x, (int) y, (int) z);
		return true;
	}
}