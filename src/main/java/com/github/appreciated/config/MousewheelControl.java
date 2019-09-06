package com.github.appreciated.config;

public class MousewheelControl {

    boolean forceToAxis;
    boolean releaseOnEdges;
    boolean invert;
    double sensitivity;
    String eventsTarged;

    public boolean isForceToAxis() {
        return forceToAxis;
    }

    public void setForceToAxis(boolean forceToAxis) {
        this.forceToAxis = forceToAxis;
    }

    public boolean isReleaseOnEdges() {
        return releaseOnEdges;
    }

    public void setReleaseOnEdges(boolean releaseOnEdges) {
        this.releaseOnEdges = releaseOnEdges;
    }

    public boolean isInvert() {
        return invert;
    }

    public void setInvert(boolean invert) {
        this.invert = invert;
    }

    public double getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(double sensitivity) {
        this.sensitivity = sensitivity;
    }

    public String getEventsTarged() {
        return eventsTarged;
    }

    public void setEventsTarged(String eventsTarged) {
        this.eventsTarged = eventsTarged;
    }
}
