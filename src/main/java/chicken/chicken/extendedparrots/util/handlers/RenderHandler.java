package chicken.chicken.extendedparrots.util.handlers;

import chicken.chicken.extendedparrots.entity.EntityLovebird;
import chicken.chicken.extendedparrots.entity.render.RenderLovebird;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityLovebird.class, new IRenderFactory<EntityLovebird>()
				{
					@Override
					public Render<? super EntityLovebird> createRenderFor(RenderManager manager)
					{
						return new RenderLovebird(manager);
					}
				});
	}
}
