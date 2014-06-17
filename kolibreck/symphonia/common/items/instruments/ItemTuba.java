package com.kolibreck.symphonia.common.items.instruments;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.kolibreck.symphonia.common.help.Reference;

public class ItemTuba extends ItemInstrument
{
	public ItemTuba()
	{
		super();
		this.setUnlocalizedName("tuba");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5) + "16");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack tuba, World world, EntityPlayer player)
	{
		player.setItemInUse(tuba, getMaxItemUseDuration(tuba));
		if(!player.worldObj.isRemote)
		{
			float pitch = itemRand.nextFloat() + 0.5F;
			player.worldObj.playSoundAtEntity(player, Reference.MODID + ":" + "tubanote1", 1.0F, pitch);
		}
			
		return tuba;
	}
}
