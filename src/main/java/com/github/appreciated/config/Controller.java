package com.github.appreciated.config;

import com.github.appreciated.Swiper;

public class Controller {

    Swiper control;
    boolean inverse;
    String by;

    public Swiper getControl() {
        return control;
    }

    public void setControl(Swiper control) {
        this.control = control;
    }

    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
