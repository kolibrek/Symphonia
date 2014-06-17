package com.kolibreck.symphonia.client.render;

import com.kolibreck.symphonia.common.help.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class WrappedModel
{
	private IModelCustom model;
	private ResourceLocation texture;
	
	public WrappedModel(String model, String texture)
	{
		this(
				new ResourceLocation(Reference.MODID + ":models/" + model),
				new ResourceLocation(Reference.MODID + ":textures/models/" + texture)
			);
	}
	
	public WrappedModel(ResourceLocation model, ResourceLocation texture)
	{
		this.model = AdvancedModelLoader.loadModel(model);
		this.texture = texture;
	}
	
	public void bindTexture()
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
	}
	
	public void renderAll()
	{
		model.renderAll();
	}
	
	public void renderOnly(String... groupNames)
	{
		model.renderOnly(groupNames);
	}
	
	public void renderPart(String partName)
	{
		model.renderPart(partName);
	}
	
	public void renderAllExcept(String... excludedGroupNames)
	{
		model.renderAllExcept(excludedGroupNames);
	}
}
