package feilena.OnewithNature.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagnesiumOre extends BlockBase {

public MagnesiumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
