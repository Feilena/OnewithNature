package feilena.OnewithNature.world;

import java.util.Random;

import feilena.OnewithNature.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		if(world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider) {
		//generateOre(ModBlocks.copper_block.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, Y minimum coord (bedrock ~5), Y maximum coord (surface ~64), random.nextInt(5) + 3, 7);
		generateOre(ModBlocks.copper_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 3, 7);
		generateOre(ModBlocks.phosphorous_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.magnesium_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.manganese_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.boron_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.zinc_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.selenium_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.molybdenum_ore.getDefaultState(),world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(5) + 2, 7);
		generateOre(ModBlocks.cobalt_ore.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(4) + 2, 7);
		
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
