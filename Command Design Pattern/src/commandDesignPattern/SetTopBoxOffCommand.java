//Name: Jay Vekariya
//Roll NO: 20BCP125

package commandDesignPattern;

public class SetTopBoxOffCommand implements Command{
    SetTopBox setTopBox;
    public SetTopBoxOffCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }
    public void execute(){
        setTopBox.OFF();
    }
}
