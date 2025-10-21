package io.github.gameking1happy.examplemod;

import io.github.gameking1happy.examplemod.config.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static io.github.gameking1happy.examplemod.platform.Services.PLATFORM;
public class ExampleMod {
    public static void init() {

        LOG.info("Hello from Common init on {}! we are currently in a {} environment!", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        if (Common.ExampleCommon.get()) {
            LOG.info("ExampleCommon is true!");
        }
        else {
            LOG.info("ExampleCommon is false!");
        }
    }
    public static void initclient() {
        LOG.info("Client-side.");
        if (Client.ExampleClient.get()) {
            LOG.info("ExampleClient is true!");
        }
        else {
            LOG.info("ExampleClient is false!");
        }
    }
    public static void initserver() {
        LOG.info("Server-side.");
        if (Server.ExampleServer.get()) {
            LOG.info("ExampleServer is true!");
        }
        else {
            LOG.info("ExampleServer is false!");
        }
    }
    public static final String MOD_ID = "examplemod";
    public static final String MOD_NAME = "Example Mod";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}