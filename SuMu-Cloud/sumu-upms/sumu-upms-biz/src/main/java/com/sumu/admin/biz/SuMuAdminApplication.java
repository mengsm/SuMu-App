package com.sumu.admin.biz;

import com.sumu.common.feign.annotation.EnableSuMuFeignClients;
import com.sumu.common.security.annotation.EnableSuMuResourceServer;
import com.sumu.common.swagger.annotation.EnableSuMuSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author sumu
 * @date 2018年06月21日 用户统一管理系统
 */
@EnableSuMuSwagger2
@EnableSuMuResourceServer
@EnableSuMuFeignClients
@SpringCloudApplication
public class SuMuAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuMuAdminApplication.class, args);
	}

}
