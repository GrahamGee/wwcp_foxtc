//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.03.2019 - 14:37:32
// Last changed on: 25.03.2019 - 14:37:32

package wwcp.client.render.rollingstock.freight; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class GundersonWoodchips extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public GundersonWoodchips() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Woodchip_Layer

		bodyModel[0].addShapeBox(0F, 0F, 0F, 126, 1, 20, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, -1F, -0.01F, 0F, -1F); // Woodchip_Layer
		bodyModel[0].setRotationPoint(-63F, 9F, -10F);
	}
}