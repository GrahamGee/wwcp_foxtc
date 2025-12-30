//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.03.2019 - 14:37:32
// Last changed on: 25.03.2019 - 14:37:32

package wwcp.client.render.rollingstock.freight; //Path where the model is located


import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import wwcp.client.render.rollingstock.bogies.AmericanTrucks.truck_70ton;
import wwcp.common.library.Info;

public class EP2_Center extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public EP2_Center() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 29
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 30
		bodyModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 384
		bodyModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 387
		bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 388
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 389
		bodyModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 390
		bodyModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 392
		bodyModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 393
		bodyModel[18] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 394
		bodyModel[19] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 422
		bodyModel[20] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 302
		bodyModel[21] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 302
		bodyModel[22] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 304
		bodyModel[23] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 302
		bodyModel[24] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 422
		bodyModel[25] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 302
		bodyModel[26] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 302
		bodyModel[27] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 304
		bodyModel[28] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 302
		bodyModel[29] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 419
		bodyModel[30] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 420
		bodyModel[31] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 425
		bodyModel[32] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 426
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 427
		bodyModel[34] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 428
		bodyModel[35] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 429
		bodyModel[36] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 430
		bodyModel[37] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 431
		bodyModel[38] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 432
		bodyModel[39] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 433
		bodyModel[40] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 432
		bodyModel[41] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 389
		bodyModel[43] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 629
		bodyModel[44] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 629
		bodyModel[45] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 629
		bodyModel[46] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 629

		bodyModel[0].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-18.5F, -24F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[1].setRotationPoint(-18.5F, -24F, 9.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 23, 20, 0F); // Box 2
		bodyModel[2].setRotationPoint(-18.5F, -23F, -10.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 2, 12, 0F); // Box 29
		bodyModel[3].setRotationPoint(-8F, -26.2F, -6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[4].setRotationPoint(-0.5F, -29.4F, -2.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-18.5F, -24F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 37, 1, 6, 0F,0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-18.5F, -24F, 3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-18.5F, -25F, -4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 37, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-18.5F, -25F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[9].setRotationPoint(-2.5F, -29.4F, -2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F); // Box 30
		bodyModel[10].setRotationPoint(-3.4F, -26.9F, -2.6F);

		bodyModel[11].addBox(-4F, 0F, 0F, 4, 0, 1, 0F); // Box 384
		bodyModel[11].setRotationPoint(10.5F, 2F, -11.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 387
		bodyModel[12].setRotationPoint(5.74F, -0.25F, -12.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 388
		bodyModel[13].setRotationPoint(5.74F, 4.6F, -11.5F);

		bodyModel[14].addBox(-4F, 0F, 0F, 0, 8, 1, 0F); // Box 389
		bodyModel[14].setRotationPoint(10.5F, -3.33066907387547E-16F, -11.5F);

		bodyModel[15].addBox(-4F, 0F, 0F, 4, 0, 1, 0F); // Box 390
		bodyModel[15].setRotationPoint(10.5F, 5.5F, -11.5F);

		bodyModel[16].addBox(-4F, 0F, 0F, 4, 0, 1, 0F); // Box 392
		bodyModel[16].setRotationPoint(10.5F, 8F, -11.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 393
		bodyModel[17].setRotationPoint(10.26F, -0.25F, -12.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 394
		bodyModel[18].setRotationPoint(10.26F, 4.6F, -11.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 422
		bodyModel[19].setRotationPoint(-11F, -27.4F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[20].setRotationPoint(-10F, -26.65F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[21].setRotationPoint(-4F, -26.65F, -8.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 304
		bodyModel[22].setRotationPoint(2F, -26.65F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[23].setRotationPoint(8F, -26.65F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 422
		bodyModel[24].setRotationPoint(-11F, -27.4F, 6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[25].setRotationPoint(-10F, -26.65F, 6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[26].setRotationPoint(-4F, -26.65F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 304
		bodyModel[27].setRotationPoint(2F, -26.65F, 6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[28].setRotationPoint(8F, -26.65F, 6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 419
		bodyModel[29].setRotationPoint(5.74F, -17.25F, -12.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 420
		bodyModel[30].setRotationPoint(10.26F, -17.25F, -12.25F);

		bodyModel[31].addBox(0F, 0F, 0F, 25, 23, 1, 0F); // Box 425
		bodyModel[31].setRotationPoint(-18.5F, -23F, -11.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 8, 23, 1, 0F); // Box 426
		bodyModel[32].setRotationPoint(10.5F, -23F, -11.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 37, 23, 1, 0F); // Box 427
		bodyModel[33].setRotationPoint(-18.5F, -23F, 9.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 23, 20, 0F); // Box 428
		bodyModel[34].setRotationPoint(17.5F, -23F, -10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 429
		bodyModel[35].setRotationPoint(6.5F, -23F, -11.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 430
		bodyModel[36].setRotationPoint(6.5F, -7F, -11.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 431
		bodyModel[37].setRotationPoint(6.5F, -1F, -11.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 432
		bodyModel[38].setRotationPoint(6.5F, -4.5F, -11.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 15, 1, 0F); // Box 433
		bodyModel[39].setRotationPoint(6.5F, -22F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 432
		bodyModel[40].setRotationPoint(6.5F, -2.5F, -11.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 35, 7, 20, 0F); // Box 1
		bodyModel[41].setRotationPoint(-17.5F, -7F, -10.5F);

		bodyModel[42].addBox(-4F, 0F, 0F, 0, 8, 1, 0F); // Box 389
		bodyModel[42].setRotationPoint(14.5F, -3.33066907387547E-16F, -11.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 7, 16, 7, 0F); // Box 629
		bodyModel[43].setRotationPoint(-17.5F, -23F, 2.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 7, 16, 7, 0F); // Box 629
		bodyModel[44].setRotationPoint(-17.5F, -23F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 7, 16, 7, 0F); // Box 629
		bodyModel[45].setRotationPoint(10.5F, -23F, 2.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 7, 16, 7, 0F); // Box 629
		bodyModel[46].setRotationPoint(10.5F, -23F, -10.5F);
	}
}