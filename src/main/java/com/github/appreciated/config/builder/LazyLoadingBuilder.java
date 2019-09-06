package com.github.appreciated.config.builder;

import com.github.appreciated.config.LazyLoading;

public class LazyLoadingBuilder {
    private Boolean loadPrevNext;
    private Double loadPrevNextAmount;
    private Boolean loadOnTransitionStart;
    private String elementClass;
    private String loadingClass;
    private String loadedClass;
    private String preloaderClass;

    private LazyLoadingBuilder() {
    }

    public static LazyLoadingBuilder get() {
        return new LazyLoadingBuilder();
    }

    public LazyLoadingBuilder withLoadPrevNext(Boolean loadPrevNext) {
        this.loadPrevNext = loadPrevNext;
        return this;
    }

    public LazyLoadingBuilder withLoadPrevNextAmount(Double loadPrevNextAmount) {
        this.loadPrevNextAmount = loadPrevNextAmount;
        return this;
    }

    public LazyLoadingBuilder withLoadOnTransitionStart(Boolean loadOnTransitionStart) {
        this.loadOnTransitionStart = loadOnTransitionStart;
        return this;
    }

    public LazyLoadingBuilder withElementClass(String elementClass) {
        this.elementClass = elementClass;
        return this;
    }

    public LazyLoadingBuilder withLoadingClass(String loadingClass) {
        this.loadingClass = loadingClass;
        return this;
    }

    public LazyLoadingBuilder withLoadedClass(String loadedClass) {
        this.loadedClass = loadedClass;
        return this;
    }

    public LazyLoadingBuilder withPreloaderClass(String preloaderClass) {
        this.preloaderClass = preloaderClass;
        return this;
    }

    public LazyLoading build() {
        LazyLoading lazyLoading = new LazyLoading();
        lazyLoading.setLoadPrevNext(loadPrevNext);
        lazyLoading.setLoadPrevNextAmount(loadPrevNextAmount);
        lazyLoading.setLoadOnTransitionStart(loadOnTransitionStart);
        lazyLoading.setElementClass(elementClass);
        lazyLoading.setLoadingClass(loadingClass);
        lazyLoading.setLoadedClass(loadedClass);
        lazyLoading.setPreloaderClass(preloaderClass);
        return lazyLoading;
    }
}
