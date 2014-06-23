package com.kolibreck.symphonia.client.render.entity;

import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMagicCircle extends Render
{
	private ResourceLocation texture = new ResourceLocation(Reference.MODID + ":textures/models/magicSquare1.png");
	
	public RenderEntityMagicCircle()
	{
		//this.bindTexture(texture);
	}

	@Override
	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
	{
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1)
	{
		return null;
	}
	
}
