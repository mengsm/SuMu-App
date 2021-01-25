package com.sumu.gateway;

import com.sumu.common.swagger.annotation.EnableSuMuSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author sumu
 * @date 2018年06月21日
 * <p>
 * 网关应用
 */
@EnableSuMuSwagger2
@SpringCloudApplication
public class SuMuGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuMuGatewayApplication.class, args);
	}

}
