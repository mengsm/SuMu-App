package com.sumu.gen;

import com.sumu.common.security.annotation.EnableCustomConfig;
import com.sumu.common.security.annotation.EnableRyFeignClients;
import com.sumu.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 代码生成
 *
 * @author sumu
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class SuMuGenApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SuMuGenApplication.class, args);
    }
}
