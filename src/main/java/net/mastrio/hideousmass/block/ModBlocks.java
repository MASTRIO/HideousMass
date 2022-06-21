package net.mastrio.hideousmass.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mastrio.hideousmass.HideousMass;
import net.mastrio.hideousmass.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block EYEBALL_SACK = registerBlock("eyeball_sack",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(4f).requiresTool()), ModItemGroup.HIDEOUS_MASS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(HideousMass.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(HideousMass.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        HideousMass.LOGGER.debug("Registering mod blocks for " + HideousMass.MOD_ID);
    }

}