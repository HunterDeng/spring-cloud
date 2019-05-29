package md.consumer01.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author MD@do1.com
 * @date 2019/5/28 17:26
 * create by a new bird!
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/producer/hello")
    String hello(@RequestParam(value = "name") String name);
}
