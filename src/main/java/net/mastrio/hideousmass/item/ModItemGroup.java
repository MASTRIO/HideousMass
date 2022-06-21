package net.mastrio.hideousmass.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mastrio.hideousmass.HideousMass;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup HIDEOUS_MASS = FabricItemGroupBuilder.build(
            new Identifier(HideousMass.MOD_ID, "hideous_mass"), () -> new ItemStack(ModItems.BLOODY_EYEBALL));

}
