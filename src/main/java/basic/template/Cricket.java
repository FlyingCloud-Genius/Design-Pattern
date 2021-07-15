package basic.template;

/**
 * @FileName: Circket
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! ");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game! ");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished! ");
    }
}
