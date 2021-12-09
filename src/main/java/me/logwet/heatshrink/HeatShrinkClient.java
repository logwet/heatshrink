package me.logwet.heatshrink;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.Level;

@Environment(EnvType.CLIENT)
public class HeatShrinkClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HeatShrink.log(Level.INFO, "Client class initialized!");
    }
}
