package com.github.appreciated.config;

public class Autoplay {

    Double delay;
    Boolean stopOnLastSlide;
    Boolean disableOnInteraction;
    Boolean reverseDirection;
    Boolean waitForTransition;

    public Double getDelay() {
        return delay;
    }

    public void setDelay(Double delay) {
        this.delay = delay;
    }

    public Boolean isStopOnLastSlide() {
        return stopOnLastSlide;
    }

    public void setStopOnLastSlide(Boolean stopOnLastSlide) {
        this.stopOnLastSlide = stopOnLastSlide;
    }

    public Boolean isDisableOnInteraction() {
        return disableOnInteraction;
    }

    public void setDisableOnInteraction(Boolean disableOnInteraction) {
        this.disableOnInteraction = disableOnInteraction;
    }

    public Boolean isReverseDirection() {
        return reverseDirection;
    }

    public void setReverseDirection(Boolean reverseDirection) {
        this.reverseDirection = reverseDirection;
    }

    public Boolean isWaitForTransition() {
        return waitForTransition;
    }

    public void setWaitForTransition(Boolean waitForTransition) {
        this.waitForTransition = waitForTransition;
    }
}
