package com.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@FeignClient(name = "kitty-producer", fallback = ProducerHystrix.class)
public interface ProducerService {

    @RequestMapping("/hello")
    public String hello();
}
