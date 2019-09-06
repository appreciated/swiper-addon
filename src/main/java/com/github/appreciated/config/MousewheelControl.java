package com.github.appreciated.config;

public class MousewheelControl {

    private Boolean forceToAxis;
    private Boolean releaseOnEdges;
    private Boolean invert;
    private Double sensitivity;
    private String eventsTarged;

    public MousewheelControl() {
    }

    public Boolean isForceToAxis() {
        return forceToAxis;
    }

    public Boolean isReleaseOnEdges() {
        return releaseOnEdges;
    }

    public Boolean isInvert() {
        return invert;
    }

    public Boolean getForceToAxis() {
        return forceToAxis;
    }

    public void setForceToAxis(Boolean forceToAxis) {
        this.forceToAxis = forceToAxis;
    }

    public Boolean getReleaseOnEdges() {
        return releaseOnEdges;
    }

    public void setReleaseOnEdges(Boolean releaseOnEdges) {
        this.releaseOnEdges = releaseOnEdges;
    }

    public Boolean getInvert() {
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
