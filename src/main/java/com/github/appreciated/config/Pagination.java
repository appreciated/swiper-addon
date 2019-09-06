package com.github.appreciated.config;

public class Pagination {
    private String el;
    private String type;
    private String bulletElement;
    private Boolean dynamicBullets;
    private Double dynamicMainBullets;
    private Boolean hideOnClick;
    private Boolean clickable;
    private Boolean progressbarOpposite;
    private String bulletClass;
    private String bulletActiveClass;
    private String modifierClass;
    private String currentClass;
    private String totalClass;
    private String hiddenClass;
    private String progressbarFillClass;
    private String clickableClass;
    private String lockClass;

    public Pagination() {
    }

    public Boolean isDynamicBullets() {
        return dynamicBullets;
    }

    public Boolean isHideOnClick() {
        return hideOnClick;
    }

    public Boolean isClickable() {
        return clickable;
    }

    public Boolean isProgressbarOpposite() {
        return progressbarOpposite;
    }

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBulletElement() {
        return bulletElement;
    }

    public void setBulletElement(String bulletElement) {
        this.bulletElement = bulletElement;
    }

    public Boolean getDynamicBullets() {
        return dynamicBullets;
    }

    public void setDynamicBullets(Boolean dynamicBullets) {
        this.dynamicBullets = dynamicBullets;
    }

    public Double getDynamicMainBullets() {
        return dynamicMainBullets;
    }

    public void setDynamicMainBullets(Double dynamicMainBullets) {
        this.dynamicMainBullets = dynamicMainBullets;
    }

    public Boolean getHideOnClick() {
        return hideOnClick;
    }

    public void setHideOnClick(Boolean hideOnClick) {
        this.hideOnClick = hideOnClick;
    }

    public Boolean getClickable() {
        return clickable;
    }

    public void setClickable(Boolean clickable) {
        this.clickable = clickable;
    }

    public Boolean getProgressbarOpposite() {
        return progressbarOpposite;
    }

    public void setProgressbarOpposite(Boolean progressbarOpposite) {
        this.progressbarOpposite = progressbarOpposite;
    }

    public String getBulletClass() {
        return bulletClass;
    }

    public void setBulletClass(String bulletClass) {
        this.bulletClass = bulletClass;
    }

    public String getBulletActiveClass() {
        return bulletActiveClass;
    }

    public void setBulletActiveClass(String bulletActiveClass) {
        this.bulletActiveClass = bulletActiveClass;
    }

    public String getModifierClass() {
        return modifierClass;
    }

    public void setModifierClass(String modifierClass) {
        this.modifierClass = modifierClass;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public String getTotalClass() {
        return totalClass;
    }

    public void setTotalClass(String totalClass) {
        this.totalClass = totalClass;
    }

    public String getHiddenClass() {
        return hiddenClass;
    }

    public void setHiddenClass(String hiddenClass) {
        this.hiddenClass = hiddenClass;
    }

    public String getProgressbarFillClass() {
        return progressbarFillClass;
    }

    public void setProgressbarFillClass(String progressbarFillClass) {
        this.progressbarFillClass = progressbarFillClass;
    }

    public String getClickableClass() {
        return clickableClass;
    }

    public void setClickableClass(String clickableClass) {
        this.clickableClass = clickableClass;
    }

    public String getLockClass() {
        return lockClass;
    }

    public void setLockClass(String lockClass) {
        this.lockClass = lockClass;
    }

}
