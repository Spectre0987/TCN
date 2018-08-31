package help;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelControlsTest extends ModelBase {

	ModelRenderer Glow1;
	ModelRenderer Glow2;
	ModelRenderer Glow3;
	ModelRenderer Glow4;
	ModelRenderer Glow5;
	ModelRenderer Glow6;
	ModelRenderer Glow7;
	ModelRenderer DoNotGlow1;
	ModelRenderer DoNotGlow2;
	ModelRenderer DoNotGlow3;
	ModelRenderer DoNotGlow4;
	ModelRenderer DoNotGlow5;
	ModelRenderer DoNotGlow6;
	ModelRenderer DoNotGlow7;
	ModelRenderer DoNotGlow8;
	ModelRenderer DoNotGlow9;
	ModelRenderer DoNotGlow10;
	ModelRenderer Panel2Glow1;
	ModelRenderer Panel2Glow2;
	ModelRenderer Panel2Glow3;
	ModelRenderer Panel2Glow4;
	ModelRenderer Panel2Glow5;
	ModelRenderer Panel2Glow6;
	ModelRenderer Panel2Glow7;
	ModelRenderer Panel2Glow8;
	ModelRenderer Panel2DNG1;
	ModelRenderer Panel2DNG2;
	ModelRenderer Panel2DNG3;
	ModelRenderer Panel2DNG4;
	ModelRenderer Panel2DNG5;
	ModelRenderer Panel2DNG6;
	ModelRenderer Panel2DNG7;
	ModelRenderer Panel2DNG8;
	ModelRenderer Panel2DNG9;
	ModelRenderer Panel2Lever;
	ModelRenderer Panel3Glow1;
	ModelRenderer Panel3Glow2;
	ModelRenderer Panel3Glow3;
	ModelRenderer Panel3Glow4;
	ModelRenderer Panel3Glow5;
	ModelRenderer Panel3Glow6;
	ModelRenderer Panel3Glow7;
	ModelRenderer Panel3Glow8;
	ModelRenderer Panel3Glow9;
	ModelRenderer Panel3Glow10;
	ModelRenderer Panel3DNG1;
	ModelRenderer Panel3DNG2;
	ModelRenderer Panel3DNG3;
	ModelRenderer Panel3DNG4;
	ModelRenderer Panel3DNG5;
	ModelRenderer Panel3DNG6;
	ModelRenderer Panel3DNG7;
	ModelRenderer Panel3DNG8;
	ModelRenderer Panel3DNG9;
	ModelRenderer Panel3DNG10;
	ModelRenderer Panel3DNG11;
	ModelRenderer Panel4Glow1;
	ModelRenderer Panel4Glow2;
	ModelRenderer Panel4Glow3;
	ModelRenderer Panel4Glow4;
	ModelRenderer Panel4DNG1;
	ModelRenderer Panel4DNG2;
	ModelRenderer Panel4DNG3;
	ModelRenderer Panel4DNG4;
	ModelRenderer Panel4DNG5;
	ModelRenderer Panel4DNG6;
	ModelRenderer Panel4DNG7;
	ModelRenderer Panel4DNG8;
	ModelRenderer Panel4DNG9;
	ModelRenderer Panel4DNG10;
	ModelRenderer Panel5Glow1;
	ModelRenderer Panel5Glow2;
	ModelRenderer Panel5Glow3;
	ModelRenderer Panel5Glow4;
	ModelRenderer Panel5Glow5;
	ModelRenderer Panel5Glow6;
	ModelRenderer Panel5Glow7;
	ModelRenderer Panel5DNG1;
	ModelRenderer Panel5DNG2;
	ModelRenderer Panel5DNG3;
	ModelRenderer Panel5DNG4;
	ModelRenderer Panel5DNG5;
	ModelRenderer Panel5DNG6;
	ModelRenderer Panel5DNG7;
	ModelRenderer Panel5DNG8;
	ModelRenderer Panel5DNG9;
	ModelRenderer Panel5DNG10;
	ModelRenderer Panel5DNG11;
	ModelRenderer Panel5DNG12;
	ModelRenderer Panel5DNG13;
	ModelRenderer Panel6DNG1;
	ModelRenderer Panel6DNG2;
	ModelRenderer Panel6DNG3;
	ModelRenderer Panel6DNG4;
	ModelRenderer Panel6DNG5;
	ModelRenderer Panel6DNG6;
	ModelRenderer Panel6DNG7;
	ModelRenderer Panel6DNG8;
	ModelRenderer Panel6DNG9;
	ModelRenderer Panel6DNG10;
	ModelRenderer Panel6DNG11;
	ModelRenderer Panel6DNG12;
	ModelRenderer Panel6DNG13;
	ModelRenderer Panel6DNG14;
	ModelRenderer Panel6DNG15;
	ModelRenderer Panel6DNG16;
	ModelRenderer Panel6DNG17;
	ModelRenderer Panel6DNG18;
	ModelRenderer Panel6DNG19;
	ModelRenderer Panel6DNG20;
	ModelRenderer Panel6DNG21;
	ModelRenderer Panel6DNG22;
	ModelRenderer Panel6DNG23;
	ModelRenderer Panel6DNG24;
	ModelRenderer Panel6Lever;

	public ModelControlsTest() { 

		textureWidth = 80;
		textureHeight = 80;

		Glow1 = new ModelRenderer(this, 0, 0);
		Glow1.addBox(-1.5F, 3.0F, -7.3F, 3, 1, 1);
		Glow1.setTextureSize(80, 80);
		Glow1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow1, -1.0122909661567112F, 0.0F, 0.0F);
		Glow1.mirror = false;

		Glow2 = new ModelRenderer(this, 0, 4);
		Glow2.addBox(-1.5F, 4.5F, -7.3F, 3, 3, 1);
		Glow2.setTextureSize(80, 80);
		Glow2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow2, -1.0122909661567112F, 0.0F, 0.0F);
		Glow2.mirror = false;

		Glow3 = new ModelRenderer(this, 0, 46);
		Glow3.addBox(-2.0F, 8.0F, -7.3F, 1, 1, 1);
		Glow3.setTextureSize(80, 80);
		Glow3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow3, -1.0122909661567112F, 0.0F, 0.0F);
		Glow3.mirror = false;

		Glow4 = new ModelRenderer(this, 0, 43);
		Glow4.addBox(-0.5F, 8.0F, -7.3F, 1, 1, 1);
		Glow4.setTextureSize(80, 80);
		Glow4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow4, -1.0122909661567112F, 0.0F, 0.0F);
		Glow4.mirror = false;

		Glow5 = new ModelRenderer(this, 0, 46);
		Glow5.addBox(1.0F, 8.0F, -7.3F, 1, 1, 1);
		Glow5.setTextureSize(80, 80);
		Glow5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow5, -1.0122909661567112F, 0.0F, 0.0F);
		Glow5.mirror = false;

		Glow6 = new ModelRenderer(this, 0, 35);
		Glow6.addBox(-4.75F, 9.0F, -7.5F, 1, 1, 1);
		Glow6.setTextureSize(80, 80);
		Glow6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow6, -1.0122909661567112F, 0.0F, 0.0F);
		Glow6.mirror = false;

		Glow7 = new ModelRenderer(this, 6, 35);
		Glow7.addBox(3.75F, 9.0F, -7.5F, 1, 1, 1);
		Glow7.setTextureSize(80, 80);
		Glow7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Glow7, -1.0122909661567112F, 0.0F, 0.0F);
		Glow7.mirror = false;

		DoNotGlow1 = new ModelRenderer(this, 0, 18);
		DoNotGlow1.addBox(-3.0F, 4.0F, -7.3F, 1, 1, 1);
		DoNotGlow1.setTextureSize(80, 80);
		DoNotGlow1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow1, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow1.mirror = false;

		DoNotGlow2 = new ModelRenderer(this, 0, 10);
		DoNotGlow2.addBox(-1.0F, 5.0F, -7.4F, 2, 2, 1);
		DoNotGlow2.setTextureSize(80, 80);
		DoNotGlow2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow2, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow2.mirror = false;

		DoNotGlow3 = new ModelRenderer(this, 0, 14);
		DoNotGlow3.addBox(-0.5F, 5.5F, -7.5F, 1, 1, 1);
		DoNotGlow3.setTextureSize(80, 80);
		DoNotGlow3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow3, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow3.mirror = false;

		DoNotGlow4 = new ModelRenderer(this, 0, 22);
		DoNotGlow4.addBox(-4.75F, 8.0F, -7.3F, 1, 3, 1);
		DoNotGlow4.setTextureSize(80, 80);
		DoNotGlow4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow4, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow4.mirror = false;

		DoNotGlow5 = new ModelRenderer(this, 0, 27);
		DoNotGlow5.addBox(-5.25F, 8.5F, -7.3F, 2, 2, 1);
		DoNotGlow5.setTextureSize(80, 80);
		DoNotGlow5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow5, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow5.mirror = false;

		DoNotGlow6 = new ModelRenderer(this, 0, 32);
		DoNotGlow6.addBox(-5.75F, 9.0F, -7.3F, 3, 1, 1);
		DoNotGlow6.setTextureSize(80, 80);
		DoNotGlow6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow6, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow6.mirror = false;

		DoNotGlow7 = new ModelRenderer(this, 0, 38);
		DoNotGlow7.addBox(-2.5F, 9.5F, -7.3F, 5, 2, 1);
		DoNotGlow7.setTextureSize(80, 80);
		DoNotGlow7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow7, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow7.mirror = false;

		DoNotGlow8 = new ModelRenderer(this, 0, 22);
		DoNotGlow8.addBox(3.75F, 8.0F, -7.3F, 1, 3, 1);
		DoNotGlow8.setTextureSize(80, 80);
		DoNotGlow8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow8, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow8.mirror = false;

		DoNotGlow9 = new ModelRenderer(this, 0, 27);
		DoNotGlow9.addBox(3.25F, 8.5F, -7.3F, 2, 2, 1);
		DoNotGlow9.setTextureSize(80, 80);
		DoNotGlow9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow9, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow9.mirror = false;

		DoNotGlow10 = new ModelRenderer(this, 0, 32);
		DoNotGlow10.addBox(2.75F, 9.0F, -7.3F, 3, 1, 1);
		DoNotGlow10.setTextureSize(80, 80);
		DoNotGlow10.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(DoNotGlow10, -1.0122909661567112F, 0.0F, 0.0F);
		DoNotGlow10.mirror = false;

		Panel2Glow1 = new ModelRenderer(this, 38, 23);
		Panel2Glow1.addBox(-2.0F, 3.0F, -8.0F, 1, 1, 1);
		Panel2Glow1.setTextureSize(80, 80);
		Panel2Glow1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow1, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow1.mirror = false;

		Panel2Glow2 = new ModelRenderer(this, 43, 23);
		Panel2Glow2.addBox(-0.5F, 3.0F, -8.0F, 1, 1, 1);
		Panel2Glow2.setTextureSize(80, 80);
		Panel2Glow2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow2, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow2.mirror = false;

		Panel2Glow3 = new ModelRenderer(this, 38, 23);
		Panel2Glow3.addBox(1.0F, 3.0F, -8.0F, 1, 1, 1);
		Panel2Glow3.setTextureSize(80, 80);
		Panel2Glow3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow3, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow3.mirror = false;

		Panel2Glow4 = new ModelRenderer(this, 57, 19);
		Panel2Glow4.addBox(-2.0F, 4.75F, -7.3F, 4, 2, 1);
		Panel2Glow4.setTextureSize(80, 80);
		Panel2Glow4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow4, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow4.mirror = false;

		Panel2Glow5 = new ModelRenderer(this, 17, 37);
		Panel2Glow5.addBox(-5.0F, 9.5F, -7.3F, 2, 2, 1);
		Panel2Glow5.setTextureSize(80, 80);
		Panel2Glow5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow5, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow5.mirror = false;

		Panel2Glow6 = new ModelRenderer(this, 50, 23);
		Panel2Glow6.addBox(3.75F, 7.5F, -7.5F, 1, 1, 1);
		Panel2Glow6.setTextureSize(80, 80);
		Panel2Glow6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow6, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow6.mirror = false;

		Panel2Glow7 = new ModelRenderer(this, 56, 23);
		Panel2Glow7.addBox(3.75F, 9.0F, -7.5F, 1, 1, 1);
		Panel2Glow7.setTextureSize(80, 80);
		Panel2Glow7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow7, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow7.mirror = false;

		Panel2Glow8 = new ModelRenderer(this, 62, 23);
		Panel2Glow8.addBox(3.75F, 10.5F, -7.5F, 1, 1, 1);
		Panel2Glow8.setTextureSize(80, 80);
		Panel2Glow8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Glow8, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Glow8.mirror = false;

		Panel2DNG1 = new ModelRenderer(this, 28, 28);
		Panel2DNG1.addBox(-1.0F, 4.75F, -7.5F, 0, 2, 1);
		Panel2DNG1.setTextureSize(80, 80);
		Panel2DNG1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG1, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG1.mirror = false;

		Panel2DNG2 = new ModelRenderer(this, 28, 28);
		Panel2DNG2.addBox(0.0F, 4.75F, -7.5F, 0, 2, 1);
		Panel2DNG2.setTextureSize(80, 80);
		Panel2DNG2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG2, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG2.mirror = false;

		Panel2DNG3 = new ModelRenderer(this, 28, 28);
		Panel2DNG3.addBox(1.0F, 4.75F, -7.5F, 0, 2, 1);
		Panel2DNG3.setTextureSize(80, 80);
		Panel2DNG3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG3, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG3.mirror = false;

		Panel2DNG4 = new ModelRenderer(this, 17, 29);
		Panel2DNG4.addBox(-2.0F, 5.75F, -7.5F, 4, 0, 1);
		Panel2DNG4.setTextureSize(80, 80);
		Panel2DNG4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG4, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG4.mirror = false;

		Panel2DNG5 = new ModelRenderer(this, 43, 28);
		Panel2DNG5.addBox(-1.5F, 7.5F, -7.3F, 5, 4, 1);
		Panel2DNG5.setTextureSize(80, 80);
		Panel2DNG5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG5, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG5.mirror = false;

		Panel2DNG6 = new ModelRenderer(this, 33, 28);
		Panel2DNG6.addBox(-1.0F, 8.5F, -7.5F, 2, 2, 1);
		Panel2DNG6.setTextureSize(80, 80);
		Panel2DNG6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG6, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG6.mirror = false;

		Panel2DNG7 = new ModelRenderer(this, 16, 31);
		Panel2DNG7.addBox(-0.5F, 9.0F, -7.7F, 1, 1, 1);
		Panel2DNG7.setTextureSize(80, 80);
		Panel2DNG7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG7, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG7.mirror = false;

		Panel2DNG8 = new ModelRenderer(this, 16, 31);
		Panel2DNG8.addBox(2.0F, 9.0F, -7.5F, 1, 1, 1);
		Panel2DNG8.setTextureSize(80, 80);
		Panel2DNG8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG8, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG8.mirror = false;

		Panel2DNG9 = new ModelRenderer(this, 6, 46);
		Panel2DNG9.addBox(-4.5F, 10.0F, -7.5F, 1, 1, 1);
		Panel2DNG9.setTextureSize(80, 80);
		Panel2DNG9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2DNG9, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2DNG9.mirror = false;

		Panel2Lever = new ModelRenderer(this, 22, 31);
		Panel2Lever.addBox(-0.5F, 5.75F, -8.0F, 1, 0, 1);
		Panel2Lever.setTextureSize(80, 80);
		Panel2Lever.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel2Lever, -1.0122909661567112F, -1.0471975511965976F, 0.0F);
		Panel2Lever.mirror = false;

		Panel3Glow1 = new ModelRenderer(this, 23, 10);
		Panel3Glow1.addBox(-4.25F, 6.5F, -7.3F, 1, 1, 1);
		Panel3Glow1.setTextureSize(80, 80);
		Panel3Glow1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow1, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow1.mirror = false;

		Panel3Glow2 = new ModelRenderer(this, 29, 10);
		Panel3Glow2.addBox(-3.0F, 6.5F, -7.3F, 1, 1, 1);
		Panel3Glow2.setTextureSize(80, 80);
		Panel3Glow2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow2, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow2.mirror = false;

		Panel3Glow3 = new ModelRenderer(this, 29, 10);
		Panel3Glow3.addBox(-4.5F, 8.0F, -7.3F, 1, 1, 1);
		Panel3Glow3.setTextureSize(80, 80);
		Panel3Glow3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow3, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow3.mirror = false;

		Panel3Glow4 = new ModelRenderer(this, 21, 33);
		Panel3Glow4.addBox(-3.0F, 8.0F, -7.3F, 1, 1, 1);
		Panel3Glow4.setTextureSize(80, 80);
		Panel3Glow4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow4, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow4.mirror = false;

		Panel3Glow5 = new ModelRenderer(this, 26, 21);
		Panel3Glow5.addBox(-1.25F, 7.0F, -7.5F, 1, 4, 1);
		Panel3Glow5.setTextureSize(80, 80);
		Panel3Glow5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow5, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow5.mirror = false;

		Panel3Glow6 = new ModelRenderer(this, 32, 21);
		Panel3Glow6.addBox(0.25F, 7.0F, -7.5F, 1, 4, 1);
		Panel3Glow6.setTextureSize(80, 80);
		Panel3Glow6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow6, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow6.mirror = false;

		Panel3Glow7 = new ModelRenderer(this, 23, 10);
		Panel3Glow7.addBox(2.0F, 6.5F, -7.3F, 1, 1, 1);
		Panel3Glow7.setTextureSize(80, 80);
		Panel3Glow7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow7, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow7.mirror = false;

		Panel3Glow8 = new ModelRenderer(this, 21, 33);
		Panel3Glow8.addBox(3.25F, 6.5F, -7.3F, 1, 1, 1);
		Panel3Glow8.setTextureSize(80, 80);
		Panel3Glow8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow8, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow8.mirror = false;

		Panel3Glow9 = new ModelRenderer(this, 29, 10);
		Panel3Glow9.addBox(2.0F, 8.0F, -7.3F, 1, 1, 1);
		Panel3Glow9.setTextureSize(80, 80);
		Panel3Glow9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow9, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow9.mirror = false;

		Panel3Glow10 = new ModelRenderer(this, 29, 10);
		Panel3Glow10.addBox(3.5F, 8.0F, -7.3F, 1, 1, 1);
		Panel3Glow10.setTextureSize(80, 80);
		Panel3Glow10.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3Glow10, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3Glow10.mirror = false;

		Panel3DNG1 = new ModelRenderer(this, 18, 14);
		Panel3DNG1.addBox(-3.25F, 4.0F, -7.3F, 2, 2, 1);
		Panel3DNG1.setTextureSize(80, 80);
		Panel3DNG1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG1, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG1.mirror = false;

		Panel3DNG2 = new ModelRenderer(this, 26, 14);
		Panel3DNG2.addBox(-2.75F, 4.5F, -7.5F, 1, 1, 1);
		Panel3DNG2.setTextureSize(80, 80);
		Panel3DNG2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG2, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG2.mirror = false;

		Panel3DNG3 = new ModelRenderer(this, 18, 14);
		Panel3DNG3.addBox(-1.0F, 4.0F, -7.3F, 2, 2, 1);
		Panel3DNG3.setTextureSize(80, 80);
		Panel3DNG3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG3, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG3.mirror = false;

		Panel3DNG4 = new ModelRenderer(this, 26, 14);
		Panel3DNG4.addBox(-0.5F, 4.5F, -7.5F, 1, 1, 1);
		Panel3DNG4.setTextureSize(80, 80);
		Panel3DNG4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG4, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG4.mirror = false;

		Panel3DNG5 = new ModelRenderer(this, 18, 14);
		Panel3DNG5.addBox(1.25F, 4.0F, -7.3F, 2, 2, 1);
		Panel3DNG5.setTextureSize(80, 80);
		Panel3DNG5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG5, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG5.mirror = false;

		Panel3DNG6 = new ModelRenderer(this, 26, 14);
		Panel3DNG6.addBox(1.75F, 4.5F, -7.5F, 1, 1, 1);
		Panel3DNG6.setTextureSize(80, 80);
		Panel3DNG6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG6, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG6.mirror = false;

		Panel3DNG7 = new ModelRenderer(this, 41, 18);
		Panel3DNG7.addBox(-4.5F, 9.5F, -7.3F, 2, 2, 1);
		Panel3DNG7.setTextureSize(80, 80);
		Panel3DNG7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG7, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG7.mirror = false;

		Panel3DNG8 = new ModelRenderer(this, 49, 18);
		Panel3DNG8.addBox(-4.0F, 10.0F, -7.5F, 1, 1, 1);
		Panel3DNG8.setTextureSize(80, 80);
		Panel3DNG8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG8, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG8.mirror = false;

		Panel3DNG9 = new ModelRenderer(this, 32, 14);
		Panel3DNG9.addBox(-1.5F, 6.5F, -7.3F, 3, 5, 1);
		Panel3DNG9.setTextureSize(80, 80);
		Panel3DNG9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG9, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG9.mirror = false;

		Panel3DNG10 = new ModelRenderer(this, 41, 18);
		Panel3DNG10.addBox(2.5F, 9.5F, -7.3F, 2, 2, 1);
		Panel3DNG10.setTextureSize(80, 80);
		Panel3DNG10.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG10, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG10.mirror = false;

		Panel3DNG11 = new ModelRenderer(this, 49, 18);
		Panel3DNG11.addBox(3.0F, 10.0F, -7.5F, 1, 1, 1);
		Panel3DNG11.setTextureSize(80, 80);
		Panel3DNG11.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel3DNG11, -1.0122909661567112F, -2.0943951023931953F, 0.0F);
		Panel3DNG11.mirror = false;

		Panel4Glow1 = new ModelRenderer(this, 49, 8);
		Panel4Glow1.addBox(-1.5F, 3.0F, -7.3F, 3, 2, 1);
		Panel4Glow1.setTextureSize(80, 80);
		Panel4Glow1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4Glow1, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4Glow1.mirror = false;

		Panel4Glow2 = new ModelRenderer(this, 42, 8);
		Panel4Glow2.addBox(-0.5F, 5.75F, -8.3F, 1, 1, 2);
		Panel4Glow2.setTextureSize(80, 80);
		Panel4Glow2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4Glow2, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4Glow2.mirror = false;

		Panel4Glow3 = new ModelRenderer(this, 49, 14);
		Panel4Glow3.addBox(-5.5F, 9.5F, -7.3F, 2, 2, 1);
		Panel4Glow3.setTextureSize(80, 80);
		Panel4Glow3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4Glow3, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4Glow3.mirror = false;

		Panel4Glow4 = new ModelRenderer(this, 49, 14);
		Panel4Glow4.addBox(3.5F, 9.5F, -7.3F, 2, 2, 1);
		Panel4Glow4.setTextureSize(80, 80);
		Panel4Glow4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4Glow4, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4Glow4.mirror = false;

		Panel4DNG1 = new ModelRenderer(this, 35, 8);
		Panel4DNG1.addBox(-3.0F, 5.75F, -7.3F, 2, 1, 1);
		Panel4DNG1.setTextureSize(80, 80);
		Panel4DNG1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG1, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG1.mirror = false;

		Panel4DNG2 = new ModelRenderer(this, 35, 8);
		Panel4DNG2.addBox(1.0F, 5.75F, -7.3F, 2, 1, 1);
		Panel4DNG2.setTextureSize(80, 80);
		Panel4DNG2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG2, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG2.mirror = false;

		Panel4DNG3 = new ModelRenderer(this, 44, 14);
		Panel4DNG3.addBox(-5.0F, 10.0F, -7.5F, 1, 1, 1);
		Panel4DNG3.setTextureSize(80, 80);
		Panel4DNG3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG3, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG3.mirror = false;

		Panel4DNG4 = new ModelRenderer(this, 44, 14);
		Panel4DNG4.addBox(4.0F, 10.0F, -7.5F, 1, 1, 1);
		Panel4DNG4.setTextureSize(80, 80);
		Panel4DNG4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG4, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG4.mirror = false;

		Panel4DNG5 = new ModelRenderer(this, 57, 13);
		Panel4DNG5.addBox(-3.0F, 7.5F, -7.3F, 6, 4, 1);
		Panel4DNG5.setTextureSize(80, 80);
		Panel4DNG5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG5, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG5.mirror = false;

		Panel4DNG6 = new ModelRenderer(this, 6, 42);
		Panel4DNG6.addBox(-2.5F, 8.0F, -7.5F, 1, 1, 1);
		Panel4DNG6.setTextureSize(80, 80);
		Panel4DNG6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG6, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG6.mirror = false;

		Panel4DNG7 = new ModelRenderer(this, 6, 42);
		Panel4DNG7.addBox(-1.0F, 8.0F, -7.5F, 1, 1, 1);
		Panel4DNG7.setTextureSize(80, 80);
		Panel4DNG7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG7, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG7.mirror = false;

		Panel4DNG8 = new ModelRenderer(this, 6, 42);
		Panel4DNG8.addBox(-2.5F, 9.5F, -7.5F, 1, 1, 1);
		Panel4DNG8.setTextureSize(80, 80);
		Panel4DNG8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG8, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG8.mirror = false;

		Panel4DNG9 = new ModelRenderer(this, 6, 42);
		Panel4DNG9.addBox(-1.0F, 9.5F, -7.5F, 1, 1, 1);
		Panel4DNG9.setTextureSize(80, 80);
		Panel4DNG9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG9, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG9.mirror = false;

		Panel4DNG10 = new ModelRenderer(this, 66, 8);
		Panel4DNG10.addBox(0.5F, 8.5F, -7.5F, 2, 2, 1);
		Panel4DNG10.setTextureSize(80, 80);
		Panel4DNG10.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel4DNG10, -1.0122909661567112F, 3.141592653589793F, 0.0F);
		Panel4DNG10.mirror = false;

		Panel5Glow1 = new ModelRenderer(this, 11, 15);
		Panel5Glow1.addBox(-0.5F, 3.0F, -7.3F, 1, 1, 1);
		Panel5Glow1.setTextureSize(80, 80);
		Panel5Glow1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow1, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow1.mirror = false;

		Panel5Glow2 = new ModelRenderer(this, 16, 10);
		Panel5Glow2.addBox(-2.5F, 4.25F, -7.5F, 1, 2, 1);
		Panel5Glow2.setTextureSize(80, 80);
		Panel5Glow2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow2, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow2.mirror = false;

		Panel5Glow3 = new ModelRenderer(this, 9, 10);
		Panel5Glow3.addBox(-3.0F, 4.0F, -7.3F, 2, 2, 1);
		Panel5Glow3.setTextureSize(80, 80);
		Panel5Glow3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow3, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow3.mirror = false;

		Panel5Glow4 = new ModelRenderer(this, 16, 10);
		Panel5Glow4.addBox(1.5F, 4.25F, -7.5F, 1, 2, 1);
		Panel5Glow4.setTextureSize(80, 80);
		Panel5Glow4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow4, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow4.mirror = false;

		Panel5Glow5 = new ModelRenderer(this, 9, 10);
		Panel5Glow5.addBox(1.0F, 4.0F, -7.3F, 2, 2, 1);
		Panel5Glow5.setTextureSize(80, 80);
		Panel5Glow5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow5, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow5.mirror = false;

		Panel5Glow6 = new ModelRenderer(this, 16, 26);
		Panel5Glow6.addBox(-5.5F, 10.0F, -7.4F, 1, 1, 1);
		Panel5Glow6.setTextureSize(80, 80);
		Panel5Glow6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow6, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow6.mirror = false;

		Panel5Glow7 = new ModelRenderer(this, 22, 26);
		Panel5Glow7.addBox(4.5F, 10.0F, -7.4F, 1, 1, 1);
		Panel5Glow7.setTextureSize(80, 80);
		Panel5Glow7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5Glow7, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5Glow7.mirror = false;

		Panel5DNG1 = new ModelRenderer(this, 6, 15);
		Panel5DNG1.addBox(-0.5F, 4.5F, -7.3F, 1, 1, 1);
		Panel5DNG1.setTextureSize(80, 80);
		Panel5DNG1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG1, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG1.mirror = false;

		Panel5DNG2 = new ModelRenderer(this, 9, 26);
		Panel5DNG2.addBox(-5.5F, 9.5F, -7.3F, 1, 2, 1);
		Panel5DNG2.setTextureSize(80, 80);
		Panel5DNG2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG2, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG2.mirror = false;

		Panel5DNG3 = new ModelRenderer(this, 9, 26);
		Panel5DNG3.addBox(4.5F, 9.5F, -7.3F, 1, 2, 1);
		Panel5DNG3.setTextureSize(80, 80);
		Panel5DNG3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG3, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG3.mirror = false;

		Panel5DNG4 = new ModelRenderer(this, 6, 19);
		Panel5DNG4.addBox(-4.0F, 7.5F, -7.3F, 8, 4, 1);
		Panel5DNG4.setTextureSize(80, 80);
		Panel5DNG4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG4, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG4.mirror = false;

		Panel5DNG5 = new ModelRenderer(this, 11, 32);
		Panel5DNG5.addBox(-3.5F, 8.0F, -7.5F, 1, 1, 1);
		Panel5DNG5.setTextureSize(80, 80);
		Panel5DNG5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG5, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG5.mirror = false;

		Panel5DNG6 = new ModelRenderer(this, 11, 32);
		Panel5DNG6.addBox(-2.0F, 8.0F, -7.5F, 1, 1, 1);
		Panel5DNG6.setTextureSize(80, 80);
		Panel5DNG6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG6, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG6.mirror = false;

		Panel5DNG7 = new ModelRenderer(this, 11, 32);
		Panel5DNG7.addBox(-0.5F, 8.0F, -7.5F, 1, 1, 1);
		Panel5DNG7.setTextureSize(80, 80);
		Panel5DNG7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG7, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG7.mirror = false;

		Panel5DNG8 = new ModelRenderer(this, 11, 32);
		Panel5DNG8.addBox(1.0F, 8.0F, -7.5F, 1, 1, 1);
		Panel5DNG8.setTextureSize(80, 80);
		Panel5DNG8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG8, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG8.mirror = false;

		Panel5DNG9 = new ModelRenderer(this, 11, 32);
		Panel5DNG9.addBox(2.5F, 9.0F, -7.5F, 1, 1, 1);
		Panel5DNG9.setTextureSize(80, 80);
		Panel5DNG9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG9, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG9.mirror = false;

		Panel5DNG10 = new ModelRenderer(this, 11, 32);
		Panel5DNG10.addBox(-3.5F, 10.0F, -7.5F, 1, 1, 1);
		Panel5DNG10.setTextureSize(80, 80);
		Panel5DNG10.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG10, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG10.mirror = false;

		Panel5DNG11 = new ModelRenderer(this, 11, 32);
		Panel5DNG11.addBox(-2.0F, 10.0F, -7.5F, 1, 1, 1);
		Panel5DNG11.setTextureSize(80, 80);
		Panel5DNG11.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG11, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG11.mirror = false;

		Panel5DNG12 = new ModelRenderer(this, 11, 32);
		Panel5DNG12.addBox(-0.5F, 10.0F, -7.5F, 1, 1, 1);
		Panel5DNG12.setTextureSize(80, 80);
		Panel5DNG12.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG12, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG12.mirror = false;

		Panel5DNG13 = new ModelRenderer(this, 11, 32);
		Panel5DNG13.addBox(1.0F, 10.0F, -7.5F, 1, 1, 1);
		Panel5DNG13.setTextureSize(80, 80);
		Panel5DNG13.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel5DNG13, -1.0122909661567112F, 2.0943951023931953F, 0.0F);
		Panel5DNG13.mirror = false;

		Panel6DNG1 = new ModelRenderer(this, 0, 50);
		Panel6DNG1.addBox(-2.25F, 3.0F, -7.3F, 1, 1, 1);
		Panel6DNG1.setTextureSize(80, 80);
		Panel6DNG1.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG1, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG1.mirror = false;

		Panel6DNG2 = new ModelRenderer(this, 12, 0);
		Panel6DNG2.addBox(-1.0F, 2.5F, -7.3F, 2, 2, 1);
		Panel6DNG2.setTextureSize(80, 80);
		Panel6DNG2.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG2, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG2.mirror = false;

		Panel6DNG3 = new ModelRenderer(this, 0, 50);
		Panel6DNG3.addBox(1.25F, 3.0F, -7.3F, 1, 1, 1);
		Panel6DNG3.setTextureSize(80, 80);
		Panel6DNG3.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG3, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG3.mirror = false;

		Panel6DNG4 = new ModelRenderer(this, 21, 0);
		Panel6DNG4.addBox(-2.0F, 4.75F, -7.3F, 4, 2, 1);
		Panel6DNG4.setTextureSize(80, 80);
		Panel6DNG4.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG4, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG4.mirror = false;

		Panel6DNG5 = new ModelRenderer(this, 58, 9);
		Panel6DNG5.addBox(-1.5F, 5.25F, -7.4F, 2, 1, 1);
		Panel6DNG5.setTextureSize(80, 80);
		Panel6DNG5.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG5, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG5.mirror = false;

		Panel6DNG6 = new ModelRenderer(this, 10, 4);
		Panel6DNG6.addBox(0.5F, 5.25F, -7.5F, 1, 1, 1);
		Panel6DNG6.setTextureSize(80, 80);
		Panel6DNG6.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG6, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG6.mirror = false;

		Panel6DNG7 = new ModelRenderer(this, 21, 0);
		Panel6DNG7.addBox(-2.0F, 7.25F, -7.3F, 4, 2, 1);
		Panel6DNG7.setTextureSize(80, 80);
		Panel6DNG7.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG7, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG7.mirror = false;

		Panel6DNG8 = new ModelRenderer(this, 58, 9);
		Panel6DNG8.addBox(-1.5F, 7.75F, -7.4F, 2, 1, 1);
		Panel6DNG8.setTextureSize(80, 80);
		Panel6DNG8.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG8, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG8.mirror = false;

		Panel6DNG9 = new ModelRenderer(this, 10, 4);
		Panel6DNG9.addBox(0.5F, 7.75F, -7.5F, 1, 1, 1);
		Panel6DNG9.setTextureSize(80, 80);
		Panel6DNG9.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG9, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG9.mirror = false;

		Panel6DNG10 = new ModelRenderer(this, 43, 4);
		Panel6DNG10.addBox(-4.5F, 7.25F, -7.3F, 2, 2, 1);
		Panel6DNG10.setTextureSize(80, 80);
		Panel6DNG10.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG10, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG10.mirror = false;

		Panel6DNG11 = new ModelRenderer(this, 36, 4);
		Panel6DNG11.addBox(-4.5F, 7.75F, -7.75F, 2, 0, 1);
		Panel6DNG11.setTextureSize(80, 80);
		Panel6DNG11.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG11, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG11.mirror = false;

		Panel6DNG12 = new ModelRenderer(this, 36, 4);
		Panel6DNG12.addBox(-4.5F, 8.25F, -7.75F, 2, 0, 1);
		Panel6DNG12.setTextureSize(80, 80);
		Panel6DNG12.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG12, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG12.mirror = false;

		Panel6DNG13 = new ModelRenderer(this, 36, 4);
		Panel6DNG13.addBox(-4.5F, 8.75F, -7.75F, 2, 0, 1);
		Panel6DNG13.setTextureSize(80, 80);
		Panel6DNG13.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG13, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG13.mirror = false;

		Panel6DNG14 = new ModelRenderer(this, 30, 4);
		Panel6DNG14.addBox(2.5F, 5.0F, -7.3F, 1, 4, 1);
		Panel6DNG14.setTextureSize(80, 80);
		Panel6DNG14.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG14, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG14.mirror = false;

		Panel6DNG15 = new ModelRenderer(this, 21, 0);
		Panel6DNG15.addBox(-5.5F, 9.75F, -7.3F, 11, 2, 1);
		Panel6DNG15.setTextureSize(80, 80);
		Panel6DNG15.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG15, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG15.mirror = false;

		Panel6DNG16 = new ModelRenderer(this, 10, 4);
		Panel6DNG16.addBox(-5.0F, 10.25F, -7.5F, 1, 1, 1);
		Panel6DNG16.setTextureSize(80, 80);
		Panel6DNG16.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG16, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG16.mirror = false;

		Panel6DNG17 = new ModelRenderer(this, 54, 4);
		Panel6DNG17.addBox(-4.0F, 10.25F, -7.4F, 3, 1, 1);
		Panel6DNG17.setTextureSize(80, 80);
		Panel6DNG17.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG17, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG17.mirror = false;

		Panel6DNG18 = new ModelRenderer(this, 10, 4);
		Panel6DNG18.addBox(-1.0F, 10.25F, -7.5F, 1, 1, 1);
		Panel6DNG18.setTextureSize(80, 80);
		Panel6DNG18.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG18, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG18.mirror = false;

		Panel6DNG19 = new ModelRenderer(this, 54, 4);
		Panel6DNG19.addBox(0.0F, 10.25F, -7.4F, 2, 1, 1);
		Panel6DNG19.setTextureSize(80, 80);
		Panel6DNG19.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG19, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG19.mirror = false;

		Panel6DNG20 = new ModelRenderer(this, 10, 4);
		Panel6DNG20.addBox(2.0F, 10.25F, -7.5F, 1, 1, 1);
		Panel6DNG20.setTextureSize(80, 80);
		Panel6DNG20.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG20, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG20.mirror = false;

		Panel6DNG21 = new ModelRenderer(this, 54, 4);
		Panel6DNG21.addBox(3.0F, 10.25F, -7.4F, 2, 1, 1);
		Panel6DNG21.setTextureSize(80, 80);
		Panel6DNG21.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6DNG21, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6DNG21.mirror = false;

		Panel6DNG22 = new ModelRenderer(this, 65, 3);
		Panel6DNG22.addBox(-4.5F, 1.0F, -16.0F, 4, 1, 2);
		Panel6DNG22.setTextureSize(80, 80);
		Panel6DNG22.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotation(Panel6DNG22, 0.0F, 1.0471975511965976F, 0.0F);
		Panel6DNG22.mirror = false;

		Panel6DNG23 = new ModelRenderer(this, 48, 0);
		Panel6DNG23.addBox(0.5F, 1.0F, -16.0F, 5, 1, 2);
		Panel6DNG23.setTextureSize(80, 80);
		Panel6DNG23.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotation(Panel6DNG23, 0.0F, 1.0471975511965976F, 0.0F);
		Panel6DNG23.mirror = false;

		Panel6DNG24 = new ModelRenderer(this, 65, 0);
		Panel6DNG24.addBox(1.0F, 0.0F, -15.5F, 4, 1, 1);
		Panel6DNG24.setTextureSize(80, 80);
		Panel6DNG24.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotation(Panel6DNG24, 0.0F, 1.0471975511965976F, 0.0F);
		Panel6DNG24.mirror = false;

		Panel6Lever = new ModelRenderer(this, 18, 4);
		Panel6Lever.addBox(2.5F, 5.25F, -10.0F, 1, 1, 4);
		Panel6Lever.setTextureSize(80, 80);
		Panel6Lever.setRotationPoint(0.0F, 11.0F, 0.0F);
		setRotation(Panel6Lever, -1.0122909661567112F, 1.0471975511965976F, 0.0F);
		Panel6Lever.mirror = false;

	}
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		Glow1.render(scale);
		Glow2.render(scale);
		Glow3.render(scale);
		Glow4.render(scale);
		Glow5.render(scale);
		Glow6.render(scale);
		Glow7.render(scale);
		DoNotGlow1.render(scale);
		DoNotGlow2.render(scale);
		DoNotGlow3.render(scale);
		DoNotGlow4.render(scale);
		DoNotGlow5.render(scale);
		DoNotGlow6.render(scale);
		DoNotGlow7.render(scale);
		DoNotGlow8.render(scale);
		DoNotGlow9.render(scale);
		DoNotGlow10.render(scale);
		Panel2Glow1.render(scale);
		Panel2Glow2.render(scale);
		Panel2Glow3.render(scale);
		Panel2Glow4.render(scale);
		Panel2Glow5.render(scale);
		Panel2Glow6.render(scale);
		Panel2Glow7.render(scale);
		Panel2Glow8.render(scale);
		Panel2DNG1.render(scale);
		Panel2DNG2.render(scale);
		Panel2DNG3.render(scale);
		Panel2DNG4.render(scale);
		Panel2DNG5.render(scale);
		Panel2DNG6.render(scale);
		Panel2DNG7.render(scale);
		Panel2DNG8.render(scale);
		Panel2DNG9.render(scale);
		Panel2Lever.render(scale);
		Panel3Glow1.render(scale);
		Panel3Glow2.render(scale);
		Panel3Glow3.render(scale);
		Panel3Glow4.render(scale);
		Panel3Glow5.render(scale);
		Panel3Glow6.render(scale);
		Panel3Glow7.render(scale);
		Panel3Glow8.render(scale);
		Panel3Glow9.render(scale);
		Panel3Glow10.render(scale);
		Panel3DNG1.render(scale);
		Panel3DNG2.render(scale);
		Panel3DNG3.render(scale);
		Panel3DNG4.render(scale);
		Panel3DNG5.render(scale);
		Panel3DNG6.render(scale);
		Panel3DNG7.render(scale);
		Panel3DNG8.render(scale);
		Panel3DNG9.render(scale);
		Panel3DNG10.render(scale);
		Panel3DNG11.render(scale);
		Panel4Glow1.render(scale);
		Panel4Glow2.render(scale);
		Panel4Glow3.render(scale);
		Panel4Glow4.render(scale);
		Panel4DNG1.render(scale);
		Panel4DNG2.render(scale);
		Panel4DNG3.render(scale);
		Panel4DNG4.render(scale);
		Panel4DNG5.render(scale);
		Panel4DNG6.render(scale);
		Panel4DNG7.render(scale);
		Panel4DNG8.render(scale);
		Panel4DNG9.render(scale);
		Panel4DNG10.render(scale);
		Panel5Glow1.render(scale);
		Panel5Glow2.render(scale);
		Panel5Glow3.render(scale);
		Panel5Glow4.render(scale);
		Panel5Glow5.render(scale);
		Panel5Glow6.render(scale);
		Panel5Glow7.render(scale);
		Panel5DNG1.render(scale);
		Panel5DNG2.render(scale);
		Panel5DNG3.render(scale);
		Panel5DNG4.render(scale);
		Panel5DNG5.render(scale);
		Panel5DNG6.render(scale);
		Panel5DNG7.render(scale);
		Panel5DNG8.render(scale);
		Panel5DNG9.render(scale);
		Panel5DNG10.render(scale);
		Panel5DNG11.render(scale);
		Panel5DNG12.render(scale);
		Panel5DNG13.render(scale);
		Panel6DNG1.render(scale);
		Panel6DNG2.render(scale);
		Panel6DNG3.render(scale);
		Panel6DNG4.render(scale);
		Panel6DNG5.render(scale);
		Panel6DNG6.render(scale);
		Panel6DNG7.render(scale);
		Panel6DNG8.render(scale);
		Panel6DNG9.render(scale);
		Panel6DNG10.render(scale);
		Panel6DNG11.render(scale);
		Panel6DNG12.render(scale);
		Panel6DNG13.render(scale);
		Panel6DNG14.render(scale);
		Panel6DNG15.render(scale);
		Panel6DNG16.render(scale);
		Panel6DNG17.render(scale);
		Panel6DNG18.render(scale);
		Panel6DNG19.render(scale);
		Panel6DNG20.render(scale);
		Panel6DNG21.render(scale);
		Panel6DNG22.render(scale);
		Panel6DNG23.render(scale);
		Panel6DNG24.render(scale);
		Panel6Lever.render(scale);
	}
	private void setRotation(ModelRenderer model, float x, float y, float z){
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles((float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch, float scaleFactor, Entity entity){
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netheadYaw, headPitch, scaleFactor, entity);
	}
}