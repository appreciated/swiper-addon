package com.github.appreciated.config.builder;

import com.github.appreciated.Swiper;
import com.github.appreciated.config.Controller;

public class ControllerBuilder {
    private Swiper control;
    private Boolean inverse;
    private String by;

    private ControllerBuilder() {
    }

    public static ControllerBuilder get() {
        return new ControllerBuilder();
    }

    public ControllerBuilder withControl(Swiper control) {
        this.control = control;
        return this;
    }

    public ControllerBuilder withInverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public ControllerBuilder withBy(String by) {
        this.by = by;
        return this;
    }

    public Controller build() {
        Controller controller = new Controller();
        controller.setControl(control);
        controller.setInverse(inverse);
        controller.setBy(by);
        return controller;
    }
}
