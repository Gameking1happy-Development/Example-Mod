package io.github.gameking1happy.examplemod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.minecraft.network.chat.Component;

@SuppressWarnings("unused")
public class FabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Client.initclient();
        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            var player = client.player;
            assert player != null;
            player.sendSystemMessage(Component.nullToEmpty("test"));
        });
    }
}
