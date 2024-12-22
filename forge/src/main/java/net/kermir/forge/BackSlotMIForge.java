package net.kermir.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.kermir.BackSlotMICore;

@Mod(BackSlotMICore.MOD_ID)
public final class BackSlotMIForge {
    public BackSlotMIForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(BackSlotMICore.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        BackSlotMICore.init();
    }
}
