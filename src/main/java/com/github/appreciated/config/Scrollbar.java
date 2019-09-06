package com.github.appreciated.config;

public class Scrollbar {
    String el;
    boolean hide;
    boolean draggable;
    boolean snapOnRelease;
    String dragSize;
    String lockClass;
    String dragClass;

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public boolean isDraggable() {
        return draggable;
    }

    public void setDraggable(boolean draggable) {
        this.draggable = draggable;
    }

    public boolean isSnapOnRelease() {
        return snapOnRelease;
    }

    public void setSnapOnRelease(boolean snapOnRelease) {
        this.snapOnRelease = snapOnRelease;
    }

    public String getDragSize() {
        return dragSize;
    }

    public void setDragSize(String dragSize) {
        this.dragSize = dragSize;
    }

    public String getLockClass() {
        return lockClass;
    }

    public void setLockClass(String lockClass) {
        this.lockClass = lockClass;
    }

    public String getDragClass() {
        return dragClass;
    }

    public void setDragClass(String dragClass) {
        this.dragClass = dragClass;
    }
}
