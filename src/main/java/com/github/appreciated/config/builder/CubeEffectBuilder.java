package com.github.appreciated.config.builder;

import com.github.appreciated.config.CubeEffect;

public class CubeEffectBuilder {
    private Boolean slideShadows;
    private Boolean shadow;
    private Double shadowOffset;
    private Double shadowScale;

    private CubeEffectBuilder() {
    }

    public static CubeEffectBuilder get() {
        return new CubeEffectBuilder();
    }

    public CubeEffectBuilder withSlideShadows(Boolean slideShadows) {
        this.slideShadows = slideShadows;
        return this;
    }

    public CubeEffectBuilder withShadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public CubeEffectBuilder withShadowOffset(Double shadowOffset) {
        this.shadowOffset = shadowOffset;
        return this;
    }

    public CubeEffectBuilder withShadowScale(Double shadowScale) {
        this.shadowScale = shadowScale;
        return this;
    }

    public CubeEffect build() {
        CubeEffect cubeEffect = new CubeEffect();
        cubeEffect.setSlideShadows(slideShadows);
        cubeEffect.setShadow(shadow);
        cubeEffect.setShadowOffset(shadowOffset);
        cubeEffect.setShadowScale(shadowScale);
        return cubeEffect;
    }
}
