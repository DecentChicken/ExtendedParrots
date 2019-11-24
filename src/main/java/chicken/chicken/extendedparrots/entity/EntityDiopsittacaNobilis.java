package chicken.chicken.extendedparrots.entity;

import java.util.Random;

import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.world.World;

public class EntityDiopsittacaNobilis extends EntityParrot 
{
	private static int VARIANTS_AMNT = 2;
	Random rand = new Random();
	public int rndTexture = rand.nextInt(VARIANTS_AMNT);
	
	public EntityDiopsittacaNobilis(World worldIn) {
		super(worldIn);
	}

}
