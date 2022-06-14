package Adapter;

public class Mp4Player extends AdvancedMediaPlayer{
    @Override
    public void playMp4(String filename) {
        System.out.println("Playing MP4" + filename);
    }

    @Override
    public void playVlc(String filename) {

    }
}
