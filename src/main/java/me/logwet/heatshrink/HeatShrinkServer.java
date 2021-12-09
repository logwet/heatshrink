package me.logwet.heatshrink;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.Level;

@Environment(EnvType.SERVER)
public class HeatShrinkServer implements DedicatedServerModInitializer {

    @Override
    public void onInitializeServer() {
        HeatShrink.log(Level.INFO, "Server class initialized!");
    }
}
