// Date: 6/10/2014 8:32:03 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.kolibreck.symphonia.client.render.item;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelItemTrumpet extends ModelBase
{
	//fields
	ModelRenderer shaft;
	ModelRenderer mouthpiece;
	ModelRenderer valve0;
	ModelRenderer valve1;
	ModelRenderer valve2;
	ModelRenderer horn0;
	ModelRenderer horn1;
	ModelRenderer horn2;
	ModelRenderer loopback;
	ModelRenderer loopfront;
	ModelRenderer loopbottom;
	ModelRenderer looptop;

	public ModelItemTrumpet()
	{
		textureWidth = 64;
		textureHeight = 64;

		shaft = new ModelRenderer(this, 0, 0);
		shaft.addBox(0F, 0F, 0F, 3, 3, 15);
		shaft.setRotationPoint(3F, 3F, 6F);
		shaft.setTextureSize(64, 64);
		shaft.mirror = true;
		setRotation(shaft, 0F, 0F, 0F);
		mouthpiece = new ModelRenderer(this, 0, 0);
		mouthpiece.addBox(0F, 0F, 0F, 1, 1, 2);
		mouthpiece.setRotationPoint(4F, 4F, 21F);
		mouthpiece.setTextureSize(64, 64);
		mouthpiece.mirror = true;
		setRotation(mouthpiece, 0F, 0F, 0F);
		valve0 = new ModelRenderer(this, 0, 0);
		valve0.addBox(0F, 0F, 0F, 1, 9, 1);
		valve0.setRotationPoint(4F, 1F, 10F);
		valve0.setTextureSize(64, 64);
		valve0.mirror = true;
		setRotation(valve0, 0F, 0F, 0F);
		valve1 = new ModelRenderer(this, 0, 0);
		valve1.addBox(0F, 0F, 0F, 1, 9, 1);
		valve1.setRotationPoint(4F, 1F, 12F);
		valve1.setTextureSize(64, 64);
		valve1.mirror = true;
		setRotation(valve1, 0F, 0F, 0F);
		valve2 = new ModelRenderer(this, 0, 0);
		valve2.addBox(0F, 0F, 0F, 1, 9, 1);
		valve2.setRotationPoint(4F, 1F, 14F);
		valve2.setTextureSize(64, 64);
		valve2.mirror = true;
		setRotation(valve2, 0F, 0F, 0F);
		horn0 = new ModelRenderer(this, 0, 0);
		horn0.addBox(0F, 0F, 0F, 9, 9, 1);
		horn0.setRotationPoint(0F, 0F, 0F);
		horn0.setTextureSize(64, 64);
		horn0.mirror = true;
		setRotation(horn0, 0F, 0F, 0F);
		horn1 = new ModelRenderer(this, 0, 0);
		horn1.addBox(0F, 0F, 0F, 7, 7, 2);
		horn1.setRotationPoint(1F, 1F, 1F);
		horn1.setTextureSize(64, 64);
		horn1.mirror = true;
		setRotation(horn1, 0F, 0F, 0F);
		horn2 = new ModelRenderer(this, 0, 0);
		horn2.addBox(0F, 0F, 0F, 5, 5, 3);
		horn2.setRotationPoint(2F, 2F, 3F);
		horn2.setTextureSize(64, 64);
		horn2.mirror = true;
		setRotation(horn2, 0F, 0F, 0F);
		loopback = new ModelRenderer(this, 0, 0);
		loopback.addBox(0F, 0F, 0F, 1, 5, 1);
		loopback.setRotationPoint(2F, 2F, 17F);
		loopback.setTextureSize(64, 64);
		loopback.mirror = true;
		setRotation(loopback, 0F, 0F, 0F);
		loopfront = new ModelRenderer(this, 0, 0);
		loopfront.addBox(0F, 0F, 0F, 1, 5, 1);
		loopfront.setRotationPoint(2F, 2F, 8F);
		loopfront.setTextureSize(64, 64);
		loopfront.mirror = true;
		setRotation(loopfront, 0F, 0F, 0F);
		loopbottom = new ModelRenderer(this, 0, 0);
		loopbottom.addBox(0F, 0F, 0F, 1, 1, 8);
		loopbottom.setRotationPoint(2F, 7F, 9F);
		loopbottom.setTextureSize(64, 64);
		loopbottom.mirror = true;
		setRotation(loopbottom, 0F, 0F, 0F);
		looptop = new ModelRenderer(this, 0, 0);
		looptop.addBox(0F, 0F, 0F, 1, 1, 8);
		looptop.setRotationPoint(2F, 1F, 9F);
		looptop.setTextureSize(64, 64);
		looptop.mirror = true;
		setRotation(looptop, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		shaft.render(f5);
		mouthpiece.render(f5);
		valve0.render(f5);
		valve1.render(f5);
		valve2.render(f5);
		horn0.render(f5);
		horn1.render(f5);
		horn2.render(f5);
		loopback.render(f5);
		loopfront.render(f5);
		loopbottom.render(f5);
		looptop.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}