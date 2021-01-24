package com.sumu.auth;

import com.sumu.common.feign.annotation.EnableSuMuFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author sumu
 * @date 2018年06月21日 认证授权中心
 */
@EnableSuMuFeignClients
@SpringCloudApplication
public class SuMuAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuMuAuthApplication.class, args);
	}

}
