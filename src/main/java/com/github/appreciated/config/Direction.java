package com.github.appreciated.config;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Direction {
    HORIZONTAL("horizontal"), VERTICAL("vertical");

    private String name;

    Direction(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
