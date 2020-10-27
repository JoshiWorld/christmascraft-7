package de.christmascraft.main.init;

import de.christmascraft.main.ChristmasCraft;
import de.christmascraft.main.armor.ModArmorMaterial;
import de.christmascraft.main.items.CandyCane;
import de.christmascraft.main.items.GingerBread;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChristmasCraft.MOD_ID);

    // Items
    public static final RegistryObject<GingerBread> GINGERBREAD = ITEMS.register("gingerbread", GingerBread::new);
    public static final RegistryObject<CandyCane> CANDY_CANE = ITEMS.register("candy_cane", CandyCane::new);

    // Armor
    public static final RegistryObject<ArmorItem> CANDY_HELMET = ITEMS.register("candy_helmet", () ->
            new ArmorItem(ModArmorMaterial.CANDY_CANE, EquipmentSlotType.HEAD, new Item.Properties().group(ChristmasCraft.TAB)));
    public static final RegistryObject<ArmorItem> CANDY_CHESTPLATE = ITEMS.register("candy_chestplate", () ->
            new ArmorItem(ModArmorMaterial.CANDY_CANE, EquipmentSlotType.CHEST, new Item.Properties().group(ChristmasCraft.TAB)));
    public static final RegistryObject<ArmorItem> CANDY_LEGGINGS = ITEMS.register("candy_leggings", () ->
            new ArmorItem(ModArmorMaterial.CANDY_CANE, EquipmentSlotType.LEGS, new Item.Properties().group(ChristmasCraft.TAB)));
    public static final RegistryObject<ArmorItem> CANDY_BOOTS = ITEMS.register("candy_boots", () ->
            new ArmorItem(ModArmorMaterial.CANDY_CANE, EquipmentSlotType.FEET, new Item.Properties().group(ChristmasCraft.TAB)));

}
