package Adapter;



public class MediaAdapter extends MediaPlayer {
    private AdvancedMediaPlayer player;
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            player = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            player=new Mp4Player();
        }
    }
    public void play (String audioType , String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            player.playVlc((fileName));
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            player.playMp4(fileName);
        }
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3" + fileName);
        }

    }

}
