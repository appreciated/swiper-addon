package com.github.appreciated.config.builder;

import com.github.appreciated.config.Autoplay;

public class AutoplayBuilder {
    private Double delay;
    private Boolean stopOnLastSlide;
    private Boolean disableOnInteraction;
    private Boolean reverseDirection;
    private Boolean waitForTransition;

    private AutoplayBuilder() {
    }

    public static AutoplayBuilder aAutoplay() {
        return new AutoplayBuilder();
    }

    public AutoplayBuilder withDelay(Double delay) {
        this.delay = delay;
        return this;
    }

    public AutoplayBuilder withStopOnLastSlide(Boolean stopOnLastSlide) {
        this.stopOnLastSlide = stopOnLastSlide;
        return this;
    }

    public AutoplayBuilder withDisableOnInteraction(Boolean disableOnInteraction) {
        this.disableOnInteraction = disableOnInteraction;
        return this;
    }

    public AutoplayBuilder withReverseDirection(Boolean reverseDirection) {
        this.reverseDirection = reverseDirection;
        return this;
    }

    public AutoplayBuilder withWaitForTransition(Boolean waitForTransition) {
        this.waitForTransition = waitForTransition;
        return this;
    }

    public Autoplay build() {
        Autoplay autoplay = new Autoplay();
        autoplay.setDelay(delay);
        autoplay.setStopOnLastSlide(stopOnLastSlide);
        autoplay.setDisableOnInteraction(disableOnInteraction);
        autoplay.setReverseDirection(reverseDirection);
        autoplay.setWaitForTransition(waitForTransition);
        return autoplay;
    }
}
