package com.sumu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关启动程序
 *
 * @author sumu
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SuMuGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SuMuGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  苏木网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ __  __ \n" +
                " / ____|  \\/  |\n" +
                "| (___ | \\  / |\n" +
                " \\___ \\| |\\/| |\n" +
                " ____) | |  | |\n" +
                "|_____/|_|  |_|\n");
    }
}
