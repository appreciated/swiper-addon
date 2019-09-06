package com.github.appreciated.config;

public class CoverflowEffect {
    Boolean slideShadows;
    Double rotate;
    Double stretch;
    Double depth;
    Double modifier;

    public Boolean isSlideShadows() {
        return slideShadows;
    }

    public void setSlideShadows(Boolean slideShadows) {
        this.slideShadows = slideShadows;
    }

    public Double getRotate() {
        return rotate;
    }

    public void setRotate(Double rotate) {
        this.rotate = rotate;
    }

    public Double getStretch() {
        return stretch;
    }

    public void setStretch(Double stretch) {
        this.stretch = stretch;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getModifier() {
        return modifier;
    }

    public void setModifier(Double modifier) {
        this.modifier = modifier;
    }
};
