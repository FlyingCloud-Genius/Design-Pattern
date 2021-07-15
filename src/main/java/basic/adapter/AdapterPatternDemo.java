package basic.adapter;

/**
 * @fileName: AdapterPatternDemo
 * @author: Cloud
 * @create: 2020-05-19
 * @description:
 * 1. run more different classes together in the basic.adapter
 * 2. increase the transparency of the class
 * 3. use a class multiple times, decrease the code quantity and increase the code quality
 * 4. Too many basic.adapter will cause into chaos
 * 5. Adapter used more in a running system api rather than designing one
 * 6. Adapter must be used with only one abstract class or one interface
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
