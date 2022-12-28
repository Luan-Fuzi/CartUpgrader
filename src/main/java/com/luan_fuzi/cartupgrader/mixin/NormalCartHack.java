package com.luan_fuzi.cartupgrader.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MinecartEntity.class)
public abstract class NormalCartHack extends AbstractMinecartEntity {


    protected NormalCartHack(EntityType<?> entityType, World world) {
        super(entityType, world);
    }


    public void dropItems(DamageSource damageSource) {
        this.remove();
        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
            ItemStack itemStack = new ItemStack(Items.MINECART);
            if (this.hasCustomName()) {
                itemStack.setCustomName(this.getCustomName());
            }

            this.dropStack(itemStack);
        }

    }
}