package basic.mediator;

import java.util.Date;

/**
 * @FileName: ChatRoom
 * @Auther: Cloud
 * @Create: 2020 - 06 - 23
 * @Description:
 **/

public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
