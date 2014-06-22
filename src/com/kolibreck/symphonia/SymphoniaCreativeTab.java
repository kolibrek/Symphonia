package com.kolibreck.symphonia;

import java.util.List;

import com.kolibreck.symphonia.common.blocks.ModBlocks;
import com.kolibreck.symphonia.common.help.Reference;
import com.kolibreck.symphonia.common.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class SymphoniaCreativeTab extends CreativeTabs
{
	public static SymphoniaCreativeTab INSTANCE = new SymphoniaCreativeTab();
	@SuppressWarnings("rawtypes")
	List list;

	public SymphoniaCreativeTab() {
		super(Reference.NAME);
	}
	
	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ModItems.trumpet);
	}

	@Override
	public Item getTabIconItem()
	{
		return getIconItemStack().getItem();
	}
	
	@Override
	@SuppressWarnings("rawtypes")
	public void displayAllReleventItems( List list)
	{
		this.list = list;
		
		addBlock(ModBlocks.composingDesk);
		addBlock(ModBlocks.advancedNote);
		
		addItem(ModItems.woodFlute);
		addItem(ModItems.trumpet);
		addItem(ModItems.clarinet);
		addItem(ModItems.tuba);
		addItem(ModItems.guitar);
		
		addItem(ModItems.woodReed);
		addItem(ModItems.woodShaft);
		addItem(ModItems.ironMouthpiece);
		addItem(ModItems.goldValves);
		addItem(ModItems.goldHorn);
		addItem(ModItems.stainedShaft);
		addItem(ModItems.keySystem);
		addItem(ModItems.goldTube);
	}
	
	private void addItem(Item item)
	{
		item.getSubItems(item, this, list);
	}
	
	private void addBlock(Block block)
	{
		ItemStack stack = new ItemStack(block);
		block.getSubBlocks(stack.getItem(), this, list);
	}

}
