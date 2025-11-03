package io.github.gameking1happy.examplemod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

public class MyBlockTagsProvider extends BlockTagsProvider {
    // Get parameters from GatherDataEvent.
    public MyBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MOD_ID, existingFileHelper);
    }
    // Add your tag entries here.
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
            // Put stuff here.
        }
}