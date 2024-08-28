package net.im_maker.wallpapers.datagen;

import com.ninni.dye_depot.registry.DDDyes;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Wallpapers.MOD_ID, existingFileHelper);
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
    protected void registerModels() {
        List<DyeColor> colors = new ArrayList<>(Arrays.asList(
                DyeColor.WHITE, DyeColor.LIGHT_GRAY, DyeColor.GRAY, DyeColor.BLACK,
                DyeColor.BROWN, DyeColor.RED, DyeColor.ORANGE, DyeColor.YELLOW,
                DyeColor.LIME, DyeColor.GREEN, DyeColor.CYAN, DyeColor.LIGHT_BLUE,
                DyeColor.BLUE, DyeColor.PURPLE, DyeColor.MAGENTA, DyeColor.PINK
        ));
        for (DyeColor color : colors) {
            evenSimplerBlockItem(block(color + "_wallpaper_block"));
            simpleItem(item(color + "_wallpaper_roll"));
        }
        if (ModList.get().isLoaded("dye_depot")) for (DDDyes color : DDDyes.values()) {
            evenSimplerBlockItem(block(color + "_wallpaper_block"));
            simpleItem(item(color + "_wallpaper_roll"));
        }
        evenSimplerBlockItem(ModBlocks.PRIMARY_WALLPAPER_BLOCK);
        evenSimplerBlockItem(ModBlocks.FROSTED_WALLPAPER_BLOCK);
        evenSimplerBlockItem(ModBlocks.ULTIMATE_WALLPAPER_BLOCK);
        evenSimplerBlockItem(ModBlocks.ULTRA_ULTIMATE_WALLPAPER_BLOCK);
        simpleItem(ModItems.PRIMARY_WALLPAPER_ROLL);
        simpleItem(ModItems.FROSTED_WALLPAPER_ROLL);
        simpleItem(ModItems.ULTIMATE_WALLPAPER_ROLL);
        simpleItem(ModItems.ULTRA_ULTIMATE_WALLPAPER_ROLL);

        for (String board_type : Wallpapers.SkirtingBoards) {
            handheldItem(item(board_type + "_skirting_board"));
        }
        handheldItem(item("broken_quartz_skirting_board"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Wallpapers.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Wallpapers.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Wallpapers.MOD_ID,"item/" + item.getId().getPath()));
    }
}