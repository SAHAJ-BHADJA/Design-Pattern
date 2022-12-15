//Name   : Jay Vekariya
//Roll NO: 20BCP125

package adapterPattern;

public class adapterDemo {

    public static void main(String[] args) {
        audioPlayer demo = new audioPlayer();

        demo.play("mp3", "beyond the horizon.mp3");
        demo.play("mp4", "alone.mp4");
        demo.play("vlc", "far far away.vlc");
        demo.play("avi", "mind me.avi");
    }
}
