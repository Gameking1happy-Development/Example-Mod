package io.github.gameking1happy.examplemod.server;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;
@Mod(value = MOD_ID, dist = Dist.DEDICATED_SERVER)
public class NeoForgeServer {
    public NeoForgeServer() {
        Server.initserver();
    }
}
