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

public class VertAPacAutorack extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public VertAPacAutorack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[195];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // box
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // box
		bodyModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // box
		bodyModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // box
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 57
		bodyModel[44] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 58
		bodyModel[45] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 62
		bodyModel[49] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 64
		bodyModel[51] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 65
		bodyModel[52] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 66
		bodyModel[53] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 68
		bodyModel[55] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 69
		bodyModel[56] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 72
		bodyModel[59] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 75
		bodyModel[61] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 76
		bodyModel[62] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 77
		bodyModel[63] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 87
		bodyModel[69] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 89
		bodyModel[71] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 92
		bodyModel[73] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 94
		bodyModel[74] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 95
		bodyModel[75] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 97
		bodyModel[76] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 99
		bodyModel[77] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 100
		bodyModel[78] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 101
		bodyModel[79] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 104
		bodyModel[81] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 105
		bodyModel[82] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 108
		bodyModel[85] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 109
		bodyModel[86] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 110
		bodyModel[87] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 111
		bodyModel[88] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 112
		bodyModel[89] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 113
		bodyModel[90] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 114
		bodyModel[91] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 115
		bodyModel[92] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 116
		bodyModel[93] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 117
		bodyModel[94] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 118
		bodyModel[95] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 294
		bodyModel[96] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 295
		bodyModel[97] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 296
		bodyModel[98] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 297
		bodyModel[99] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 298
		bodyModel[100] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 299
		bodyModel[101] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 300
		bodyModel[102] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 301
		bodyModel[103] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 321
		bodyModel[104] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 322
		bodyModel[105] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 323
		bodyModel[106] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 324
		bodyModel[107] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 325
		bodyModel[108] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 326
		bodyModel[109] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 426
		bodyModel[110] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 427
		bodyModel[111] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 428
		bodyModel[112] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 429
		bodyModel[113] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 430
		bodyModel[114] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 431
		bodyModel[115] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 680
		bodyModel[116] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 490
		bodyModel[117] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 125
		bodyModel[126] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 126
		bodyModel[127] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 127
		bodyModel[128] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 972
		bodyModel[130] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 973
		bodyModel[131] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 134
		bodyModel[132] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 135
		bodyModel[133] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 136
		bodyModel[134] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 137
		bodyModel[135] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 139
		bodyModel[136] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 141
		bodyModel[137] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 142
		bodyModel[138] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 143
		bodyModel[139] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 144
		bodyModel[140] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 145
		bodyModel[141] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 146
		bodyModel[142] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 147
		bodyModel[143] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 148
		bodyModel[144] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 149
		bodyModel[145] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 150
		bodyModel[146] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 151
		bodyModel[147] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 152
		bodyModel[148] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 153
		bodyModel[149] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 154
		bodyModel[150] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 155
		bodyModel[151] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 156
		bodyModel[152] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 157
		bodyModel[153] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 158
		bodyModel[154] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 159
		bodyModel[155] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 160
		bodyModel[156] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 161
		bodyModel[157] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 162
		bodyModel[158] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 163
		bodyModel[159] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 164
		bodyModel[160] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 165
		bodyModel[161] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 166
		bodyModel[162] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 167
		bodyModel[163] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 168
		bodyModel[164] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 169
		bodyModel[165] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 170
		bodyModel[166] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 171
		bodyModel[167] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 172
		bodyModel[168] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 173
		bodyModel[169] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 174
		bodyModel[170] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 175
		bodyModel[171] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 176
		bodyModel[172] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 177
		bodyModel[173] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 178
		bodyModel[174] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 179
		bodyModel[175] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 180
		bodyModel[176] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 181
		bodyModel[177] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 182
		bodyModel[178] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 183
		bodyModel[179] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 184
		bodyModel[180] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 185
		bodyModel[181] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 186
		bodyModel[182] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 187
		bodyModel[183] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 188
		bodyModel[184] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 33
		bodyModel[185] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 33
		bodyModel[186] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 33
		bodyModel[187] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 33
		bodyModel[188] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 151
		bodyModel[189] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 194
		bodyModel[190] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 195
		bodyModel[191] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 196
		bodyModel[192] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 197
		bodyModel[193] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 195
		bodyModel[194] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 196

		bodyModel[0].addBox(0F, 0F, 0F, 187, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-93.5F, 3F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // box
		bodyModel[1].setRotationPoint(-96.5F, 3.5F, -0.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[2].setRotationPoint(-97.5F, 3F, -0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[3].setRotationPoint(-97.5F, 3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[4].setRotationPoint(-99.5F, 3F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[5].setRotationPoint(-98.5F, 3F, 0.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 187, 1, 10, 0F); // Box 6
		bodyModel[6].setRotationPoint(-93.5F, 4F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 187, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-93.5F, 3F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 187, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		bodyModel[8].setRotationPoint(-93.5F, 3F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 10
		bodyModel[9].setRotationPoint(-94.5F, 3F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(93.5F, 3F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 13
		bodyModel[11].setRotationPoint(93.5F, 3F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyModel[12].setRotationPoint(-87.5F, 4F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-87.5F, 5F, 2F);

		bodyModel[14].addBox(0F, 0F, 0F, 97, 3, 4, 0F); // Box 18
		bodyModel[14].setRotationPoint(-48.4F, 5F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 19
		bodyModel[15].setRotationPoint(-58.4F, 5F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(48.6F, 5F, -2F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 28
		bodyModel[17].setRotationPoint(-87.5F, 5F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 29
		bodyModel[18].setRotationPoint(-87.5F, 4F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(-87.5F, 4F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[20].setRotationPoint(-87.5F, 5F, -10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 32
		bodyModel[21].setRotationPoint(-95.5F, 2.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 33
		bodyModel[22].setRotationPoint(-77.5F, 5F, 2F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 34
		bodyModel[23].setRotationPoint(-77.5F, 4F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[24].setRotationPoint(-77.5F, 4F, -11F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 36
		bodyModel[25].setRotationPoint(-77.5F, 5F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[26].setRotationPoint(-77.5F, 5F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[27].setRotationPoint(-77.5F, 4F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 39
		bodyModel[28].setRotationPoint(-58.5F, 5F, 2F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 40
		bodyModel[29].setRotationPoint(-58.5F, 4F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-58.5F, 4F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 42
		bodyModel[31].setRotationPoint(-58.5F, 5F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-58.5F, 5F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 44
		bodyModel[33].setRotationPoint(-58.5F, 4F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 45
		bodyModel[34].setRotationPoint(-48.5F, 5F, 2F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 46
		bodyModel[35].setRotationPoint(-48.5F, 4F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[36].setRotationPoint(-48.5F, 5F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[37].setRotationPoint(47.5F, 5F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 52
		bodyModel[38].setRotationPoint(47.5F, 4F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[39].setRotationPoint(47.5F, 4F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 54
		bodyModel[40].setRotationPoint(57.5F, 4F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[41].setRotationPoint(57.5F, 4F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[42].setRotationPoint(57.5F, 5F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 57
		bodyModel[43].setRotationPoint(57.5F, 5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[44].setRotationPoint(76.5F, 4F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 59
		bodyModel[45].setRotationPoint(76.5F, 4F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[46].setRotationPoint(76.5F, 5F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 61
		bodyModel[47].setRotationPoint(76.5F, 5F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 62
		bodyModel[48].setRotationPoint(86.5F, 5F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[49].setRotationPoint(86.5F, 5F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[50].setRotationPoint(86.5F, 4F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 65
		bodyModel[51].setRotationPoint(86.5F, 4F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 66
		bodyModel[52].setRotationPoint(47.5F, 5F, 2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 67
		bodyModel[53].setRotationPoint(47.5F, 4F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 68
		bodyModel[54].setRotationPoint(57.5F, 5F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69
		bodyModel[55].setRotationPoint(57.5F, 4F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 70
		bodyModel[56].setRotationPoint(76.5F, 5F, 2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 71
		bodyModel[57].setRotationPoint(76.5F, 4F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 72
		bodyModel[58].setRotationPoint(86.5F, 5F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[59].setRotationPoint(86.5F, 4F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[60].setRotationPoint(37.5F, 5F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 76
		bodyModel[61].setRotationPoint(37.5F, 4F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 77
		bodyModel[62].setRotationPoint(37.5F, 5F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[63].setRotationPoint(27.5F, 5F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 81
		bodyModel[64].setRotationPoint(27.5F, 4F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 82
		bodyModel[65].setRotationPoint(27.5F, 5F, 2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[66].setRotationPoint(17.5F, 5F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 86
		bodyModel[67].setRotationPoint(17.5F, 4F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 87
		bodyModel[68].setRotationPoint(17.5F, 5F, 2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		bodyModel[69].setRotationPoint(17.5F, 4F, 10F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 89
		bodyModel[70].setRotationPoint(-38.5F, 4F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[71].setRotationPoint(-38.5F, 5F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 92
		bodyModel[72].setRotationPoint(-38.5F, 5F, 2F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 94
		bodyModel[73].setRotationPoint(-28.5F, 4F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[74].setRotationPoint(-28.5F, 5F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 97
		bodyModel[75].setRotationPoint(-28.5F, 5F, 2F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 99
		bodyModel[76].setRotationPoint(-18.5F, 4F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[77].setRotationPoint(-18.5F, 5F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[78].setRotationPoint(-18.5F, 4F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 102
		bodyModel[79].setRotationPoint(-18.5F, 5F, 2F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 104
		bodyModel[80].setRotationPoint(-8.5F, 4F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[81].setRotationPoint(-8.5F, 5F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[82].setRotationPoint(-8.5F, 4F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 107
		bodyModel[83].setRotationPoint(-8.5F, 5F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 108
		bodyModel[84].setRotationPoint(-8.5F, 4F, 10F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 109
		bodyModel[85].setRotationPoint(7.5F, 4F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[86].setRotationPoint(7.5F, 5F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[87].setRotationPoint(7.5F, 4F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 112
		bodyModel[88].setRotationPoint(7.5F, 5F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[89].setRotationPoint(7.5F, 4F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 114
		bodyModel[90].setRotationPoint(-0.5F, 4F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[91].setRotationPoint(-0.5F, 5F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[92].setRotationPoint(-0.5F, 4F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 117
		bodyModel[93].setRotationPoint(-0.5F, 5F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 118
		bodyModel[94].setRotationPoint(-0.5F, 4F, 10F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 294
		bodyModel[95].setRotationPoint(94.5F, 2.5F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 295
		bodyModel[96].setRotationPoint(95.5F, 3.5F, -0.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 296
		bodyModel[97].setRotationPoint(96.5F, 3F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 297
		bodyModel[98].setRotationPoint(96.5F, 3F, 0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[99].setRotationPoint(98.5F, 3F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 299
		bodyModel[100].setRotationPoint(97.5F, 3F, -1.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 300
		bodyModel[101].setRotationPoint(67F, 5F, -1F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 301
		bodyModel[102].setRotationPoint(-69F, 5F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 321
		bodyModel[103].setRotationPoint(90.5F, 5F, -10.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 322
		bodyModel[104].setRotationPoint(90F, 3.5F, -10.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[105].setRotationPoint(94F, 3.5F, -10.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 324
		bodyModel[106].setRotationPoint(-91F, 3.5F, 9.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 325
		bodyModel[107].setRotationPoint(-94.5F, 5F, 9.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 326
		bodyModel[108].setRotationPoint(-95F, 3.5F, 9.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 426
		bodyModel[109].setRotationPoint(-94.5F, 3.5F, -10.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 427
		bodyModel[110].setRotationPoint(-90.5F, 3.5F, -10.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 428
		bodyModel[111].setRotationPoint(-94F, 5F, -10.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 429
		bodyModel[112].setRotationPoint(93.5F, 3.5F, 9.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 430
		bodyModel[113].setRotationPoint(90F, 5F, 9.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 431
		bodyModel[114].setRotationPoint(89.5F, 3.5F, 9.75F);

		bodyModel[115].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 680
		bodyModel[115].setRotationPoint(-94.5F, 3.25F, -3F);
		bodyModel[115].rotateAngleZ = -0.01745329F;

		bodyModel[116].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 490
		bodyModel[116].setRotationPoint(94.5F, 3.25F, 2F);
		bodyModel[116].rotateAngleZ = 0.01745329F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 117
		bodyModel[117].setRotationPoint(-48.5F, 4F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 118
		bodyModel[118].setRotationPoint(-38.5F, 4F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 119
		bodyModel[119].setRotationPoint(-28.5F, 4F, 10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 120
		bodyModel[120].setRotationPoint(-18.5F, 4F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 121
		bodyModel[121].setRotationPoint(27.5F, 4F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[122].setRotationPoint(37.5F, 4F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(-48.5F, 4F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[124].setRotationPoint(-38.5F, 4F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[125].setRotationPoint(-28.5F, 4F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[126].setRotationPoint(17.5F, 4F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[127].setRotationPoint(27.5F, 4F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(37.5F, 4F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -12F, -1F, 0.5F, -12F, -1F, -1F, 0F, -1F, -1F); // Box 972
		bodyModel[129].setRotationPoint(5.5F, 3.1F, -10.1F);
		bodyModel[129].rotateAngleY = 3.14159265F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 54, 3, 1, 0F,0F, 0F, -0.5F, -18F, 0F, -0.5F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -18F, -1F, 0.5F, -18F, -1F, -1F, 0F, -1F, -1F); // Box 973
		bodyModel[130].setRotationPoint(47.5F, 3.1F, -10.1F);
		bodyModel[130].rotateAngleY = 3.14159265F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 134
		bodyModel[131].setRotationPoint(93.5F, 3F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[132].setRotationPoint(-94.5F, 3F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 136
		bodyModel[133].setRotationPoint(-94.5F, 3F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 195, 25, 22, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 137
		bodyModel[134].setRotationPoint(-97.5F, -22F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 195, 7, 3, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 139
		bodyModel[135].setRotationPoint(-97.5F, -29F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 141
		bodyModel[136].setRotationPoint(-94F, 1F, -11.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 142
		bodyModel[137].setRotationPoint(-94F, -2F, -11.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 143
		bodyModel[138].setRotationPoint(-94F, -5F, -11.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 144
		bodyModel[139].setRotationPoint(-94F, -8F, -11.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[140].setRotationPoint(-90.5F, -5.5F, -11.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		bodyModel[141].setRotationPoint(-94.5F, -5.5F, -11.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[142].setRotationPoint(-95F, -5.5F, -6.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 148
		bodyModel[143].setRotationPoint(-95F, -2F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[144].setRotationPoint(-95F, -5.5F, -10.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[145].setRotationPoint(-95F, 1F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[146].setRotationPoint(-95F, 4F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[147].setRotationPoint(-95F, -5F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[148].setRotationPoint(-95F, -5.5F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[149].setRotationPoint(-95F, -5.5F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 155
		bodyModel[150].setRotationPoint(-95F, -5F, 5.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 156
		bodyModel[151].setRotationPoint(-95F, -2F, 5.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 157
		bodyModel[152].setRotationPoint(-95F, 1F, 5.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[153].setRotationPoint(-95F, 4F, 5.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 159
		bodyModel[154].setRotationPoint(94F, -5F, -9.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 160
		bodyModel[155].setRotationPoint(94F, -5.5F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 161
		bodyModel[156].setRotationPoint(94F, -2F, -9.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 162
		bodyModel[157].setRotationPoint(94F, -5.5F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 163
		bodyModel[158].setRotationPoint(94F, 1F, -9.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 164
		bodyModel[159].setRotationPoint(94F, 4F, -9.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 165
		bodyModel[160].setRotationPoint(94F, -5.5F, 5.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 166
		bodyModel[161].setRotationPoint(94F, -5F, 6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 167
		bodyModel[162].setRotationPoint(94F, -5.5F, 9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 168
		bodyModel[163].setRotationPoint(94F, -2F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 169
		bodyModel[164].setRotationPoint(94F, 1F, 6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 170
		bodyModel[165].setRotationPoint(94F, 4F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 171
		bodyModel[166].setRotationPoint(93.5F, -5.5F, 10.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 172
		bodyModel[167].setRotationPoint(90F, -5F, 10.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		bodyModel[168].setRotationPoint(89.5F, -5.5F, 10.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 174
		bodyModel[169].setRotationPoint(90F, -8F, 10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 175
		bodyModel[170].setRotationPoint(90F, -2F, 10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 176
		bodyModel[171].setRotationPoint(90F, 1F, 10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 177
		bodyModel[172].setRotationPoint(93.5F, -5.5F, -11.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 178
		bodyModel[173].setRotationPoint(90F, -5F, -11.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 179
		bodyModel[174].setRotationPoint(89.5F, -5.5F, -11.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 180
		bodyModel[175].setRotationPoint(90F, -2F, -11.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 181
		bodyModel[176].setRotationPoint(90F, 1F, -11.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 182
		bodyModel[177].setRotationPoint(90F, -8F, -11.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[178].setRotationPoint(-94.5F, -5.5F, 10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 184
		bodyModel[179].setRotationPoint(-94F, -5F, 10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[180].setRotationPoint(-90.5F, -5.5F, 10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 186
		bodyModel[181].setRotationPoint(-94F, -2F, 10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 187
		bodyModel[182].setRotationPoint(-94F, 1F, 10.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[183].setRotationPoint(-94F, -8F, 10.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[184].setRotationPoint(94.5F, -4F, -3.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[185].setRotationPoint(95.5F, -5F, -4.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[186].setRotationPoint(94F, -4.5F, -4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[187].setRotationPoint(94.5F, 1.5F, -4.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 151
		bodyModel[188].setRotationPoint(94.5F, -1.5F, -2.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[189].setRotationPoint(94F, 4F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[190].setRotationPoint(-96.5F, 1.5F, -4.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 195, 7, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 196
		bodyModel[191].setRotationPoint(-97.5F, -29F, 8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 195, 7, 16, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 197
		bodyModel[192].setRotationPoint(-97.5F, -29F, -8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F,0F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -12F, -1F, 0.5F, -12F, -1F, -1F, 0F, -1F, -1F); // Box 195
		bodyModel[193].setRotationPoint(-5.5F, 3.1F, 10.1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 54, 3, 1, 0F,0F, 0F, -0.5F, -18F, 0F, -0.5F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -18F, -1F, 0.5F, -18F, -1F, -1F, 0F, -1F, -1F); // Box 196
		bodyModel[194].setRotationPoint(-47.5F, 3.1F, 10.1F);
	}

	 truck_70ton bogie = new truck_70ton();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);

		Tessellator.bindTexture(new ResourceLocation(Info.modID, "textures/bogies/70ton_truck_black.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(4.225f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(-4.225f,0f,0);
		bogie.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}

}