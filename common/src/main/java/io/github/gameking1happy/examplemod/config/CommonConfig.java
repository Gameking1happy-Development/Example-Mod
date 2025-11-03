package io.github.gameking1happy.examplemod.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import static io.github.gameking1happy.gk1hcore.config.ConfigMaker.makeConfig;
import static net.neoforged.neoforge.common.ModConfigSpec.*;
public class CommonConfig {
    // Common configuration options.
    public static final Builder BUILDER = new Builder();
    public static final BooleanValue ExampleCommon = makeConfig(BUILDER, "ExampleCommon", true, "An example common-side configuration option.", null);
    public static final ModConfigSpec SPEC = BUILDER.build();
}