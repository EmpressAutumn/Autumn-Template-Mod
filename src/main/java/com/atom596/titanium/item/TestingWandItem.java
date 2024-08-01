package com.atom596.titanium.item;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.*;

public class TestingWandItem extends Item {
    public TestingWandItem() {
        super(new Item.Settings().maxCount(1));
        blocks.add("Block{minecraft:iron_ore}");
        blocks.add("Block{minecraft:deepslate_iron_ore}");
        blocks.add("Block{titanium:titanium_ore}");
        blocks.add("Block{titanium:deepslate_titanium_ore}");
        blocks.add("Block{minecraft:diamond_ore}");
        blocks.add("Block{minecraft:deepslate_diamond_ore}");
    }
    public List<String> blocks = new ArrayList<>();

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (user.isInCreativeMode()) {
            user.getItemCooldownManager().set(this, 10);
            if (user.isSneaking() || blocks.isEmpty()) {
            } else {
                List<Integer> count = new ArrayList<>();
                for (int i = 0; i < blocks.size(); i++) {
                    count.add(0);
                }
                for (int x = user.getBlockX(); x < user.getBlockX() + 16; x++) {
                    for (int y = world.getTopY() - 1; y >= world.getBottomY(); y--) {
                        for (int z = user.getBlockZ(); z < user.getBlockZ() + 16; z++) {
                            if (!blocks.contains(world.getBlockState(new BlockPos(x, y, z)).getBlock().toString())) {
                                world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState());
                            }
                        }
                    }
                }
                user.sendMessage(Text.of("Summary of Deleted Blocks:"));
                for (int i = 0; i < blocks.size(); i++) {
                    user.sendMessage(Text.of(count.get(i) + " blocks of " + blocks.get(i) + "."));
                }
                user.sendMessage(Text.of(""));
            }
            return TypedActionResult.success(itemStack);
        }
        return TypedActionResult.pass(itemStack);
    }
}
