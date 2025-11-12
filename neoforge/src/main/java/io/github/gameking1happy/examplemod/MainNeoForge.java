package io.github.gameking1happy.examplemod;

import io.github.gameking1happy.examplemod.config.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;

import static io.github.gameking1happy.examplemod.Main.LOG;
import static io.github.gameking1happy.examplemod.Main.MOD_ID;

@Mod(MOD_ID)
public class MainNeoForge {

    public MainNeoForge(ModContainer modContainer, IEventBus modBus) {
        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
        modContainer.registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC);
        modBus.addListener(MainNeoForge::ConfigLoaded);
    }
    private static void ConfigLoaded(ModConfigEvent.Loading event) {
        ModConfig config = event.getConfig();
        if (config.getSpec() == CommonConfig.SPEC) {
            Main.init();
        }
        else if (config.getSpec() == ClientConfig.SPEC) {
            LOG.info("Ignored client config in main ConfigLoaded event listener.");
        }
        else if (config.getSpec() == ServerConfig.SPEC) {
            Main.serverconfigcheck();
        }
    }
}