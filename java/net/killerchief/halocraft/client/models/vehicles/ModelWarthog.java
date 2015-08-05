//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package net.killerchief.halocraft.client.models.vehicles;

import org.lwjgl.opengl.GL11;

import net.killerchief.halocraft.client.models.Model3DBase;
import net.killerchief.halocraft.entities.vehicles.EntityWarthog;
import net.killerchief.turbomodelthingy.ModelRendererTurbo;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWarthog extends Model3DBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelWarthog()
	{
		bodyModel = new ModelRendererTurbo[128];
		bodyModel[0] = new ModelRendererTurbo(this, 121, 47, textureX, textureY); // Import Box1
		bodyModel[1] = new ModelRendererTurbo(this, 182, 64, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 153, 55, textureX, textureY); // Import Box3
		bodyModel[3] = new ModelRendererTurbo(this, 153, 55, textureX, textureY); // Import Box4
		bodyModel[4] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Import Box5
		bodyModel[5] = new ModelRendererTurbo(this, 91, 22, textureX, textureY); // Import Box6
		bodyModel[6] = new ModelRendererTurbo(this, 110, 12, textureX, textureY); // Import Box7
		bodyModel[7] = new ModelRendererTurbo(this, 91, 13, textureX, textureY); // Import Box8
		bodyModel[8] = new ModelRendererTurbo(this, 71, 59, textureX, textureY); // Import Box10
		bodyModel[9] = new ModelRendererTurbo(this, 180, 46, textureX, textureY); // Import Box11
		bodyModel[10] = new ModelRendererTurbo(this, 138, 69, textureX, textureY); // Import Box12
		bodyModel[11] = new ModelRendererTurbo(this, 197, 46, textureX, textureY); // Import Box13
		bodyModel[12] = new ModelRendererTurbo(this, 90, 126, textureX, textureY); // Import Box15
		bodyModel[13] = new ModelRendererTurbo(this, 136, 100, textureX, textureY); // Import Box16
		bodyModel[14] = new ModelRendererTurbo(this, 179, 100, textureX, textureY); // Import Box17
		bodyModel[15] = new ModelRendererTurbo(this, 232, 100, textureX, textureY); // Import Box19
		bodyModel[16] = new ModelRendererTurbo(this, 254, 100, textureX, textureY); // Import Box20
		bodyModel[17] = new ModelRendererTurbo(this, 278, 100, textureX, textureY); // Import Box21
		bodyModel[18] = new ModelRendererTurbo(this, 303, 100, textureX, textureY); // Import Box22
		bodyModel[19] = new ModelRendererTurbo(this, 188, 187, textureX, textureY); // Import Box26
		bodyModel[20] = new ModelRendererTurbo(this, 182, 171, textureX, textureY); // Import Box27
		bodyModel[21] = new ModelRendererTurbo(this, 184, 207, textureX, textureY); // Import Box28
		bodyModel[22] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Import Box24
		bodyModel[23] = new ModelRendererTurbo(this, 227, 208, textureX, textureY); // Import Box25
		bodyModel[24] = new ModelRendererTurbo(this, 233, 226, textureX, textureY); // Import Box26
		bodyModel[25] = new ModelRendererTurbo(this, 244, 244, textureX, textureY); // Import Box27
		bodyModel[26] = new ModelRendererTurbo(this, 55, 126, textureX, textureY); // Import Box28
		bodyModel[27] = new ModelRendererTurbo(this, 381, 56, textureX, textureY); // Import Box29
		bodyModel[28] = new ModelRendererTurbo(this, 128, 376, textureX, textureY); // Import Box30
		bodyModel[29] = new ModelRendererTurbo(this, 445, 70, textureX, textureY); // Import Box32
		bodyModel[30] = new ModelRendererTurbo(this, 84, 411, textureX, textureY); // Import Box33
		bodyModel[31] = new ModelRendererTurbo(this, 320, 323, textureX, textureY); // Import Box34
		bodyModel[32] = new ModelRendererTurbo(this, 410, 421, textureX, textureY); // Import Box35
		bodyModel[33] = new ModelRendererTurbo(this, 338, 420, textureX, textureY); // Import Box36
		bodyModel[34] = new ModelRendererTurbo(this, 347, 118, textureX, textureY); // Import Box37
		bodyModel[35] = new ModelRendererTurbo(this, 302, 61, textureX, textureY); // Import Box38
		bodyModel[36] = new ModelRendererTurbo(this, 296, 192, textureX, textureY); // Import Box44
		bodyModel[37] = new ModelRendererTurbo(this, 294, 172, textureX, textureY); // Import Box45
		bodyModel[38] = new ModelRendererTurbo(this, 258, 126, textureX, textureY); // Import Box48
		bodyModel[39] = new ModelRendererTurbo(this, 141, 126, textureX, textureY); // Import Box52
		bodyModel[40] = new ModelRendererTurbo(this, 92, 61, textureX, textureY); // Import Box53
		bodyModel[41] = new ModelRendererTurbo(this, 138, 69, textureX, textureY); // Import Box54
		bodyModel[42] = new ModelRendererTurbo(this, 169, 45, textureX, textureY); // Import Box55
		bodyModel[43] = new ModelRendererTurbo(this, 159, 48, textureX, textureY); // Import Box56
		bodyModel[44] = new ModelRendererTurbo(this, 91, 376, textureX, textureY); // Import Box57
		bodyModel[45] = new ModelRendererTurbo(this, 54, 412, textureX, textureY); // Import Box58
		bodyModel[46] = new ModelRendererTurbo(this, 443, 55, textureX, textureY); // Import Box59
		bodyModel[47] = new ModelRendererTurbo(this, 90, 100, textureX, textureY); // Import Box60
		bodyModel[48] = new ModelRendererTurbo(this, 56, 100, textureX, textureY); // Import Box61
		bodyModel[49] = new ModelRendererTurbo(this, 306, 126, textureX, textureY); // Import Box59
		bodyModel[50] = new ModelRendererTurbo(this, 297, 213, textureX, textureY); // Import Box60
		bodyModel[51] = new ModelRendererTurbo(this, 301, 235, textureX, textureY); // Import Box61
		bodyModel[52] = new ModelRendererTurbo(this, 281, 126, textureX, textureY); // Import Box62
		bodyModel[53] = new ModelRendererTurbo(this, 238, 283, textureX, textureY); // Import Box63
		bodyModel[54] = new ModelRendererTurbo(this, 221, 311, textureX, textureY); // Import Box64
		bodyModel[55] = new ModelRendererTurbo(this, 345, 276, textureX, textureY); // Import Box65
		bodyModel[56] = new ModelRendererTurbo(this, 303, 361, textureX, textureY); // Import Box66
		bodyModel[57] = new ModelRendererTurbo(this, 187, 360, textureX, textureY); // Import Box67
		bodyModel[58] = new ModelRendererTurbo(this, 383, 126, textureX, textureY); // Import Box68
		bodyModel[59] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Import Box69
		bodyModel[60] = new ModelRendererTurbo(this, 44, 70, textureX, textureY); // Import Box71
		bodyModel[61] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box94
		bodyModel[62] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box95
		bodyModel[63] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box96
		bodyModel[64] = new ModelRendererTurbo(this, 126, 259, textureX, textureY); // Import Box99
		bodyModel[65] = new ModelRendererTurbo(this, 126, 259, textureX, textureY); // Import Box100
		bodyModel[66] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box101
		bodyModel[67] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box102
		bodyModel[68] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box103
		bodyModel[69] = new ModelRendererTurbo(this, 126, 259, textureX, textureY); // Import Box146
		bodyModel[70] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box147
		bodyModel[71] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box148
		bodyModel[72] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box149
		bodyModel[73] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box152
		bodyModel[74] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box153
		bodyModel[75] = new ModelRendererTurbo(this, 126, 273, textureX, textureY); // Import Box154
		bodyModel[76] = new ModelRendererTurbo(this, 126, 259, textureX, textureY); // Import Box177
		bodyModel[77] = new ModelRendererTurbo(this, 362, 18, textureX, textureY); // Import Box178
		bodyModel[78] = new ModelRendererTurbo(this, 364, 11, textureX, textureY); // Import Box179
		bodyModel[79] = new ModelRendererTurbo(this, 385, 11, textureX, textureY); // Import Box180
		bodyModel[80] = new ModelRendererTurbo(this, 313, 4, textureX, textureY); // Import Box181
		bodyModel[81] = new ModelRendererTurbo(this, 312, 4, textureX, textureY); // Import Box182
		bodyModel[82] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box183
		bodyModel[83] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box184
		bodyModel[84] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box185
		bodyModel[85] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box186
		bodyModel[86] = new ModelRendererTurbo(this, 22, 108, textureX, textureY); // Import Box187
		bodyModel[87] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box188
		bodyModel[88] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box189
		bodyModel[89] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box190
		bodyModel[90] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box191
		bodyModel[91] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box192
		bodyModel[92] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box193
		bodyModel[93] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box194
		bodyModel[94] = new ModelRendererTurbo(this, 17, 106, textureX, textureY); // Import Box195
		bodyModel[95] = new ModelRendererTurbo(this, 67, 330, textureX, textureY); // Import Box196
		bodyModel[96] = new ModelRendererTurbo(this, 147, 324, textureX, textureY); // Import Box197
		bodyModel[97] = new ModelRendererTurbo(this, 111, 331, textureX, textureY); // Import Box198
		bodyModel[98] = new ModelRendererTurbo(this, 14, 332, textureX, textureY); // Import Box200
		bodyModel[99] = new ModelRendererTurbo(this, 12, 368, textureX, textureY); // Import Box202
		bodyModel[100] = new ModelRendererTurbo(this, 378, 227, textureX, textureY); // Import Box203
		bodyModel[101] = new ModelRendererTurbo(this, 373, 180, textureX, textureY); // Import Box204
		bodyModel[102] = new ModelRendererTurbo(this, 100, 173, textureX, textureY); // Import Box205
		bodyModel[103] = new ModelRendererTurbo(this, 100, 149, textureX, textureY); // Import Box206
		bodyModel[104] = new ModelRendererTurbo(this, 92, 147, textureX, textureY); // Import Box207
		bodyModel[105] = new ModelRendererTurbo(this, 181, 126, textureX, textureY); // Import Box0
		bodyModel[106] = new ModelRendererTurbo(this, 209, 126, textureX, textureY); // Import Box1
		bodyModel[107] = new ModelRendererTurbo(this, 237, 126, textureX, textureY); // Import Box2
		bodyModel[108] = new ModelRendererTurbo(this, 100, 173, textureX, textureY); // Import Box3
		bodyModel[109] = new ModelRendererTurbo(this, 100, 149, textureX, textureY); // Import Box4
		bodyModel[110] = new ModelRendererTurbo(this, 92, 147, textureX, textureY); // Import Box5
		bodyModel[111] = new ModelRendererTurbo(this, 141, 19, textureX, textureY); // Import Box10
		bodyModel[112] = new ModelRendererTurbo(this, 138, 16, textureX, textureY); // Import Box11
		bodyModel[113] = new ModelRendererTurbo(this, 436, 482, textureX, textureY); // Import Box12
		bodyModel[114] = new ModelRendererTurbo(this, 204, 100, textureX, textureY); // Import Box194
		bodyModel[115] = new ModelRendererTurbo(this, 68, 369, textureX, textureY); // Import Box199
		bodyModel[116] = new ModelRendererTurbo(this, 57, 381, textureX, textureY); // Import Box200
		bodyModel[117] = new ModelRendererTurbo(this, 10, 444, textureX, textureY); // Import Box201
		bodyModel[118] = new ModelRendererTurbo(this, 33, 453, textureX, textureY); // Import Box202
		bodyModel[119] = new ModelRendererTurbo(this, 25, 429, textureX, textureY); // Import Box204
		bodyModel[120] = new ModelRendererTurbo(this, 30, 442, textureX, textureY); // Import Box206
		bodyModel[121] = new ModelRendererTurbo(this, 29, 311, textureX, textureY); // Import Box207
		bodyModel[122] = new ModelRendererTurbo(this, 40, 302, textureX, textureY); // Import Box208
		bodyModel[123] = new ModelRendererTurbo(this, 41, 310, textureX, textureY); // Import Box209
		bodyModel[124] = new ModelRendererTurbo(this, 28, 298, textureX, textureY); // Import Box210
		bodyModel[125] = new ModelRendererTurbo(this, 81, 315, textureX, textureY); // Import Box211
		bodyModel[126] = new ModelRendererTurbo(this, 436, 482, textureX, textureY); // Import Box212
		bodyModel[127] = new ModelRendererTurbo(this, 436, 482, textureX, textureY); // Import Box213

		bodyModel[0].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Import Box1
		bodyModel[0].setRotationPoint(-5F, -36F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F); // Import Box2
		bodyModel[1].setRotationPoint(-8F, -36F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[2].setRotationPoint(-10F, -36F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box4
		bodyModel[3].setRotationPoint(8F, -36F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[4].setRotationPoint(8F, -37F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[5].setRotationPoint(10F, -37F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[6].setRotationPoint(8F, -37F, 4.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[7].setRotationPoint(10F, -37F, 4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 4F, 5F, 0F, 4F, 5F, 0F, -4F, -4F, 0F, -4F); // Import Box10
		bodyModel[8].setRotationPoint(8F, -35F, -12.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box11
		bodyModel[9].setRotationPoint(8F, -36F, -12.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, -4F, 19F, 0F, -4F); // Import Box12
		bodyModel[10].setRotationPoint(-10F, -35F, -12.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		bodyModel[11].setRotationPoint(-10F, -36F, -12.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		bodyModel[12].setRotationPoint(-38F, -27F, 14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 1F, 0F, 11F, -5F, 0F, 0F, 0F); // Import Box16
		bodyModel[13].setRotationPoint(-23F, -27F, -21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 15, 2, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, -2F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -6F, 3F, 0F, -6F, 4F); // Import Box17
		bodyModel[14].setRotationPoint(-12F, -27F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,0F, -4F, 2F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -4F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 5F, 0F, 2F, 3F, 0F, 3F); // Import Box19
		bodyModel[15].setRotationPoint(6F, -27F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -5F, 0F, 4F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[16].setRotationPoint(12F, -28F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 16, 2, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, 5F, 0F, 4F, -7F, -8F, 4F, 3F, -7F, 2F, 5F, 0F, -4F); // Import Box21
		bodyModel[17].setRotationPoint(18F, -28F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3F, 0F, -2F, 0F, 1F, 6F, 6F, 0F, 6F, 3F); // Import Box22
		bodyModel[18].setRotationPoint(26F, -28F, -18F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[19].setRotationPoint(25F, -28F, -17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[20].setRotationPoint(15F, -28F, -17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 6F, 0F, -1F, 8F, -6F); // Import Box28
		bodyModel[21].setRotationPoint(34F, -28F, -18F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, 3F, 0F, 0F, 4F, 0F); // Import Box24
		bodyModel[22].setRotationPoint(41F, -26F, -14F);

		bodyModel[23].addBox(0F, 0F, 0F, 19, 2, 10, 0F); // Import Box25
		bodyModel[23].setRotationPoint(15F, -30F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 2, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[24].setRotationPoint(34F, -30F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F); // Import Box27
		bodyModel[25].setRotationPoint(41F, -26F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box28
		bodyModel[26].setRotationPoint(-46F, -27F, 14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 8, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Import Box29
		bodyModel[27].setRotationPoint(-46F, -27F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box30
		bodyModel[28].setRotationPoint(-47F, -27F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box32
		bodyModel[29].setRotationPoint(-47F, -27F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -2F, 0F, 0F); // Import Box33
		bodyModel[30].setRotationPoint(-47F, -23F, -16F);

		bodyModel[31].addBox(0F, 0F, 0F, 25, 2, 26, 0F); // Import Box34
		bodyModel[31].setRotationPoint(-40F, -21F, -13F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 25, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box35
		bodyModel[32].setRotationPoint(-40F, -27F, -15F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 25, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box36
		bodyModel[33].setRotationPoint(-40F, -27F, 13F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 6, 29, 0F); // Import Box37
		bodyModel[34].setRotationPoint(-15F, -27F, -14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 28, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[35].setRotationPoint(-46F, -30F, -14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		bodyModel[36].setRotationPoint(25F, -28F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box45
		bodyModel[37].setRotationPoint(15F, -28F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 4F, 0F, 0F, 4F); // Import Box48
		bodyModel[38].setRotationPoint(12F, -28F, 15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 11F, -5F, 0F, 11F, 1F, 0F, 0F, 0F); // Import Box52
		bodyModel[39].setRotationPoint(-23F, -27F, 14F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 4F, -4F, 0F, 4F); // Import Box53
		bodyModel[40].setRotationPoint(8F, -35F, 9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 19F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 4F, 21F, 0F, 4F); // Import Box54
		bodyModel[41].setRotationPoint(-10F, -35F, 9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box55
		bodyModel[42].setRotationPoint(8F, -36F, 9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[43].setRotationPoint(-10F, -36F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F); // Import Box57
		bodyModel[44].setRotationPoint(-47F, -27F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -2F, 0F, -3F); // Import Box58
		bodyModel[45].setRotationPoint(-47F, -23F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Import Box59
		bodyModel[46].setRotationPoint(-47F, -27F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		bodyModel[47].setRotationPoint(-38F, -27F, -21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyModel[48].setRotationPoint(-46F, -27F, -21F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 6F, 3F, 1F, 6F, 6F, 0F, -2F, 0F, 2F, 0F, 3F); // Import Box59
		bodyModel[49].setRotationPoint(26F, -28F, 17F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 2, 13, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, -1F, 8F, -6F, 0F, 6F, 0F, 0F, 2F, -4F, 0F, 0F, 0F); // Import Box60
		bodyModel[50].setRotationPoint(34F, -28F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 2F, -6F, 0F, 0F, 0F); // Import Box61
		bodyModel[51].setRotationPoint(41F, -26F, 5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 4F, 0F, 0F, 0F, 5F, 0F, -4F, 3F, -7F, 2F, -7F, -8F, 4F, 5F, 0F, 4F); // Import Box62
		bodyModel[52].setRotationPoint(18F, -28F, 15F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 6F); // Import Box63
		bodyModel[53].setRotationPoint(35F, -20F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Import Box64
		bodyModel[54].setRotationPoint(23F, -20F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 15, 1, 38, 0F,0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, 0F, 0F); // Import Box65
		bodyModel[55].setRotationPoint(13F, -13F, -19F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 30, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -6F, 0F, -9F); // Import Box66
		bodyModel[56].setRotationPoint(-45F, -19F, -13F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 25, 2, 42, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 2F); // Import Box67
		bodyModel[57].setRotationPoint(-12F, -12F, -21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 38, 0F,0F, 7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -3F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F); // Import Box68
		bodyModel[58].setRotationPoint(-19F, -13F, -19F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		bodyModel[59].setRotationPoint(30F, -32F, 1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box71
		bodyModel[60].setRotationPoint(29F, -32F, 1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box94
		bodyModel[61].setRotationPoint(29.2F, -8F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box95
		bodyModel[62].setRotationPoint(29.2F, -13F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Import Box96
		bodyModel[63].setRotationPoint(28.2F, -11F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F); // Import Box99
		bodyModel[64].setRotationPoint(12.2F, -16F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F); // Import Box100
		bodyModel[65].setRotationPoint(12.2F, -16F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box101
		bodyModel[66].setRotationPoint(29.2F, -13F, 3F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Import Box102
		bodyModel[67].setRotationPoint(28.2F, -11F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box103
		bodyModel[68].setRotationPoint(29.2F, -8F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F, 0F); // Import Box146
		bodyModel[69].setRotationPoint(-28.8F, -16F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box147
		bodyModel[70].setRotationPoint(-35.8F, -8F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Import Box148
		bodyModel[71].setRotationPoint(-36.8F, -11F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box149
		bodyModel[72].setRotationPoint(-35.8F, -13F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box152
		bodyModel[73].setRotationPoint(-35.8F, -13F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 8, 3, 5, 0F); // Import Box153
		bodyModel[74].setRotationPoint(-36.8F, -11F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box154
		bodyModel[75].setRotationPoint(-35.8F, -8F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 5F, 0F); // Import Box177
		bodyModel[76].setRotationPoint(-28.8F, -16F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box178
		bodyModel[77].setRotationPoint(-48F, -17F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box179
		bodyModel[78].setRotationPoint(-48F, -17F, 5F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 2, 28, 0F); // Import Box180
		bodyModel[79].setRotationPoint(-50F, -17F, -14F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 28, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		bodyModel[80].setRotationPoint(-50F, -18F, -14F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box182
		bodyModel[81].setRotationPoint(-50F, -15F, -14F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		bodyModel[82].setRotationPoint(42F, -19.5F, -6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box184
		bodyModel[83].setRotationPoint(42F, -17.5F, -6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box185
		bodyModel[84].setRotationPoint(40F, -19.5F, -6.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box186
		bodyModel[85].setRotationPoint(40F, -17.5F, -6.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Import Box187
		bodyModel[86].setRotationPoint(40.5F, -17.5F, -7.5F);
		bodyModel[86].rotateAngleZ = 0.57595865F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box188
		bodyModel[87].setRotationPoint(37F, -20.5F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		bodyModel[88].setRotationPoint(45F, -16.5F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F); // Import Box190
		bodyModel[89].setRotationPoint(46F, -16.5F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F); // Import Box191
		bodyModel[90].setRotationPoint(46F, -18.5F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box192
		bodyModel[91].setRotationPoint(37F, -20.5F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F); // Import Box193
		bodyModel[92].setRotationPoint(46F, -16.5F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F); // Import Box194
		bodyModel[93].setRotationPoint(46F, -18.5F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[94].setRotationPoint(45F, -16.5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 11, 9, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box196
		bodyModel[95].setRotationPoint(-4F, -21F, -3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 12, 6, 0F,0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 8F, 0F, 2F, 8F, 0F, 2F, 0F, 0F, 2F); // Import Box197
		bodyModel[96].setRotationPoint(7F, -24F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 9, 6, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box198
		bodyModel[97].setRotationPoint(-12F, -21F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Import Box200
		bodyModel[98].setRotationPoint(12F, -29F, -14F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 3, 30, 0F); // Import Box202
		bodyModel[99].setRotationPoint(11F, -27F, -15F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box203
		bodyModel[100].setRotationPoint(12F, -24F, -15F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 10, 1, 37, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		bodyModel[101].setRotationPoint(6F, -15F, -18F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F); // Import Box205
		bodyModel[102].setRotationPoint(-4F, -19F, -13F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		bodyModel[103].setRotationPoint(-11F, -26F, -13F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		bodyModel[104].setRotationPoint(-11F, -28F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 15, 2, 0F,0F, 0F, 1F, 0F, -4F, -2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, -6F, 4F, 0F, -6F, 3F, 0F, 0F, 5F, 0F, 0F, 5F); // Import Box0
		bodyModel[105].setRotationPoint(-12F, -27F, 15F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 5F, -2F, -2F, 4F, 0F, 0F, 2F, 0F, 0F, 3F); // Import Box1
		bodyModel[106].setRotationPoint(-4F, -23F, 17F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 15, 2, 0F,0F, -4F, -2F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, -4F, 2F, 3F, 0F, 3F, 5F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F); // Import Box2
		bodyModel[107].setRotationPoint(6F, -27F, 15F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[108].setRotationPoint(-4F, -19F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[109].setRotationPoint(-11F, -26F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		bodyModel[110].setRotationPoint(-11F, -28F, 6F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box10
		bodyModel[111].setRotationPoint(-44F, -30.5F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box11
		bodyModel[112].setRotationPoint(-44F, -30.5F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Import Box12
		bodyModel[113].setRotationPoint(-44.3F, -33F, -10.7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, -2F, -2F, 4F, 0F, -6F, 5F); // Import Box194
		bodyModel[114].setRotationPoint(-4F, -23F, -19F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box199
		bodyModel[115].setRotationPoint(10F, -27F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		bodyModel[116].setRotationPoint(10F, -27F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box201
		bodyModel[117].setRotationPoint(8F, -26F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Import Box202
		bodyModel[118].setRotationPoint(7F, -27F, 6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		bodyModel[119].setRotationPoint(7F, -28F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box206
		bodyModel[120].setRotationPoint(7F, -24F, 6F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box207
		bodyModel[121].setRotationPoint(-4F, -22F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		bodyModel[122].setRotationPoint(-4F, -22F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box209
		bodyModel[123].setRotationPoint(-4F, -22F, 1F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Import Box210
		bodyModel[124].setRotationPoint(2F, -23F, -2.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Import Box211
		bodyModel[125].setRotationPoint(5F, -35F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.8F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.6F, 0.8F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Import Box212
		bodyModel[126].setRotationPoint(-45.3F, -36F, -10.7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Import Box213
		bodyModel[127].setRotationPoint(-46.7F, -38F, -10.7F);


		bodyDoorOpenModel = new ModelRendererTurbo[7];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 219, 9, textureX, textureY); // Import Lights
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 254, 8, textureX, textureY); // Import Lights
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 253, 17, textureX, textureY); // Import Lights
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 178, 24, textureX, textureY); // Import Lights
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 178, 18, textureX, textureY); // Import Lights
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 193, 27, textureX, textureY); // Import Lights
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 211, 12, textureX, textureY); // Import Lights

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 0, 3, 10, 0F); // Import Lights
		bodyDoorOpenModel[0].setRotationPoint(44.2F, -24F, -5F);

		bodyDoorOpenModel[1].addBox(0F, 0F, 0F, 0, 4, 10, 0F); // Import Lights
		bodyDoorOpenModel[1].setRotationPoint(-47.2F, -27F, -18F);
		bodyDoorOpenModel[1].rotateAngleZ = -0.2443461F;

		bodyDoorOpenModel[2].addBox(0F, 0F, 0F, 0, 4, 10, 0F); // Import Lights
		bodyDoorOpenModel[2].setRotationPoint(-47.2F, -27F, 6F);
		bodyDoorOpenModel[2].rotateAngleZ = -0.2443461F;

		bodyDoorOpenModel[3].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Import Lights
		bodyDoorOpenModel[3].setRotationPoint(12.2F, -37.5F, -9.5F);

		bodyDoorOpenModel[4].addBox(0F, 0F, 0F, 0, 1, 5, 0F); // Import Lights
		bodyDoorOpenModel[4].setRotationPoint(12.2F, -37.5F, 4.5F);

		bodyDoorOpenModel[5].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Import Lights
		bodyDoorOpenModel[5].setRotationPoint(4.9F, -35F, -2F);

		bodyDoorOpenModel[6].addBox(0F, 0F, 0F, 0, 2, 16, 0F); // Import Lights
		bodyDoorOpenModel[6].setRotationPoint(11.8F, -29F, -3.5F);
		bodyDoorOpenModel[6].rotateAngleZ = -0.43633231F;


		frontWheelModel = new ModelRendererTurbo[38];
		frontWheelModel[0] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Wheels
		frontWheelModel[1] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Wheels
		frontWheelModel[2] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Wheels
		frontWheelModel[3] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Wheels
		frontWheelModel[4] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Wheels
		frontWheelModel[5] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Wheels
		frontWheelModel[6] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Wheels
		frontWheelModel[7] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Wheels
		frontWheelModel[8] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Wheels
		frontWheelModel[9] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Wheels
		frontWheelModel[10] = new ModelRendererTurbo(this, 12, 250, textureX, textureY); // Import Wheels
		frontWheelModel[11] = new ModelRendererTurbo(this, 71, 251, textureX, textureY); // Import Wheels
		frontWheelModel[12] = new ModelRendererTurbo(this, 46, 231, textureX, textureY); // Import Wheels
		frontWheelModel[13] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Box200
		frontWheelModel[14] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Box201
		frontWheelModel[15] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Box202
		frontWheelModel[16] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Box203
		frontWheelModel[17] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Box204
		frontWheelModel[18] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Box205
		frontWheelModel[19] = new ModelRendererTurbo(this, 12, 250, textureX, textureY); // Import Box206
		frontWheelModel[20] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Box207
		frontWheelModel[21] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Box208
		frontWheelModel[22] = new ModelRendererTurbo(this, 71, 251, textureX, textureY); // Import Box209
		frontWheelModel[23] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Box210
		frontWheelModel[24] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Box211
		frontWheelModel[25] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Box212
		frontWheelModel[26] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Box213
		frontWheelModel[27] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box214
		frontWheelModel[28] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box215
		frontWheelModel[29] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box216
		frontWheelModel[30] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box217
		frontWheelModel[31] = new ModelRendererTurbo(this, 46, 231, textureX, textureY); // Import Box218
		frontWheelModel[32] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box219
		frontWheelModel[33] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box220
		frontWheelModel[34] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Box221
		frontWheelModel[35] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Box222
		frontWheelModel[36] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box223
		frontWheelModel[37] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Box224

		frontWheelModel[0].addShapeBox(-4F, -9F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[0].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[1].addShapeBox(0F, -9F, 0F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[1].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[2].addShapeBox(4F, -4F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[2].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[3].addShapeBox(4F, 0F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[3].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[4].addShapeBox(0F, 4F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Wheels
		frontWheelModel[4].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[5].addShapeBox(-4F, 4F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[5].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[6].addShapeBox(-10F, 0F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Wheels
		frontWheelModel[6].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[7].addShapeBox(-10F, -4F, 0F, 6, 4, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[7].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[8].addShapeBox(-9F, -9F, 0F, 5, 5, 9, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[8].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[9].addShapeBox(4F, -9F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[9].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[10].addShapeBox(4F, 4F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Import Wheels
		frontWheelModel[10].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[11].addShapeBox(-9F, 4F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Import Wheels
		frontWheelModel[11].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[12].addBox(-4F, -4F, 0F, 8, 8, 1, 0F); // Import Wheels
		frontWheelModel[12].setRotationPoint(33.2F, -9.5F, 23F);

		frontWheelModel[13].addShapeBox(-9F, -9F, -9F, 5, 5, 9, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		frontWheelModel[13].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[14].addShapeBox(-4F, -9F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		frontWheelModel[14].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[15].addShapeBox(0F, -9F, -9F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		frontWheelModel[15].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[16].addShapeBox(4F, -9F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		frontWheelModel[16].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[17].addShapeBox(4F, -4F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		frontWheelModel[17].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[18].addShapeBox(4F, 0F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		frontWheelModel[18].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[19].addShapeBox(4F, 4F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Import Box206
		frontWheelModel[19].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[20].addShapeBox(0F, 4F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box207
		frontWheelModel[20].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[21].addShapeBox(-4F, 4F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box208
		frontWheelModel[21].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[22].addShapeBox(-9F, 4F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Import Box209
		frontWheelModel[22].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[23].addShapeBox(-10F, 0F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box210
		frontWheelModel[23].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[24].addShapeBox(-10F, -4F, -9F, 6, 4, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box211
		frontWheelModel[24].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[25].addShapeBox(-2F, -2F, 4F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		frontWheelModel[25].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[26].addShapeBox(-2F, 0F, 4F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box213
		frontWheelModel[26].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[27].addShapeBox(-5F, -5F, -2F, 5, 5, 4, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box214
		frontWheelModel[27].setRotationPoint(33.2F, -9.5F, -14F);

		frontWheelModel[28].addShapeBox(-5F, 0F, -2F, 5, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F); // Import Box215
		frontWheelModel[28].setRotationPoint(33.2F, -9.5F, -14F);

		frontWheelModel[29].addShapeBox(0F, -5F, -2F, 5, 5, 4, 0F,0F, 0F, 0F, -1F, -1F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		frontWheelModel[29].setRotationPoint(33.2F, -9.5F, -14F);

		frontWheelModel[30].addShapeBox(0F, 0F, -2F, 5, 5, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -4F, 0F, 0F, -3F, 0F); // Import Box217
		frontWheelModel[30].setRotationPoint(33.2F, -9.5F, -14F);

		frontWheelModel[31].addBox(-4F, -4F, -9F, 8, 8, 1, 0F); // Import Box218
		frontWheelModel[31].setRotationPoint(33.2F, -9.5F, -16F);

		frontWheelModel[32].addShapeBox(-5F, -5F, -5F, 5, 5, 4, 0F,-3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box219
		frontWheelModel[32].setRotationPoint(33.2F, -9.5F, 16F);

		frontWheelModel[33].addShapeBox(-5F, 0F, -5F, 5, 5, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Import Box220
		frontWheelModel[33].setRotationPoint(33.2F, -9.5F, 16F);

		frontWheelModel[34].addShapeBox(-2F, -2F, -7F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		frontWheelModel[34].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[35].addShapeBox(-2F, 0F, -7F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box222
		frontWheelModel[35].setRotationPoint(33.2F, -9.5F, 15F);

		frontWheelModel[36].addShapeBox(0F, -5F, -5F, 5, 5, 4, 0F,0F, -3F, 0F, -3F, -4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box223
		frontWheelModel[36].setRotationPoint(33.2F, -9.5F, 16F);

		frontWheelModel[37].addShapeBox(0F, 0F, -5F, 5, 5, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, -3F, -4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Import Box224
		frontWheelModel[37].setRotationPoint(33.2F, -9.5F, 16F);


		backWheelModel = new ModelRendererTurbo[43];
		backWheelModel[0] = new ModelRendererTurbo(this, 46, 231, textureX, textureY); // Import Box214
		backWheelModel[1] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Box215
		backWheelModel[2] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Box216
		backWheelModel[3] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Box217
		backWheelModel[4] = new ModelRendererTurbo(this, 71, 251, textureX, textureY); // Import Box218
		backWheelModel[5] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Wheels
		backWheelModel[6] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Wheels
		backWheelModel[7] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[8] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[9] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[10] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[11] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Wheels
		backWheelModel[12] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Wheels
		backWheelModel[13] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Wheels
		backWheelModel[14] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Wheels
		backWheelModel[15] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Wheels
		backWheelModel[16] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Wheels
		backWheelModel[17] = new ModelRendererTurbo(this, 12, 250, textureX, textureY); // Import Wheels
		backWheelModel[18] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Wheels
		backWheelModel[19] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Wheels
		backWheelModel[20] = new ModelRendererTurbo(this, 71, 251, textureX, textureY); // Import Wheels
		backWheelModel[21] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Wheels
		backWheelModel[22] = new ModelRendererTurbo(this, 46, 231, textureX, textureY); // Import Wheels
		backWheelModel[23] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Wheels
		backWheelModel[24] = new ModelRendererTurbo(this, 46, 231, textureX, textureY); // Import Wheels
		backWheelModel[25] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Wheels
		backWheelModel[26] = new ModelRendererTurbo(this, 76, 231, textureX, textureY); // Import Wheels
		backWheelModel[27] = new ModelRendererTurbo(this, 71, 251, textureX, textureY); // Import Wheels
		backWheelModel[28] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Wheels
		backWheelModel[29] = new ModelRendererTurbo(this, 40, 256, textureX, textureY); // Import Wheels
		backWheelModel[30] = new ModelRendererTurbo(this, 12, 250, textureX, textureY); // Import Wheels
		backWheelModel[31] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Wheels
		backWheelModel[32] = new ModelRendererTurbo(this, 8, 231, textureX, textureY); // Import Wheels
		backWheelModel[33] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Wheels
		backWheelModel[34] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Wheels
		backWheelModel[35] = new ModelRendererTurbo(this, 34, 212, textureX, textureY); // Import Wheels
		backWheelModel[36] = new ModelRendererTurbo(this, 73, 213, textureX, textureY); // Import Wheels
		backWheelModel[37] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[38] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[39] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[40] = new ModelRendererTurbo(this, 44, 275, textureX, textureY); // Import Wheels
		backWheelModel[41] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Wheels
		backWheelModel[42] = new ModelRendererTurbo(this, 69, 274, textureX, textureY); // Import Wheels

		backWheelModel[0].addBox(-4F, -4F, -9F, 8, 8, 1, 0F); // Import Box214
		backWheelModel[0].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[1].addShapeBox(-10F, -4F, -9F, 6, 4, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		backWheelModel[1].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[2].addShapeBox(-10F, 0F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box216
		backWheelModel[2].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[3].addShapeBox(-4F, 4F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box217
		backWheelModel[3].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[4].addShapeBox(-9F, 4F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Import Box218
		backWheelModel[4].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[5].addShapeBox(-2F, -2F, -7F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[5].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[6].addShapeBox(-2F, 0F, -7F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Wheels
		backWheelModel[6].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[7].addShapeBox(-5F, -5F, -5F, 5, 5, 4, 0F,-3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[7].setRotationPoint(-33.8F, -9.5F, 16F);

		backWheelModel[8].addShapeBox(-5F, 0F, -5F, 5, 5, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Import Wheels
		backWheelModel[8].setRotationPoint(-33.8F, -9.5F, 16F);

		backWheelModel[9].addShapeBox(0F, 0F, -5F, 5, 5, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, -3F, -4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[9].setRotationPoint(-33.8F, -9.5F, 16F);

		backWheelModel[10].addShapeBox(0F, -5F, -5F, 5, 5, 4, 0F,0F, -3F, 0F, -3F, -4F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Wheels
		backWheelModel[10].setRotationPoint(-33.8F, -9.5F, 16F);

		backWheelModel[11].addShapeBox(-10F, -4F, 0F, 6, 4, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[11].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[12].addShapeBox(-9F, -9F, 0F, 5, 5, 9, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[12].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[13].addShapeBox(-4F, -9F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[13].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[14].addShapeBox(0F, -9F, 0F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[14].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[15].addShapeBox(4F, -4F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[15].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[16].addShapeBox(4F, 0F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[16].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[17].addShapeBox(4F, 4F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[17].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[18].addShapeBox(0F, 4F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Wheels
		backWheelModel[18].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[19].addShapeBox(-4F, 4F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[19].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[20].addShapeBox(-9F, 4F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Import Wheels
		backWheelModel[20].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[21].addShapeBox(-10F, 0F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Wheels
		backWheelModel[21].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[22].addBox(-4F, -4F, 0F, 8, 8, 1, 0F); // Import Wheels
		backWheelModel[22].setRotationPoint(-33.8F, -9.5F, 23F);

		backWheelModel[23].addShapeBox(4F, -9F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[23].setRotationPoint(-33.8F, -9.5F, 15F);

		backWheelModel[24].addBox(-4F, -4F, -9F, 8, 8, 1, 0F); // Import Wheels
		backWheelModel[24].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[25].addShapeBox(-10F, -4F, -9F, 6, 4, 9, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[25].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[26].addShapeBox(-10F, 0F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Wheels
		backWheelModel[26].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[27].addShapeBox(-9F, 4F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Import Wheels
		backWheelModel[27].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[28].addShapeBox(-4F, 4F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[28].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[29].addShapeBox(0F, 4F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Wheels
		backWheelModel[29].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[30].addShapeBox(4F, 4F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[30].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[31].addShapeBox(4F, 0F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[31].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[32].addShapeBox(4F, -4F, -9F, 6, 4, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[32].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[33].addShapeBox(-4F, -9F, -9F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[33].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[34].addShapeBox(4F, -9F, -9F, 5, 5, 9, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[34].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[35].addShapeBox(0F, -9F, -9F, 4, 5, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[35].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[36].addShapeBox(-9F, -9F, -9F, 5, 5, 9, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[36].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[37].addShapeBox(0F, -5F, -2F, 5, 5, 4, 0F,0F, 0F, 0F, -1F, -1F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[37].setRotationPoint(-33.8F, -9.5F, -14F);

		backWheelModel[38].addShapeBox(0F, 0F, -2F, 5, 5, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -4F, 0F, 0F, -3F, 0F); // Import Wheels
		backWheelModel[38].setRotationPoint(-33.8F, -9.5F, -14F);

		backWheelModel[39].addShapeBox(-5F, -5F, -2F, 5, 5, 4, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Wheels
		backWheelModel[39].setRotationPoint(-33.8F, -9.5F, -14F);

		backWheelModel[40].addShapeBox(-5F, 0F, -2F, 5, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F); // Import Wheels
		backWheelModel[40].setRotationPoint(-33.8F, -9.5F, -14F);

		backWheelModel[41].addShapeBox(-2F, -2F, 4F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Wheels
		backWheelModel[41].setRotationPoint(-33.8F, -9.5F, -16F);

		backWheelModel[42].addShapeBox(-2F, 0F, 4F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Wheels
		backWheelModel[42].setRotationPoint(-33.8F, -9.5F, -16F);


		leftTrackModel = new ModelRendererTurbo[3];
		leftTrackModel[0] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Import Windshield
		leftTrackModel[1] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Import Windshield
		leftTrackModel[2] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Import Windshield

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 21, 8, 11, 0F,0F, -1F, -5F, -22F, -1F, -5F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, -17F, 0F, 0F, 0F, -2F, 0F, -21F, -2F, 0F); // Import Windshield
		leftTrackModel[0].setRotationPoint(10F, -36F, -16F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 21, 8, 10, 0F,0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, -21F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -21F, -2F, 0F); // Import Windshield
		leftTrackModel[1].setRotationPoint(10F, -36F, -5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 21, 8, 11, 0F,0F, 0F, 0F, -22F, 0F, 0F, -22F, -1F, -5F, 0F, -1F, -5F, -21F, -2F, 0F, 0F, -2F, 0F, -17F, 0F, 0F, 0F, -7F, -5F); // Import Windshield
		leftTrackModel[2].setRotationPoint(10F, -36F, 5F);

		//translateAll(0F, 0F, 0F);
		//flipAll();
		
		this.flip(this.bodyModel);
		this.flip(this.bodyDoorOpenModel);
		this.flip(this.frontWheelModel);
		this.flip(this.backWheelModel);
		this.flip(this.leftTrackModel);
	}
	
	@Override
	protected void renderAllParts(Entity entity, float par7)
	{
		if (this.frontWheelModel != null)
		{
			for (ModelRendererTurbo part : this.frontWheelModel)
			{
				if (part != null)
				{
					part.rotateAngleZ = -((EntityWarthog)entity).getRotateWheelSpeed();
				}
			}
		}
		if (this.backWheelModel != null)
		{
			for (ModelRendererTurbo part : this.backWheelModel)
			{
				if (part != null)
				{
					part.rotateAngleZ = -((EntityWarthog)entity).getRotateWheelSpeed();
				}
			}
		}
		
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
		if (this.bodyDoorOpenModel != null || this.leftTrackModel != null)
		{
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_SRC_ALPHA);
		}
		if (this.bodyDoorOpenModel != null)
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
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
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1F);
			for (ModelRendererTurbo part : this.leftTrackModel)
			{
				if (part != null)
				{
					part.render(par7);
				}
			}
		}
	}
}