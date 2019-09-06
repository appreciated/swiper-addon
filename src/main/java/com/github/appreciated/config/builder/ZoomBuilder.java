package com.github.appreciated.config.builder;

import com.github.appreciated.config.Zoom;

public class ZoomBuilder {
    private Double maxRatio;
    private Double minRatio;
    private Boolean toggle;
    private String containerClass;
    private String zoomedSlideClass;

    private ZoomBuilder() {
    }

    public static ZoomBuilder aZoom() {
        return new ZoomBuilder();
    }

    public ZoomBuilder withMaxRatio(Double maxRatio) {
        this.maxRatio = maxRatio;
        return this;
    }

    public ZoomBuilder withMinRatio(Double minRatio) {
        this.minRatio = minRatio;
        return this;
    }

    public ZoomBuilder withToggle(Boolean toggle) {
        this.toggle = toggle;
        return this;
    }

    public ZoomBuilder withContainerClass(String containerClass) {
        this.containerClass = containerClass;
        return this;
    }

    public ZoomBuilder withZoomedSlideClass(String zoomedSlideClass) {
        this.zoomedSlideClass = zoomedSlideClass;
        return this;
    }

    public Zoom build() {
        Zoom zoom = new Zoom();
        zoom.setMaxRatio(maxRatio);
        zoom.setMinRatio(minRatio);
        zoom.setToggle(toggle);
        zoom.setContainerClass(containerClass);
        zoom.setZoomedSlideClass(zoomedSlideClass);
        return zoom;
    }
}
