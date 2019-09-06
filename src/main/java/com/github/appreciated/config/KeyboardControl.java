package com.github.appreciated.config;

public class KeyboardControl {
    Boolean enabled;
    Boolean onlyInViewport;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean isOnlyInViewport() {
        return onlyInViewport;
    }

    public void setOnlyInViewport(Boolean onlyInViewport) {
        this.onlyInViewport = onlyInViewport;
    }
}
