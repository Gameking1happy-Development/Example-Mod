package io.github.gameking1happy.examplemod.data.client;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

public class MyLanguageProvider extends LanguageProvider {
    public MyLanguageProvider(PackOutput output) {
        super(
                // Provided by the GatherDataEvent.
                output,
                // Your mod id.
                MOD_ID,
                // The locale to use. You may use multiple language providers for different locales.
                "en_us"
        );
    }
    @Override
    protected void addTranslations() {
        // Adds a translation with the given key and the given value.
        add("examplemod.configuration.ExampleClient", "Example Client");
        add("examplemod.configuration.ExampleClient.tooltip", "An example client-side configuration option.");
        add("examplemod.configuration.ExampleCommon", "Example Common");
        add("examplemod.configuration.ExampleCommon.tooltip", "An example common-side configuration option.");
        add("examplemod.configuration.ExampleServer", "Example Server");
        add("examplemod.configuration.ExampleServer.tooltip", "An example server-side configuration option.");
        add("examplemod.configuration.section.examplemod.client.toml", "Client Settings");
        add("examplemod.configuration.section.examplemod.client.toml.title", "Example Mod Client Configuration");
        add("examplemod.configuration.section.examplemod.common.toml", "Common Settings");
        add("examplemod.configuration.section.examplemod.common.toml.title", "Example Mod Common Configuration");
        add("examplemod.configuration.section.examplemod.server.toml", "Server Settings");
        add("examplemod.configuration.section.examplemod.server.toml.title", "Example Mod Server Configuration");
        add("examplemod.configuration.title", "Example Mod Configuration");
    }
}