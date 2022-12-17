//Name   : Jay Vekariya
//Roll NO: 20BCP125

package observerDesignPattern;
public class Youtube {

    public static void main(String[] args) {
        Channel Design = new Channel();

        Subscriber s1 = new Subscriber("Jay");
        Subscriber s2 = new Subscriber("Rohan");
        Subscriber s3 = new Subscriber("Raj");
        Subscriber s4 = new Subscriber("Shyam");

        Design.subscribe(s1);
        Design.subscribe(s2);
        Design.subscribe(s3);
        Design.subscribe(s4);

        s1.subscribeChannel(Design);
        s2.subscribeChannel(Design);
        s3.subscribeChannel(Design);
        s4.subscribeChannel(Design);

        Design.upload("Observer Design Pattern");
    }
}

