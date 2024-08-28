package net.im_maker.wallpapers.common.block;

import net.im_maker.wallpapers.common.sound.ModSounds;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.item.ModItems;
import net.im_maker.wallpapers.common.block.custom.WallpaperBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Wallpapers.MOD_ID);
    //Wallpaper Blocks
    public static final RegistryObject<Block> RED_WALLPAPER_BLOCK = registerBlock("red_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> ORANGE_WALLPAPER_BLOCK = registerBlock("orange_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> YELLOW_WALLPAPER_BLOCK = registerBlock("yellow_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> LIME_WALLPAPER_BLOCK = registerBlock("lime_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> GREEN_WALLPAPER_BLOCK = registerBlock("green_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> CYAN_WALLPAPER_BLOCK = registerBlock("cyan_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> LIGHT_BLUE_WALLPAPER_BLOCK = registerBlock("light_blue_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> BLUE_WALLPAPER_BLOCK = registerBlock("blue_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> PURPLE_WALLPAPER_BLOCK = registerBlock("purple_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> MAGENTA_WALLPAPER_BLOCK = registerBlock("magenta_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> PINK_WALLPAPER_BLOCK = registerBlock("pink_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> BROWN_WALLPAPER_BLOCK = registerBlock("brown_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> BLACK_WALLPAPER_BLOCK = registerBlock("black_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> GRAY_WALLPAPER_BLOCK = registerBlock("gray_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> LIGHT_GRAY_WALLPAPER_BLOCK = registerBlock("light_gray_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> WHITE_WALLPAPER_BLOCK = registerBlock("white_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> ULTIMATE_WALLPAPER_BLOCK = registerBlock("ultimate_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));

    public static final RegistryObject<Block> PRIMARY_WALLPAPER_BLOCK = registerBlock("primary_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> FROSTED_WALLPAPER_BLOCK = registerBlock("frosted_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));

    public static final RegistryObject<Block> MAROON_WALLPAPER_BLOCK = registerBlock("maroon_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> ROSE_WALLPAPER_BLOCK = registerBlock("rose_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_MAGENTA).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> CORAL_WALLPAPER_BLOCK = registerBlock("coral_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> INDIGO_WALLPAPER_BLOCK = registerBlock("indigo_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLUE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> NAVY_WALLPAPER_BLOCK = registerBlock("navy_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> SLATE_WALLPAPER_BLOCK = registerBlock("slate_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_NYLIUM).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> OLIVE_WALLPAPER_BLOCK = registerBlock("olive_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> AMBER_WALLPAPER_BLOCK = registerBlock("amber_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> BEIGE_WALLPAPER_BLOCK = registerBlock("beige_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> TEAL_WALLPAPER_BLOCK = registerBlock("teal_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> MINT_WALLPAPER_BLOCK = registerBlock("mint_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_WART_BLOCK).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> AQUA_WALLPAPER_BLOCK = registerBlock("aqua_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> VERDANT_WALLPAPER_BLOCK = registerBlock("verdant_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> FOREST_WALLPAPER_BLOCK = registerBlock("forest_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> GINGER_WALLPAPER_BLOCK = registerBlock("ginger_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> TAN_WALLPAPER_BLOCK = registerBlock("tan_wallpaper_block", () -> new WallpaperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));
    public static final RegistryObject<Block> ULTRA_ULTIMATE_WALLPAPER_BLOCK = registerBlock("ultra_ultimate_wallpaper_block", () -> new WallpaperBlock (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(ModSounds.WALLPAPER_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
