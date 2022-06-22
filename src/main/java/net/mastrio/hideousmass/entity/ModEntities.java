package net.mastrio.hideousmass.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
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

    // Hideous Mass
    public static final EntityType<HideousMassEntity> HIDEOUS_MASS = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(HideousMass.MOD_ID, "hideous_mass"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HideousMassEntity::new)
                    .dimensions(EntityDimensions.fixed(2.5f, 2.5f)).build());


    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(HIDEOUS_MASS, HideousMassEntity.setAttributes());
    }

}
