package de.christmascraft.main.items;

import de.christmascraft.main.ChristmasCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class GingerBread extends Item {

    public GingerBread() {
        super(new Item.Properties()
            .group(ChristmasCraft.TAB)
            .food(new Food.Builder()
                    .hunger(5)
                    .saturation(1.2f)
                    .build())
        );
    }

}
