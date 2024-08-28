package net.im_maker.wallpapers.datagen.loot;

import com.ninni.dye_depot.registry.DDDyes;
import net.im_maker.wallpapers.Wallpapers;
import net.im_maker.wallpapers.common.block.ModBlocks;
import net.im_maker.wallpapers.common.block.block_values.SkirtingBoard;
import net.im_maker.wallpapers.common.block.custom.WallpaperBlock;
import net.im_maker.wallpapers.common.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    private RegistryObject<Block> block (String block) {
        return blockV(Wallpapers.MOD_ID, block);
    }

    private RegistryObject<Block> blockV (String blockID, String block) {
        ResourceLocation blockLocation = new ResourceLocation(blockID, block);
        return RegistryObject.create(blockLocation, ForgeRegistries.BLOCKS);
    }

    @Override
    protected void generate() {
        List<DyeColor> colors = new ArrayList<>(Arrays.asList(
                DyeColor.WHITE, DyeColor.LIGHT_GRAY, DyeColor.GRAY, DyeColor.BLACK,
                DyeColor.BROWN, DyeColor.RED, DyeColor.ORANGE, DyeColor.YELLOW,
                DyeColor.LIME, DyeColor.GREEN, DyeColor.CYAN, DyeColor.LIGHT_BLUE,
                DyeColor.BLUE, DyeColor.PURPLE, DyeColor.MAGENTA, DyeColor.PINK
        ));
        for (DyeColor color : colors) {
            this.add(block(color.getName() + "_wallpaper_block").get(), (block) -> this.createWallpaperBlockItemTable(block));
        }
        if (ModList.get().isLoaded("dye_depot")) for (DDDyes color : DDDyes.values()) {
            this.add(block(color.getName() + "_wallpaper_block").get(), (block) -> this.createWallpaperBlockItemTable(block));
        }
        this.add(ModBlocks.PRIMARY_WALLPAPER_BLOCK.get(), (block) -> this.createWallpaperBlockItemTable(block));
        this.add(ModBlocks.FROSTED_WALLPAPER_BLOCK.get(), (block) -> this.createWallpaperBlockItemTable(block));
        this.add(ModBlocks.ULTIMATE_WALLPAPER_BLOCK.get(), (block) -> this.createWallpaperBlockItemTable(block));
        this.add(ModBlocks.ULTRA_ULTIMATE_WALLPAPER_BLOCK.get(), (block) -> this.createWallpaperBlockItemTable(block));
    }

    private LootTable.Builder createWallpaperBlockItemTable(Block pBlock) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(pBlock)))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.DRIPSTONE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.DRIPSTONE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.QUARTZ_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.QUARTZ)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.GOLD_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.GOLD)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.PRISMARINE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.PRISMARINE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.STONE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.STONE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.DEEPSLATE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.DEEPSLATE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.BLACKSTONE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Skirting_Board, SkirtingBoard.BLACKSTONE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.DRIPSTONE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.DRIPSTONE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.QUARTZ_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.QUARTZ)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.GOLD_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.GOLD)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.PRISMARINE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.PRISMARINE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.STONE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.STONE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.DEEPSLATE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.DEEPSLATE)))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .add(LootItem.lootTableItem(ModItems.BLACKSTONE_SKIRTING_BOARD.get())
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(pBlock)
                                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                                .hasProperty(WallpaperBlock.Crown_molding, SkirtingBoard.BLACKSTONE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}