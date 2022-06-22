package net.mastrio.hideousmass.entity.client;

import net.mastrio.hideousmass.entity.custom.HideousMassEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HideousMassRenderer extends GeoEntityRenderer<HideousMassEntity> {

    public HideousMassRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new HideousMassModel());
    }

    @Override
    public Identifier getTextureLocation(HideousMassEntity instance) {
        return super.getTextureLocation(instance);
    }

}
