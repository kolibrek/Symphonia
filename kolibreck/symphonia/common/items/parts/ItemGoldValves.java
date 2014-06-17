package com.kolibreck.symphonia.common.items.parts;

import com.kolibreck.symphonia.SymphoniaCreativeTab;
import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.item.Item;

public class ItemGoldValves extends Item {
	public ItemGoldValves()
	{
		super();
		this.setUnlocalizedName("goldValves");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		this.setCreativeTab(SymphoniaCreativeTab.INSTANCE);
	}
}
