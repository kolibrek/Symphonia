package com.kolibreck.symphonia.common.items.instruments;

import com.kolibreck.symphonia.SymphoniaCreativeTab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemInstrument extends Item
{
	public ItemInstrument()
	{
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(SymphoniaCreativeTab.INSTANCE);
	}
	

	@Override
	public EnumAction getItemUseAction(ItemStack itemStack)
	{
		return EnumAction.bow;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack itemStack)
	{
		return 36000;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack instrument, World world, EntityPlayer player)
	{
		return instrument;
	}
	
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		return false;
	}
	
	@Override 
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{}
}
