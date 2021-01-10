package org.example.configs;

import com.google.inject.AbstractModule;
import org.example.factories.Factory;
import org.example.factories.WebDriverFactory;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(Factory.class).to(WebDriverFactory.class);
    }
}
