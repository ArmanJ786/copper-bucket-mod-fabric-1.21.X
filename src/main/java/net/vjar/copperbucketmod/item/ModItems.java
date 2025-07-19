package net.vjar.copperbucketmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vjar.copperbucketmod.CopperBucketMod;

public class ModItems {

    public static final Item COPPER_BUCKET = registerItem("copper_bucket", new Item(new Item.Settings().maxCount(1)));
    public static final Item WATER_COPPER_BUCKET = registerItem("water_copper_bucket", new Item(new Item.Settings().maxCount(1)));
    public static final Item MILK_COPPER_BUCKET = registerItem("milk_copper_bucket", new Item(new Item.Settings().maxCount(1)));
    public static final Item CREAM_BUCKET = registerItem("cream_bucket", new Item(new Item.Settings().maxCount(1)));
    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk", new Item(new Item.Settings().maxCount(1)));
    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream", new Item(new Item.Settings().maxCount(1)));
    public static final Item ICE_CREAM_BUCKET = registerItem("ice_cream_bucket", new Item(new Item.Settings().maxCount(1)));
    public static final Item APPLE_JUICE = registerItem("apple_juice", new Item(new Item.Settings()));
    public static final Item APPLE_ICE_CREAM = registerItem("apple_ice_cream", new Item(new Item.Settings().maxCount(1)));
    public static final Item CARROT_JUICE = registerItem("carrot_juice", new Item(new Item.Settings().maxCount(1)));
    public static final Item CARROT_ICE_CREAM = registerItem("carrot_ice_cream", new Item(new Item.Settings().maxCount(1)));
    public static final Item SWEET_BERRIES_JUICE = registerItem("sweet_berries_juice", new Item(new Item.Settings().maxCount(1)));
    public static final Item SWEET_BERRIES_ICE_CREAM = registerItem("sweet_berries_ice_cream", new Item(new Item.Settings().maxCount(1)));
    public static final Item MELON_JUICE = registerItem("melon_juice", new Item(new Item.Settings().maxCount(1)));
    public static final Item MELON_ICE_CREAM = registerItem("melon_ice_cream", new Item(new Item.Settings().maxCount(1)));
    public static final Item GLOW_BERRIES_JUICE = registerItem("glow_berries_juice", new Item(new Item.Settings().maxCount(1)));
    public static final Item GLOW_BERRIES_ICE_CREAM = registerItem("glow_berries_ice_cream", new Item(new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CopperBucketMod.MOD_ID , name), item);
    }

    public static void registerModItems() {
        CopperBucketMod.LOGGER.info("Register Mod Items " + CopperBucketMod.MOD_ID);

    }
}
