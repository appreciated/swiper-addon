package com.github.appreciated.config;

public class Scrollbar {
    String el;
    Boolean hide;
    Boolean draggable;
    Boolean snapOnRelease;
    String dragSize;
    String lockClass;
    String dragClass;

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public Boolean isHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public Boolean isDraggable() {
        return draggable;
    }

    public void setDraggable(Boolean draggable) {
        this.draggable = draggable;
    }

    public Boolean isSnapOnRelease() {
        return snapOnRelease;
    }

    public void setSnapOnRelease(Boolean snapOnRelease) {
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
