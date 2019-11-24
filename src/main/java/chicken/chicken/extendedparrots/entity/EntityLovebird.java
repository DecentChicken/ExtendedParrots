package chicken.chicken.extendedparrots.entity;

import java.util.Random;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityLovebird extends EntityParrot 
{
	private static int VARIANTS_AMNT = 2;
	Random rand = new Random();
	public int rndTexture = rand.nextInt(VARIANTS_AMNT);

	public EntityLovebird(World worldIn) {
		super(worldIn);
	}
}
