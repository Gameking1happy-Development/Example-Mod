package io.github.gameking1happy.examplemod.server;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;
import static io.github.gameking1happy.examplemod.Main.LOG;
@Mod(value = MOD_ID, dist = Dist.DEDICATED_SERVER)
public class NeoForgeServer {
    public static void initserver() {
        LOG.info("If this message is here, except in the Example Mod template, you delete this line from NeoForgeServer. If initserver() is the only method, and only has this line, you can safely delete NeoForgeServer.");
    }
}
