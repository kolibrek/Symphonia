package com.kolibreck.symphonia.common.blocks;

import com.kolibreck.symphonia.common.blocks.machines.BlockAdvancedNote;
import com.kolibreck.symphonia.common.blocks.machines.BlockComposingDesk;
import com.kolibreck.symphonia.common.help.RegisterHelper;

import net.minecraft.block.Block;

public final class ModBlocks 
{
	public static Block composingDesk;
	public static Block advancedNote;
	
	public static void preinitialize()
	{
		composingDesk = new BlockComposingDesk();
		advancedNote = new BlockAdvancedNote();
		
		RegisterHelper.RegisterBlock(composingDesk);
		RegisterHelper.RegisterBlock(advancedNote);
	}
	
	public static void initialize()
	{
		addRecipes();
	}
	
	private static void addRecipes()
	{
		
	}
}
