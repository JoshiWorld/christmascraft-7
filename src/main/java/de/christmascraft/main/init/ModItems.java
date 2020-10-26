package de.christmascraft.main.init;

import de.christmascraft.main.ChristmasCraft;
import de.christmascraft.main.items.CandyCane;
import de.christmascraft.main.items.GingerBread;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChristmasCraft.MOD_ID);

    // Items
    public static final RegistryObject<GingerBread> GINGERBREAD = ITEMS.register("gingerbread", GingerBread::new);
    public static final RegistryObject<CandyCane> CANDY_CANE = ITEMS.register("candy_cane", CandyCane::new);

}
