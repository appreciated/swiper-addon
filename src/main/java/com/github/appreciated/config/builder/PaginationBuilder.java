package com.github.appreciated.config.builder;

import com.github.appreciated.config.Pagination;

public class PaginationBuilder {
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

    private PaginationBuilder() {
    }

    public static PaginationBuilder aPagination() {
        return new PaginationBuilder();
    }

    public PaginationBuilder withEl(String el) {
        this.el = el;
        return this;
    }

    public PaginationBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public PaginationBuilder withBulletElement(String bulletElement) {
        this.bulletElement = bulletElement;
        return this;
    }

    public PaginationBuilder withDynamicBullets(Boolean dynamicBullets) {
        this.dynamicBullets = dynamicBullets;
        return this;
    }

    public PaginationBuilder withDynamicMainBullets(Double dynamicMainBullets) {
        this.dynamicMainBullets = dynamicMainBullets;
        return this;
    }

    public PaginationBuilder withHideOnClick(Boolean hideOnClick) {
        this.hideOnClick = hideOnClick;
        return this;
    }

    public PaginationBuilder withClickable(Boolean clickable) {
        this.clickable = clickable;
        return this;
    }

    public PaginationBuilder withProgressbarOpposite(Boolean progressbarOpposite) {
        this.progressbarOpposite = progressbarOpposite;
        return this;
    }

    public PaginationBuilder withBulletClass(String bulletClass) {
        this.bulletClass = bulletClass;
        return this;
    }

    public PaginationBuilder withBulletActiveClass(String bulletActiveClass) {
        this.bulletActiveClass = bulletActiveClass;
        return this;
    }

    public PaginationBuilder withModifierClass(String modifierClass) {
        this.modifierClass = modifierClass;
        return this;
    }

    public PaginationBuilder withCurrentClass(String currentClass) {
        this.currentClass = currentClass;
        return this;
    }

    public PaginationBuilder withTotalClass(String totalClass) {
        this.totalClass = totalClass;
        return this;
    }

    public PaginationBuilder withHiddenClass(String hiddenClass) {
        this.hiddenClass = hiddenClass;
        return this;
    }

    public PaginationBuilder withProgressbarFillClass(String progressbarFillClass) {
        this.progressbarFillClass = progressbarFillClass;
        return this;
    }

    public PaginationBuilder withClickableClass(String clickableClass) {
        this.clickableClass = clickableClass;
        return this;
    }

    public PaginationBuilder withLockClass(String lockClass) {
        this.lockClass = lockClass;
        return this;
    }

    public Pagination build() {
        Pagination pagination = new Pagination();
        pagination.setEl(el);
        pagination.setType(type);
        pagination.setBulletElement(bulletElement);
        pagination.setDynamicBullets(dynamicBullets);
        pagination.setDynamicMainBullets(dynamicMainBullets);
        pagination.setHideOnClick(hideOnClick);
        pagination.setClickable(clickable);
        pagination.setProgressbarOpposite(progressbarOpposite);
        pagination.setBulletClass(bulletClass);
        pagination.setBulletActiveClass(bulletActiveClass);
        pagination.setModifierClass(modifierClass);
        pagination.setCurrentClass(currentClass);
        pagination.setTotalClass(totalClass);
        pagination.setHiddenClass(hiddenClass);
        pagination.setProgressbarFillClass(progressbarFillClass);
        pagination.setClickableClass(clickableClass);
        pagination.setLockClass(lockClass);
        return pagination;
    }
}
