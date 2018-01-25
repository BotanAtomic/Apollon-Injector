package org.apollon.injector.core;

import org.apollon.injector.module.AbstractModule;

import java.util.List;

public class Injector {

    private final List<AbstractModule> modules;

    public static Injector create(AbstractModule...modules) {
        return new Injector(modules);
    }

    private Injector(AbstractModule...modules) {
        this.modules = List.of(modules);

        initialize();
    }

    private void initialize() {
        this.modules.forEach(AbstractModule::configure);
    }

}
