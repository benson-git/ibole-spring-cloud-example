package io.ibole.springcloud.web.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;
    /**
     * 
     * HystrixCommand 表明该方法为hystrix包裹，可以对依赖服务进行隔离、降级、快速失败、快速重试等等hystrix相关功能 
	 * 该注解属性较多，下面讲解其中几个:
	 * fallbackMethod 降级方法
	 * commandProperties 普通配置属性，可以配置HystrixCommand对应属性，例如采用线程池还是信号量隔离、熔断器熔断规则等等
	 * ignoreExceptions 忽略的异常，默认HystrixBadRequestException不计入失败
	 * groupKey() 组名称，默认使用类名称
	 * commandKey 命令名称，默认使用方法名
     */
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a1=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }

}
