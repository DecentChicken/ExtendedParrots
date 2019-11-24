package chicken.chicken.extendedparrots.util.handlers;

import chicken.chicken.extendedparrots.entity.EntityDiopsittacaNobilis;
import chicken.chicken.extendedparrots.entity.EntityLovebird;
import chicken.chicken.extendedparrots.entity.EntityRegentParakeet;
import chicken.chicken.extendedparrots.entity.render.RenderDiopsittacaNobilis;
import chicken.chicken.extendedparrots.entity.render.RenderLovebird;
import chicken.chicken.extendedparrots.entity.render.RenderRegentParakeet;
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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRegentParakeet.class, new IRenderFactory<EntityRegentParakeet>()
				{
					@Override
					public Render<? super EntityRegentParakeet> createRenderFor(RenderManager manager)
					{
						return new RenderRegentParakeet(manager);
					}
				});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDiopsittacaNobilis.class, new IRenderFactory<EntityDiopsittacaNobilis>()
		{
			@Override
			public Render<? super EntityDiopsittacaNobilis> createRenderFor(RenderManager manager)
			{
				return new RenderDiopsittacaNobilis(manager);
			}
		});
	}
}
