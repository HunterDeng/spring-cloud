package md.consumer01.service;

import org.springframework.stereotype.Component;

/**
 * @author MD@do1.com
 * @date 2019/5/29 14:08
 * create by a new bird!
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return String.format("hello %s,8031 message Send Failed!",name);
    }
}
