package com.github.appreciated.config.builder;

import com.github.appreciated.config.HistoryNavigation;

public class HistoryNavigationBuilder {
    private Boolean replaceState;
    private String key;

    private HistoryNavigationBuilder() {
    }

    public static HistoryNavigationBuilder aHistoryNavigation() {
        return new HistoryNavigationBuilder();
    }

    public HistoryNavigationBuilder withReplaceState(Boolean replaceState) {
        this.replaceState = replaceState;
        return this;
    }

    public HistoryNavigationBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public HistoryNavigation build() {
        HistoryNavigation historyNavigation = new HistoryNavigation();
        historyNavigation.setReplaceState(replaceState);
        historyNavigation.setKey(key);
        return historyNavigation;
    }
}
