package com.github.appreciated.config;

public class CoverflowEffect {
    private Boolean slideShadows;
    private Double rotate;
    private Double stretch;
    private Double depth;
    private Double modifier;

    public CoverflowEffect() {
    }

    public Boolean isSlideShadows() {
        return slideShadows;
    }

    public Boolean getSlideShadows() {
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

}
