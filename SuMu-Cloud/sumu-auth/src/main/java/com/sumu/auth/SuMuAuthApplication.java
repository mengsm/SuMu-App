package com.sumu.auth;

import com.sumu.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 认证授权中心
 *
 * @author sumu
 */
@EnableRyFeignClients
@SpringCloudApplication
public class SuMuAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SuMuAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ __  __ \n" +
                " / ____|  \\/  |\n" +
                "| (___ | \\  / |\n" +
                " \\___ \\| |\\/| |\n" +
                " ____) | |  | |\n" +
                "|_____/|_|  |_|\n");
    }
}
