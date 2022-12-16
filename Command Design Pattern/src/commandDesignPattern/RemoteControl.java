//Name: Jay Vekariya
//Roll NO: 20BCP125

package commandDesignPattern;

public class RemoteControl {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
