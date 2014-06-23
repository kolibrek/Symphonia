package com.kolibreck.symphonia.common.items.instruments;

import com.kolibreck.symphonia.common.entities.EntityMagicCircle;
import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWoodFlute extends ItemInstrument {
	public ItemWoodFlute()
	{
		super();
		this.setUnlocalizedName("woodFlute");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack flute, World world, EntityPlayer player)
	{
		player.setItemInUse(flute, getMaxItemUseDuration(flute));
		if(!player.worldObj.isRemote)
		{
			float pitch = itemRand.nextFloat() + 0.5F;
			player.worldObj.playSoundAtEntity(player, Reference.MODID + ":" + "flutenote1", 1F, pitch);
			EntityMagicCircle circle = new EntityMagicCircle(player);
			world.spawnEntityInWorld(circle);
		}
			
		return flute;
	}
}
