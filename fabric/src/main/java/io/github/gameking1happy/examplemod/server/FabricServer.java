package io.github.gameking1happy.examplemod.server;

import net.fabricmc.api.DedicatedServerModInitializer;

@SuppressWarnings("unused")
public class FabricServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        Server.initserver();
    }
}
