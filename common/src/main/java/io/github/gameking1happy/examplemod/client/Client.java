package io.github.gameking1happy.examplemod.client;

import io.github.gameking1happy.examplemod.Main;
import io.github.gameking1happy.examplemod.config.ClientConfig;

public class Client {
    public static void initclient() {
        // Gives a startup message to the log.
        Main.LOG.info("Client-side.");
        // Checks the client configuration option.
        if (ClientConfig.ExampleClient.get()) {
            Main.LOG.info("ExampleClient is true!");
        }
        else {
            Main.LOG.info("ExampleClient is false!");
        }
    }
}
