package basic.template;

/**
 * @FileName: Football
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
