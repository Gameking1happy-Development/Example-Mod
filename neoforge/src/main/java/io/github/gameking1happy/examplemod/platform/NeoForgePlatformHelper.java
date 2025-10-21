package io.github.gameking1happy.examplemod.platform;

import io.github.gameking1happy.examplemod.platform.services.IPlatformHelper;
import net.neoforged.fml.ModList;

import static net.neoforged.fml.loading.FMLLoader.isProduction;
public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !isProduction();
    }
}