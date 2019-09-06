package com.github.appreciated.config;

public class HistoryNavigation {
    Boolean replaceState;
    String key;

    public Boolean isReplaceState() {
        return replaceState;
    }

    public void setReplaceState(Boolean replaceState) {
        this.replaceState = replaceState;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
