package com.github.appreciated.config.builder;

import com.github.appreciated.config.Navigation;

public class NavigationBuilder {
    private String nextEl;
    private String prevEl;
    private Boolean hideOnClick;
    private String disabledClass;
    private String hiddenClass;

    private NavigationBuilder() {
    }

    public static NavigationBuilder get() {
        return new NavigationBuilder();
    }

    public NavigationBuilder withNextEl(String nextEl) {
        this.nextEl = nextEl;
        return this;
    }

    public NavigationBuilder withPrevEl(String prevEl) {
        this.prevEl = prevEl;
        return this;
    }

    public NavigationBuilder withHideOnClick(Boolean hideOnClick) {
        this.hideOnClick = hideOnClick;
        return this;
    }

    public NavigationBuilder withDisabledClass(String disabledClass) {
        this.disabledClass = disabledClass;
        return this;
    }

    public NavigationBuilder withHiddenClass(String hiddenClass) {
        this.hiddenClass = hiddenClass;
        return this;
    }

    public Navigation build() {
        Navigation navigation = new Navigation();
        navigation.setNextEl(nextEl);
        navigation.setPrevEl(prevEl);
        navigation.setHideOnClick(hideOnClick);
        navigation.setDisabledClass(disabledClass);
        navigation.setHiddenClass(hiddenClass);
        return navigation;
    }
}
