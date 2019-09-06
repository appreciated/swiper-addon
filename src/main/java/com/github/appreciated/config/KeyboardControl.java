package com.github.appreciated.config;

public class KeyboardControl {
    private Boolean enabled;
    private Boolean onlyInViewport;

    public KeyboardControl() {
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public Boolean isOnlyInViewport() {
        return onlyInViewport;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getOnlyInViewport() {
        return onlyInViewport;
    }

    public void setOnlyInViewport(Boolean onlyInViewport) {
        this.onlyInViewport = onlyInViewport;
    }

}
