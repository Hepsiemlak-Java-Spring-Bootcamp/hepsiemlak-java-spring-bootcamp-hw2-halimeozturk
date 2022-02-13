package factory;

import service.UserService;

public class UserServiceFactory implements UserServiceFactoryImpl{
    @Override
    public UserService createUserService() {
        return new UserService();
    }
}
