package net.mastrio.hideousmass;

import net.fabricmc.api.ModInitializer;
import net.mastrio.hideousmass.block.ModBlocks;
import net.mastrio.hideousmass.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Literally the most important comment ever created in the entire history of the world
public class HideousMass implements ModInitializer {

	public static final String MOD_ID = "hideousmass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}
