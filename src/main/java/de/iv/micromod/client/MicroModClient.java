package de.iv.micromod.client;

import de.iv.micromod.MicroMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;

@Environment(EnvType.CLIENT)
public class MicroModClient implements ClientModInitializer {

    private static final Logger LOGGER = MicroMod.LOGGER;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Minecraft started. Have fun!");
    }
}
