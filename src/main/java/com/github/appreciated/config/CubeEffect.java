package com.github.appreciated.config;

public class CubeEffect {
    Boolean slideShadows;
    Boolean shadow;
    Double shadowOffset;
    Double shadowScale;

    public Boolean isSlideShadows() {
        return slideShadows;
    }

    public void setSlideShadows(Boolean slideShadows) {
        this.slideShadows = slideShadows;
    }

    public Boolean isShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public Double getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(Double shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public Double getShadowScale() {
        return shadowScale;
    }

    public void setShadowScale(Double shadowScale) {
        this.shadowScale = shadowScale;
    }
}
