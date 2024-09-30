package net.yeetboi1984.ondeathopen;
import org.slf4j.LoggerFactory;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

import org.slf4j.Logger;
import net.fabricmc.api.ClientModInitializer;



public class OnDeathOpenClient implements ClientModInitializer{
    
    public static OnDeathOpenConfig CONFIG = new OnDeathOpenConfig();
    public static final String MOD_ID = "ondeathopen";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static String command = "start C:\\Users\\yeetboi1984\\Downloads\\Trollface_non-free.png";

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Fabric world!");
        AutoConfig.register(OnDeathOpenConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(OnDeathOpenConfig.class).getConfig();
        OnDeathOpenClient.command = CONFIG.command;
    }
    
    public static void UpdateConfig() {
        CONFIG = AutoConfig.getConfigHolder(OnDeathOpenConfig.class).getConfig();
        OnDeathOpenClient.command = CONFIG.command;
    }
}
