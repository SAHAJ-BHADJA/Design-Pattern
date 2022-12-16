//Name: Jay Vekariya
//Roll NO: 20BCP125

package commandDesignPattern;

public class User {
    public static void main(String[] args) {
        RemoteControl r = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();

        r.setCommand(new SetTopBoxOnCommand(setTopBox));
        r.pressButton();
        r.setCommand((new SetTopBoxOffCommand(setTopBox)));
        r.pressButton();
    }
}
