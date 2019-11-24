package chicken.chicken.extendedparrots.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.util.math.MathHelper;

public class ModelRegentParakeet extends ModelBase
{
	public ModelRenderer body;
    public ModelRenderer Leftwing;
    public ModelRenderer tail;
    public ModelRenderer backofhead;
    public ModelRenderer rightleg;
    public ModelRenderer rightwing;
    public ModelRenderer leftleg;
    public ModelRenderer topofhead;
    public ModelRenderer beakback;
    public ModelRenderer beakfront;
    private ModelRegentParakeet.State state = ModelRegentParakeet.State.STANDING;

    public ModelRegentParakeet() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        
        this.body = new ModelRenderer(this, 2, 8);
        this.body.setRotationPoint(0.0F, 16.5F, -3.0F);
        this.body.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(body, 0.49375364538919575F, 0.0F, 0.0F);

        this.tail = new ModelRenderer(this, 22, 1);
        this.tail.setRotationPoint(0.0F, 21.07F, 1.16F);
        this.tail.addBox(-1.5F, -1.0F, -1.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(tail, 1.015083492959902F, 0.0F, 0.0F);

        this.Leftwing = new ModelRenderer(this, 19, 8);
        this.Leftwing.setRotationPoint(1.5F, 16.94F, -2.76F);
        this.Leftwing.addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F);
        this.setRotateAngle(Leftwing, -0.6981317007977318F, -3.141592653589793F, -0.08726646259971647F);
        
        this.rightwing = new ModelRenderer(this, 19, 8);
        this.rightwing.setRotationPoint(-1.5F, 16.94F, -2.76F);
        this.rightwing.addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F);
        this.setRotateAngle(rightwing, -0.6981317007977318F, -3.141592653589793F, 0.08726646259971647F);

        this.backofhead = new ModelRenderer(this, 2, 2);
        this.backofhead.setRotationPoint(0.0F, 15.69F, -2.76F);
        this.backofhead.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F);

        this.topofhead = new ModelRenderer(this, 10, 0);
        this.topofhead.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.topofhead.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F);
        this.backofhead.addChild(this.topofhead);

        this.beakback = new ModelRenderer(this, 11, 7);
        this.beakback.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.beakback.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F);
        this.backofhead.addChild(this.beakback);
        
        this.beakfront = new ModelRenderer(this, 16, 7);
        this.beakfront.setRotationPoint(0.0F, -1.75F, -2.45F);
        this.beakfront.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.backofhead.addChild(this.beakfront);
        
        this.leftleg = new ModelRenderer(this, 14, 18);
        this.leftleg.setRotationPoint(1.0F, 22.0F, -1.05F);
        this.leftleg.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.6682865705886288F, 0.0F, 0.0F);
        
        this.rightleg = new ModelRenderer(this, 14, 18);
        this.rightleg.setRotationPoint(-1.0F, 22.0F, -1.05F);
        this.rightleg.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.6682865705886288F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.leftleg.render(f5);
        this.body.render(f5);
        this.Leftwing.render(f5);
        this.rightwing.render(f5);
        this.tail.render(f5);
        this.backofhead.render(f5);
        this.rightleg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) 
    {
    	float f = ageInTicks * 0.3F;
        this.backofhead.rotateAngleX = headPitch * 0.017453292F;
        this.backofhead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.backofhead.rotateAngleZ = 0.0F;
        this.backofhead.rotationPointX = 0.0F;
        this.body.rotationPointX = 0.0F;
        this.tail.rotationPointX = 0.0F;
        this.rightwing.rotationPointX = -1.5F;
        this.Leftwing.rotationPointX = 1.5F;

        if (this.state != ModelRegentParakeet.State.FLYING)
        {
            if (this.state == ModelRegentParakeet.State.SITTING)
            {
                return;
            }

            if (this.state == ModelRegentParakeet.State.PARTY)
            {
                float f1 = MathHelper.cos((float)entityIn.ticksExisted);
                float f2 = MathHelper.sin((float)entityIn.ticksExisted);
                this.backofhead.rotationPointX = f1;
                this.backofhead.rotationPointY = 15.69F + f2;
                this.backofhead.rotateAngleX = 0.0F;
                this.backofhead.rotateAngleY = 0.0F;
                this.backofhead.rotateAngleZ = MathHelper.sin((float)entityIn.ticksExisted) * 0.4F;
                this.body.rotationPointX = f1;
                this.body.rotationPointY = 16.5F + f2;
                this.Leftwing.rotateAngleZ = -0.0873F - ageInTicks;
                this.Leftwing.rotationPointX = 1.5F + f1;
                this.Leftwing.rotationPointY = 16.94F + f2;
                this.rightwing.rotateAngleZ = 0.0873F + ageInTicks;
                this.rightwing.rotationPointX = -1.5F + f1;
                this.rightwing.rotationPointY = 16.94F + f2;
                this.tail.rotationPointX = f1;
                this.tail.rotationPointY = 21.07F + f2;
                return;
            }

            this.leftleg.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.rightleg.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        } 
        	
        this.backofhead.rotationPointY = 15.69F + f;
            this.tail.rotateAngleX = 1.015F + MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
            this.tail.rotationPointY = 21.07F + f;
            this.body.rotationPointY = 16.5F + f;
            this.Leftwing.rotateAngleZ = -0.0873F - ageInTicks;
            this.Leftwing.rotationPointY = 16.94F + f;
            this.rightwing.rotateAngleZ = 0.0873F + ageInTicks;
            this.rightwing.rotationPointY = 16.94F + f;
            this.leftleg.rotationPointY = 22.0F + f;
            this.rightleg.rotationPointY = 22.0F + f;
        
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
    {
        //this.field_192772_i.rotateAngleX = -0.2214F;
    	
        this.body.rotateAngleX = 0.4937F;
        this.Leftwing.rotateAngleX = -((float)Math.PI * 2F / 9F);
        this.Leftwing.rotateAngleY = -(float)Math.PI;
        this.rightwing.rotateAngleX = -((float)Math.PI * 2F / 9F);
        this.rightwing.rotateAngleY = -(float)Math.PI;
        this.leftleg.rotateAngleX = -0.0299F;
        this.rightleg.rotateAngleX = -0.0299F;
        this.leftleg.rotationPointY = 22.0F;
        this.rightleg.rotationPointY = 22.0F;

        if (entitylivingbaseIn instanceof EntityParrot)
        {
            EntityParrot entityparrot = (EntityParrot)entitylivingbaseIn;

            if (entityparrot.isPartying()) 
            {
                this.leftleg.rotateAngleZ = -0.34906584F;
                this.rightleg.rotateAngleZ = 0.34906584F;
                this.state = ModelRegentParakeet.State.PARTY;
                return;
            }

            if (entityparrot.isSitting())
            {
                float f = 1.9F;
                this.backofhead.rotationPointY = 17.59F;
                this.tail.rotateAngleX = 1.5388988F;
                this.tail.rotationPointY = 22.97F;
                this.body.rotationPointY = 18.4F;
                this.Leftwing.rotateAngleZ = -0.0873F;
                this.Leftwing.rotationPointY = 18.84F;
                this.rightwing.rotateAngleZ = 0.0873F;
                this.rightwing.rotationPointY = 18.84F;
                ++this.leftleg.rotationPointY;
                ++this.rightleg.rotationPointY;
                ++this.leftleg.rotateAngleX;
                ++this.rightleg.rotateAngleX;
                this.state = ModelRegentParakeet.State.SITTING;
            }
            else if (!entityparrot.onGround)
            {
                this.leftleg.rotateAngleX += ((float)Math.PI * 2F / 9F);
                this.rightleg.rotateAngleX += ((float)Math.PI * 2F / 9F);
                this.state = ModelRegentParakeet.State.FLYING;
                //System.out.println("Flying");
            }
            else
            {
                this.state = ModelRegentParakeet.State.STANDING;
                //System.out.println("Standing");
            }

            this.leftleg.rotateAngleZ = 0.0F;
            this.rightleg.rotateAngleZ = 0.0F;
        }
    }
    static enum State
    {
        FLYING,
        STANDING,
        SITTING,
        PARTY;
    }
}
