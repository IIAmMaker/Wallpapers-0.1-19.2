package net.im_maker.wallpapers;

import com.mojang.logging.LogUtils;
import net.im_maker.wallpapers.common.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Wallpapers.MOD_ID)
public class Wallpapers {
    public static final String MOD_ID = "wallpapers";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Wallpapers() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModSounds.register(modEventBus);
        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            event.accept(ModBlocks.WHITE_WALLPAPER_BLOCK);
            event.accept(ModBlocks.LIGHT_GRAY_WALLPAPER_BLOCK);
            event.accept(ModBlocks.GRAY_WALLPAPER_BLOCK);
            event.accept(ModBlocks.BLACK_WALLPAPER_BLOCK);
            event.accept(ModBlocks.BROWN_WALLPAPER_BLOCK);
            event.accept(ModBlocks.RED_WALLPAPER_BLOCK);
            event.accept(ModBlocks.ORANGE_WALLPAPER_BLOCK);
            event.accept(ModBlocks.YELLOW_WALLPAPER_BLOCK);
            event.accept(ModBlocks.LIME_WALLPAPER_BLOCK);
            event.accept(ModBlocks.GREEN_WALLPAPER_BLOCK);
            event.accept(ModBlocks.CYAN_WALLPAPER_BLOCK);
            event.accept(ModBlocks.LIGHT_BLUE_WALLPAPER_BLOCK);
            event.accept(ModBlocks.BLUE_WALLPAPER_BLOCK);
            event.accept(ModBlocks.PURPLE_WALLPAPER_BLOCK);
            event.accept(ModBlocks.MAGENTA_WALLPAPER_BLOCK);
            event.accept(ModBlocks.PINK_WALLPAPER_BLOCK);
            event.accept(ModBlocks.PRIMARY_WALLPAPER_BLOCK);
            if (ModList.get().isLoaded("dye_depot")) {
                event.accept(ModBlocks.MAROON_WALLPAPER_BLOCK);
                event.accept(ModBlocks.ROSE_WALLPAPER_BLOCK);
                event.accept(ModBlocks.CORAL_WALLPAPER_BLOCK);
                event.accept(ModBlocks.INDIGO_WALLPAPER_BLOCK);
                event.accept(ModBlocks.NAVY_WALLPAPER_BLOCK);
                event.accept(ModBlocks.SLATE_WALLPAPER_BLOCK);
                event.accept(ModBlocks.OLIVE_WALLPAPER_BLOCK);
                event.accept(ModBlocks.AMBER_WALLPAPER_BLOCK);
                event.accept(ModBlocks.BEIGE_WALLPAPER_BLOCK);
                event.accept(ModBlocks.TEAL_WALLPAPER_BLOCK);
                event.accept(ModBlocks.MINT_WALLPAPER_BLOCK);
                event.accept(ModBlocks.AQUA_WALLPAPER_BLOCK);
                event.accept(ModBlocks.VERDANT_WALLPAPER_BLOCK);
                event.accept(ModBlocks.FOREST_WALLPAPER_BLOCK);
                event.accept(ModBlocks.GINGER_WALLPAPER_BLOCK);
                event.accept(ModBlocks.TAN_WALLPAPER_BLOCK);
            }
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            event.accept(ModItems.WHITE_WALLPAPER_ROLL);
            event.accept(ModItems.LIGHT_GRAY_WALLPAPER_ROLL);
            event.accept(ModItems.GRAY_WALLPAPER_ROLL);
            event.accept(ModItems.BLACK_WALLPAPER_ROLL);
            event.accept(ModItems.BROWN_WALLPAPER_ROLL);
            event.accept(ModItems.RED_WALLPAPER_ROLL);
            event.accept(ModItems.ORANGE_WALLPAPER_ROLL);
            event.accept(ModItems.YELLOW_WALLPAPER_ROLL);
            event.accept(ModItems.LIME_WALLPAPER_ROLL);
            event.accept(ModItems.GREEN_WALLPAPER_ROLL);
            event.accept(ModItems.CYAN_WALLPAPER_ROLL);
            event.accept(ModItems.LIGHT_BLUE_WALLPAPER_ROLL);
            event.accept(ModItems.BLUE_WALLPAPER_ROLL);
            event.accept(ModItems.PURPLE_WALLPAPER_ROLL);
            event.accept(ModItems.MAGENTA_WALLPAPER_ROLL);
            event.accept(ModItems.PINK_WALLPAPER_ROLL);
            event.accept(ModItems.PRIMARY_WALLPAPER_ROLL);
            if (ModList.get().isLoaded("dye_depot")) {
                event.accept(ModItems.MAROON_WALLPAPER_ROLL);
                event.accept(ModItems.ROSE_WALLPAPER_ROLL);
                event.accept(ModItems.CORAL_WALLPAPER_ROLL);
                event.accept(ModItems.INDIGO_WALLPAPER_ROLL);
                event.accept(ModItems.NAVY_WALLPAPER_ROLL);
                event.accept(ModItems.SLATE_WALLPAPER_ROLL);
                event.accept(ModItems.OLIVE_WALLPAPER_ROLL);
                event.accept(ModItems.AMBER_WALLPAPER_ROLL);
                event.accept(ModItems.BEIGE_WALLPAPER_ROLL);
                event.accept(ModItems.TEAL_WALLPAPER_ROLL);
                event.accept(ModItems.MINT_WALLPAPER_ROLL);
                event.accept(ModItems.AQUA_WALLPAPER_ROLL);
                event.accept(ModItems.VERDANT_WALLPAPER_ROLL);
                event.accept(ModItems.FOREST_WALLPAPER_ROLL);
                event.accept(ModItems.GINGER_WALLPAPER_ROLL);
                event.accept(ModItems.TAN_WALLPAPER_ROLL);
            }
            event.accept(ModItems.DRIPSTONE_BASEBOARD);
            event.accept(ModItems.GOLD_BASEBOARD);
            event.accept(ModItems.QUARTZ_BASEBOARD);
            event.accept(ModItems.PRISMARINE_BASEBOARD);
            event.accept(ModItems.STONE_BASEBOARD);
            event.accept(ModItems.DEEPSLATE_BASEBOARD);
            event.accept(ModItems.BLACKSTONE_BASEBOARD);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
