package com.github.appreciated.config;

public class LazyLoading {
    private Boolean loadPrevNext;
    private Double loadPrevNextAmount;
    private Boolean loadOnTransitionStart;
    private String elementClass;
    private String loadingClass;
    private String loadedClass;
    private String preloaderClass;

    public LazyLoading() {
    }

    public Boolean isLoadPrevNext() {
        return loadPrevNext;
    }

    public Boolean isLoadOnTransitionStart() {
        return loadOnTransitionStart;
    }

    public Boolean getLoadPrevNext() {
        return loadPrevNext;
    }

    public void setLoadPrevNext(Boolean loadPrevNext) {
        this.loadPrevNext = loadPrevNext;
    }

    public Double getLoadPrevNextAmount() {
        return loadPrevNextAmount;
    }

    public void setLoadPrevNextAmount(Double loadPrevNextAmount) {
        this.loadPrevNextAmount = loadPrevNextAmount;
    }

    public Boolean getLoadOnTransitionStart() {
        return loadOnTransitionStart;
    }

    public void setLoadOnTransitionStart(Boolean loadOnTransitionStart) {
        this.loadOnTransitionStart = loadOnTransitionStart;
    }

    public String getElementClass() {
        return elementClass;
    }

    public void setElementClass(String elementClass) {
        this.elementClass = elementClass;
    }

    public String getLoadingClass() {
        return loadingClass;
    }

    public void setLoadingClass(String loadingClass) {
        this.loadingClass = loadingClass;
    }

    public String getLoadedClass() {
        return loadedClass;
    }

    public void setLoadedClass(String loadedClass) {
        this.loadedClass = loadedClass;
    }

    public String getPreloaderClass() {
        return preloaderClass;
    }

    public void setPreloaderClass(String preloaderClass) {
        this.preloaderClass = preloaderClass;
    }

}
