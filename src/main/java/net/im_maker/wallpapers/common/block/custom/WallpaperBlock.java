package net.im_maker.wallpapers.common.block.custom;

import net.im_maker.wallpapers.common.block.block_values.ModBlockStateProperties;
import net.im_maker.wallpapers.common.block.block_values.SkirtingBoard;
import net.im_maker.wallpapers.common.item.ModItems;
import net.im_maker.wallpapers.common.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;

public class WallpaperBlock extends Block {
    public static final EnumProperty<SkirtingBoard> SKIRTING_BOARD = ModBlockStateProperties.SKIRTING_BOARD;
    public static final EnumProperty<SkirtingBoard> CROWN_MOLDING = ModBlockStateProperties.CROWN_MOLDING;

    public WallpaperBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(SKIRTING_BOARD, SkirtingBoard.NONE).setValue(CROWN_MOLDING, SkirtingBoard.NONE));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack kye = pPlayer.getItemInHand(pHand);

        if (!(pHit.getLocation().y - (double)pPos.getY() > 0.5D) && kye.is(ItemTags.PICKAXES) && pState.getValue(ModBlockStateProperties.SKIRTING_BOARD) != SkirtingBoard.NONE) {
            if (!pPlayer.isCreative()) {
                switch (pLevel.getBlockState(pPos).getValue(ModBlockStateProperties.SKIRTING_BOARD)) {
                    case DRIPSTONE:
                        pPlayer.addItem(new ItemStack(ModItems.DRIPSTONE_SKIRTING_BOARD.get()));
                        break;
                    case QUARTZ:
                        pPlayer.addItem(new ItemStack(ModItems.QUARTZ_SKIRTING_BOARD.get()));
                        break;
                    case GOLD:
                        pPlayer.addItem(new ItemStack(ModItems.GOLD_SKIRTING_BOARD.get()));
                        break;
                    case PRISMARINE:
                        pPlayer.addItem(new ItemStack(ModItems.PRISMARINE_SKIRTING_BOARD.get()));
                        break;
                    case STONE:
                        pPlayer.addItem(new ItemStack(ModItems.STONE_SKIRTING_BOARD.get()));
                        break;
                    case DEEPSLATE:
                        pPlayer.addItem(new ItemStack(ModItems.DEEPSLATE_SKIRTING_BOARD.get()));
                        break;
                    case BLACKSTONE:
                        pPlayer.addItem(new ItemStack(ModItems.BLACKSTONE_SKIRTING_BOARD.get()));
                        break;
                }
            }
            pPlayer.getItemInHand(pHand).hurtAndBreak(1, pPlayer, (player1) -> {
                player1.broadcastBreakEvent(pHand);
            });
            pLevel.setBlockAndUpdate(pPos, pState.setValue(SKIRTING_BOARD, SkirtingBoard.NONE));
            pLevel.playSound((Player)null, pPos, ModSounds.SKIRTING_BOARD_REMOVE.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        } else if ((pHit.getLocation().y - (double)pPos.getY() > 0.5D) && kye.is(ItemTags.PICKAXES) && pState.getValue(ModBlockStateProperties.CROWN_MOLDING) != SkirtingBoard.NONE) {
            if (!pPlayer.isCreative()) {
                switch (pLevel.getBlockState(pPos).getValue(ModBlockStateProperties.CROWN_MOLDING)) {
                    case DRIPSTONE:
                        pPlayer.addItem(new ItemStack(ModItems.DRIPSTONE_SKIRTING_BOARD.get()));
                        break;
                    case QUARTZ:
                        pPlayer.addItem(new ItemStack(ModItems.QUARTZ_SKIRTING_BOARD.get()));
                        break;
                    case GOLD:
                        pPlayer.addItem(new ItemStack(ModItems.GOLD_SKIRTING_BOARD.get()));
                        break;
                    case PRISMARINE:
                        pPlayer.addItem(new ItemStack(ModItems.PRISMARINE_SKIRTING_BOARD.get()));
                        break;
                    case STONE:
                        pPlayer.addItem(new ItemStack(ModItems.STONE_SKIRTING_BOARD.get()));
                        break;
                    case DEEPSLATE:
                        pPlayer.addItem(new ItemStack(ModItems.DEEPSLATE_SKIRTING_BOARD.get()));
                        break;
                    case BLACKSTONE:
                        pPlayer.addItem(new ItemStack(ModItems.BLACKSTONE_SKIRTING_BOARD.get()));
                        break;
                }
            }
            pPlayer.getItemInHand(pHand).hurtAndBreak(1, pPlayer, (player1) -> {
                player1.broadcastBreakEvent(pHand);
            });
            pLevel.setBlockAndUpdate(pPos, pState.setValue(CROWN_MOLDING, SkirtingBoard.NONE));
            pLevel.playSound((Player)null, pPos, ModSounds.SKIRTING_BOARD_REMOVE.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SKIRTING_BOARD, CROWN_MOLDING);
    }
}