package com.atom596.titanium.item;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class TestingWandItem extends Item {
    public TestingWandItem() {
        super(new Item.Properties().stacksTo(1));
        blocks.add("Block{minecraft:iron_ore}");
        blocks.add("Block{minecraft:deepslate_iron_ore}");
        blocks.add("Block{titanium:titanium_ore}");
        blocks.add("Block{titanium:deepslate_titanium_ore}");
        blocks.add("Block{minecraft:diamond_ore}");
        blocks.add("Block{minecraft:deepslate_diamond_ore}");
    }

    public List<String> blocks = new ArrayList<>();

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player user, InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);
        if (user.isCreative()) {
            user.getCooldowns().addCooldown(this, 10);
            if (user.isCrouching() || blocks.isEmpty()) {
            } else {
                List<Integer> count = new ArrayList<>();
                for (int i = 0; i < blocks.size(); i++) {
                    count.add(0);
                }
                for (int x = user.getBlockX(); x < user.getBlockX() + 16; x++) {
                    for (int y = level.getMaxBuildHeight() - 1; y >= level.getMinBuildHeight(); y--) {
                        for (int z = user.getBlockZ(); z < user.getBlockZ() + 16; z++) {
                            String block = level.getBlockState(new BlockPos(x, y, z)).getBlock().toString();
                            if (!blocks.contains(block)) {
                                level.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 255);
                            }
                            else {
                                count.set(blocks.indexOf(block),
                                        count.get(blocks.indexOf(block)) + 1);
                            }
                        }
                    }
                }
                user.sendSystemMessage(Component.literal("Summary of Blocks:"));
                for (int i = 0; i < blocks.size(); i++) {
                    user.sendSystemMessage(Component.literal(count.get(i) + " blocks of " + blocks.get(i) + "."));
                }
                user.sendSystemMessage(Component.literal(""));
            }
            return InteractionResultHolder.success(itemStack);
        }
        return InteractionResultHolder.pass(itemStack);
    }
}
