package com.kolibreck.symphonia.common.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class MagicCircle extends Entity
{
	public MagicCircle(World world)
	{
		super(world);
	}
	
	public MagicCircle(EntityPlayer player)
	{
		super(player.worldObj);
		
		this.setSize(1.0f, 1.0f);
		this.setPosition(player.posX, player.posY, player.posZ);
	}

	@Override
	protected void entityInit()
	{
		// TODO Auto-generated method stub
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound var1)
	{
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound var1)
	{
		
	}
}
