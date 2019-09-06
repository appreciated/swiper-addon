package com.github.appreciated.config;

public class Pagination {
    String el;
    String type;
    String bulletElement;
    Boolean dynamicBullets;
    Double dynamicMainBullets;
    Boolean hideOnClick;
    Boolean clickable;
    Boolean progressbarOpposite;
    String bulletClass;
    String bulletActiveClass;
    String modifierClass;
    String currentClass;
    String totalClass;
    String hiddenClass;
    String progressbarFillClass;
    String clickableClass;
    String lockClass;

    /**
     * function(Double)   formatFractionCurrent;
     * function(Double)   formatFractionTotal  ;
     * function(index, className)   renderBullet         ;
     * function(currentClass, totalClass)   renderFraction       ;
     * function(progressbarFillClass)   renderProgressbar    ;
     * function(swiper, current, total)   renderCustom         ;
     */

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

    public Boolean isDynamicBullets() {
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

    public Boolean isHideOnClick() {
        return hideOnClick;
    }

    public void setHideOnClick(Boolean hideOnClick) {
        this.hideOnClick = hideOnClick;
    }

    public Boolean isClickable() {
        return clickable;
    }

    public void setClickable(Boolean clickable) {
        this.clickable = clickable;
    }

    public Boolean isProgressbarOpposite() {
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
