package chicken.chicken.extendedparrots.entity.render;

import chicken.chicken.extendedparrots.entity.EntityDiopsittacaNobilis;
import chicken.chicken.extendedparrots.entity.model.ModelDiopsittacaNobilis;
import chicken.chicken.extendedparrots.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderDiopsittacaNobilis extends RenderLiving<EntityDiopsittacaNobilis>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID+":textures/entity/diopsittaca_nobilis.png");
	public RenderDiopsittacaNobilis(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelDiopsittacaNobilis(), 0.25f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDiopsittacaNobilis entity) {
		return TEXTURES;
	}
	
	@Override
	protected float handleRotationFloat(EntityDiopsittacaNobilis livingBase, float partialTicks) {
		return getCustomBob(livingBase, partialTicks);
	}
	
	private float getCustomBob(EntityDiopsittacaNobilis lovebird, float nr)
	{
		float f = lovebird.oFlap + (lovebird.flap - lovebird.oFlap) * nr;
        float f1 = lovebird.oFlapSpeed + (lovebird.flapSpeed - lovebird.oFlapSpeed) * nr;
        return (MathHelper.sin(f) + 1.0F) * f1;
	}
}
