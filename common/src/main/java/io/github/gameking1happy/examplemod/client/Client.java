package io.github.gameking1happy.examplemod.client;

import io.github.gameking1happy.examplemod.config.ClientConfig;
import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.api.RegisterType;

import static io.github.gameking1happy.examplemod.Main.LOG;

public class Client {
    public static ClientConfig clientconfig = ConfigApiJava.registerAndLoadConfig(ClientConfig::new, RegisterType.CLIENT);
    public static boolean ExampleClient = clientconfig.ExampleClient.get();
    public static void initclient() {
        // Gives a startup message to the log.
        LOG.info("Client-side.");
        // Checks the client configuration option.
        if (ExampleClient) {
            LOG.info("Example Client is true!");
        }
        else {
            LOG.info("Example Client is false!");
        }
    }
}
