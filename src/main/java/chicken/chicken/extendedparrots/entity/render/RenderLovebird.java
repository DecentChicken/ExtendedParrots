package chicken.chicken.extendedparrots.entity.render;

import chicken.chicken.extendedparrots.entity.EntityLovebird;
import chicken.chicken.extendedparrots.entity.model.ModelLovebird;
import chicken.chicken.extendedparrots.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderLovebird extends RenderLiving<EntityLovebird>
{
	public static final ResourceLocation[] TEXTURES = new ResourceLocation[] {new ResourceLocation(Reference.MOD_ID + ":textures/entity/lovebird_fischeri.png"), new ResourceLocation(Reference.MOD_ID + ":textures/entity/lovebird_personata_azul.png")};
	public RenderLovebird(RenderManager manager) {
		super(manager, new ModelLovebird(), 0.2f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLovebird entity) {
		return TEXTURES[entity.rndTexture];
	}

	@Override
	protected float handleRotationFloat(EntityLovebird livingBase, float partialTicks) {
		return getCustomBob(livingBase, partialTicks);
	}
	
	private float getCustomBob(EntityLovebird lovebird, float nr)
	{
		float f = lovebird.oFlap + (lovebird.flap - lovebird.oFlap) * nr;
        float f1 = lovebird.oFlapSpeed + (lovebird.flapSpeed - lovebird.oFlapSpeed) * nr;
        return (MathHelper.sin(f) + 1.0F) * f1;
	}
}
