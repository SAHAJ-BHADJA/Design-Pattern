//Name   : Jay Vekariya
//Roll NO: 20BCP125

package adapterPattern;

public class vlcPlayer implements advancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //it does nothing
    }
}

