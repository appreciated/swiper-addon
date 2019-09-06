package com.github.appreciated.config;

public class Zoom {
    double maxRatio;
    double minRatio;
    boolean toggle;
    String containerClass;
    String zoomedSlideClass;

    public double getMaxRatio() {
        return maxRatio;
    }

    public void setMaxRatio(double maxRatio) {
        this.maxRatio = maxRatio;
    }

    public double getMinRatio() {
        return minRatio;
    }

    public void setMinRatio(double minRatio) {
        this.minRatio = minRatio;
    }

    public boolean isToggle() {
        return toggle;
    }

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }

    public String getContainerClass() {
        return containerClass;
    }

    public void setContainerClass(String containerClass) {
        this.containerClass = containerClass;
    }

    public String getZoomedSlideClass() {
        return zoomedSlideClass;
    }

    public void setZoomedSlideClass(String zoomedSlideClass) {
        this.zoomedSlideClass = zoomedSlideClass;
    }
}
