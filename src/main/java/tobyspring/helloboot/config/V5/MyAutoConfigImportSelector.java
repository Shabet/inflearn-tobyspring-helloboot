package tobyspring.helloboot.config.V5;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "tobyspring.helloboot.config.V5.autoconfig.DispatcherServletConfig",
                "tobyspring.helloboot.config.V5.autoconfig.TomcatWebServerConfig"
        };
    }
}
