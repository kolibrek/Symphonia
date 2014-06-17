package com.kolibreck.symphonia.common.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterHelper {

	public static void RegisterBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
	
	public static void RegisterItem(Item item)
	{
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
}