package net.im_maker.wallpapers.common.block.wallpaper_blocks;

import net.im_maker.wallpapers.common.item.ModItems;
import net.im_maker.wallpapers.common.sound.ModSounds;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.im_maker.wallpapers.common.block.block_values.Baseboard;
import net.im_maker.wallpapers.common.block.block_values.ModBlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;

public class WallpaperBlock extends Block {
    public static final EnumProperty<Baseboard> BASEBOARD = ModBlockStateProperties.BASEBOARD;

    public WallpaperBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(BASEBOARD, Baseboard.NONE));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack Key = pPlayer.getItemInHand(pHand);
        if (Key.is(ItemTags.PICKAXES) && pState.getValue(ModBlockStateProperties.BASEBOARD) != Baseboard.NONE) {
            if (!pPlayer.isCreative()) {
                switch (pLevel.getBlockState(pPos).getValue(ModBlockStateProperties.BASEBOARD)) {
                    case DRIPSTONE:
                        pPlayer.addItem(new ItemStack(ModItems.DRIPSTONE_BASEBOARD.get()));
                        break;
                    case QUARTZ:
                        pPlayer.addItem(new ItemStack(ModItems.QUARTZ_BASEBOARD.get()));
                        break;
                    case GOLD:
                        pPlayer.addItem(new ItemStack(ModItems.GOLD_BASEBOARD.get()));
                        break;
                    case PRISMARINE:
                        pPlayer.addItem(new ItemStack(ModItems.PRISMARINE_BASEBOARD.get()));
                        break;
                    case STONE:
                        pPlayer.addItem(new ItemStack(ModItems.STONE_BASEBOARD.get()));
                        break;
                    case DEEPSLATE:
                        pPlayer.addItem(new ItemStack(ModItems.DEEPSLATE_BASEBOARD.get()));
                        break;
                    case BLACKSTONE:
                        pPlayer.addItem(new ItemStack(ModItems.BLACKSTONE_BASEBOARD.get()));
                        break;
                }
            }
            pPlayer.getItemInHand(pHand).hurtAndBreak(1, pPlayer, (player1) -> {
                player1.broadcastBreakEvent(pHand);
            });
            pLevel.setBlockAndUpdate(pPos, pState.setValue(BASEBOARD, Baseboard.NONE));
            pLevel.playSound((Player)null, pPos, ModSounds.BASEBOARD_PLACE.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.sidedSuccess(pLevel.isClientSide);
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BASEBOARD);
    }
}