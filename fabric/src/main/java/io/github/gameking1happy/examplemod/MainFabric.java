package io.github.gameking1happy.examplemod;

import net.fabricmc.api.ModInitializer;

@SuppressWarnings("unused")
public class MainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // Initialize the mod.
        Main.init();
    }
}