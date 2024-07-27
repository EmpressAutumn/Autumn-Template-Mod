package com.atom596.titanium.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class FlightChargeItem extends Item implements ProjectileItem {
    public FlightChargeItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_WIND_CHARGE_WIND_BURST.value(), SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        ItemStack itemStack = user.getStackInHand(hand);
        if (user.getY() < world.getBottomY()) {
            user.getItemCooldownManager().set(this, 40);
            user.addVelocity(0, 4, 0);
        } else {
            user.getItemCooldownManager().set(this, 20);
            user.addVelocity(0, 1.5, 0);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        return null;
    }
}
