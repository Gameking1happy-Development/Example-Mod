package io.github.gameking1happy.examplemod.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import static io.github.gameking1happy.gk1hcore.config.ConfigMaker.makeConfig;
import static net.neoforged.neoforge.common.ModConfigSpec.*;
public class Common {
    public static final Builder BUILDER = new Builder();
    public static final ConfigValue<Boolean> ExampleCommon = makeConfig(BUILDER, "Example Common", "An example common-side configuration option.", "ExampleCommon", true);
    public static final ModConfigSpec SPEC = BUILDER.build();
}