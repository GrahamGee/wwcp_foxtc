package wwcp.client.render.rollingstock.bogies.AmericanTrucks;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class EP2_End_Bogie extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public EP2_End_Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[116];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 181
		bodyModel[1] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 184
		bodyModel[2] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 184
		bodyModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 184
		bodyModel[4] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 184
		bodyModel[5] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 674
		bodyModel[6] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 675
		bodyModel[7] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 676
		bodyModel[8] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 674
		bodyModel[9] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 674
		bodyModel[10] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 675
		bodyModel[11] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 676
		bodyModel[12] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 674
		bodyModel[13] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // box
		bodyModel[14] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // box
		bodyModel[15] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // box
		bodyModel[16] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // box
		bodyModel[17] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // box
		bodyModel[18] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 186
		bodyModel[19] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 665
		bodyModel[20] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 666
		bodyModel[21] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 592
		bodyModel[22] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Wheel
		bodyModel[23] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 598
		bodyModel[24] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Wheel
		bodyModel[25] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 603
		bodyModel[26] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 605
		bodyModel[27] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 606
		bodyModel[28] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 619
		bodyModel[29] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 620
		bodyModel[30] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 621
		bodyModel[31] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 623
		bodyModel[32] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 217
		bodyModel[33] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 183
		bodyModel[34] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 410
		bodyModel[35] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 411
		bodyModel[36] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 412
		bodyModel[37] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 413
		bodyModel[38] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 704
		bodyModel[39] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 705
		bodyModel[40] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 706
		bodyModel[41] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 417
		bodyModel[42] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 418
		bodyModel[43] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 419
		bodyModel[44] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 420
		bodyModel[45] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 421
		bodyModel[46] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 422
		bodyModel[47] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 423
		bodyModel[48] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 424
		bodyModel[49] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 425
		bodyModel[50] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 426
		bodyModel[51] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 427
		bodyModel[52] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 428
		bodyModel[53] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 429
		bodyModel[54] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 430
		bodyModel[55] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 431
		bodyModel[56] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 432
		bodyModel[57] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 433
		bodyModel[58] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 434
		bodyModel[59] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 435
		bodyModel[60] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 436
		bodyModel[61] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 437
		bodyModel[62] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 438
		bodyModel[63] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 439
		bodyModel[64] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 440
		bodyModel[65] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 441
		bodyModel[66] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 442
		bodyModel[67] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 443
		bodyModel[68] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 444
		bodyModel[69] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 445
		bodyModel[70] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 446
		bodyModel[71] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 447
		bodyModel[72] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 448
		bodyModel[73] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 450
		bodyModel[74] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 680
		bodyModel[75] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 603
		bodyModel[76] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 605
		bodyModel[77] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 606
		bodyModel[78] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 619
		bodyModel[79] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 620
		bodyModel[80] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 621
		bodyModel[81] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 410
		bodyModel[82] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 411
		bodyModel[83] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 704
		bodyModel[84] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 705
		bodyModel[85] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 706
		bodyModel[86] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 417
		bodyModel[87] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 438
		bodyModel[88] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 439
		bodyModel[89] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 443
		bodyModel[90] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 444
		bodyModel[91] = new ModelRendererTurbo(this, 73, 170, textureX, textureY); // Box 547
		bodyModel[92] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 418
		bodyModel[93] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 419
		bodyModel[94] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 420
		bodyModel[95] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 421
		bodyModel[96] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 422
		bodyModel[97] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 425
		bodyModel[98] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 426
		bodyModel[99] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 427
		bodyModel[100] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 433
		bodyModel[101] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 434
		bodyModel[102] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 435
		bodyModel[103] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 436
		bodyModel[104] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 437
		bodyModel[105] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 440
		bodyModel[106] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 441
		bodyModel[107] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 442
		bodyModel[108] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 623
		bodyModel[109] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 183
		bodyModel[110] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 412
		bodyModel[111] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 413
		bodyModel[112] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 423
		bodyModel[113] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 424
		bodyModel[114] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 428
		bodyModel[115] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 429

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[0].setRotationPoint(-17F, 0.5F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[1].setRotationPoint(-16.1F, 2.5F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 184
		bodyModel[2].setRotationPoint(-16.1F, 2.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[3].setRotationPoint(-13.1F, 2.5F, 7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 184
		bodyModel[4].setRotationPoint(-13.1F, 2.5F, -11.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 674
		bodyModel[5].setRotationPoint(-17F, 2.5F, -11.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 675
		bodyModel[6].setRotationPoint(-17F, 4.5F, -11.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 676
		bodyModel[7].setRotationPoint(-17F, 6.5F, -11.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 674
		bodyModel[8].setRotationPoint(-17F, 2.5F, -8.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 674
		bodyModel[9].setRotationPoint(-17F, 2.5F, 7.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 675
		bodyModel[10].setRotationPoint(-17F, 4.5F, 7.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 676
		bodyModel[11].setRotationPoint(-17F, 6.5F, 7.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 674
		bodyModel[12].setRotationPoint(-17F, 2.5F, 10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[13].setRotationPoint(-19F, 3.5F, -1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[14].setRotationPoint(-20F, 3F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[15].setRotationPoint(-20F, 3F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[16].setRotationPoint(-22F, 3F, -1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[17].setRotationPoint(-21F, 3F, 0F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 186
		bodyModel[18].setRotationPoint(-18F, 2.5F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 665
		bodyModel[19].setRotationPoint(-17F, 0.25F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 666
		bodyModel[20].setRotationPoint(-17.5F, 0F, -0.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 33, 2, 2, 0F); // Box 592
		bodyModel[21].setRotationPoint(-11F, 2.75F, -9F);

		bodyModel[22].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Wheel
		bodyModel[22].setRotationPoint(-3.5F, 7F, -5.95F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 598
		bodyModel[23].setRotationPoint(-6F, 4.5F, -10F);

		bodyModel[24].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Wheel
		bodyModel[24].setRotationPoint(-3.5F, 7F, 5.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 603
		bodyModel[25].setRotationPoint(-7.5F, 4.75F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 605
		bodyModel[26].setRotationPoint(-8F, 7.75F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 606
		bodyModel[27].setRotationPoint(-3.5F, 4.75F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 619
		bodyModel[28].setRotationPoint(-9.5F, 0.25F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[29].setRotationPoint(-5.5F, -0.25F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[30].setRotationPoint(-4.5F, 0.25F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 623
		bodyModel[31].setRotationPoint(-0.5F, 0.25F, -9.25F);

		bodyModel[32].addBox(0F, 0F, 0F, 34, 2, 8, 0F); // Box 217
		bodyModel[32].setRotationPoint(-14.45F, 3F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 183
		bodyModel[33].setRotationPoint(-0.5F, 0.25F, -7.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 410
		bodyModel[34].setRotationPoint(-4.9F, 3.25F, -9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 411
		bodyModel[35].setRotationPoint(-6.1F, 3.25F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 412
		bodyModel[36].setRotationPoint(-9.5F, 0.25F, -9.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 413
		bodyModel[37].setRotationPoint(-9.5F, 0.25F, -7.75F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 704
		bodyModel[38].setRotationPoint(-2.5F, 4.75F, -10.5F);

		bodyModel[39].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 705
		bodyModel[39].setRotationPoint(-1.5F, 5.25F, -10F);
		bodyModel[39].rotateAngleX = -0.78539816F;

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 706
		bodyModel[40].setRotationPoint(2.5F, 4.75F, -10.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 417
		bodyModel[41].setRotationPoint(-2.5F, 0.75F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 418
		bodyModel[42].setRotationPoint(3F, 7.75F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 419
		bodyModel[43].setRotationPoint(3.5F, 4.75F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 420
		bodyModel[44].setRotationPoint(7.5F, 4.75F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 421
		bodyModel[45].setRotationPoint(6.1F, 3.25F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 422
		bodyModel[46].setRotationPoint(4.9F, 3.25F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 423
		bodyModel[47].setRotationPoint(1.5F, 0.25F, -9.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 424
		bodyModel[48].setRotationPoint(1.5F, 0.25F, -7.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 425
		bodyModel[49].setRotationPoint(1.5F, 0.25F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[50].setRotationPoint(5.5F, -0.25F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[51].setRotationPoint(6.5F, 0.25F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 428
		bodyModel[52].setRotationPoint(10.5F, 0.25F, -9.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 429
		bodyModel[53].setRotationPoint(10.5F, 0.25F, -7.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 430
		bodyModel[54].setRotationPoint(5F, 4.5F, -10F);

		bodyModel[55].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 431
		bodyModel[55].setRotationPoint(7.5F, 7F, -5.95F);

		bodyModel[56].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 432
		bodyModel[56].setRotationPoint(7.5F, 7F, 5.75F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 433
		bodyModel[57].setRotationPoint(14F, 7.75F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 434
		bodyModel[58].setRotationPoint(14.5F, 4.75F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 435
		bodyModel[59].setRotationPoint(18.5F, 4.75F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 436
		bodyModel[60].setRotationPoint(17.1F, 3.25F, -9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 437
		bodyModel[61].setRotationPoint(15.9F, 3.25F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 438
		bodyModel[62].setRotationPoint(12.5F, 0.25F, -9.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 439
		bodyModel[63].setRotationPoint(12.5F, 0.25F, -7.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 440
		bodyModel[64].setRotationPoint(12.5F, 0.25F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[65].setRotationPoint(16.5F, -0.25F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[66].setRotationPoint(17.5F, 0.25F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 443
		bodyModel[67].setRotationPoint(21.5F, 0.25F, -9.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 444
		bodyModel[68].setRotationPoint(21.5F, 0.25F, -7.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 445
		bodyModel[69].setRotationPoint(16F, 4.5F, -10F);

		bodyModel[70].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 446
		bodyModel[70].setRotationPoint(18.5F, 7F, -5.95F);

		bodyModel[71].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 447
		bodyModel[71].setRotationPoint(18.5F, 7F, 5.75F);

		bodyModel[72].addBox(0F, 0F, 0F, 33, 2, 2, 0F); // Box 448
		bodyModel[72].setRotationPoint(-10F, 2.75F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 450
		bodyModel[73].setRotationPoint(4.5F, 2F, -2F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 680
		bodyModel[74].setRotationPoint(-17F, 2.25F, -3.5F);
		bodyModel[74].rotateAngleZ = -0.05235988F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 603
		bodyModel[75].setRotationPoint(18.5F, 4.75F, 7F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 605
		bodyModel[76].setRotationPoint(14F, 7.75F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 606
		bodyModel[77].setRotationPoint(14.5F, 4.75F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[78].setRotationPoint(17.5F, 0.25F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[79].setRotationPoint(16.5F, -0.25F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 621
		bodyModel[80].setRotationPoint(12.5F, 0.25F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 410
		bodyModel[81].setRotationPoint(15.9F, 3.25F, 8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 411
		bodyModel[82].setRotationPoint(17.1F, 3.25F, 8.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 704
		bodyModel[83].setRotationPoint(13.5F, 4.75F, 7.5F);

		bodyModel[84].addBox(0F, -1F, -1F, 4, 2, 2, 0F); // Box 705
		bodyModel[84].setRotationPoint(9.5F, 5.25F, 10F);
		bodyModel[84].rotateAngleX = -0.78539816F;

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 706
		bodyModel[85].setRotationPoint(8.5F, 4.75F, 7.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 417
		bodyModel[86].setRotationPoint(13.5F, 0.75F, 9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 438
		bodyModel[87].setRotationPoint(12.5F, 0.25F, 6.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 439
		bodyModel[88].setRotationPoint(12.5F, 0.25F, 8.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 443
		bodyModel[89].setRotationPoint(21.5F, 0.25F, 6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 444
		bodyModel[90].setRotationPoint(21.5F, 0.25F, 8.25F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 547
		bodyModel[91].setRotationPoint(-18F, 1F, -3.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 418
		bodyModel[92].setRotationPoint(3F, 7.75F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 419
		bodyModel[93].setRotationPoint(7.5F, 4.75F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 420
		bodyModel[94].setRotationPoint(3.5F, 4.75F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 421
		bodyModel[95].setRotationPoint(4.9F, 3.25F, 8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 422
		bodyModel[96].setRotationPoint(6.1F, 3.25F, 8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[97].setRotationPoint(6.5F, 0.25F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[98].setRotationPoint(5.5F, -0.25F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 427
		bodyModel[99].setRotationPoint(1.5F, 0.25F, 7F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 433
		bodyModel[100].setRotationPoint(-8F, 7.75F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 434
		bodyModel[101].setRotationPoint(-3.5F, 4.75F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 435
		bodyModel[102].setRotationPoint(-7.5F, 4.75F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 436
		bodyModel[103].setRotationPoint(-6.1F, 3.25F, 8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 437
		bodyModel[104].setRotationPoint(-4.9F, 3.25F, 8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[105].setRotationPoint(-4.5F, 0.25F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[106].setRotationPoint(-5.5F, -0.25F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 442
		bodyModel[107].setRotationPoint(-9.5F, 0.25F, 7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 623
		bodyModel[108].setRotationPoint(-0.5F, 0.25F, 6.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 183
		bodyModel[109].setRotationPoint(-0.5F, 0.25F, 8.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 412
		bodyModel[110].setRotationPoint(-9.5F, 0.25F, 6.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 413
		bodyModel[111].setRotationPoint(-9.5F, 0.25F, 8.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 423
		bodyModel[112].setRotationPoint(1.5F, 0.25F, 6.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 424
		bodyModel[113].setRotationPoint(1.5F, 0.25F, 8.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 428
		bodyModel[114].setRotationPoint(10.5F, 0.25F, 6.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 429
		bodyModel[115].setRotationPoint(10.5F, 0.25F, 8.25F);
	}
}