package com.sumu.common.swagger.annotation;

import com.sumu.common.swagger.config.GatewaySwaggerAutoConfiguration;
import com.sumu.common.swagger.config.SwaggerAutoConfiguration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.*;

/**
 * @author sumu
 * @date 2020/10/2 开启pig swagger
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableSwagger2
@Import({ SwaggerAutoConfiguration.class, GatewaySwaggerAutoConfiguration.class })
public @interface EnableSuMuSwagger2 {

}
