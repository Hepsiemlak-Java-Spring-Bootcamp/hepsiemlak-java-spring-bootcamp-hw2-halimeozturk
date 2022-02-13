package factory;

import service.FilterService;

public class FilterServiceFactory implements FilterServiceFactoryImpl{

    @Override
    public FilterService createFilterService() {
        return new FilterService();
    }
}
