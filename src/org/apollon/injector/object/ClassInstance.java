package org.apollon.injector.object;

import java.lang.annotation.Annotation;

public class ClassInstance {

    private final Class<?> clazz;

    private Annotation annotation;

    private String name;

    private Object instance;

    private boolean singleton;

    private ClassInstance(Class<?> clazz) {
        this.clazz = clazz;
    }

    public static ClassInstance create(Class<?> clazz) {
        return new ClassInstance(clazz);
    }

    public ClassInstance toAnnotation(Annotation annotation) {
        this.annotation = annotation;
        return this;
    }

    public void toInstance(Object object) {
        this.instance = object;
    }

    public void asSingleton() {
        this.singleton = true;
    }

    public Object get() {
        Object instance = this.instance;

        if (instance == null && singleton) {
            try {
                instance = clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                //TODO : exception
            }
        }

        return instance;
    }

}
