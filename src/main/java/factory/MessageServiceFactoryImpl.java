package factory;

import service.MessageService;

public interface MessageServiceFactoryImpl {
    MessageService createMessageService();

}
