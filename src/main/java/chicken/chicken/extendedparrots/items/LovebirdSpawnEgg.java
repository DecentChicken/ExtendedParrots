package chicken.chicken.extendedparrots.items;

import chicken.chicken.extendedparrots.entity.EntityLovebird;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LovebirdSpawnEgg extends ItemMonsterPlacer
{
	public LovebirdSpawnEgg()
	{
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		/*EntityLovebird newlovebird = new EntityLovebird(worldIn);
		newlovebird.setLocationAndAngles(player.posX, player.chasingPosY, player.chasingPosZ, 0, 0);
		worldIn.spawnEntity(newlovebird);*/
		worldIn.spawnEntity(new EntityLovebird(worldIn));
		System.out.println("spawnegg used");
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
	
	
}
