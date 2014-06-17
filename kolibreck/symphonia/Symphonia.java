package com.kolibreck.symphonia;

import com.kolibreck.symphonia.common.blocks.ModBlocks;
import com.kolibreck.symphonia.common.help.Reference;
import com.kolibreck.symphonia.common.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION)
public class Symphonia
{
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	event.getModLog().info("Loading Symphonia, let the music play...");
    	ModBlocks.initialize();
    	ModItems.initialize();

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}