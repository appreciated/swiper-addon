package com.github.appreciated.config;

public class Zoom {
    private Double maxRatio;
    private Double minRatio;
    private Boolean toggle;
    private String containerClass;
    private String zoomedSlideClass;

    public Zoom() {
    }

    public Boolean isToggle() {
        return toggle;
    }

    public Double getMaxRatio() {
        return maxRatio;
    }

    public void setMaxRatio(Double maxRatio) {
        this.maxRatio = maxRatio;
    }

    public Double getMinRatio() {
        return minRatio;
    }

    public void setMinRatio(Double minRatio) {
        this.minRatio = minRatio;
    }

    public Boolean getToggle() {
        return toggle;
    }

    public void setToggle(Boolean toggle) {
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
