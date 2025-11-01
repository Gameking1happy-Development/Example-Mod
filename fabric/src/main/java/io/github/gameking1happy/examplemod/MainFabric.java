package io.github.gameking1happy.examplemod;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import io.github.gameking1happy.examplemod.config.*;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

public class MainFabric implements ModInitializer {

    public void onInitialize() {
        // Register the configs.
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, CommonConfig.SPEC, MOD_ID + "-common.toml");
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.SERVER, ServerConfig.SPEC, MOD_ID + "-server.toml");
        // Initialize the mod.
        Main.init();
    }
}
