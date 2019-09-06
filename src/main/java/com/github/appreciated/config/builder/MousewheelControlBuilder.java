package com.github.appreciated.config.builder;

import com.github.appreciated.config.MousewheelControl;

public class MousewheelControlBuilder {
    private Boolean forceToAxis;
    private Boolean releaseOnEdges;
    private Boolean invert;
    private Double sensitivity;
    private String eventsTarged;

    private MousewheelControlBuilder() {
    }

    public static MousewheelControlBuilder aMousewheelControl() {
        return new MousewheelControlBuilder();
    }

    public MousewheelControlBuilder withForceToAxis(Boolean forceToAxis) {
        this.forceToAxis = forceToAxis;
        return this;
    }

    public MousewheelControlBuilder withReleaseOnEdges(Boolean releaseOnEdges) {
        this.releaseOnEdges = releaseOnEdges;
        return this;
    }

    public MousewheelControlBuilder withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    public MousewheelControlBuilder withSensitivity(Double sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    public MousewheelControlBuilder withEventsTarged(String eventsTarged) {
        this.eventsTarged = eventsTarged;
        return this;
    }

    public MousewheelControl build() {
        MousewheelControl mousewheelControl = new MousewheelControl();
        mousewheelControl.setForceToAxis(forceToAxis);
        mousewheelControl.setReleaseOnEdges(releaseOnEdges);
        mousewheelControl.setInvert(invert);
        mousewheelControl.setSensitivity(sensitivity);
        mousewheelControl.setEventsTarged(eventsTarged);
        return mousewheelControl;
    }
}
