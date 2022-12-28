package com.luan_fuzi.cartupgrader.mixin;

import net.minecraft.block.entity.Hopper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.ChestMinecartEntity;
import net.minecraft.entity.vehicle.StorageMinecartEntity;
import net.minecraft.item.Items;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ChestMinecartEntity.class)
public abstract class ChestCartHack extends StorageMinecartEntity{


    protected ChestCartHack(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    @Overwrite
    public void dropItems(DamageSource damageSource) {
        super.dropItems(damageSource);
        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            this.dropItem(Items.CHEST_MINECART);
        }

    }
}