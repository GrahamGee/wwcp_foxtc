package wwcp.common.entity.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.SLRVC;
import wwcp.common.core.handler.Transport;

public class EntitySLRVC extends AbstractPassengerCar {

    public EntitySLRVC(World world) {
        super(world);
        InsertTexture(0, "SLRV C Yellow");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.8f, -0.1f, 0f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.2F;
    }

    @Override
    public String transportCountry() {
        return Transport.SLRVC().country;
    }

    @Override
    public String transportYear() {
        return Transport.SLRVC().year;
    }

    public String getInventoryName() {
        return Transport.SLRVC().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.SLRVC().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntitySLRVC.class, new SLRVC(),
                        "SLRVC",
                        new float[]{0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Electric/SLRV/SLRV_C_DART";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
