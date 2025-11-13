package io.github.gameking1happy.examplemod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.common.NeoForge;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

@Mod(value = MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClient {
    public NeoForgeClient() {
        Client.initclient();
        NeoForge.EVENT_BUS.addListener(NeoForgeClient::joinedWorld);
    }
    public static void joinedWorld(ClientPlayerNetworkEvent.LoggingIn event) {
        assert Minecraft.getInstance().player != null;
        Minecraft.getInstance().player.sendSystemMessage(Component.nullToEmpty("test"));
    }
}
