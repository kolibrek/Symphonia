package com.kolibreck.symphonia.common.items.parts;

import com.kolibreck.symphonia.SymphoniaCreativeTab;
import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.item.Item;

public class ItemStainedShaft extends Item
{
	public ItemStainedShaft()
	{
		super();
		this.setUnlocalizedName("stainedShaft");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(SymphoniaCreativeTab.INSTANCE);
	}
}
