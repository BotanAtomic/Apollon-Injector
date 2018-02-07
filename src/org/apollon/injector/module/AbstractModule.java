package org.apollon.injector.module;

import org.apollon.injector.binder.Binder;
import org.apollon.injector.object.ClassInstance;

public abstract class AbstractModule {

    private Binder binder;

    public void attachBinder(Binder binder) {
        this.binder = binder;
    }

    protected ClassInstance bind(Class<?> clazz) {
        return ClassInstance.create(clazz);
    }

    public abstract void configure();

}
