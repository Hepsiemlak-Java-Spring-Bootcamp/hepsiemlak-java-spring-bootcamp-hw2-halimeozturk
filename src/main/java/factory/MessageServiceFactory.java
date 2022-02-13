package factory;

import service.MessageService;

public class MessageServiceFactory implements MessageServiceFactoryImpl {
    @Override
    public MessageService createMessageService() {
        return new MessageService();
    }
}
