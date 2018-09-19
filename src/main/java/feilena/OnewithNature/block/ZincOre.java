package feilena.OnewithNature.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ZincOre extends BlockBase {

public ZincOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
