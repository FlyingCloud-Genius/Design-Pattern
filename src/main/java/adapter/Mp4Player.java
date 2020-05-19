package adapter;

/**
 * @fileName: Mp4Player
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:" + fileName);
    }
}
