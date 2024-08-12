package tobyspring.helloboot.config.V4;

import org.springframework.context.annotation.Import;
import tobyspring.helloboot.config.V4.autoconfig.DispatcherServletConfig;
import tobyspring.helloboot.config.V4.autoconfig.TomcatWebServerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyAutoConfigImportSelector.class)
public @interface EnableMyAutoConfiguration {
}
