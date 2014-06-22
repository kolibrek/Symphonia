package com.kolibreck.symphonia.common.blocks.machines;

import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.world.World;

public class BlockAdvancedNote extends Block
{
	private byte note;
	
	public BlockAdvancedNote()
	{
		super(Material.wood);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeStone);
		
		this.setBlockName("advancedNoteBlock");
		this.setBlockTextureName(Reference.MODID + ":" + this.getUnlocalizedName().substring(5));
		note = 0;
		
		
	}
	
	public TileEntity createNewTileEntity(World world, int a)
    {
        return new TileEntityNote();
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int a, float b, float c, float d)
	{
		if(!world.isRemote)
		{
			TileEntityNote tileEntityNote = (TileEntityNote) world.getTileEntity(x, y, z);
			
			if (tileEntityNote != null)
			{
				tileEntityNote.triggerNote(world, x, y, z);
			}
		}
		return true;
	}
	
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player)
	{
		if (!world.isRemote)
        {
            TileEntityNote tileentitynote = (TileEntityNote)world.getTileEntity(x, y, z);

            if (tileentitynote != null)
            {
                tileentitynote.triggerNote(world, x, y, z);
            }
        }
	}
	
	public byte getNote()
	{
		return note;
	}
	
	public void setNote(byte new_note)
	{
		note = new_note;
	}

}
