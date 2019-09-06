package com.github.appreciated.config;

public class CubeEffect {
    boolean slideShadows;
    boolean shadow;
    double shadowOffset;
    double shadowScale;

    public boolean isSlideShadows() {
        return slideShadows;
    }

    public void setSlideShadows(boolean slideShadows) {
        this.slideShadows = slideShadows;
    }

    public boolean isShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }

    public double getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(double shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public double getShadowScale() {
        return shadowScale;
    }

    public void setShadowScale(double shadowScale) {
        this.shadowScale = shadowScale;
    }
}
