package net.mastrio.hideousmass;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mastrio.hideousmass.entity.ModEntities;
import net.mastrio.hideousmass.entity.client.HideousMassRenderer;

public class HideousMassClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.HIDEOUS_MASS, HideousMassRenderer::new);
    }

}
