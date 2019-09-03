package com.github.appreciated.config;

public enum Direction {
    HORIZONTAL("horizontal"), VERTICAL("vertical");

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
