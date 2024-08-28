package net.im_maker.wallpapers.datagen;

import com.ninni.dye_depot.registry.DDDyes;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.tags.ModBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Wallpapers.MOD_ID, existingFileHelper);
    }

    private RegistryObject<Block> block (String block) {
        ResourceLocation blockLocation = new ResourceLocation(Wallpapers.MOD_ID, block);
        return RegistryObject.create(blockLocation, ForgeRegistries.BLOCKS);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        List<DyeColor> colors = new ArrayList<>(Arrays.asList(
                DyeColor.WHITE, DyeColor.LIGHT_GRAY, DyeColor.GRAY, DyeColor.BLACK,
                DyeColor.BROWN, DyeColor.RED, DyeColor.ORANGE, DyeColor.YELLOW,
                DyeColor.LIME, DyeColor.GREEN, DyeColor.CYAN, DyeColor.LIGHT_BLUE,
                DyeColor.BLUE, DyeColor.PURPLE, DyeColor.MAGENTA, DyeColor.PINK
        ));

        for (DyeColor color : colors) {
            this.tag(BlockTags.MINEABLE_WITH_AXE).add(block(color + "_wallpaper_block").get());
            this.tag(ModBlockTags.WALLPAPER_BLOCKS).add(block(color + "_wallpaper_block").get());
        }
        if (ModList.get().isLoaded("dye_depot")) for (DDDyes color : DDDyes.values()) {
            this.tag(BlockTags.MINEABLE_WITH_AXE).add(block(color + "_wallpaper_block").get());
            this.tag(ModBlockTags.WALLPAPER_BLOCKS).add(block(color + "_wallpaper_block").get());
        }
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                ModBlocks.PRIMARY_WALLPAPER_BLOCK.get(),
                ModBlocks.FROSTED_WALLPAPER_BLOCK.get(),
                ModBlocks.ULTIMATE_WALLPAPER_BLOCK.get(),
                ModBlocks.ULTRA_ULTIMATE_WALLPAPER_BLOCK.get()
                );
        this.tag(ModBlockTags.WALLPAPER_BLOCKS).add(
                ModBlocks.PRIMARY_WALLPAPER_BLOCK.get(),
                ModBlocks.FROSTED_WALLPAPER_BLOCK.get(),
                ModBlocks.ULTIMATE_WALLPAPER_BLOCK.get(),
                ModBlocks.ULTRA_ULTIMATE_WALLPAPER_BLOCK.get()
                );

    }
}