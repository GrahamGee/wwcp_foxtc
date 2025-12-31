package wwcp.client.render.rollingstock.bogies.AmericanTrucks;


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class EP2_Mid_Bogie extends ModelConverter
{
	int textureX = 512;
	int textureY = 512;

	public EP2_Mid_Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 451
		bodyModel[1] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 453
		bodyModel[2] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 454
		bodyModel[3] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 455
		bodyModel[4] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 456
		bodyModel[5] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 457
		bodyModel[6] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 458
		bodyModel[7] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 459
		bodyModel[8] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 460
		bodyModel[9] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 461
		bodyModel[10] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 462
		bodyModel[11] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 463
		bodyModel[12] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 464
		bodyModel[13] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 465
		bodyModel[14] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 466
		bodyModel[15] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 467
		bodyModel[16] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 468
		bodyModel[17] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 469
		bodyModel[18] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 470
		bodyModel[19] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 471
		bodyModel[20] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 472
		bodyModel[21] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 473
		bodyModel[22] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 474
		bodyModel[23] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 475
		bodyModel[24] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 476
		bodyModel[25] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 477
		bodyModel[26] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 478
		bodyModel[27] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 479
		bodyModel[28] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 480
		bodyModel[29] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 481
		bodyModel[30] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 482
		bodyModel[31] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 483
		bodyModel[32] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 484
		bodyModel[33] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 485
		bodyModel[34] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 486
		bodyModel[35] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 487
		bodyModel[36] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 488
		bodyModel[37] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 489
		bodyModel[38] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 490
		bodyModel[39] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 492
		bodyModel[40] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 493
		bodyModel[41] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 494
		bodyModel[42] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 495
		bodyModel[43] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 496
		bodyModel[44] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 497
		bodyModel[45] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 498
		bodyModel[46] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 499
		bodyModel[47] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 500
		bodyModel[48] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 501
		bodyModel[49] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 502
		bodyModel[50] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 503
		bodyModel[51] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 504
		bodyModel[52] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 505
		bodyModel[53] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 507
		bodyModel[54] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 508
		bodyModel[55] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 509
		bodyModel[56] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 510
		bodyModel[57] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 511
		bodyModel[58] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 512
		bodyModel[59] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 452
		bodyModel[60] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 453
		bodyModel[61] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 456
		bodyModel[62] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 457
		bodyModel[63] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 458
		bodyModel[64] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 459
		bodyModel[65] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 460
		bodyModel[66] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 462
		bodyModel[67] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 504
		bodyModel[68] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 505
		bodyModel[69] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 510
		bodyModel[70] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 511
		bodyModel[71] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 545
		bodyModel[72] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 546
		bodyModel[73] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 452
		bodyModel[74] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 491
		bodyModel[75] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 506
		bodyModel[76] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 469
		bodyModel[77] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 470
		bodyModel[78] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Box 471
		bodyModel[79] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 472
		bodyModel[80] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 473
		bodyModel[81] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 477
		bodyModel[82] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 478
		bodyModel[83] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 479
		bodyModel[84] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 484
		bodyModel[85] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 485
		bodyModel[86] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 486
		bodyModel[87] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 487
		bodyModel[88] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 488
		bodyModel[89] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 492
		bodyModel[90] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 493
		bodyModel[91] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 494
		bodyModel[92] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 499
		bodyModel[93] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 500
		bodyModel[94] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 501
		bodyModel[95] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 502
		bodyModel[96] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 503
		bodyModel[97] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 507
		bodyModel[98] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 508
		bodyModel[99] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 509
		bodyModel[100] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 454
		bodyModel[101] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 455
		bodyModel[102] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 464
		bodyModel[103] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 465
		bodyModel[104] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 474
		bodyModel[105] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 475
		bodyModel[106] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 489
		bodyModel[107] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 490
		bodyModel[108] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 495
		bodyModel[109] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 496
		bodyModel[110] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 111

		bodyModel[0].addBox(0F, 0F, 0F, 45, 2, 2, 0F); // Box 451
		bodyModel[0].setRotationPoint(-22.55F, 2.75F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 453
		bodyModel[1].setRotationPoint(-19.55F, 7.75F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 454
		bodyModel[2].setRotationPoint(-21.05F, 0.25F, -9.25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 455
		bodyModel[3].setRotationPoint(-21.05F, 0.25F, -7.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 456
		bodyModel[4].setRotationPoint(-21.05F, 0.25F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[5].setRotationPoint(-17.05F, -0.25F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[6].setRotationPoint(-16.05F, 0.25F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 459
		bodyModel[7].setRotationPoint(-16.45F, 3.25F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 460
		bodyModel[8].setRotationPoint(-17.65F, 3.25F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 461
		bodyModel[9].setRotationPoint(-17.55F, 4.5F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 462
		bodyModel[10].setRotationPoint(-15.05F, 4.75F, -9F);

		bodyModel[11].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 463
		bodyModel[11].setRotationPoint(-15.05F, 7F, 5.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 464
		bodyModel[12].setRotationPoint(-12.05F, 0.25F, -9.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 465
		bodyModel[13].setRotationPoint(-12.05F, 0.25F, -7.75F);

		bodyModel[14].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 466
		bodyModel[14].setRotationPoint(-15.05F, 7F, -5.95F);

		bodyModel[15].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 467
		bodyModel[15].setRotationPoint(-4.05F, 7F, 5.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 468
		bodyModel[16].setRotationPoint(-6.55F, 4.5F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 469
		bodyModel[17].setRotationPoint(-5.45F, 3.25F, -9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 470
		bodyModel[18].setRotationPoint(-6.65F, 3.25F, -9.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[19].setRotationPoint(-6.05F, -0.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 472
		bodyModel[20].setRotationPoint(-10.05F, 0.25F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[21].setRotationPoint(-5.05F, 0.25F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 474
		bodyModel[22].setRotationPoint(-1.05F, 0.25F, -9.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 475
		bodyModel[23].setRotationPoint(-1.05F, 0.25F, -7.75F);

		bodyModel[24].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 476
		bodyModel[24].setRotationPoint(-4.05F, 7F, -5.95F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 477
		bodyModel[25].setRotationPoint(-4.05F, 4.75F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 478
		bodyModel[26].setRotationPoint(-8.55F, 7.75F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 479
		bodyModel[27].setRotationPoint(-8.05F, 4.75F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 480
		bodyModel[28].setRotationPoint(-10.05F, 0.25F, -7.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 481
		bodyModel[29].setRotationPoint(-10.05F, 0.25F, -9.25F);

		bodyModel[30].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 482
		bodyModel[30].setRotationPoint(6.95F, 7F, 5.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 483
		bodyModel[31].setRotationPoint(4.45F, 4.5F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 484
		bodyModel[32].setRotationPoint(5.55F, 3.25F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 485
		bodyModel[33].setRotationPoint(4.35F, 3.25F, -9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[34].setRotationPoint(4.95F, -0.25F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 487
		bodyModel[35].setRotationPoint(0.949999999999999F, 0.25F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[36].setRotationPoint(5.95F, 0.25F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 489
		bodyModel[37].setRotationPoint(9.95F, 0.25F, -9.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 490
		bodyModel[38].setRotationPoint(9.95F, 0.25F, -7.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 492
		bodyModel[39].setRotationPoint(6.95F, 4.75F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 493
		bodyModel[40].setRotationPoint(2.45F, 7.75F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 494
		bodyModel[41].setRotationPoint(2.95F, 4.75F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 495
		bodyModel[42].setRotationPoint(0.949999999999999F, 0.25F, -7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 496
		bodyModel[43].setRotationPoint(0.949999999999999F, 0.25F, -9.25F);

		bodyModel[44].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 497
		bodyModel[44].setRotationPoint(17.95F, 7F, 5.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F); // Box 498
		bodyModel[45].setRotationPoint(15.45F, 4.5F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 499
		bodyModel[46].setRotationPoint(16.55F, 3.25F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 500
		bodyModel[47].setRotationPoint(15.35F, 3.25F, -9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[48].setRotationPoint(15.95F, -0.25F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 502
		bodyModel[49].setRotationPoint(11.95F, 0.25F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[50].setRotationPoint(16.95F, 0.25F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 504
		bodyModel[51].setRotationPoint(20.95F, 0.25F, -9.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 505
		bodyModel[52].setRotationPoint(20.95F, 0.25F, -7.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 507
		bodyModel[53].setRotationPoint(17.95F, 4.75F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 508
		bodyModel[54].setRotationPoint(13.45F, 7.75F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 509
		bodyModel[55].setRotationPoint(13.95F, 4.75F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 510
		bodyModel[56].setRotationPoint(11.95F, 0.25F, -7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 511
		bodyModel[57].setRotationPoint(11.95F, 0.25F, -9.25F);

		bodyModel[58].addBox(0F, 0F, 0F, 45, 2, 2, 0F); // Box 512
		bodyModel[58].setRotationPoint(-22.55F, 2.75F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 452
		bodyModel[59].setRotationPoint(17.95F, 4.75F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 453
		bodyModel[60].setRotationPoint(13.45F, 7.75F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[61].setRotationPoint(16.95F, 0.25F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[62].setRotationPoint(15.95F, -0.25F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 458
		bodyModel[63].setRotationPoint(11.95F, 0.25F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 459
		bodyModel[64].setRotationPoint(15.35F, 3.25F, 8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 460
		bodyModel[65].setRotationPoint(16.55F, 3.25F, 8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 462
		bodyModel[66].setRotationPoint(13.95F, 4.75F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 504
		bodyModel[67].setRotationPoint(20.95F, 0.25F, 6.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 505
		bodyModel[68].setRotationPoint(20.95F, 0.25F, 8.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 510
		bodyModel[69].setRotationPoint(11.95F, 0.25F, 8.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 511
		bodyModel[70].setRotationPoint(11.95F, 0.25F, 6.75F);

		bodyModel[71].addBox(0F, 0F, 0F, 34, 2, 8, 0F); // Box 545
		bodyModel[71].setRotationPoint(-17F, 3F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 546
		bodyModel[72].setRotationPoint(0.949999999999999F, 2F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 452
		bodyModel[73].setRotationPoint(-19.05F, 4.75F, -9F);

		bodyModel[74].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 491
		bodyModel[74].setRotationPoint(6.95F, 7F, -5.95F);

		bodyModel[75].addBox(-6F, -6F, 0F, 9, 9, 0, 0F); // Box 506
		bodyModel[75].setRotationPoint(17.95F, 7F, -5.95F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 469
		bodyModel[76].setRotationPoint(4.35F, 3.25F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 470
		bodyModel[77].setRotationPoint(5.55F, 3.25F, 8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[78].setRotationPoint(4.95F, -0.25F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[79].setRotationPoint(5.95F, 0.25F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 473
		bodyModel[80].setRotationPoint(0.949999999999999F, 0.25F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 477
		bodyModel[81].setRotationPoint(2.95F, 4.75F, 7F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 478
		bodyModel[82].setRotationPoint(2.45F, 7.75F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 479
		bodyModel[83].setRotationPoint(6.95F, 4.75F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 484
		bodyModel[84].setRotationPoint(-6.65F, 3.25F, 8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 485
		bodyModel[85].setRotationPoint(-5.45F, 3.25F, 8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[86].setRotationPoint(-6.05F, -0.25F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[87].setRotationPoint(-5.05F, 0.25F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 488
		bodyModel[88].setRotationPoint(-10.05F, 0.25F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 492
		bodyModel[89].setRotationPoint(-8.05F, 4.75F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 493
		bodyModel[90].setRotationPoint(-8.55F, 7.75F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 494
		bodyModel[91].setRotationPoint(-4.05F, 4.75F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 499
		bodyModel[92].setRotationPoint(-17.65F, 3.25F, 8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 500
		bodyModel[93].setRotationPoint(-16.45F, 3.25F, 8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[94].setRotationPoint(-17.05F, -0.25F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[95].setRotationPoint(-16.05F, 0.25F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 503
		bodyModel[96].setRotationPoint(-21.05F, 0.25F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 507
		bodyModel[97].setRotationPoint(-19.05F, 4.75F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Box 508
		bodyModel[98].setRotationPoint(-19.55F, 7.75F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 509
		bodyModel[99].setRotationPoint(-15.05F, 4.75F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 454
		bodyModel[100].setRotationPoint(-21.05F, 0.25F, 6.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 455
		bodyModel[101].setRotationPoint(-21.05F, 0.25F, 8.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 464
		bodyModel[102].setRotationPoint(-12.05F, 0.25F, 6.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 465
		bodyModel[103].setRotationPoint(-12.05F, 0.25F, 8.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 474
		bodyModel[104].setRotationPoint(-1.05F, 0.25F, 6.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 475
		bodyModel[105].setRotationPoint(-1.05F, 0.25F, 8.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 489
		bodyModel[106].setRotationPoint(9.95F, 0.25F, 6.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 490
		bodyModel[107].setRotationPoint(9.95F, 0.25F, 8.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 495
		bodyModel[108].setRotationPoint(0.949999999999999F, 0.25F, 8.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 496
		bodyModel[109].setRotationPoint(0.949999999999999F, 0.25F, 6.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 110
		bodyModel[110].setRotationPoint(-10.05F, 0.25F, 8.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 111
		bodyModel[111].setRotationPoint(-10.05F, 0.25F, 6.75F);
	}
}