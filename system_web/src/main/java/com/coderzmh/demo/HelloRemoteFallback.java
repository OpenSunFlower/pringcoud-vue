package com.coderzmh.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteFallback implements DemoServiceFeign {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message is failed";
    }
}
