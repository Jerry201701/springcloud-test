package com.cloud.producer.controller;

import com.cloud.producer.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @Autowired
    private TestFeign feign;
    /*
    @Value("${consumer.config.test}")
    private String configValue;
    @GetMapping("/config/test")
    public String TestConfig(){
        System.out.println("获取配置文件的值");
        return configValue;
    }

     */
    @RequestMapping("/feign/test")
    public String feignTest(@RequestParam(name = "word")String word){
        System.out.println("开始用feign调用");
        String s= feign.sayHiFromClientOne(word);
        System.out.println(s);
        return s;
    }
    @RequestMapping("/gateway/test")
    public String gatewayTest(@RequestParam(name = "name")String hello){
        return "from port:"+port+", message is :"+hello;
    }
    @RequestMapping("/producer")
    public String testFeign(@RequestParam(name = "word")String word){
        System.out.println("服务调用成功,传过来的参数为"+word);
        //  System.out.println(hello);
        return word;
    }
    @RequestMapping("/zuul/test")
    public String testZuul(@RequestParam(name = "hi")String hi){
        System.out.println("zuul网关路由转发成功");
        return "from   "+port+",message:  "+hi;
    }

}
