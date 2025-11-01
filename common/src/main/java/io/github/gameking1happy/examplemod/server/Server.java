package io.github.gameking1happy.examplemod.server;

import io.github.gameking1happy.examplemod.config.ServerConfig;

import static io.github.gameking1happy.examplemod.Main.LOG;
public class Server {
    public static void initserver() {
        // Gives a startup message to the log.
        LOG.info("Server-side.");
        // Checks the server configuration option.
        if (ServerConfig.ExampleServer.get()) {
            LOG.info("ExampleServer is true!");
        }
        else {
            LOG.info("ExampleServer is false!");
        }
    }
}
