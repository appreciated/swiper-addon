package com.github.appreciated.config;

public class Accessibility {
    boolean enabled;
    String prevSlideMessage;
    String nextSlideMessage;
    String firstSlideMessage;
    String lastSlideMessage;
    String paginationBulletMessage;
    String notificationClass;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPrevSlideMessage() {
        return prevSlideMessage;
    }

    public void setPrevSlideMessage(String prevSlideMessage) {
        this.prevSlideMessage = prevSlideMessage;
    }

    public String getNextSlideMessage() {
        return nextSlideMessage;
    }

    public void setNextSlideMessage(String nextSlideMessage) {
        this.nextSlideMessage = nextSlideMessage;
    }

    public String getFirstSlideMessage() {
        return firstSlideMessage;
    }

    public void setFirstSlideMessage(String firstSlideMessage) {
        this.firstSlideMessage = firstSlideMessage;
    }

    public String getLastSlideMessage() {
        return lastSlideMessage;
    }

    public void setLastSlideMessage(String lastSlideMessage) {
        this.lastSlideMessage = lastSlideMessage;
    }

    public String getPaginationBulletMessage() {
        return paginationBulletMessage;
    }

    public void setPaginationBulletMessage(String paginationBulletMessage) {
        this.paginationBulletMessage = paginationBulletMessage;
    }

    public String getNotificationClass() {
        return notificationClass;
    }

    public void setNotificationClass(String notificationClass) {
        this.notificationClass = notificationClass;
    }
}
