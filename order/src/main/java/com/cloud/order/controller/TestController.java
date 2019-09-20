package com.cloud.order.controller;

import com.cloud.order.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestFeign feign;
    @RequestMapping("/order")
    public String testFeign(@RequestParam(name = "word")String word){
        System.out.println("服务调用成功,传过来的参数为"+word);
      //  System.out.println(hello);
        return word;
    }
    @RequestMapping("/producer")
    public String testProducer(@RequestParam(name="word") String word){

        return feign.sayHiFromClientOne(word);
    }


}
