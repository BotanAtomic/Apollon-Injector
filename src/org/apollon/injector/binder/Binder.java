package org.apollon.injector.binder;

import org.apollon.injector.object.ClassInstance;

import java.lang.annotation.Annotation;
import java.util.concurrent.CopyOnWriteArrayList;

public class Binder extends CopyOnWriteArrayList<ClassInstance> {

    public ClassInstance bind(Class<?> clazz) {
        ClassInstance classInstance = ClassInstance.create(clazz);
        super.add(classInstance);
        return classInstance;
    }

    public <T> T getInstance(Class<T> classPattern) {
        return (T) find(classPattern, null, null).get();
    }

    private <T> ClassInstance find(Class<T> classPattern, String name, Annotation annotation) {

    }

}
