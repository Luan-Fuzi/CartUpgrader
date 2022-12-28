package com.luan_fuzi.cartupgrader.mixin;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;


@Mixin(TntMinecartEntity.class)
public abstract class TNTCartHack extends AbstractMinecartEntity {
    @Shadow
    private int fuseTicks;

    protected TNTCartHack(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    @Overwrite
    public void dropItems(DamageSource damageSource) {

        double d = squaredHorizontalLength(this.getVelocity());
        if (!damageSource.isFire() && !damageSource.isExplosive() && !(d >= 0.009999999776482582D)) {
            super.dropItems(damageSource);
            if (!damageSource.isExplosive() && this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
                this.dropItem(Items.TNT_MINECART);
            }

        }
        else {
            if (this.fuseTicks < 0) {
                this.prime();
                this.fuseTicks = this.random.nextInt(20) + this.random.nextInt(20);
            }

        }
    }
    public void prime() {
        this.fuseTicks = 80;
        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte)10);
            if (!this.isSilent()) {
                this.world.playSound((PlayerEntity)null, this.getX(), this.getY(), this.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            }
        }

    }
}
