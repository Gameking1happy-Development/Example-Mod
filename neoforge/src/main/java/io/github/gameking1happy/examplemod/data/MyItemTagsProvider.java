package io.github.gameking1happy.examplemod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

public class MyItemTagsProvider extends ItemTagsProvider {
    // Get parameters from GatherDataEvent.
    public MyItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    // Add your tag entries here.
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
            // Put stuff here.
        }
}