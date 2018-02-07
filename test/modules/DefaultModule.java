package modules;

import object.Test;
import org.apollon.injector.module.AbstractModule;

public class DefaultModule extends AbstractModule {

    @Override
    public void configure() {
        bind(Test.class).toInstance(new Test());
    }

}
