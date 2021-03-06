package com.kolibreck.symphonia.common.entities;

import com.kolibreck.symphonia.Symphonia;
import com.kolibreck.symphonia.client.render.entity.RenderEntityMagicCircle;
import com.kolibreck.symphonia.common.help.Reference;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
	public static void initialize()
	{
		int id = 0;
		EntityRegistry.registerModEntity(EntityMagicCircle.class, Reference.MODID + "_magicCircle", id++, Symphonia.instance, 2048, 10, false);
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityMagicCircle.class, new RenderEntityMagicCircle());
	}
}
