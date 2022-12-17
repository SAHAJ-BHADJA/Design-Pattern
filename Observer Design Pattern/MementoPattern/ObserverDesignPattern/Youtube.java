package observerDesignPattern;

public class Youtube {

    public static void main(String[] args) {
        Channel Design = new Channel();

        Subscriber s1 = new Subscriber("Meet");
        Subscriber s2 = new Subscriber("ABC");
        Subscriber s3 = new Subscriber("XYZ");
        Subscriber s4 = new Subscriber("PQR");
        Subscriber s5 = new Subscriber("DEF");

        Design.subscribe(s1);
        Design.subscribe(s2);
        Design.subscribe(s3);
        Design.subscribe(s4);
        Design.subscribe(s5);
        s1.subscribeChannel(Design);
        s2.subscribeChannel(Design);
        s3.subscribeChannel(Design);
        s4.subscribeChannel(Design);
        s5.subscribeChannel(Design);

        Design.upload("Observer Design Pattern");
    }

}
