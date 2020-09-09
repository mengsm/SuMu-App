package com.sumu.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 *
 * @author sumu
 */
@EnableAdminServer
@SpringCloudApplication
public class SuMuMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SuMuMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ __  __ \n" +
                " / ____|  \\/  |\n" +
                "| (___ | \\  / |\n" +
                " \\___ \\| |\\/| |\n" +
                " ____) | |  | |\n" +
                "|_____/|_|  |_|\n");
    }
}
