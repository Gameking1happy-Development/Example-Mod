package io.github.gameking1happy.examplemod.client;

import io.github.gameking1happy.examplemod.config.ClientConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

@Mod(value = MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClient {
    public NeoForgeClient(ModContainer modContainer, IEventBus modBus) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC);
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        modBus.addListener(NeoForgeClient::ConfigLoaded);
        NeoForge.EVENT_BUS.addListener(NeoForgeClient::joinedWorld);
    }
    private static void ConfigLoaded(ModConfigEvent.Loading event) {
        ModConfig config = event.getConfig();
        if (config.getSpec() == ClientConfig.SPEC) {
            Client.initclient();
        }
    }
    public static void joinedWorld(ClientPlayerNetworkEvent.LoggingIn event) {
        assert Minecraft.getInstance().player != null;
        Minecraft.getInstance().player.sendSystemMessage(Component.nullToEmpty("test"));
    }
}
