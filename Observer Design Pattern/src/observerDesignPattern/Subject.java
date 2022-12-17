//Name   : Jay Vekariya
//Roll NO: 20BCP125

package observerDesignPattern;

public interface Subject {
    void subscribe(Subscriber sub);
    void unsubscribe(Observer sub);
    void notifySubscriber();
    void upload(String title);
}
