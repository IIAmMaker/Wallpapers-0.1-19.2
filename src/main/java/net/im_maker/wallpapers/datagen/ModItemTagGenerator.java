package net.im_maker.wallpapers.datagen;

import com.ninni.dye_depot.registry.DDDyes;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.item.ModItems;
import net.im_maker.wallpapers.common.tags.ModBlockTags;
import net.im_maker.wallpapers.common.tags.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, providerCompletableFuture, lookupCompletableFuture, Wallpapers.MOD_ID, existingFileHelper);
    }

    private RegistryObject<Block> block (String block) {
        ResourceLocation blockLocation = new ResourceLocation(Wallpapers.MOD_ID, block);
        return RegistryObject.create(blockLocation, ForgeRegistries.BLOCKS);
    }

    private RegistryObject<Item> item (String item) {
        ResourceLocation itemLocation = new ResourceLocation(Wallpapers.MOD_ID, item);
        return RegistryObject.create(itemLocation, ForgeRegistries.ITEMS);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        List<DyeColor> colors = new ArrayList<>(Arrays.asList(
                DyeColor.WHITE, DyeColor.LIGHT_GRAY, DyeColor.GRAY, DyeColor.BLACK,
                DyeColor.BROWN, DyeColor.RED, DyeColor.ORANGE, DyeColor.YELLOW,
                DyeColor.LIME, DyeColor.GREEN, DyeColor.CYAN, DyeColor.LIGHT_BLUE,
                DyeColor.BLUE, DyeColor.PURPLE, DyeColor.MAGENTA, DyeColor.PINK
        ));
        this.tag(ItemTags.PIGLIN_LOVED).add(ModItems.GOLD_SKIRTING_BOARD.get());
        this.tag(ModItemTags.SKIRTING_BOARD).add(
                ModItems.DRIPSTONE_SKIRTING_BOARD.get(),
                ModItems.QUARTZ_SKIRTING_BOARD.get(),
                ModItems.GOLD_SKIRTING_BOARD.get(),
                ModItems.PRISMARINE_SKIRTING_BOARD.get(),
                ModItems.STONE_SKIRTING_BOARD.get(),
                ModItems.DEEPSLATE_SKIRTING_BOARD.get(),
                ModItems.BLACKSTONE_SKIRTING_BOARD.get()
        );
        for (DyeColor color : colors) {
            this.tag(ModItemTags.WALLPAPER_BLOCKS).add(item(color + "_wallpaper_block").get());
            this.tag(ModItemTags.WALLPAPER_ROLLS).add(item(color + "_wallpaper_roll").get());
        }
        if (ModList.get().isLoaded("dye_depot")) for (DDDyes color : DDDyes.values()) {
            this.tag(ModItemTags.WALLPAPER_BLOCKS).add(item(color + "_wallpaper_block").get());
            this.tag(ModItemTags.WALLPAPER_ROLLS).add(item(color + "_wallpaper_roll").get());
        }
        this.tag(ModItemTags.WALLPAPER_BLOCKS).add(
                ModBlocks.PRIMARY_WALLPAPER_BLOCK.get().asItem(),
                ModBlocks.FROSTED_WALLPAPER_BLOCK.get().asItem(),
                ModBlocks.ULTIMATE_WALLPAPER_BLOCK.get().asItem(),
                ModBlocks.ULTRA_ULTIMATE_WALLPAPER_BLOCK.get().asItem()
        );
        this.tag(ModItemTags.WALLPAPER_ROLLS).add(
                ModItems.PRIMARY_WALLPAPER_ROLL.get(),
                ModItems.FROSTED_WALLPAPER_ROLL.get(),
                ModItems.ULTIMATE_WALLPAPER_ROLL.get(),
                ModItems.ULTRA_ULTIMATE_WALLPAPER_ROLL.get()
        );
    }
}