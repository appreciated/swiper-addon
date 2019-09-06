package com.github.appreciated.config;

public class HistoryNavigation {
    boolean replaceState;
    String key;

    public boolean isReplaceState() {
        return replaceState;
    }

    public void setReplaceState(boolean replaceState) {
        this.replaceState = replaceState;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
