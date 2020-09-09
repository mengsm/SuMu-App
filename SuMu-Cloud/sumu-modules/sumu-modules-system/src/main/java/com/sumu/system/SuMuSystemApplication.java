package com.sumu.system;

import com.sumu.common.security.annotation.EnableCustomConfig;
import com.sumu.common.security.annotation.EnableRyFeignClients;
import com.sumu.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 系统模块
 *
 * @author sumu
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class SuMuSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SuMuSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ __  __ \n" +
                " / ____|  \\/  |\n" +
                "| (___ | \\  / |\n" +
                " \\___ \\| |\\/| |\n" +
                " ____) | |  | |\n" +
                "|_____/|_|  |_|\n");
    }
}
