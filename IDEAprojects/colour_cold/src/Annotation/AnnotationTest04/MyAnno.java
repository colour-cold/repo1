package Annotation.AnnotationTest04;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String className();

    String methodName();
}
