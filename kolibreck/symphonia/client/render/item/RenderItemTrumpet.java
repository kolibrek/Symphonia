package com.kolibreck.symphonia.client.render.item;

import org.lwjgl.opengl.GL11;

import com.kolibreck.symphonia.client.render.WrappedModel;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemTrumpet implements IItemRenderer
{
	private static WrappedModel trumpet;
	
	static
	{
		trumpet = new WrappedModel("trumpet.obj", "trumpetTexture.png");
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
			case INVENTORY: return false;
			default: return true;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		
        if (type == ItemRenderType.EQUIPPED_FIRST_PERSON)
        {
        	GL11.glTranslated(0.5, 0.5, -1);
            GL11.glRotated(90, 1, 0, 1);
            GL11.glRotated(135, 0, 1, 0);
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            
        }
        
        if (type == ItemRenderType.EQUIPPED)
        {
        	GL11.glRotated(225, 0, 1, 0);
        	GL11.glRotated(-20, 0, 0, 1);
        	GL11.glTranslated(0, -1.0, -1.0);
        	GL11.glScalef(0.5F, 0.5F, 0.5F);
        }

        trumpet.bindTexture();
        trumpet.renderAll();

        GL11.glDisable(GL11.GL_BLEND);
        GL11.glPopMatrix();
	}
}
