package md.consumer01.controller;

import md.consumer01.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MD@do1.com
 * @date 2019/5/28 17:28
 * create by a new bird!
 */
@RestController
public class ConsumerController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(name = "name") String name) {
        return helloRemote.hello(name);
    }
}
