package com.github.appreciated.config;

public class Navigation {
    String nextEl;
    String prevEl;
    boolean hideOnClick;
    String disabledClass;
    String hiddenClass;

    public String getNextEl() {
        return nextEl;
    }

    public void setNextEl(String nextEl) {
        this.nextEl = nextEl;
    }

    public String getPrevEl() {
        return prevEl;
    }

    public void setPrevEl(String prevEl) {
        this.prevEl = prevEl;
    }

    public boolean isHideOnClick() {
        return hideOnClick;
    }

    public void setHideOnClick(boolean hideOnClick) {
        this.hideOnClick = hideOnClick;
    }

    public String getDisabledClass() {
        return disabledClass;
    }

    public void setDisabledClass(String disabledClass) {
        this.disabledClass = disabledClass;
    }

    public String getHiddenClass() {
        return hiddenClass;
    }

    public void setHiddenClass(String hiddenClass) {
        this.hiddenClass = hiddenClass;
    }
}
