package net.mastrio.hideousmass.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.mastrio.hideousmass.HideousMass;
import net.mastrio.hideousmass.entity.custom.HideousMassEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<HideousMassEntity> HIDEOUS_MASS = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(HideousMass.MOD_ID, "hideous_mass"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HideousMassEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build()
    );

}
