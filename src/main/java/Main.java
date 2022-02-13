//import Question.Question2;

import factory.*;
import service.*;

public class Main {

    public static void main(String[] args) {


//        advertCreate();
//        realEstateCreate();
//        userCreate();
//        messageCreate();
//        filterCreate();
    }

    public static void advertCreate(){
        AdvertAdvertFactory advertFactory = new AdvertAdvertFactory();
        AdvertService advertService = advertFactory.createAdvertService();
        advertService.createAdvert(1);
    }

    public static void realEstateCreate(){
        RealEstateServiceFactory realEstateServiceFactory = new RealEstateServiceFactory();
        RealEstateService realEstateService = realEstateServiceFactory.createRealEstateService();
        realEstateService.createRealEstate(1);
    }

    public static void userCreate(){
        UserServiceFactory userServiceFactory = new UserServiceFactory();
        UserService userService = userServiceFactory.createUserService();
        userService.createUserList(1);
    }

    public static void messageCreate(){
        MessageServiceFactory messageServiceFactory = new MessageServiceFactory();
        MessageService messageService = messageServiceFactory.createMessageService();
        messageService.createMessageList(8);
    }

    public static void filterCreate(){
        FilterServiceFactory filterServiceFactory = new FilterServiceFactory();
        FilterService filterService = filterServiceFactory.createFilterService();
        filterService.favoriteList("ayse.sari@gmail.com");
        filterService.filterMessage();
        filterService.filterRealEstate();
    }


}
