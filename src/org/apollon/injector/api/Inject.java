package org.apollon.injector.api;

import java.lang.annotation.*;

@Target({ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {

    String value() default "";

}
