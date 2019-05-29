package md.producer.controller;

import md.producer.util.ApplicationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MD@do1.com
 * @date 2019/5/28 16:32
 * create by a new bird!
 */
@RestController
public class ProducerController {
    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);
    @Autowired
    private ApplicationConfig applicationConfig;
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        logger.info("生产者被消费了,地址[{}:{}]", applicationConfig.getHost(), applicationConfig.getPort());
        return "hello " + name + ":this is " + System.currentTimeMillis();
    }
}
