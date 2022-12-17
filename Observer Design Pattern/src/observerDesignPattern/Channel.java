//Name   : Jay Vekariya
//Roll NO: 20BCP125

package observerDesignPattern;
import java.util.ArrayList;
import java.util.List;
public class Channel implements Subject{
    private List<Subscriber> subs = new ArrayList<Subscriber>();
    public String title;

    @Override
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    @Override
    public void unsubscribe(Observer sub) {
    }
    @Override
    public void notifySubscriber(){
        for(Observer sub:subs){
            sub.update();
        }
    }
    @Override
    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }
}
