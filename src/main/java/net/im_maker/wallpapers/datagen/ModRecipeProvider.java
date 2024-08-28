package net.im_maker.wallpapers.datagen;

import com.ninni.dye_depot.registry.DDDyes;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.item.ModItems;
import net.im_maker.wallpapers.common.tags.ModItemTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private RegistryObject<Item> item (String item) {
        return itemV(Wallpapers.MOD_ID, item);
    }

    private RegistryObject<Item> itemV (String itemID, String item) {
        ResourceLocation itemLocation = new ResourceLocation(itemID, item);
        return RegistryObject.create(itemLocation, ForgeRegistries.ITEMS);
    }

    private void skirtingBoards (Item skirting_boards, Item material, Consumer<FinishedRecipe> pWriter){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, skirting_boards, 12)
                .pattern(" C ")
                .pattern("###")
                .define('C', Items.CLAY_BALL)
                .define('#', material)
                .unlockedBy(getHasName(material), has(material))
                .save(pWriter);
    }

    private void wallpaperRoll (String color, String dyeID, Consumer<FinishedRecipe> pWriter){
        Item wallpaper_roll = item(color + "_wallpaper_roll").get();
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, wallpaper_roll, 16)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PSP")
                .define('P', Items.PAPER)
                .define('D', itemV(dyeID, color + "_dye").get())
                .define('S', Items.SLIME_BALL)
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .save(pWriter);
    }

    private void wallpaperBlock (String color, Consumer<FinishedRecipe> pWriter){
        Item wallpaper_roll = item(color + "_wallpaper_roll").get();
        Item wallpaper_block = item(color + "_wallpaper_block").get();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, wallpaper_block)
                .requires(wallpaper_roll)
                .requires(ItemTags.PLANKS)
                .unlockedBy(getHasName(wallpaper_roll), has(wallpaper_roll))
                .save(pWriter);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        List<DyeColor> colors = new ArrayList<>(Arrays.asList(
                DyeColor.WHITE, DyeColor.LIGHT_GRAY, DyeColor.GRAY, DyeColor.BLACK,
                DyeColor.BROWN, DyeColor.RED, DyeColor.ORANGE, DyeColor.YELLOW,
                DyeColor.LIME, DyeColor.GREEN, DyeColor.CYAN, DyeColor.LIGHT_BLUE,
                DyeColor.BLUE, DyeColor.PURPLE, DyeColor.MAGENTA, DyeColor.PINK
        ));
        for (DyeColor color : colors) {
            wallpaperRoll(color.getName(), "minecraft", pWriter);
            wallpaperBlock(color.getName(), pWriter);
        }
        if (ModList.get().isLoaded("dye_depot")) for (DDDyes color : DDDyes.values()) {
            wallpaperRoll(color.getName(), "dye_depot", pWriter);
            wallpaperBlock(color.getName(), pWriter);
        }

        Item fwr = ModItems.FROSTED_WALLPAPER_ROLL.get();
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fwr)
                .pattern("PPP")
                .pattern("PDP")
                .pattern("PSP")
                .define('P', Items.PAPER)
                .define('D', Items.SNOWBALL)
                .define('S', Items.SLIME_BALL)
                .unlockedBy(getHasName(fwr), has(fwr))
                .save(pWriter);

        wallpaperBlock("primary", pWriter);
        wallpaperBlock("frosted", pWriter);
        wallpaperBlock("ultimate", pWriter);
        wallpaperBlock("ultra_ultimate", pWriter);

        skirtingBoards(ModItems.DRIPSTONE_SKIRTING_BOARD.get(), Items.DRIPSTONE_BLOCK, pWriter);
        skirtingBoards(ModItems.GOLD_SKIRTING_BOARD.get(), Items.GOLD_BLOCK, pWriter);
        skirtingBoards(ModItems.QUARTZ_SKIRTING_BOARD.get(), Items.QUARTZ, pWriter);
        skirtingBoards(ModItems.PRISMARINE_SKIRTING_BOARD.get(), Items.PRISMARINE, pWriter);
        skirtingBoards(ModItems.STONE_SKIRTING_BOARD.get(), Items.COBBLESTONE, pWriter);
        skirtingBoards(ModItems.DEEPSLATE_SKIRTING_BOARD.get(), Items.COBBLED_DEEPSLATE, pWriter);
        skirtingBoards(ModItems.BLACKSTONE_SKIRTING_BOARD.get(), Items.BLACKSTONE, pWriter);

    }
}