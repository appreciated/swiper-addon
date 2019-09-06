package com.github.appreciated.config.builder;

import com.github.appreciated.config.FlipEffect;

public class FlipEffectBuilder {
    private Boolean slideShadows;
    private Boolean limitRotation;

    private FlipEffectBuilder() {
    }

    public static FlipEffectBuilder get() {
        return new FlipEffectBuilder();
    }

    public FlipEffectBuilder withSlideShadows(Boolean slideShadows) {
        this.slideShadows = slideShadows;
        return this;
    }

    public FlipEffectBuilder withLimitRotation(Boolean limitRotation) {
        this.limitRotation = limitRotation;
        return this;
    }

    public FlipEffect build() {
        FlipEffect flipEffect = new FlipEffect();
        flipEffect.setSlideShadows(slideShadows);
        flipEffect.setLimitRotation(limitRotation);
        return flipEffect;
    }
}
