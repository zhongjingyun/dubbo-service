package com.jiyuge;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zhongjingyun
 * @Date 2020/11/1 下午5:30
 **/
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.jiyuge")
//@EnableDiscoveryClient
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
