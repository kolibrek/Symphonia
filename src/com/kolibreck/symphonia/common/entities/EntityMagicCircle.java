package com.kolibreck.symphonia.common.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class EntityMagicCircle extends Entity
{
	public EntityMagicCircle(World world)
	{
		super(world);
		this.height = 0.01f;
		this.width = 4.0f;
	}
	
	public EntityMagicCircle(EntityPlayer player)
	{
		super(player.worldObj);

		this.setPosition(player.posX, player.posY, player.posZ);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(ticksExisted >= 80)
		{
			this.setDead();
		}
	}

	@Override
	protected void entityInit()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void onCollideWithPlayer(EntityPlayer player)
	{
		//player.addChatComponentMessage(new ChatComponentTranslation("symphonia.spell.speed"));
		PotionEffect speed = new PotionEffect(1, 120, 2, false);
		PotionEffect jump = new PotionEffect(8, 120, 2, false);
		player.addPotionEffect(speed);
		player.addPotionEffect(jump);
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
