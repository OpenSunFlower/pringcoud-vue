package com.coderzmh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Autowired
    private DemoServiceFeign demoServiceFeign;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return demoServiceFeign.hello( name );
    }
}
