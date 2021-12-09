package me.logwet.heatshrink.mixin.common;

import net.minecraft.world.level.levelgen.StructureSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Slice;

@SuppressWarnings("UnresolvedMixinReference")
@Mixin(StructureSettings.class)
public abstract class StructureSettingsMixin {
    @Unique private static final int SPACING = 14;

    @Unique private static final int SEPARATION = 2;

    @ModifyConstant(
            method = "<clinit>",
            constant = @Constant(intValue = 27),
            slice =
                    @Slice(
                            from =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;BASTION_REMNANT:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;"),
                            to =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;NETHER_BRIDGE:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;")))
    private static int modifyBastionSpacing(int original) {
        return SPACING;
    }

    @ModifyConstant(
            method = "<clinit>",
            constant = @Constant(intValue = 4),
            slice =
                    @Slice(
                            from =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;BASTION_REMNANT:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;"),
                            to =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;NETHER_BRIDGE:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;")))
    private static int modifyBastionSeparation(int original) {
        return SEPARATION;
    }

    @ModifyConstant(
            method = "<clinit>",
            constant = @Constant(intValue = 27),
            slice =
                    @Slice(
                            from =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;NETHER_BRIDGE:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;"),
                            to =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;NETHER_FOSSIL:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;")))
    private static int modifyFortressSpacing(int original) {
        return SPACING;
    }

    @ModifyConstant(
            method = "<clinit>",
            constant = @Constant(intValue = 4),
            slice =
                    @Slice(
                            from =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;NETHER_BRIDGE:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;"),
                            to =
                                    @At(
                                            value = "FIELD",
                                            target =
                                                    "Lnet/minecraft/world/level/levelgen/feature/StructureFeature;NETHER_FOSSIL:Lnet/minecraft/world/level/levelgen/feature/StructureFeature;")))
    private static int modifyFortressSeparation(int original) {
        return SEPARATION;
    }
}
