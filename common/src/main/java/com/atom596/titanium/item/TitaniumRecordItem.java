package com.atom596.titanium.item;

import com.atom596.titanium.sound.TitaniumSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class TitaniumRecordItem extends RecordItem {
    protected TitaniumRecordItem() {
        super(
                14,
                TitaniumSounds.MUSIC_DISC_AMETHYST,
                new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                144);
    }
}
