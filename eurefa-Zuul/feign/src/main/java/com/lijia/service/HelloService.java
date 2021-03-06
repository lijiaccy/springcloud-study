package com.lijia.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = ErrorHelloService.class)
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String callClientOne(@RequestParam(value = "name") String name);
}
