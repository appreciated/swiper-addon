package com.github.appreciated.config;

public class FlipEffect {
    private Boolean slideShadows;
    private Boolean limitRotation;

    public FlipEffect() {
    }

    public Boolean isSlideShadows() {
        return slideShadows;
    }

    public Boolean isLimitRotation() {
        return limitRotation;
    }

    public Boolean getSlideShadows() {
        return slideShadows;
    }

    public void setSlideShadows(Boolean slideShadows) {
        this.slideShadows = slideShadows;
    }

    public Boolean getLimitRotation() {
        return limitRotation;
    }

    public void setLimitRotation(Boolean limitRotation) {
        this.limitRotation = limitRotation;
    }

}
