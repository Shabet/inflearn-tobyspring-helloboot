package tobyspring.helloboot.config.V7;

import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    private final ClassLoader classLoader;

    public MyAutoConfigImportSelector(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> autoConfig = new ArrayList<>();

/*        for (String candidate : ImportCandidates.load(MyAutoConfiguration.class, classLoader)) {
            autoConfig.add(candidate);
        }*/
/*        ImportCandidates.load(MyAutoConfiguration.class, classLoader).forEach(candidate ->
                autoConfig.add(candidate)
        );*/
        ImportCandidates.load(MyAutoConfiguration.class, classLoader).forEach(autoConfig::add);

        return autoConfig.toArray(new String[0]);
//        return autoConfig.stream().toArray(String[]::new);
//        return Arrays.copyOf(autoConfig.toArray(), autoConfig.size(), String[].class);

//        Iterable<String> candidates = ImportCandidates.load(MyAutoConfiguration.class, classLoader);
//        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);
    }
}
