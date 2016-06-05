package com.dizzle.main;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
	modid = MysticCore.MODID, 
	version = MysticCore.VERSION,
	name = MysticCore.MOD_NAME)

public class MysticCore {
	
	public static final String MOD_NAME = "Mystic Core";
    public static final String MODID = "mysticcore";
    public static final String PREFIX = MODID + ":";
    public static final String VERSION = "1.0";
    public static final boolean DEV = true;
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
