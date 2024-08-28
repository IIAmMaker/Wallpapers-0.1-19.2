package net.im_maker.wallpapers.datagen;

import com.google.common.collect.ImmutableMap;
import com.ninni.dye_depot.registry.DDDyes;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.block.block_values.ModBlockStateProperties;
import net.im_maker.wallpapers.common.block.block_values.SkirtingBoard;
import net.im_maker.wallpapers.common.block.custom.WallpaperBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Wallpapers.MOD_ID, exFileHelper);
    }

    private Block block (String block) {
        ResourceLocation blockLocation = new ResourceLocation(Wallpapers.MOD_ID, block);
        return ForgeRegistries.BLOCKS.getValue(blockLocation);
    }
    private ResourceLocation blockR (DyeColor color, String block) {
        return new ResourceLocation(Wallpapers.MOD_ID, "block/" + color + "_painted_" + block);
    }
    private RegistryObject<Block> blockO (DyeColor color, String block) {
        ResourceLocation blockLocation = new ResourceLocation(Wallpapers.MOD_ID, color + "_painted_" + block);
        return RegistryObject.create(blockLocation, ForgeRegistries.BLOCKS);
    }
    private Block  blockOSSS (DyeColor color, String block) {
        ResourceLocation blockLocation = new ResourceLocation(Wallpapers.MOD_ID, "stripped_" + color + "_painted_" + block);
        return ForgeRegistries.BLOCKS.getValue(blockLocation);
    }

    private void strippedLogBlock(RotatedPillarBlock block, RotatedPillarBlock baseName) {
        axisBlock(block, blockTexture(baseName), blockTexture(baseName));
    }


    @Override
    protected void registerStatesAndModels() {
        List<DyeColor> colors = new ArrayList<>(Arrays.asList(
                DyeColor.WHITE, DyeColor.LIGHT_GRAY, DyeColor.GRAY, DyeColor.BLACK,
                DyeColor.BROWN, DyeColor.RED, DyeColor.ORANGE, DyeColor.YELLOW,
                DyeColor.LIME, DyeColor.GREEN, DyeColor.CYAN, DyeColor.LIGHT_BLUE,
                DyeColor.BLUE, DyeColor.PURPLE, DyeColor.MAGENTA, DyeColor.PINK
        ));
        for (DyeColor color : colors) {
            wallpaperBlock(block(color + "_wallpaper_block"));
        }
        if (ModList.get().isLoaded("dye_depot")) for (DDDyes color : DDDyes.values()) {
            wallpaperBlock(block(color + "_wallpaper_block"));
        }
        wallpaperBlock(ModBlocks.PRIMARY_WALLPAPER_BLOCK.get());
        wallpaperBlock(ModBlocks.FROSTED_WALLPAPER_BLOCK.get());
        wallpaperBlock(ModBlocks.ULTIMATE_WALLPAPER_BLOCK.get());
        wallpaperBlock(ModBlocks.ULTRA_ULTIMATE_WALLPAPER_BLOCK.get());
    }

    public void wallpaperBlock(Block block) {
        wallpaperBlock(block,
                models().withExistingParent(name(block), "minecraft:block/cube_all")
                        .texture("all", "block/" + name(block)),
                models().withExistingParent("dripstone_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/dripstone_skirting_board")
                        .texture("skirting_board", "wallpapers:block/dripstone_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/dripstone_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("quartz_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/quartz_skirting_board")
                        .texture("skirting_board", "wallpapers:block/quartz_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/quartz_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("gold_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/gold_skirting_board")
                        .texture("skirting_board", "wallpapers:block/gold_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/gold_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("prismarine_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/prismarine_skirting_board")
                        .texture("skirting_board", "wallpapers:block/prismarine_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/prismarine_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("stone_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/stone_skirting_board")
                        .texture("skirting_board", "wallpapers:block/stone_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/stone_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("deepslate_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/deepslate_skirting_board")
                        .texture("skirting_board", "wallpapers:block/deepslate_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/deepslate_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("blackstone_skirting_board", "wallpapers:block/template_skirting_board")
                        .texture("particle", "wallpapers:block/blackstone_skirting_board")
                        .texture("skirting_board", "wallpapers:block/blackstone_skirting_board")
                        .texture("skirting_board_bottom", "wallpapers:block/blackstone_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("dripstone_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/dripstone_skirting_board")
                        .texture("crown_molding", "wallpapers:block/dripstone_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/dripstone_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("quartz_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/quartz_skirting_board")
                        .texture("crown_molding", "wallpapers:block/quartz_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/quartz_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("gold_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/gold_skirting_board")
                        .texture("crown_molding", "wallpapers:block/gold_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/gold_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("prismarine_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/prismarine_skirting_board")
                        .texture("crown_molding", "wallpapers:block/prismarine_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/prismarine_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("stone_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/stone_skirting_board")
                        .texture("crown_molding", "wallpapers:block/stone_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/stone_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("deepslate_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/deepslate_skirting_board")
                        .texture("crown_molding", "wallpapers:block/deepslate_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/deepslate_skirting_board_bottom").renderType("cutout"),
                models().withExistingParent("blackstone_crown_molding", "wallpapers:block/template_crown_molding")
                        .texture("particle", "wallpapers:block/blackstone_skirting_board")
                        .texture("crown_molding", "wallpapers:block/blackstone_skirting_board")
                        .texture("crown_molding_up", "wallpapers:block/blackstone_skirting_board_bottom").renderType("cutout"));
    }

    public void wallpaperBlock(Block block, ModelFile wallpaperBlock, ModelFile dripstoneSB, ModelFile quartzSB, ModelFile goldSB, ModelFile prismarineSB, ModelFile stoneSB, ModelFile deepslateSB, ModelFile blackstoneSB, ModelFile dripstoneCM, ModelFile quartzCM, ModelFile goldCM, ModelFile prismarineCM, ModelFile stoneCM, ModelFile deepslateCM, ModelFile blackstoneCM) {
        getMultipartBuilder(block)
                .part().modelFile(wallpaperBlock).addModel().end()
                .part().modelFile(dripstoneSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.DRIPSTONE).end()
                .part().modelFile(quartzSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.QUARTZ).end()
                .part().modelFile(goldSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.GOLD).end()
                .part().modelFile(prismarineSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.PRISMARINE).end()
                .part().modelFile(stoneSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.STONE).end()
                .part().modelFile(deepslateSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.DEEPSLATE).end()
                .part().modelFile(blackstoneSB).addModel()
                .condition(WallpaperBlock.Skirting_Board, SkirtingBoard.BLACKSTONE).end()
                .part().modelFile(dripstoneCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.DRIPSTONE).end()
                .part().modelFile(quartzCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.QUARTZ).end()
                .part().modelFile(goldCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.GOLD).end()
                .part().modelFile(prismarineCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.PRISMARINE).end()
                .part().modelFile(stoneCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.STONE).end()
                .part().modelFile(deepslateCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.DEEPSLATE).end()
                .part().modelFile(blackstoneCM).addModel()
                .condition(WallpaperBlock.Crown_molding, SkirtingBoard.BLACKSTONE).end();
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
}