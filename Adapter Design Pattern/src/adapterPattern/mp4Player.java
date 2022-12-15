//Name   : Jay Vekariya
//Roll NO: 20BCP125

package adapterPattern;

public class mp4Player implements advancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //it does nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: "+ fileName);
    }
}

