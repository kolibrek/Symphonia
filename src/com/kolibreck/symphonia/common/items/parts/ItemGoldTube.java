package com.kolibreck.symphonia.common.items.parts;

import com.kolibreck.symphonia.SymphoniaCreativeTab;
import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.item.Item;

public class ItemGoldTube extends Item
{
	public ItemGoldTube()
	{
		super();
		this.setUnlocalizedName("goldTube");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(SymphoniaCreativeTab.INSTANCE);
	}
}
