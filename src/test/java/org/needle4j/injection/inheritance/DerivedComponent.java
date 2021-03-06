package org.needle4j.injection.inheritance;

import javax.inject.Inject;

import org.needle4j.MyComponent;

public class DerivedComponent extends BaseComponent {

    @Inject
    private MyComponent componentFieldInjectionDerived;

    private MyComponent componentSetterInjectionDerived;

    @Override
    public MyComponent getComponentByFieldInjection() {
        return componentFieldInjectionDerived;
    }

    public MyComponent getComponentFromBaseByFieldInjection() {
        return super.getComponentByFieldInjection();
    }

    @Inject
    public void setComponentBySetter(final MyComponent component) {
        componentSetterInjectionDerived = component;
    }

    public MyComponent getComponentBySetter() {
        return componentSetterInjectionDerived;
    }

    public MyComponent getComponentFromBaseBySetter() {
        return super.getComponentBySetter();
    }
}
