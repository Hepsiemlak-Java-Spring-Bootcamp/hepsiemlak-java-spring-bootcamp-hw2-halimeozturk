package factory;

import service.RealEstateService;

public class RealEstateServiceFactory implements RealEstateServiceFactoryImpl{
    @Override
    public RealEstateService createRealEstateService() {
        return new RealEstateService();
    }
}
