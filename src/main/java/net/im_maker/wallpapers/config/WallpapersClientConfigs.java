package net.im_maker.wallpapers.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class WallpapersClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ConfigValue<Boolean> TOOLTIPS;

    static {
        BUILDER.push("Configs for Wallpapers");
        TOOLTIPS = BUILDER.comment("ToolTips for Wallpaper Rolls & Skirting Boards").define("tooltips", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}