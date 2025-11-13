package io.github.gameking1happy.examplemod;

import io.github.gameking1happy.examplemod.config.ServerConfig;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

public class Main {
    public static void init() {
        // Gives a startup message to the log.
        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        // Checks the server configuration option.
        if (ExampleServer) {
            LOG.info("Example Server is true!");
        }
        else {
            LOG.info("Example Server is false!");
        }
    }
    // Mod constants.
    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "Example Mod";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    public static ServerConfig serverconfig = ConfigApiJava.registerAndLoadConfig(ServerConfig::new);
    public static boolean ExampleServer = serverconfig.ExampleServer.get();
}