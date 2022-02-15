package factory;

import service.CategoryService;

public class CategoryServiceFactory implements CategoryServiceFactoryImpl {

    @Override
    public CategoryService createCategoryService() {
        return new CategoryService();
    }
}
