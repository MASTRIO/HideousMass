package net.mastrio.hideousmass.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mastrio.hideousmass.HideousMass;
import net.mastrio.hideousmass.entity.ModEntities;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //// Normal Items
    // Bloody Eyeball
    public static final Item BLOODY_EYEBALL = registerItem("bloody_eyeball",
            new Item(new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS)));

    // Finger
    public static final Item FINGER = registerItem("finger",
            new Item(new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS)));

    // Roasted Finger
    public static final Item ROASTED_FINGER = registerItem("roasted_finger",
            new Item(new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS).food(FoodComponents.MELON_SLICE)));

    // Bottle of blood
    public static final Item BOTTLE_OF_BLOOD = registerItem("bottle_of_blood",
            new Item(new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS)));

    //// Spawn Eggs
    // Hideous Mass spawn egg
    public static final Item HIDEOUS_MASS_SPAWN_EGG = registerItem("hideous_mass_spawn_egg",
            new SpawnEggItem(ModEntities.HIDEOUS_MASS, 0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS)));


    // Method to register an item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HideousMass.MOD_ID, name), item);
    }

    // 'Register' the mod items because it totally wasn't done already
    public static void registerModItems() {
        HideousMass.LOGGER.debug("Registering mod items for " + HideousMass.MOD_ID);
    }

}
