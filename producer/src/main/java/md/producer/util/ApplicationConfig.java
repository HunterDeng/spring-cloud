package md.producer.util;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author MD@do1.com
 * @date 2019/5/29 10:00
 * create by a new bird!
 */
@Component
public class ApplicationConfig implements ApplicationListener<WebServerInitializedEvent> {
    private int port;

    public String getHost() {
        String hostAddress;
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            hostAddress = "host Invalid";
        }
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        port = webServerInitializedEvent.getWebServer().getPort();
    }
}
