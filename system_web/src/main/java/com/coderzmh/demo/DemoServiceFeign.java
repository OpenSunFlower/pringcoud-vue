package com.coderzmh.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "business-service", fallback = HelloRemoteFallback.class)
public interface DemoServiceFeign {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
