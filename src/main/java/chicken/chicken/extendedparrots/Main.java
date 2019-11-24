package chicken.chicken.extendedparrots;

import chicken.chicken.extendedparrots.proxy.CommonProxy;
import chicken.chicken.extendedparrots.util.Reference;
import chicken.chicken.extendedparrots.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	 @Instance
	 public static Main instance;
	 
	 @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	 public static CommonProxy proxy;
	 
	 @EventHandler
	 public static void PreInit(FMLPreInitializationEvent event)
	 {
		 RegistryHandler.preInitRegistries();
		 System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	 }
	 
	 @EventHandler
	 public static void init(FMLInitializationEvent event)
	 {
		 
	 }
	 
	 @EventHandler
	 public static void PostInit(FMLPostInitializationEvent event)
	 {
		 
	 }
}
