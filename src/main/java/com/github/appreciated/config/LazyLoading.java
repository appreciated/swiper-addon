package com.github.appreciated.config;

public class LazyLoading {
    boolean loadPrevNext;
    double loadPrevNextAmount;
    boolean loadOnTransitionStart;
    String elementClass;
    String loadingClass;
    String loadedClass;
    String preloaderClass;

    public boolean isLoadPrevNext() {
        return loadPrevNext;
    }

    public void setLoadPrevNext(boolean loadPrevNext) {
        this.loadPrevNext = loadPrevNext;
    }

    public double getLoadPrevNextAmount() {
        return loadPrevNextAmount;
    }

    public void setLoadPrevNextAmount(double loadPrevNextAmount) {
        this.loadPrevNextAmount = loadPrevNextAmount;
    }

    public boolean isLoadOnTransitionStart() {
        return loadOnTransitionStart;
    }

    public void setLoadOnTransitionStart(boolean loadOnTransitionStart) {
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
