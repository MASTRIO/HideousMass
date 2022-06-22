package net.mastrio.hideousmass.entity.client;

import net.mastrio.hideousmass.HideousMass;
import net.mastrio.hideousmass.entity.custom.HideousMassEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HideousMassRenderer extends GeoEntityRenderer<HideousMassEntity> {

    public HideousMassRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HideousMassModel());
    }

    @Override
    public Identifier getTexture(HideousMassEntity entity) {
        return new Identifier(HideousMass.MOD_ID, "textures/entity/hideous_mass.png");
    }
}
