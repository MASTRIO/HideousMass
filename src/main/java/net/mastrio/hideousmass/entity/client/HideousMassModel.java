package net.mastrio.hideousmass.entity.client;

import net.mastrio.hideousmass.HideousMass;
import net.mastrio.hideousmass.entity.custom.HideousMassEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class HideousMassModel extends AnimatedGeoModel<HideousMassEntity> {

    @Override
    public Identifier getModelResource(HideousMassEntity object) {
        return new Identifier(HideousMass.MOD_ID, "geo/hideous_mass.geo.json");
    }

    @Override
    public Identifier getTextureResource(HideousMassEntity object) {
        return new Identifier(HideousMass.MOD_ID, "textures/entity/hideous_mass.png");
    }

    @Override
    public Identifier getAnimationResource(HideousMassEntity animatable) {
        return new Identifier(HideousMass.MOD_ID, "animation/hideous_mass.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(HideousMassEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("root");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

}
