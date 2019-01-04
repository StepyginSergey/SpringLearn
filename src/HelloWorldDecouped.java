import spring.HelloWorldMessageProvider;
import spring.MessageProvider;
import spring.MessageRenderer;
import spring.StandartOutMessageRenderer;

public class HelloWorldDecouped {

    public static void main(String[] args) {
        MessageRenderer mr = new StandartOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
