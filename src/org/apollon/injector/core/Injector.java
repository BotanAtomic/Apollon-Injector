package org.apollon.injector.core;

import org.apollon.injector.binder.Binder;
import org.apollon.injector.module.AbstractModule;

import java.util.List;

public class Injector extends Binder {

    private final List<AbstractModule> modules;

    private Injector(AbstractModule... modules) {
        this.modules = List.of(modules);

        initialize();
    }

    public static Injector create(AbstractModule... modules) {
        return new Injector(modules);
    }

    private void initialize() {
        this.modules.forEach(module -> {
            module.attachBinder(this);
            module.configure();
        });

    }

}
