package factory;

import service.UserService;

public interface UserServiceFactoryImpl {
    UserService createUserService();
}
