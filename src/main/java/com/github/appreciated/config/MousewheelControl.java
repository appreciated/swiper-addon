package com.github.appreciated.config;

public class MousewheelControl {

    Boolean forceToAxis;
    Boolean releaseOnEdges;
    Boolean invert;
    Double sensitivity;
    String eventsTarged;

    public Boolean isForceToAxis() {
        return forceToAxis;
    }

    public void setForceToAxis(Boolean forceToAxis) {
        this.forceToAxis = forceToAxis;
    }

    public Boolean isReleaseOnEdges() {
        return releaseOnEdges;
    }

    public void setReleaseOnEdges(Boolean releaseOnEdges) {
        this.releaseOnEdges = releaseOnEdges;
    }

    public Boolean isInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public Double getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(Double sensitivity) {
        this.sensitivity = sensitivity;
    }

    public String getEventsTarged() {
        return eventsTarged;
    }

    public void setEventsTarged(String eventsTarged) {
        this.eventsTarged = eventsTarged;
    }
}
