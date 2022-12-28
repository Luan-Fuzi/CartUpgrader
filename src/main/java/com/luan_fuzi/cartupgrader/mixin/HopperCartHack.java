package com.luan_fuzi.cartupgrader.mixin;

import net.minecraft.block.entity.Hopper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.HopperMinecartEntity;
import net.minecraft.entity.vehicle.StorageMinecartEntity;
import net.minecraft.item.Items;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(HopperMinecartEntity.class)
public abstract class HopperCartHack extends StorageMinecartEntity implements Hopper {
    protected HopperCartHack(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    @Overwrite
    public void dropItems(DamageSource damageSource) {
        super.dropItems(damageSource);
        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            this.dropItem(Items.HOPPER_MINECART);
        }

    }
}
