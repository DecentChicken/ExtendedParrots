package chicken.chicken.extendedparrots.entity.render;

import chicken.chicken.extendedparrots.entity.EntityLovebird;
import chicken.chicken.extendedparrots.entity.EntityRegentParakeet;
import chicken.chicken.extendedparrots.entity.model.ModelRegentParakeet;
import chicken.chicken.extendedparrots.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderRegentParakeet extends RenderLiving<EntityRegentParakeet>
{
	public static final ResourceLocation[] TEXTURES = new ResourceLocation[] {new ResourceLocation(Reference.MOD_ID + ":textures/entity/regent_parakeet_male.png"), new ResourceLocation(Reference.MOD_ID + ":textures/entity/regent_parakeet_female.png")};
	public RenderRegentParakeet(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelRegentParakeet(), 0.3f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityRegentParakeet entity) {
		return TEXTURES[entity.getTexture()];
	}
	
	@Override
	protected float handleRotationFloat(EntityRegentParakeet livingBase, float partialTicks) {
		return getCustomBob(livingBase, partialTicks);
	}
	
	private float getCustomBob(EntityRegentParakeet regentparakeet, float nr)
	{
		float f = regentparakeet.oFlap + (regentparakeet.flap - regentparakeet.oFlap) * nr;
        float f1 = regentparakeet.oFlapSpeed + (regentparakeet.flapSpeed - regentparakeet.oFlapSpeed) * nr;
        return (MathHelper.sin(f) + 1.0F) * f1;
	}
}
