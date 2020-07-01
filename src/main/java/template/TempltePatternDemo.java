package template;

/**
 * @FileName: TempltePatternDemo
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 * 1. This pattern encapsulates all that are immortal and extends others that are changable.
 * 2. The outside and the inside can get changed dynamically.
 * 3. The complicated inside logic with similar .sphere can use this pattern.
 **/

public class TempltePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
