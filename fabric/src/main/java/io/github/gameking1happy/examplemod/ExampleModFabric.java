package io.github.gameking1happy.examplemod;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.client.ConfigScreenFactoryRegistry;
import io.github.gameking1happy.examplemod.config.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;

import static io.github.gameking1happy.examplemod.ExampleMod.MOD_ID;
import static net.fabricmc.loader.api.FabricLoader.getInstance;
public class ExampleModFabric implements ModInitializer {

    public void onInitialize() {
        // Register the configs.
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, Common.SPEC, MOD_ID + "-common.toml");
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.SERVER, Server.SPEC, MOD_ID + "-server.toml");
        // Register the config screen.
        ConfigScreenFactoryRegistry.INSTANCE.register(MOD_ID, ConfigurationScreen::new);
        // Initialize the mod.
        ExampleMod.init();
        if (getInstance().getEnvironmentType() == EnvType.CLIENT) {
            initclient();
        }
        if (getInstance().getEnvironmentType() == EnvType.SERVER) {
            initserver();
        }
    }
    public void initclient() {
        NeoForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.CLIENT, Client.SPEC, MOD_ID + "-client.toml");
        ExampleMod.initclient();
    }
    public void initserver() {
        ExampleMod.initserver();
    }
}
