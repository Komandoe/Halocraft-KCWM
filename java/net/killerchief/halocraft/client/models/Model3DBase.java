package net.killerchief.halocraft.client.models;

import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

public abstract class Model3DBase extends ModelBase {

	protected ModelRendererTurbo[] bodyModel;
	protected ModelRendererTurbo[] frontWheelModel;
	protected ModelRendererTurbo[] backWheelModel;
	protected ModelRendererTurbo[] bodyDoorOpenModel;
	protected ModelRendererTurbo[] leftTrackModel;

	protected ModelRenderer[] techneModel;

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	@Override
	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.renderAllParts(entity, par7);
	}

	protected void renderAllParts(Entity entity, float par7)
	{
		this.renderAllParts(par7);
	}

	/**
	 * Sets the models various rotation angles then renders the model.
	 */
	public void render(TileEntity tileentity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		this.renderAllParts(tileentity, par7);
	}

	protected void renderAllParts(TileEntity entity, float par7)
	{
		this.renderAllParts(par7);
	}

	protected void renderAllParts(float par7)
	{
		if (this.bodyModel != null)
		{
			for (ModelRendererTurbo part : this.bodyModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.frontWheelModel != null)
		{
			for (ModelRendererTurbo part : this.frontWheelModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.backWheelModel != null)
		{
			for (ModelRendererTurbo part : this.backWheelModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.techneModel != null)
		{
			for (ModelRenderer part : this.techneModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.bodyDoorOpenModel != null)
		{
			for (ModelRendererTurbo part : this.bodyDoorOpenModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
		if (this.leftTrackModel != null)
		{
			for (ModelRendererTurbo part : this.leftTrackModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
	}

	protected void flip(ModelRendererTurbo model[])
	{
		for (ModelRendererTurbo part : model)
		{
			if (part != null)
			{
				part.doMirror(false, true, true);
				part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
			}
		}
	}
}