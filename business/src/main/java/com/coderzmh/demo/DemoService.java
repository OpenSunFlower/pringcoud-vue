package com.coderzmh.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
    @Value("${spring.application.name}")
    private String displayName; // 注入配置文件中的服务显示名称

    /**
     * 提供输出hello信息
     *
     * @param name 名字
     * @return "hello @name,this is producer service message!"
     */
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + ", this is " + displayName + " service message!";
    }
}
