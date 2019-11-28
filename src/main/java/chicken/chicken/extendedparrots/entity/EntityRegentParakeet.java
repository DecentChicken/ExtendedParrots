package chicken.chicken.extendedparrots.entity;

import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityRegentParakeet extends EntityParrot 
{
	private static final DataParameter<Integer> texture = EntityDataManager.<Integer>createKey(EntityRegentParakeet.class, DataSerializers.VARINT);
    private static final Int2ObjectMap<SoundEvent> field_192017_bK = new Int2ObjectOpenHashMap<SoundEvent>(32);
	private static final Predicate<EntityLiving> field_192014_bH = new Predicate<EntityLiving>()
	{
        public boolean apply(@Nullable EntityLiving p_apply_1_)
        {
        	return p_apply_1_ != null && EntityRegentParakeet.field_192017_bK.containsKey(EntityList.getID(p_apply_1_.getClass()));
        }
    };
	
	public EntityRegentParakeet(World worldIn) {
		super(worldIn);
	}
	
	public int getTexture()
    {
		int tmp = MathHelper.clamp(((Integer)this.dataManager.get(texture)).intValue(), 0, 1);      
		return tmp;
    }
	
	protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(texture, Integer.valueOf(0));
    }
	
	public void func_191997_m(int p_191997_1_)
    {
        this.dataManager.set(texture, Integer.valueOf(p_191997_1_));
    }

	
	public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Variant", this.getTexture());
    }
	
	public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.func_191997_m(compound.getInteger("Variant"));
    }
}
