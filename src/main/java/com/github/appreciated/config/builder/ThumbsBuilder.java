package com.github.appreciated.config.builder;

import com.github.appreciated.Swiper;
import com.github.appreciated.config.Thumbs;

public class ThumbsBuilder {
    private Swiper swiper;
    private String slideThumbActiveClass;
    private String thumbsContainerClass;

    private ThumbsBuilder() {
    }

    public static ThumbsBuilder get() {
        return new ThumbsBuilder();
    }

    public ThumbsBuilder withSwiper(Swiper swiper) {
        this.swiper = swiper;
        return this;
    }

    public ThumbsBuilder withSlideThumbActiveClass(String slideThumbActiveClass) {
        this.slideThumbActiveClass = slideThumbActiveClass;
        return this;
    }

    public ThumbsBuilder withThumbsContainerClass(String thumbsContainerClass) {
        this.thumbsContainerClass = thumbsContainerClass;
        return this;
    }

    public Thumbs build() {
        Thumbs thumbs = new Thumbs();
        thumbs.setSwiper(swiper);
        thumbs.setSlideThumbActiveClass(slideThumbActiveClass);
        thumbs.setThumbsContainerClass(thumbsContainerClass);
        return thumbs;
    }
}
