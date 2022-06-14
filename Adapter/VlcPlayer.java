package Adapter;

public class VlcPlayer extends AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing VLC" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
