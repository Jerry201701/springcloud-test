package com.cloud.producer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-service")
public interface TestFeign {
    @RequestMapping(value = "/order")
    String sayHiFromClientOne( @RequestParam(name = "word")String word);
}
