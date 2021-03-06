package com.github.wendao76.springcloud.serviceconsumerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 *
 * @author wendao76
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MvcServiceConsumerServer {

    public static void main(String[] args) {
        SpringApplication.run(MvcServiceConsumerServer.class, args);
    }

}
