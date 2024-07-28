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
        user.getItemCooldownManager().set(this, 10);
        if (!blocks.isEmpty()) {
            List<Integer> count = new ArrayList<>();
            for (int i = 0; i < blocks.size(); i++) {
                count.add(0);
            }
            for (int x = user.getBlockX(); x < user.getBlockX() + 16.5; x++) {
                for (int y = world.getBottomY(); y < world.getTopY(); y++) {
                    for (int z = user.getBlockZ(); z < user.getBlockZ() + 16.5; z++) {
                        boolean doBreak = true;
                        for (int i = 0; i < blocks.size(); i++) {
                            if (Objects.equals(world.getBlockState(new BlockPos(x, y, z)).getBlock().toString(), blocks.get(i))) {
                                doBreak = false;
                                count.set(i, count.get(i) + 1);
                            }
                        }
                        if (doBreak) {
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
        } else {

        }
        return TypedActionResult.success(itemStack);
    }
}
