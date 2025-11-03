package io.github.gameking1happy.examplemod.server;

import net.fabricmc.api.DedicatedServerModInitializer;

public class FabricServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        Server.initserver();
    }
}
