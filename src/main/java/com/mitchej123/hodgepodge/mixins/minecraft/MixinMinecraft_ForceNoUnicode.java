package com.mitchej123.hodgepodge.mixins.minecraft;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Minecraft.class)
public class MixinMinecraft_ForceNoUnicode {

    /**
     * @author laetansky
     * @reason https://bugs.mojang.com/browse/MC-41685
     */
    @Overwrite
    public boolean func_152349_b() {
        return false;
    }
}
