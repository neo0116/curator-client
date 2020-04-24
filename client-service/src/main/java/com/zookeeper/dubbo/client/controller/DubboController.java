package com.zookeeper.dubbo.client.controller;

import com.zookeeper.curator.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName DubboController
 * @Description TODO
 * @Version 1.0
 **/
@RestController
public class DubboController {
//    public static void main(String[] args) {
//        [0,1]  [2,3,4]  [5,6,7,8,9]
//
//        7
//
//
//        int offset = ThreadLocalRandom.current().nextInt(10);
//        System.out.println(offset);
//    }
    @Reference
    ISayHelloService iSayHelloService;

    @GetMapping(value = "/get")
    public String get() {
        return iSayHelloService.sayHello("fsdjfklsa");
    }

}
