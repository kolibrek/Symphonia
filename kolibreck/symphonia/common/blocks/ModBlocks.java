package com.kolibreck.symphonia.common.blocks;

import com.kolibreck.symphonia.common.blocks.machines.BlockComposingDesk;
import com.kolibreck.symphonia.common.help.RegisterHelper;

import net.minecraft.block.Block;

public final class ModBlocks 
{
	public static Block composingDesk;
	
	public static void initialize()
	{
		composingDesk = new BlockComposingDesk();
		
		RegisterHelper.RegisterBlock(composingDesk);
		
		addRecipes();
	}
	
	private static void addRecipes()
	{
		
	}
}
