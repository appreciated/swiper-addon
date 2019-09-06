package com.github.appreciated.config.builder;

import com.github.appreciated.config.Accessibility;

public class AccessibilityBuilder {
    private Boolean enabled;
    private String prevSlideMessage;
    private String nextSlideMessage;
    private String firstSlideMessage;
    private String lastSlideMessage;
    private String paginationBulletMessage;
    private String notificationClass;

    private AccessibilityBuilder() {
    }

    public static AccessibilityBuilder get() {
        return new AccessibilityBuilder();
    }

    public AccessibilityBuilder withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AccessibilityBuilder withPrevSlideMessage(String prevSlideMessage) {
        this.prevSlideMessage = prevSlideMessage;
        return this;
    }

    public AccessibilityBuilder withNextSlideMessage(String nextSlideMessage) {
        this.nextSlideMessage = nextSlideMessage;
        return this;
    }

    public AccessibilityBuilder withFirstSlideMessage(String firstSlideMessage) {
        this.firstSlideMessage = firstSlideMessage;
        return this;
    }

    public AccessibilityBuilder withLastSlideMessage(String lastSlideMessage) {
        this.lastSlideMessage = lastSlideMessage;
        return this;
    }

    public AccessibilityBuilder withPaginationBulletMessage(String paginationBulletMessage) {
        this.paginationBulletMessage = paginationBulletMessage;
        return this;
    }

    public AccessibilityBuilder withNotificationClass(String notificationClass) {
        this.notificationClass = notificationClass;
        return this;
    }

    public Accessibility build() {
        Accessibility accessibility = new Accessibility();
        accessibility.setEnabled(enabled);
        accessibility.setPrevSlideMessage(prevSlideMessage);
        accessibility.setNextSlideMessage(nextSlideMessage);
        accessibility.setFirstSlideMessage(firstSlideMessage);
        accessibility.setLastSlideMessage(lastSlideMessage);
        accessibility.setPaginationBulletMessage(paginationBulletMessage);
        accessibility.setNotificationClass(notificationClass);
        return accessibility;
    }
}
