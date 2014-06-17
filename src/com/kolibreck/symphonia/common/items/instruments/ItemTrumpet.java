package com.kolibreck.symphonia.common.items.instruments;

import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTrumpet extends ItemInstrument {
	public ItemTrumpet()
	{
		super();
		this.setUnlocalizedName("trumpet");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5) + "16");
		this.setFull3D();
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack trumpet, World world, EntityPlayer player)
	{
		player.setItemInUse(trumpet, getMaxItemUseDuration(trumpet));
		if(!player.worldObj.isRemote)
		{
			float pitch = itemRand.nextFloat() + 0.5F;
			player.worldObj.playSoundAtEntity(player, Reference.MODID + ":" + "trumpetnote2", 1.0F, pitch);
		}
			
		return trumpet;
	}
}
