package com.github.appreciated.config;

public class CoverflowEffect {
    boolean slideShadows;
    double rotate;
    double stretch;
    double depth;
    double modifier;

    public boolean isSlideShadows() {
        return slideShadows;
    }

    public void setSlideShadows(boolean slideShadows) {
        this.slideShadows = slideShadows;
    }

    public double getRotate() {
        return rotate;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    public double getStretch() {
        return stretch;
    }

    public void setStretch(double stretch) {
        this.stretch = stretch;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getModifier() {
        return modifier;
    }

    public void setModifier(double modifier) {
        this.modifier = modifier;
    }
};
