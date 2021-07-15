package basic.adapter;

/**
 * @fileName: VlcPlayer
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 **/
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
