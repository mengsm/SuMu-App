package com.sumu.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 *
 * @author ruoyi
 */
@EnableAdminServer
@SpringCloudApplication
public class SuMuMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SuMuMonitorApplication.class, args);
    }
}
