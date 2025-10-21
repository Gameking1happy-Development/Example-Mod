package io.github.gameking1happy.examplemod;

import io.github.gameking1happy.examplemod.config.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import static io.github.gameking1happy.examplemod.ExampleMod.MOD_ID;
import static net.neoforged.fml.loading.FMLEnvironment.dist;
@Mod(MOD_ID)
public class ExampleModNeoForge {

    public ExampleModNeoForge(ModContainer modContainer, IEventBus modBus) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Common.SPEC, MOD_ID + "-common.toml");
        modContainer.registerConfig(ModConfig.Type.CLIENT, Client.SPEC, MOD_ID + "-client.toml");
        modContainer.registerConfig(ModConfig.Type.SERVER, Server.SPEC, MOD_ID + "-server.toml");
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        modBus.addListener(ExampleModNeoForge::ConfigLoaded);
    }

    private static void ConfigLoaded(ModConfigEvent.Loading event) {
        ModConfig config = event.getConfig();
        if (config.getSpec() == Common.SPEC) {
            ExampleMod.init();
        }
        else if (config.getSpec() == Client.SPEC) {
            if (dist == Dist.CLIENT) {
                ExampleMod.initclient();
            }
        }
        else if (config.getSpec() == Server.SPEC) {
            if (dist == Dist.DEDICATED_SERVER) {
                ExampleMod.initserver();
            }
        }
        else {
            throw new IllegalStateException("Unknown ModConfigSpec Loaded.");
        }
    }
}