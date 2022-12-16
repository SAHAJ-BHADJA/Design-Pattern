//Name: Jay Vekariya
//Roll NO: 20BCP125

package commandDesignPattern;

public class SetTopBoxOnCommand implements Command{
    SetTopBox setTopBox;

    public SetTopBoxOnCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }
    public void execute(){
        setTopBox.ON();
        setTopBox.setChannel(282);
        setTopBox.setVolume(8);
    }
}
