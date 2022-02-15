package factory;

import service.*;

public class AdvertAdvertFactory implements AdvertFactoryImpl {
    @Override
    public AdvertService createAdvertService() {
        return new AdvertService();
    }
}
