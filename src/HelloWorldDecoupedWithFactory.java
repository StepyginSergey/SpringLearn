import spring.MessageProvider;
import spring.MessageRenderer;
import spring.MessageSupportFactory;

public class HelloWorldDecoupedWithFactory {

    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
