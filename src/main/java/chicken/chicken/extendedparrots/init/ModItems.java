package chicken.chicken.extendedparrots.init;

import java.util.ArrayList;
import java.util.List;

import chicken.chicken.extendedparrots.items.LovebirdSpawnEgg;
import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
		
		// Materials
		//public static final ToolMaterial MATERIAL = EnumHelper.addToolMaterial("material", 3, 250, 8.0f, 3.0f, 10);
		
		// Items
		//public static final Item RUBY = new ItemBase("ruby");
	public static final Item LOVEBIRD_SPAWN_EGG = new LovebirdSpawnEgg();
		
		// Tools
		//public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
}
