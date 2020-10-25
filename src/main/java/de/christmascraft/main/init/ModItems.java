package de.christmascraft.main.init;

import de.christmascraft.main.ChristmasCraft;
import de.christmascraft.main.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChristmasCraft.MOD_ID);

    // Items
    public static final RegistryObject<Item> GINGERBREAD = ITEMS.register("gingerbread", ItemBase::new);

}
