package com.luan_fuzi.cartupgrader.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.FurnaceMinecartEntity;
import net.minecraft.item.Items;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FurnaceMinecartEntity.class)
public abstract class FurCartHack extends AbstractMinecartEntity {

    protected FurCartHack(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    @Overwrite
    public void dropItems(DamageSource damageSource) {
        super.dropItems(damageSource);
        if (!damageSource.isExplosive() && this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            this.dropItem(Items.FURNACE_MINECART);
        }

    }
}
