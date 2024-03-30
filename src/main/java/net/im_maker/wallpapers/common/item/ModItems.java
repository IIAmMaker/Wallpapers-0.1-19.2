package net.im_maker.wallpapers.common.item;

import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.block.block_values.Baseboard;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.im_maker.wallpapers.common.item.wallpaper_rolls.*;
import net.im_maker.wallpapers.common.item.baseborde.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Wallpapers.MOD_ID);
    //Wallpaper Roll Items
    public static final RegistryObject<Item> RED_WALLPAPER_ROLL = ITEMS.register("red_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.RED_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> ORANGE_WALLPAPER_ROLL = ITEMS.register("orange_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.ORANGE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> YELLOW_WALLPAPER_ROLL = ITEMS.register("yellow_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.YELLOW_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> LIME_WALLPAPER_ROLL = ITEMS.register("lime_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.LIME_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_WALLPAPER_ROLL = ITEMS.register("green_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.GREEN_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> CYAN_WALLPAPER_ROLL = ITEMS.register("cyan_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.CYAN_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_WALLPAPER_ROLL = ITEMS.register("light_blue_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.LIGHT_BLUE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> BLUE_WALLPAPER_ROLL = ITEMS.register("blue_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.BLUE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> PURPLE_WALLPAPER_ROLL = ITEMS.register("purple_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.PURPLE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> MAGENTA_WALLPAPER_ROLL = ITEMS.register("magenta_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.MAGENTA_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> PINK_WALLPAPER_ROLL = ITEMS.register("pink_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.PINK_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> BROWN_WALLPAPER_ROLL = ITEMS.register("brown_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.BROWN_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> BLACK_WALLPAPER_ROLL = ITEMS.register("black_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.BLACK_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> GRAY_WALLPAPER_ROLL = ITEMS.register("gray_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.GRAY_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_WALLPAPER_ROLL = ITEMS.register("light_gray_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.LIGHT_GRAY_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> WHITE_WALLPAPER_ROLL = ITEMS.register("white_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.WHITE_WALLPAPER_BLOCK.get()));

    public static final RegistryObject<Item> PRIMARY_WALLPAPER_ROLL = ITEMS.register("primary_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.PRIMARY_WALLPAPER_BLOCK.get()));

    public static final RegistryObject<Item> MAROON_WALLPAPER_ROLL = ITEMS.register("maroon_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.MAROON_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> ROSE_WALLPAPER_ROLL = ITEMS.register("rose_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.ROSE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> CORAL_WALLPAPER_ROLL = ITEMS.register("coral_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.CORAL_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> INDIGO_WALLPAPER_ROLL = ITEMS.register("indigo_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.INDIGO_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> NAVY_WALLPAPER_ROLL = ITEMS.register("navy_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.NAVY_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> SLATE_WALLPAPER_ROLL = ITEMS.register("slate_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.SLATE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> OLIVE_WALLPAPER_ROLL = ITEMS.register("olive_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.OLIVE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> AMBER_WALLPAPER_ROLL = ITEMS.register("amber_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.AMBER_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> BEIGE_WALLPAPER_ROLL = ITEMS.register("beige_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.BEIGE_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> TEAL_WALLPAPER_ROLL = ITEMS.register("teal_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.TEAL_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> MINT_WALLPAPER_ROLL = ITEMS.register("mint_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.MINT_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> AQUA_WALLPAPER_ROLL = ITEMS.register("aqua_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.AQUA_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> VERDANT_WALLPAPER_ROLL = ITEMS.register("verdant_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.VERDANT_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> FOREST_WALLPAPER_ROLL = ITEMS.register("forest_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.FOREST_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> GINGER_WALLPAPER_ROLL = ITEMS.register("ginger_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.GINGER_WALLPAPER_BLOCK.get()));
    public static final RegistryObject<Item> TAN_WALLPAPER_ROLL = ITEMS.register("tan_wallpaper_roll",
            () -> new WallpaperRollItem(new Item.Properties(), ModBlocks.TAN_WALLPAPER_BLOCK.get()));

    //Baseborde Items
    public static final RegistryObject<Item> DRIPSTONE_BASEBOARD = ITEMS.register("dripstone_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.DRIPSTONE));
    public static final RegistryObject<Item> QUARTZ_BASEBOARD = ITEMS.register("quartz_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.QUARTZ));
    public static final RegistryObject<Item> GOLD_BASEBOARD = ITEMS.register("gold_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.GOLD));
    public static final RegistryObject<Item> PRISMARINE_BASEBOARD = ITEMS.register("prismarine_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.PRISMARINE));
    public static final RegistryObject<Item> STONE_BASEBOARD = ITEMS.register("stone_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.STONE));
    public static final RegistryObject<Item> DEEPSLATE_BASEBOARD = ITEMS.register("deepslate_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.DEEPSLATE));
    public static final RegistryObject<Item> BLACKSTONE_BASEBOARD = ITEMS.register("blackstone_baseboard",
            () -> new SkirtingItem(new Item.Properties(), Baseboard.BLACKSTONE));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}