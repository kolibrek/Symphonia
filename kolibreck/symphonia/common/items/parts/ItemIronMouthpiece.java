package com.kolibreck.symphonia.common.items.parts;

import com.kolibreck.symphonia.SymphoniaCreativeTab;
import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.item.Item;

public class ItemIronMouthpiece extends Item {
	public ItemIronMouthpiece()
	{
		super();
		this.setUnlocalizedName("ironMouthpiece");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(SymphoniaCreativeTab.INSTANCE);
	}
}
