package com.kolibreck.symphonia.common.items.instruments;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

import com.kolibreck.symphonia.common.help.Reference;

public class ItemGuitar extends ItemInstrument
{
	private float note;
	
	public ItemGuitar()
	{
		super();
		this.setUnlocalizedName("guitar");
		this.setTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5) + "16");
		this.setFull3D();
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack guitar, World world, EntityPlayer player)
	{
		player.setItemInUse(guitar, getMaxItemUseDuration(guitar));
		if(!player.worldObj.isRemote)
		{
			note = itemRand.nextFloat() + 0.5F;
			player.worldObj.playSoundAtEntity(player, Reference.MODID + ":" + "guitarnote1", 1.0F, note);
		}

		return guitar;
	}
	
	@Override
	public boolean onItemUse(ItemStack guitar, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if(!player.worldObj.isRemote)
		{
			Block block = world.getBlock(x, y, z);
			
			if (block == Blocks.noteblock)
			{
				player.addChatComponentMessage(new ChatComponentTranslation("symphonia.instrument.tuning"));
				
			}
			else
			{
				player.setItemInUse(guitar, getMaxItemUseDuration(guitar));
				note = itemRand.nextFloat() + 0.5F;
				player.worldObj.playSoundAtEntity(player, Reference.MODID + ":" + "guitarnote1", 1.0F, note);
			}
		}
		return true;
	}
	
	@Override
	public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer player, int par4)
	{
		//player.setVelocity(0, 1, 0);
	}
}
