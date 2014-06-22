package com.kolibreck.symphonia;

import com.kolibreck.symphonia.common.blocks.ModBlocks;
import com.kolibreck.symphonia.common.entities.ModEntities;
import com.kolibreck.symphonia.common.help.Reference;
import com.kolibreck.symphonia.common.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class Symphonia
{
	@Instance(Reference.MODID)
	public static Symphonia instance;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	event.getModLog().info("Loading Symphonia, let the music play...");
    	ModBlocks.preinitialize();
    	ModItems.preinitialize();
    	ModEntities.initialize();

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	ModBlocks.initialize();
    	ModItems.initialize();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}