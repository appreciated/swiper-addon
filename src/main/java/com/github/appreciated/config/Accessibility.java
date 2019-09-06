package com.github.appreciated.config;

public class Accessibility {
    private Boolean enabled;
    private String prevSlideMessage;
    private String nextSlideMessage;
    private String firstSlideMessage;
    private String lastSlideMessage;
    private String paginationBulletMessage;
    private String notificationClass;

    public Accessibility() {
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
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
