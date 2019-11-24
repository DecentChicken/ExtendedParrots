package chicken.chicken.extendedparrots.entity;

import chicken.chicken.extendedparrots.Main;
import chicken.chicken.extendedparrots.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityBase 
{
	public static void registerEntity()
	{
		// put all existing entities here
		registerEntity("lovebird", EntityLovebird.class, 120, 50, 8633435, 13998104);
		registerEntity("regentparakeet", EntityRegentParakeet.class, 121, 50, 8633435, 13998104);
		registerEntity("diopsittacanobilis", EntityDiopsittacaNobilis.class, 122, 50, 8633435, 13998104);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int primaryColour, int secondaryColour)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name),
				entity, name, id, Main.instance, range, 1, true, primaryColour, secondaryColour);
	}

}
