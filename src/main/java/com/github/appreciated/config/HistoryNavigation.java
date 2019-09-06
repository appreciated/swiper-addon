package com.github.appreciated.config;

public class HistoryNavigation {
    private Boolean replaceState;
    private String key;

    public HistoryNavigation() {
    }

    public Boolean isReplaceState() {
        return replaceState;
    }

    public Boolean getReplaceState() {
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
