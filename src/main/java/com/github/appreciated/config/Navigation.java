package com.github.appreciated.config;

public class Navigation {
    String nextEl;
    String prevEl;
    Boolean hideOnClick;
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

    public Boolean isHideOnClick() {
        return hideOnClick;
    }

    public void setHideOnClick(Boolean hideOnClick) {
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
