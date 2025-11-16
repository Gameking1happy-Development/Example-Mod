package io.github.gameking1happy.examplemod;

import net.fabricmc.api.ModInitializer;

/**
 * The Fabric main method for the mod.
 */
@SuppressWarnings("unused")
public class MainFabric implements ModInitializer {
    /**
     * Runs the Fabric mod initializer.
     */
    @Override
    public void onInitialize() {
        Main.init();
    }
}