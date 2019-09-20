package com.cloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "producer-service")
public interface TestFeign {
    @RequestMapping(value = "/producer")
    String sayHiFromClientOne(@RequestParam(name = "word") String word);
}
