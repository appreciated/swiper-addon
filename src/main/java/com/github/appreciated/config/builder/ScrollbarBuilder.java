package com.github.appreciated.config.builder;

import com.github.appreciated.config.Scrollbar;

public class ScrollbarBuilder {
    private String el;
    private Boolean hide;
    private Boolean draggable;
    private Boolean snapOnRelease;
    private String dragSize;
    private String lockClass;
    private String dragClass;

    private ScrollbarBuilder() {
    }

    public static ScrollbarBuilder aScrollbar() {
        return new ScrollbarBuilder();
    }

    public ScrollbarBuilder withEl(String el) {
        this.el = el;
        return this;
    }

    public ScrollbarBuilder withHide(Boolean hide) {
        this.hide = hide;
        return this;
    }

    public ScrollbarBuilder withDraggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public ScrollbarBuilder withSnapOnRelease(Boolean snapOnRelease) {
        this.snapOnRelease = snapOnRelease;
        return this;
    }

    public ScrollbarBuilder withDragSize(String dragSize) {
        this.dragSize = dragSize;
        return this;
    }

    public ScrollbarBuilder withLockClass(String lockClass) {
        this.lockClass = lockClass;
        return this;
    }

    public ScrollbarBuilder withDragClass(String dragClass) {
        this.dragClass = dragClass;
        return this;
    }

    public Scrollbar build() {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setEl(el);
        scrollbar.setHide(hide);
        scrollbar.setDraggable(draggable);
        scrollbar.setSnapOnRelease(snapOnRelease);
        scrollbar.setDragSize(dragSize);
        scrollbar.setLockClass(lockClass);
        scrollbar.setDragClass(dragClass);
        return scrollbar;
    }
}
