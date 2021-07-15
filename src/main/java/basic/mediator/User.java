package basic.mediator;

/**
 * @FileName: User
 * @Auther: Cloud
 * @Create: 2020 - 06 - 23
 * @Description:
 **/

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
