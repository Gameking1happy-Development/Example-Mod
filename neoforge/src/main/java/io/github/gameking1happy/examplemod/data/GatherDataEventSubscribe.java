package io.github.gameking1happy.examplemod.data;

import io.github.gameking1happy.examplemod.data.client.MyLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

@EventBusSubscriber(modid = MOD_ID)
public class GatherDataEventSubscribe {
    @SubscribeEvent // on the mod event bus
    public static void gatherData(GatherDataEvent event) {
        // Data generators may require some of these as constructor parameters.
        // See below for more details on each of these.
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BlockTagsProvider blockTagsProvider = new MyBlockTagsProvider(output, lookupProvider, existingFileHelper);
        // Register the provider.
        generator.addProvider(
                // A boolean that determines whether the data should actually be generated.
                // The event provides methods that determine this:
                // event.includeClient(), event.includeServer(),
                // event.includeDev() and event.includeReports().
                // Since recipes are server data, we only run them in a server datagen.
                event.includeServer(),
                // Our provider.
                new MyRecipeProvider(output, lookupProvider)
        );
        generator.addProvider(
                event.includeClient(),
                new MyLanguageProvider(output)
        );
        generator.addProvider(
                event.includeServer(),
                blockTagsProvider
        );
        generator.addProvider(
                event.includeServer(),
                new MyItemTagsProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper)
        );
    }
}