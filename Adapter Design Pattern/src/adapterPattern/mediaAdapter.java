//Name   : Jay Vekariya
//Roll NO: 20BCP125

package adapterPattern;

public class mediaAdapter implements mediaPlayer {
    advancedMediaPlayer advancedMusicPlayer;

    public mediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new vlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}



