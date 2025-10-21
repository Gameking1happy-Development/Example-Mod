package io.github.gameking1happy.examplemod.platform;

import io.github.gameking1happy.examplemod.platform.services.IPlatformHelper;
import java.util.ServiceLoader;

import static io.github.gameking1happy.examplemod.ExampleMod.LOG;
public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}