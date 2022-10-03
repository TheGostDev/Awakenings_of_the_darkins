package com.darkins.awakenings_of_the_darkins.fluid.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.function.Supplier;

public class SiliconFluid extends LiquidBlock {


    public SiliconFluid(Supplier<? extends FlowingFluid> pFluid, Properties pProperties) {
        super(pFluid, pProperties);
    }

    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
            if (!pLevel.isClientSide && (pEntity.xOld != pEntity.getX() || pEntity.zOld != pEntity.getZ())) {
                double d0 = Math.abs(pEntity.getX() - pEntity.xOld);
                double d1 = Math.abs(pEntity.getZ() - pEntity.zOld);
                if (d0 >= (double)0.003F || d1 >= (double)0.003F) {
                    pEntity.hurt(DamageSource.LAVA, 3.0F);
                }
            }

    }

}
