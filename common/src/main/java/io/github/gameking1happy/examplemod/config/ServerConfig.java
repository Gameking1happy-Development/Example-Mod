package io.github.gameking1happy.examplemod.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import static io.github.gameking1happy.gk1hcore.config.ConfigMaker.makeConfig;
import static net.neoforged.neoforge.common.ModConfigSpec.*;
public class ServerConfig {
    // Server-side configuration options.
    public static final Builder BUILDER = new Builder();
    public static final BooleanValue ExampleServer = makeConfig(BUILDER, "ExampleServer", true, "An example server-side configuration option.", null);
    public static final ModConfigSpec SPEC = BUILDER.build();
}