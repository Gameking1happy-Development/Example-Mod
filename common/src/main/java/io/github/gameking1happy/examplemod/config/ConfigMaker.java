package io.github.gameking1happy.examplemod.config;

import static net.neoforged.neoforge.common.ModConfigSpec.*;
public class ConfigMaker {
    public static <T> ConfigValue<T> makeConfig(Builder BUILDER, String translationKey, String comment, String name, T defaultValue) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .define(name, defaultValue);
    }
}