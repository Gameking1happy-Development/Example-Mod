package io.github.gameking1happy.examplemod;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import io.github.gameking1happy.examplemod.config.CommonConfig;
import io.github.gameking1happy.examplemod.config.ServerConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.neoforged.fml.config.ModConfig;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

public class MainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register the configs.
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, CommonConfig.SPEC);
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.SERVER, ServerConfig.SPEC);
        // Initialize the mod.
        Main.init();
        ServerLifecycleEvents.SERVER_STARTED.register((server -> Main.serverconfigcheck()));
    }
}