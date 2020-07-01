package template;

/**
 * @FileName: Game
 * @Auther: Cloud
 * @Create: 2020 - 06 - 26
 * @Description:
 **/

public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template
    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
