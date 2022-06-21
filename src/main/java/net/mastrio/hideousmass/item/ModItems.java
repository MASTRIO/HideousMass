package net.mastrio.hideousmass.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mastrio.hideousmass.HideousMass;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Bloody Eyeball
    public static final Item BLOODY_EYEBALL = registerItem("bloody_eyeball",
            new Item(new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS)));

    // Finger
    public static final Item FINGER = registerItem("finger",
            new Item(new FabricItemSettings().group(ModItemGroup.HIDEOUS_MASS)));


    // Method to register an item
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HideousMass.MOD_ID, name), item);
    }

    // 'Register' the mod items because it totally wasn't done already
    public static void registerModItems() {
        HideousMass.LOGGER.debug("Registering mod items for " + HideousMass.MOD_ID);
    }

}
