// Date: 12.07.2016 17:01:02
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.hbm.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXVL1456 extends ModelBase {
	// fields
	ModelRenderer CoilFront;
	ModelRenderer Panel1;
	ModelRenderer Panel2;
	ModelRenderer Panel3;
	ModelRenderer CoilBack;
	ModelRenderer SpinPivot;
	ModelRenderer Barrel;
	ModelRenderer CoilBarrel;
	ModelRenderer PipeBarrel;
	ModelRenderer PipeHolder;
	ModelRenderer Rail1;
	ModelRenderer Rail2;
	ModelRenderer Rail3;
	ModelRenderer Rail4;
	ModelRenderer Rail5;
	ModelRenderer Rail6;
	ModelRenderer TankHolder;
	ModelRenderer HandleBase;
	ModelRenderer HandleShaft;
	ModelRenderer HanldeGrip;
	ModelRenderer SpinC1;
	ModelRenderer SpinC2;
	ModelRenderer SpinC3;
	ModelRenderer SpinP1;
	ModelRenderer SpinP2;
	ModelRenderer SpinP3;
	ModelRenderer Battery1;
	ModelRenderer Battery2;
	ModelRenderer StockBase;
	ModelRenderer StockTrigger;
	ModelRenderer Shape1;
	int i = 0;

	public ModelXVL1456() {
		textureWidth = 128;
		textureHeight = 64;

		CoilFront = new ModelRenderer(this, 0, 0);
		CoilFront.addBox(0F, 0F, 0F, 4, 10, 10);
		CoilFront.setRotationPoint(0F, 0F, 0F);
		CoilFront.setTextureSize(128, 64);
		CoilFront.mirror = true;
		setRotation(CoilFront, 0F, 0F, 0F);
		Panel1 = new ModelRenderer(this, 0, 40);
		Panel1.addBox(0F, 0F, 0F, 5, 11, 3);
		Panel1.setRotationPoint(4F, -1F, 3.5F);
		Panel1.setTextureSize(128, 64);
		Panel1.mirror = true;
		setRotation(Panel1, 0F, 0F, 0F);
		Panel2 = new ModelRenderer(this, 0, 54);
		Panel2.addBox(0F, 0F, 0F, 5, 3, 3);
		Panel2.setRotationPoint(9F, -1F, 3.5F);
		Panel2.setTextureSize(128, 64);
		Panel2.mirror = true;
		setRotation(Panel2, 0F, 0F, 0F);
		Panel3 = new ModelRenderer(this, 16, 40);
		Panel3.addBox(0F, 0F, 0F, 3, 11, 3);
		Panel3.setRotationPoint(14F, -1F, 3.5F);
		Panel3.setTextureSize(128, 64);
		Panel3.mirror = true;
		setRotation(Panel3, 0F, 0F, 0F);
		CoilBack = new ModelRenderer(this, 0, 20);
		CoilBack.addBox(0F, 0F, 0F, 4, 10, 10);
		CoilBack.setRotationPoint(17F, 0F, 0F);
		CoilBack.setTextureSize(128, 64);
		CoilBack.mirror = true;
		setRotation(CoilBack, 0F, 0F, 0F);
		SpinPivot = new ModelRenderer(this, 66, 42);
		SpinPivot.addBox(0F, 0F, 0F, 5, 1, 1);
		SpinPivot.setRotationPoint(9F, 5.5F, 4.5F);
		SpinPivot.setTextureSize(128, 64);
		SpinPivot.mirror = true;
		setRotation(SpinPivot, 0F, 0F, 0F);
		Barrel = new ModelRenderer(this, 64, 0);
		Barrel.addBox(0F, 0F, 0F, 28, 1, 1);
		Barrel.setRotationPoint(-28F, 4.5F, 4.5F);
		Barrel.setTextureSize(128, 64);
		Barrel.mirror = true;
		setRotation(Barrel, 0F, 0F, 0F);
		CoilBarrel = new ModelRenderer(this, 28, 4);
		CoilBarrel.addBox(0F, 0F, 0F, 9, 7, 7);
		CoilBarrel.setRotationPoint(-19F, 1.5F, 1.5F);
		CoilBarrel.setTextureSize(128, 64);
		CoilBarrel.mirror = true;
		setRotation(CoilBarrel, 0F, 0F, 0F);
		PipeBarrel = new ModelRenderer(this, 28, 0);
		PipeBarrel.addBox(0F, 0F, 0F, 16, 2, 2);
		PipeBarrel.setRotationPoint(-13F, 6F, -0.4666667F);
		PipeBarrel.setTextureSize(128, 64);
		PipeBarrel.mirror = true;
		setRotation(PipeBarrel, 0F, 0F, 0F);
		PipeHolder = new ModelRenderer(this, 42, 37);
		PipeHolder.addBox(0F, 0F, 0F, 3, 4, 1);
		PipeHolder.setRotationPoint(0.5F, 5F, -1F);
		PipeHolder.setTextureSize(128, 64);
		PipeHolder.mirror = true;
		setRotation(PipeHolder, 0F, 0F, 0F);
		Rail1 = new ModelRenderer(this, 28, 27);
		Rail1.addBox(0F, 0F, 0F, 1, 5, 1);
		Rail1.setRotationPoint(5F, -2F, 2.5F);
		Rail1.setTextureSize(128, 64);
		Rail1.mirror = true;
		setRotation(Rail1, 0F, 0F, 0F);
		Rail2 = new ModelRenderer(this, 32, 27);
		Rail2.addBox(0F, 0F, 0F, 1, 5, 1);
		Rail2.setRotationPoint(5F, -2F, 6.5F);
		Rail2.setTextureSize(128, 64);
		Rail2.mirror = true;
		setRotation(Rail2, 0F, 0F, 0F);
		Rail3 = new ModelRenderer(this, 28, 23);
		Rail3.addBox(0F, 0F, 0F, 18, 1, 1);
		Rail3.setRotationPoint(-12F, -3F, 2.5F);
		Rail3.setTextureSize(128, 64);
		Rail3.mirror = true;
		setRotation(Rail3, 0F, 0F, 0F);
		Rail4 = new ModelRenderer(this, 28, 25);
		Rail4.addBox(0F, 0F, 0F, 18, 1, 1);
		Rail4.setRotationPoint(-12F, -3F, 6.5F);
		Rail4.setTextureSize(128, 64);
		Rail4.mirror = true;
		setRotation(Rail4, 0F, 0F, 0F);
		Rail5 = new ModelRenderer(this, 28, 18);
		Rail5.addBox(0F, 0F, 0F, 1, 4, 1);
		Rail5.setRotationPoint(-12F, -2F, 2.5F);
		Rail5.setTextureSize(128, 64);
		Rail5.mirror = true;
		setRotation(Rail5, 0F, 0F, 0F);
		Rail6 = new ModelRenderer(this, 32, 18);
		Rail6.addBox(0F, 0F, 0F, 1, 4, 1);
		Rail6.setRotationPoint(-12F, -2F, 6.5F);
		Rail6.setTextureSize(128, 64);
		Rail6.mirror = true;
		setRotation(Rail6, 0F, 0F, 0F);
		TankHolder = new ModelRenderer(this, 42, 27);
		TankHolder.addBox(0F, 0F, 0F, 4, 2, 1);
		TankHolder.setRotationPoint(4.5F, 4F, 2.5F);
		TankHolder.setTextureSize(128, 64);
		TankHolder.mirror = true;
		setRotation(TankHolder, 0F, 0F, 0F);
		HandleBase = new ModelRenderer(this, 28, 33);
		HandleBase.addBox(0F, 0F, 0F, 6, 1, 1);
		HandleBase.setRotationPoint(9F, -2F, 4.5F);
		HandleBase.setTextureSize(128, 64);
		HandleBase.mirror = true;
		setRotation(HandleBase, 0F, 0F, 0F);
		HandleShaft = new ModelRenderer(this, 28, 35);
		HandleShaft.addBox(0F, 0F, 0F, 1, 3, 1);
		HandleShaft.setRotationPoint(8F, -4F, 4.5F);
		HandleShaft.setTextureSize(128, 64);
		HandleShaft.mirror = true;
		setRotation(HandleShaft, 0F, 0F, 0F);
		HanldeGrip = new ModelRenderer(this, 28, 39);
		HanldeGrip.addBox(0F, 0F, 0F, 5, 2, 2);
		HanldeGrip.setRotationPoint(9F, -5F, 4F);
		HanldeGrip.setTextureSize(128, 64);
		HanldeGrip.mirror = true;
		setRotation(HanldeGrip, 0F, 0F, 0F);
		SpinC1 = new ModelRenderer(this, 66, 21);
		SpinC1.addBox(0F, -3.5F, -2F, 4, 3, 4);
		SpinC1.setRotationPoint(9.5F, 6F, 5F);
		SpinC1.setTextureSize(128, 64);
		SpinC1.mirror = true;
		setRotation(SpinC1, 0F, 0F, 0F);
		SpinC2 = new ModelRenderer(this, 66, 28);
		SpinC2.addBox(0F, -3.5F, -2F, 4, 3, 4);
		SpinC2.setRotationPoint(9.5F, 6F, 5F);
		SpinC2.setTextureSize(128, 64);
		SpinC2.mirror = true;
		setRotation(SpinC2, 2.094395F, 0F, 0F);
		SpinC3 = new ModelRenderer(this, 66, 35);
		SpinC3.addBox(0F, -3.5F, -2F, 4, 3, 4);
		SpinC3.setRotationPoint(9.5F, 6F, 5F);
		SpinC3.setTextureSize(128, 64);
		SpinC3.mirror = true;
		setRotation(SpinC3, -2.094395F, 0F, 0F);
		SpinP1 = new ModelRenderer(this, 82, 21);
		SpinP1.addBox(0F, -3F, -1.5F, 3, 2, 3);
		SpinP1.setRotationPoint(10F, 6F, 5F);
		SpinP1.setTextureSize(128, 64);
		SpinP1.mirror = true;
		setRotation(SpinP1, 1.047198F, 0F, 0F);
		SpinP2 = new ModelRenderer(this, 82, 26);
		SpinP2.addBox(0F, -3F, -1.5F, 3, 2, 3);
		SpinP2.setRotationPoint(10F, 6F, 5F);
		SpinP2.setTextureSize(128, 64);
		SpinP2.mirror = true;
		setRotation(SpinP2, 3.141593F, 0F, 0F);
		SpinP3 = new ModelRenderer(this, 82, 31);
		SpinP3.addBox(0F, -3F, -1.5F, 3, 2, 3);
		SpinP3.setRotationPoint(10F, 6F, 5F);
		SpinP3.setTextureSize(128, 64);
		SpinP3.mirror = true;
		setRotation(SpinP3, -1.047198F, 0F, 0F);
		Battery1 = new ModelRenderer(this, 64, 2);
		Battery1.addBox(0F, 0F, 0F, 1, 1, 3);
		Battery1.setRotationPoint(17.8F, -1F, 3.5F);
		Battery1.setTextureSize(128, 64);
		Battery1.mirror = true;
		setRotation(Battery1, 0F, 0F, 0F);
		Battery2 = new ModelRenderer(this, 72, 2);
		Battery2.addBox(0F, 0F, 0F, 1, 1, 3);
		Battery2.setRotationPoint(19.3F, -1F, 3.5F);
		Battery2.setTextureSize(128, 64);
		Battery2.mirror = true;
		setRotation(Battery2, 0F, 0F, 0F);
		StockBase = new ModelRenderer(this, 60, 12);
		StockBase.addBox(0F, 0F, 0F, 12, 6, 3);
		StockBase.setRotationPoint(22F, 7F, 3.5F);
		StockBase.setTextureSize(128, 64);
		StockBase.mirror = true;
		setRotation(StockBase, 0F, 0F, 0F);
		StockTrigger = new ModelRenderer(this, 60, 6);
		StockTrigger.addBox(-3.5F, -1.5F, 0F, 5, 4, 2);
		StockTrigger.setRotationPoint(22F, 10F, 4F);
		StockTrigger.setTextureSize(128, 64);
		StockTrigger.mirror = true;
		setRotation(StockTrigger, 0F, 0F, 0.7853982F);
		Shape1 = new ModelRenderer(this, 42, 30);
		Shape1.addBox(0F, -1F, -1F, 2, 5, 2);
		Shape1.setRotationPoint(5.5F, 6F, 2.5F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		setRotation(Shape1, -0.7853982F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float rot) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		CoilFront.render(f5);
		Panel1.render(f5);
		Panel2.render(f5);
		Panel3.render(f5);
		CoilBack.render(f5);
		SpinPivot.render(f5);
		Barrel.render(f5);
		CoilBarrel.render(f5);
		PipeBarrel.render(f5);
		PipeHolder.render(f5);
		Rail1.render(f5);
		Rail2.render(f5);
		Rail3.render(f5);
		Rail4.render(f5);
		Rail5.render(f5);
		Rail6.render(f5);
		TankHolder.render(f5);
		HandleBase.render(f5);
		HandleShaft.render(f5);
		HanldeGrip.render(f5);
		SpinC1.rotateAngleX += rot;
		SpinC2.rotateAngleX += rot;
		SpinC3.rotateAngleX += rot;
		SpinP1.rotateAngleX += rot;
		SpinP2.rotateAngleX += rot;
		SpinP3.rotateAngleX += rot;
		SpinC1.render(f5);
		SpinC2.render(f5);
		SpinC3.render(f5);
		SpinP1.render(f5);
		SpinP2.render(f5);
		SpinP3.render(f5);
		Battery1.render(f5);
		Battery2.render(f5);
		StockBase.render(f5);
		StockTrigger.render(f5);
		Shape1.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
