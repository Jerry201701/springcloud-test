package com.cloud.consumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


public class ProducerHystrix implements ProducerService {

    @RequestMapping("/hello")
    public String hello() {
    	return "sorry, hello service call failed.";
    }
}
