package com.github.appreciated.config.builder;

import com.github.appreciated.config.KeyboardControl;

public class KeyboardControlBuilder {
    private Boolean enabled;
    private Boolean onlyInViewport;

    private KeyboardControlBuilder() {
    }

    public static KeyboardControlBuilder aKeyboardControl() {
        return new KeyboardControlBuilder();
    }

    public KeyboardControlBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public KeyboardControlBuilder withOnlyInViewport(Boolean onlyInViewport) {
        this.onlyInViewport = onlyInViewport;
        return this;
    }

    public KeyboardControl build() {
        KeyboardControl keyboardControl = new KeyboardControl();
        keyboardControl.setEnabled(enabled);
        keyboardControl.setOnlyInViewport(onlyInViewport);
        return keyboardControl;
    }
}
