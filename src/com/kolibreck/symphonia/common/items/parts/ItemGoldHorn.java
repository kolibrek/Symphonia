package com.kolibreck.symphonia.common.items.parts;

import com.kolibreck.symphonia.SymphoniaCreativeTab;
import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.item.Item;

public class ItemGoldHorn extends Item
{
	public ItemGoldHorn()
	{
		super();
		this.setUnlocalizedName("goldHorn");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(SymphoniaCreativeTab.INSTANCE);
	}
}
