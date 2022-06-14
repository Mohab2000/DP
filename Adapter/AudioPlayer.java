package Adapter;

public class AudioPlayer extends MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing Mp3 " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
