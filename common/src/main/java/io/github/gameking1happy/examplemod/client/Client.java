package io.github.gameking1happy.examplemod.client;

import io.github.gameking1happy.examplemod.config.ClientConfig;

import static io.github.gameking1happy.examplemod.Main.LOG;
public class Client {
    public static void initclient() {
        // Gives a startup message to the log.
        LOG.info("Client-side.");
        // Checks the client configuration option.
        if (ClientConfig.ExampleClient.get()) {
            LOG.info("Example Client is true!");
        }
        else {
            LOG.info("Example Client is false!");
        }
    }
}
