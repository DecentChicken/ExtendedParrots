package chicken.chicken.extendedparrots.entity;

import java.util.Random;

import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.world.World;

public class EntityRegentParakeet extends EntityParrot 
{
	private static int VARIANTS_AMNT = 2;
	Random rand = new Random();
	public int rndTexture = rand.nextInt(VARIANTS_AMNT);
	
	public EntityRegentParakeet(World worldIn) {
		super(worldIn);
	}
}
