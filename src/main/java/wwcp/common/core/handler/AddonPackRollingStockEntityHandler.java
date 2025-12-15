package wwcp.common.core.handler;

import train.common.Traincraft;
import train.common.library.register.TrainRecord;
import wwcp.client.render.rollingstock.passengerStock.Eurofima.EurofimaOpen1;
import wwcp.common.entity.locomotives.diesels.EntitySD90MACH;
import wwcp.common.entity.locomotives.diesels.EntityWWCPShopShunter;
import wwcp.common.entity.passenger.EntityEurofima1stClass;
import wwcp.common.library.AddonRollingStockItems;
import wwcp.common.wwcp;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return wwcp.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(AddonRollingStockItems.WWCPShopShunter.item,
                        new TrainRecord(AddonRollingStockItems.WWCPShopShunter.name(), EntityWWCPShopShunter.class, AddonRollingStockItems.WWCPShopShunter.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red", "Blue"}, 18, 0, .95, 164,
                                4120, 60, 160,
                                0.65, -1.5, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(AddonRollingStockItems.SD90MACH.item,
                        new TrainRecord(AddonRollingStockItems.SD90MACH.name(), EntitySD90MACH.class, AddonRollingStockItems.SD90MACH.item,
                                "Freight Locomotive", 1,
                                new String[] {"Yellow", "Orange", "Red"}, 10, 0, .95, 164,
                                4120, 60, 160,
                                0.65, 7, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(AddonRollingStockItems.Eurofima1stClassOpen.item,
                        new TrainRecord(AddonRollingStockItems.Eurofima1stClassOpen.name(), EntityEurofima1stClass.class, AddonRollingStockItems.Eurofima1stClassOpen.item,
                                Transport.EurofimaOpen1().additionalText2, Transport.EurofimaOpen1().weightinKGs,
                                new String[] {"Yellow", "Orange", "Red"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 7, 0),
                        Instance()
                );
    }
}
