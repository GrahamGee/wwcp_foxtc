package wwcp.common.entity.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.locomotives.diesels.SD90MACH;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaOpen1;
import wwcp.common.entity.locomotives.diesels.EntitySD90MACH;

public class EntityEurofima1stClass extends EntityRollingStock {

    public EntityEurofima1stClass(World world) {
        super(world);
        InsertTexture(0, "Eurofima 1st Class");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 3.2F, 0.45f, -0.15f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.5F;
    }

    @Override
    public String transportCountry() {
        return "EU";
    }

    @Override
    public String transportYear() {
        return "2012-";
    }

    public String getInventoryName() {
        return "Eurofima1stClass";
    }

    @Override
    public boolean isFictional() {
        return false;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityEurofima1stClass.class, new EurofimaOpen1(),
                        "Eurofima1stClass",
                        new float[]{-3f, 0.2F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaOpen/Class1/O1Base";
                                break;
                            case "orange":
                                texturePath = "textures/passengerstock/Eurofima/EurofimaOpen/Class1/O1SBB";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
