package io.ibole.springcloud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ibole.springcloud.web.service.HystrixService;

/**
 * 模拟一个对外的接口.
 */
@RestController
public class HystrixController {

    @Autowired
    private HystrixService service;
    /**
     * 调用依赖的服务
     */
    @RequestMapping("/call")
    public String callDependencyService(){
        return service.callDependencyService();
    }
}