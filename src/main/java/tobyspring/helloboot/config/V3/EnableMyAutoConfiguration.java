package tobyspring.helloboot.config.V3;

import org.springframework.context.annotation.Import;
import tobyspring.helloboot.config.V3.autoconfig.DispatcherServletConfig;
import tobyspring.helloboot.config.V3.autoconfig.TomcatWebServerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({DispatcherServletConfig.class, TomcatWebServerConfig.class})
public @interface EnableMyAutoConfiguration {
}
