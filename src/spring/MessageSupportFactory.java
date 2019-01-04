package spring;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private static MessageRenderer renderer;
    private static MessageProvider provider;

    private MessageSupportFactory(){
        properties = new Properties();
        try{
            properties.load(new FileInputStream("src/msf.properties"));

            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }
    public static MessageRenderer getMessageRenderer(){
        return renderer;
    }
    public static MessageProvider getMessageProvider(){
        return provider;
    }
}
