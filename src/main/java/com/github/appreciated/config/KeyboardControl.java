package com.github.appreciated.config;

public class KeyboardControl {
    boolean enabled;
    boolean onlyInViewport;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isOnlyInViewport() {
        return onlyInViewport;
    }

    public void setOnlyInViewport(boolean onlyInViewport) {
        this.onlyInViewport = onlyInViewport;
    }
}
