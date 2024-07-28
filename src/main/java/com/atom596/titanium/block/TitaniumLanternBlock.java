package com.atom596.titanium.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TitaniumLanternBlock extends LanternBlock {
    public TitaniumLanternBlock() {
        super(AbstractBlock.Settings.create().solid().requiresTool().strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
        this.setDefaultState(this.getDefaultState().with(LIT, false));
    }

    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.setBlockState(pos, state.cycle(LIT), Block.NOTIFY_LISTENERS);
        return ActionResult.SUCCESS;
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState returnable = super.getPlacementState(ctx);
        if (returnable != null) {
            return returnable.with(LIT, false);
        }
        return null;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(LIT);
    }
}
