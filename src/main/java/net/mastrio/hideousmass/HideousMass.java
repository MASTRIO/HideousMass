package net.mastrio.hideousmass;

import net.fabricmc.api.ModInitializer;
import net.mastrio.hideousmass.block.ModBlocks;
import net.mastrio.hideousmass.entity.ModEntities;
import net.mastrio.hideousmass.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

// Literally the most important comment ever created in the entire history of the world
public class HideousMass implements ModInitializer {

	public static final String MOD_ID = "hideousmass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Register stuff
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerAttributes();

		// Load Geckolib
		GeckoLib.initialize();
	}

}
