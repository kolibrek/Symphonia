package com.kolibreck.symphonia.common.items.instruments;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.kolibreck.symphonia.common.help.Reference;

public class ItemClarinet extends ItemInstrument
{
	public ItemClarinet()
	{
		super();
		this.setUnlocalizedName("clarinet");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5) + "16");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack clarinet, World world, EntityPlayer player)
	{
		player.setItemInUse(clarinet, getMaxItemUseDuration(clarinet));
		if(!player.worldObj.isRemote)
		{
			float pitch = itemRand.nextFloat() + 0.5F;
			player.worldObj.playSoundAtEntity(player, Reference.MODID + ":" + "clarinetnote1", 1.0F, pitch);
		}
			
		return clarinet;
	}
}
