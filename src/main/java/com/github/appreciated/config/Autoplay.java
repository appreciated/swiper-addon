package com.github.appreciated.config;

public class Autoplay {

    private Double delay;
    private Boolean stopOnLastSlide;
    private Boolean disableOnInteraction;
    private Boolean reverseDirection;
    private Boolean waitForTransition;

    public Autoplay() {
    }

    public Boolean isStopOnLastSlide() {
        return stopOnLastSlide;
    }

    public Boolean isDisableOnInteraction() {
        return disableOnInteraction;
    }

    public Boolean isReverseDirection() {
        return reverseDirection;
    }

    public Boolean isWaitForTransition() {
        return waitForTransition;
    }

    public Double getDelay() {
        return delay;
    }

    public void setDelay(Double delay) {
        this.delay = delay;
    }

    public Boolean getStopOnLastSlide() {
        return stopOnLastSlide;
    }

    public void setStopOnLastSlide(Boolean stopOnLastSlide) {
        this.stopOnLastSlide = stopOnLastSlide;
    }

    public Boolean getDisableOnInteraction() {
        return disableOnInteraction;
    }

    public void setDisableOnInteraction(Boolean disableOnInteraction) {
        this.disableOnInteraction = disableOnInteraction;
    }

    public Boolean getReverseDirection() {
        return reverseDirection;
    }

    public void setReverseDirection(Boolean reverseDirection) {
        this.reverseDirection = reverseDirection;
    }

    public Boolean getWaitForTransition() {
        return waitForTransition;
    }

    public void setWaitForTransition(Boolean waitForTransition) {
        this.waitForTransition = waitForTransition;
    }

}
