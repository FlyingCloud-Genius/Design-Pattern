package mediator;

/**
 * @FileName: MediatorPatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 23
 * @Description:
 * 1. The main purpose of mediator pattern is to decouple the object.
 * 2. Divide the function into every object. Also decoupling the relationship between each classes
 * 3. Easy to divide the responsibility to every single object.
 **/

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
