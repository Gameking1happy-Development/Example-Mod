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
        add("examplemod.server_config", "Example Server Config");
        add("examplemod.server_config.ExampleServer", "Example Server Config Value");
        add("examplemod.server_config.ExampleServer.desc", "Example Server Config Value Description.");
        add("examplemod.client_config", "Example Client Config");
        add("examplemod.client_config.ExampleClient", "Example Client Config Value");
        add("examplemod.client_config.ExampleClient.desc", "Example Client Config Value Description.");
    }
}