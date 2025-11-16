package io.github.gameking1happy.examplemod;

import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;

/**
 * The NeoForge main method for the mod.
 */
@SuppressWarnings("unused")
@Mod(MOD_ID)
public class MainNeoForge {
    /**
     * Runs the NeoForge mod initializer.
     */
    public MainNeoForge() {
        Main.init();
    }
}