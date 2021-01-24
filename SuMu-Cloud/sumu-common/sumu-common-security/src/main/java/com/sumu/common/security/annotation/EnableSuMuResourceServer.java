

package com.sumu.common.security.annotation;

import com.sumu.common.security.component.SuMuResourceServerAutoConfiguration;
import com.sumu.common.security.component.SuMuSecurityBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.lang.annotation.*;

/**
 * @author sumu
 * @date 2019/03/08
 * <p>
 * 资源服务注解
 */
@Documented
@Inherited
@EnableResourceServer
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import({ SuMuResourceServerAutoConfiguration.class, SuMuSecurityBeanDefinitionRegistrar.class })
public @interface EnableSuMuResourceServer {

}
