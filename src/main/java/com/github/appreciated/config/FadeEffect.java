package com.github.appreciated.config;

public class FadeEffect {
    private Boolean crossFade;

    public FadeEffect(Boolean crossFade) {
        this.crossFade = crossFade;
    }

    public Boolean isCrossFade() {
        return crossFade;
    }

    public void setCrossFade(Boolean crossFade) {
        this.crossFade = crossFade;
    }
}
