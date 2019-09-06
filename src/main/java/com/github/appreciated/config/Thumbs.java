package com.github.appreciated.config;

import com.github.appreciated.Swiper;

public class Thumbs {

    private Swiper swiper;
    private String slideThumbActiveClass;
    private String thumbsContainerClass;

    public Thumbs() {
    }

    public Swiper getSwiper() {
        return swiper;
    }

    public void setSwiper(Swiper swiper) {
        this.swiper = swiper;
    }

    public String getSlideThumbActiveClass() {
        return slideThumbActiveClass;
    }

    public void setSlideThumbActiveClass(String slideThumbActiveClass) {
        this.slideThumbActiveClass = slideThumbActiveClass;
    }

    public String getThumbsContainerClass() {
        return thumbsContainerClass;
    }

    public void setThumbsContainerClass(String thumbsContainerClass) {
        this.thumbsContainerClass = thumbsContainerClass;
    }

}
