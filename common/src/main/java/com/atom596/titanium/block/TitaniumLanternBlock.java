package com.atom596.titanium.block;

public class TitaniumLanternBlock /*extends LanternBlock*/ {/*
    public TitaniumLanternBlock() {
        super(Properties.of()
                .forceSolidOn()
                .requiresCorrectToolForDrops()
                .strength(3.5f)
                .sound(SoundType.LANTERN)
                .lightLevel(($$1) -> { return (Boolean)$$1.getValue(BlockStateProperties.LIT) ? 15 : 0; })
                .noOcclusion()
                .pushReaction(PushReaction.DESTROY));

        this.registerDefaultState(this.defaultBlockState().setValue(LIT, false));
    }

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        world.setBlock(pos, state.cycle(LIT), 512);
        return InteractionResult.SUCCESS;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockState returnable = super.getStateForPlacement(ctx);
        if (returnable != null) {
            return returnable.setValue(LIT, false);
        }
        return null;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(LIT);
    }
*/}
