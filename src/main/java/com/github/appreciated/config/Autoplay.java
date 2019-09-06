package com.github.appreciated.config;

public class Autoplay {

    double delay;
    boolean stopOnLastSlide;
    boolean disableOnInteraction;
    boolean reverseDirection;
    boolean waitForTransition;

    public double getDelay() {
        return delay;
    }

    public void setDelay(double delay) {
        this.delay = delay;
    }

    public boolean isStopOnLastSlide() {
        return stopOnLastSlide;
    }

    public void setStopOnLastSlide(boolean stopOnLastSlide) {
        this.stopOnLastSlide = stopOnLastSlide;
    }

    public boolean isDisableOnInteraction() {
        return disableOnInteraction;
    }

    public void setDisableOnInteraction(boolean disableOnInteraction) {
        this.disableOnInteraction = disableOnInteraction;
    }

    public boolean isReverseDirection() {
        return reverseDirection;
    }

    public void setReverseDirection(boolean reverseDirection) {
        this.reverseDirection = reverseDirection;
    }

    public boolean isWaitForTransition() {
        return waitForTransition;
    }

    public void setWaitForTransition(boolean waitForTransition) {
        this.waitForTransition = waitForTransition;
    }
}
