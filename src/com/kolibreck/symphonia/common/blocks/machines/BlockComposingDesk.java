package com.kolibreck.symphonia.common.blocks.machines;

import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockComposingDesk extends Block
{
	public BlockComposingDesk()
	{
		super(Material.wood);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeWood);
		
		this.setBlockName("composingDesk");
		this.setBlockTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
	{
		System.out.println("block clicked!");
		world.playSoundAtEntity(player, "random.bow", 0.5F, 1.0F);
	}
	/*
	@Override
	public void onBlockActivated(World world, int x, int y, int z, EntityPlayer player)
	{
		
	}
	*/
}
