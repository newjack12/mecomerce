package com.jiafu.gulimallproduct;

import com.jiafu.gulimallproduct.product.entity.BrandEntity;
import com.jiafu.gulimallproduct.product.service.BrandService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {


        SpringApplication.run(GulimallProductApplication.class, args);

        System.out.println("✅ Brand saved successfully!");
    }
}
