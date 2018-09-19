package feilena.OnewithNature.items;

import java.util.HashSet;
import java.util.Set;

import feilena.OnewithNature.init.ModItems;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSpade extends ItemTool {
	
	private static final HashSet<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[] {});
	
	public ItemSpade(ToolMaterial material, Set<Block> effectiveBlocks) {
		super(EnumHelper.addToolMaterial(ModItems.dirt_spade, 0, 100, 0F, 0F, 0), EFFECTIVE_BLOCKS);
	}

	
	//Right Click with losing durability
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		player.getHeldItem(hand).stackSize--;
		return super.onItemRightClick(world, player, hand);
	}
}
