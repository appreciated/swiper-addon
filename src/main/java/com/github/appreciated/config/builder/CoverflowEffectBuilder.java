package com.github.appreciated.config.builder;

import com.github.appreciated.config.CoverflowEffect;

public class CoverflowEffectBuilder {
    private Boolean slideShadows;
    private Double rotate;
    private Double stretch;
    private Double depth;
    private Double modifier;

    private CoverflowEffectBuilder() {
    }

    public static CoverflowEffectBuilder aCoverflowEffect() {
        return new CoverflowEffectBuilder();
    }

    public CoverflowEffectBuilder withSlideShadows(Boolean slideShadows) {
        this.slideShadows = slideShadows;
        return this;
    }

    public CoverflowEffectBuilder withRotate(Double rotate) {
        this.rotate = rotate;
        return this;
    }

    public CoverflowEffectBuilder withStretch(Double stretch) {
        this.stretch = stretch;
        return this;
    }

    public CoverflowEffectBuilder withDepth(Double depth) {
        this.depth = depth;
        return this;
    }

    public CoverflowEffectBuilder withModifier(Double modifier) {
        this.modifier = modifier;
        return this;
    }

    public CoverflowEffect build() {
        CoverflowEffect coverflowEffect = new CoverflowEffect();
        coverflowEffect.setSlideShadows(slideShadows);
        coverflowEffect.setRotate(rotate);
        coverflowEffect.setStretch(stretch);
        coverflowEffect.setDepth(depth);
        coverflowEffect.setModifier(modifier);
        return coverflowEffect;
    }
}
