package io.github.gameking1happy.examplemod.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import static io.github.gameking1happy.gk1hcore.config.ConfigMaker.makeConfig;
import static net.neoforged.neoforge.common.ModConfigSpec.*;
public class ServerConfig {
    // Server-side configuration options.
    public static final Builder BUILDER = new Builder();
    public static final ConfigValue<Boolean> ExampleServer = makeConfig(BUILDER, "Example Server", "An example server-side configuration option.", "ExampleServer", true);
    public static final ModConfigSpec SPEC = BUILDER.build();
}