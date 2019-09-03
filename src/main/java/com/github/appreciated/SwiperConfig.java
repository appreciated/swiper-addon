package com.github.appreciated;

import com.github.appreciated.config.Direction;

public class SwiperConfig {

    private Boolean init;
    private Double initialSlide;
    private Direction direction;
    private Double speed;
    private Boolean setWrapperSize;
    private Boolean virtualTranslate;
    private Double width;
    private Double height;
    private Boolean autoHeight;
    private Boolean roundLengths;
    private Boolean nested;
    private Boolean uniqueNavElements;
    private String effect;
    private Boolean runCallbacksOnInit;
    private Boolean watchOverflow;
    private Object on;
    private Double spaceBetween;
    private Double slidesPerView; //TODO number or 'auto'
    private Double slidesPerColumn;
    private String slidesPerColumnFill;
    private Double slidesPerGroup;
    private Boolean centeredSlides;
    private Double slidesOffsetBefore;
    private Double slidesOffsetAfter;
    private Boolean normalizeSlideIndex;
    private Boolean centerInsufficientSlides;
    private Boolean grabCursor;
    private String touchEventsTarget;
    private Double touchRatio;
    private Double touchAngle;
    private Boolean simulateTouch;
    private Boolean shortSwipes;
    private Boolean longSwipes;
    private Double longSwipesRatio;
    private Double longSwipesMs;
    private Boolean followFinger;
    private Boolean allowTouchMove;
    private Double threshold;
    private Boolean touchStartPreventDefault;
    private Boolean touchStartForcePreventDefault;
    private Boolean touchMoveStopPropagation;
    private Boolean iOSEdgeSwipeDetection;
    private Double iOSEdgeSwipeThreshold;
    private Boolean touchReleaseOnEdges;
    private Boolean passiveListeners;
    private Boolean resistance;
    private Double resistanceRatio;
    private Boolean preventInteractionOnTransition;
    private Boolean allowSlidePrev;
    private Boolean allowSlideNext;
    private Boolean noSwiping;
    private String noSwipingClass;
    private String noSwipingSelector;
    private String swipeHandler; //TODO string / HTMLElement
    private Boolean preventClicks;
    private Boolean preventClicksPropagation;
    private Boolean slideToClickedSlide;
    private Boolean freeMode;
    private Boolean freeModeMomentum;
    private Double freeModeMomentumRatio;
    private Double freeModeMomentumVelocityRatio;
    private Boolean freeModeMomentumBounce;
    private Double freeModeMomentumBounceRatio;
    private Double freeModeMinimumVelocity;
    private Boolean freeModeSticky;
    private Boolean watchSlidesProgress;
    private Boolean watchSlidesVisibility;
    private Boolean preloadImages;
    private Boolean updateOnImagesReady;
    private Boolean loop;
    private Double loopAdditionalSlides;
    private Double loopedSlides;
    private Boolean loopFillGroupWithBlank;
    private Object breakpoints;
    private Boolean breakpointsInverse;
    private Boolean observer;
    private Boolean observeParents;
    private Boolean observeSlideChildren;
    private String containerModifierClass;
    private String slideClass;
    private String slideActiveClass;
    private String slideDuplicateActiveClass;
    private String slideVisibleClass;
    private String slideDuplicateClass;
    private String slideNextClass;
    private String slideDuplicateNextClass;
    private String slidePrevClass;
    private String slideDuplicatePrevClass;
    private String wrapperClass;

    public SwiperConfig() {
    }

    public Boolean isInit() {
        return init;
    }

    public Boolean isSetWrapperSize() {
        return setWrapperSize;
    }

    public Boolean isVirtualTranslate() {
        return virtualTranslate;
    }

    public Boolean isAutoHeight() {
        return autoHeight;
    }

    public Boolean isRoundLengths() {
        return roundLengths;
    }

    public Boolean isNested() {
        return nested;
    }

    public Boolean isUniqueNavElements() {
        return uniqueNavElements;
    }

    public Boolean isRunCallbacksOnInit() {
        return runCallbacksOnInit;
    }

    public Boolean isWatchOverflow() {
        return watchOverflow;
    }

    public Boolean isCenteredSlides() {
        return centeredSlides;
    }

    public Boolean isNormalizeSlideIndex() {
        return normalizeSlideIndex;
    }

    public Boolean isCenterInsufficientSlides() {
        return centerInsufficientSlides;
    }

    public Boolean isGrabCursor() {
        return grabCursor;
    }

    public Boolean isSimulateTouch() {
        return simulateTouch;
    }

    public Boolean isShortSwipes() {
        return shortSwipes;
    }

    public Boolean isLongSwipes() {
        return longSwipes;
    }

    public Boolean isFollowFinger() {
        return followFinger;
    }

    public Boolean isAllowTouchMove() {
        return allowTouchMove;
    }

    public Boolean isTouchStartPreventDefault() {
        return touchStartPreventDefault;
    }

    public Boolean isTouchStartForcePreventDefault() {
        return touchStartForcePreventDefault;
    }

    public Boolean isTouchMoveStopPropagation() {
        return touchMoveStopPropagation;
    }

    public Boolean isiOSEdgeSwipeDetection() {
        return iOSEdgeSwipeDetection;
    }

    public void setiOSEdgeSwipeDetection(Boolean iOSEdgeSwipeDetection) {
        this.iOSEdgeSwipeDetection = iOSEdgeSwipeDetection;
    }

    public Double getiOSEdgeSwipeThreshold() {
        return iOSEdgeSwipeThreshold;
    }

    public void setiOSEdgeSwipeThreshold(Double iOSEdgeSwipeThreshold) {
        this.iOSEdgeSwipeThreshold = iOSEdgeSwipeThreshold;
    }

    public Boolean isTouchReleaseOnEdges() {
        return touchReleaseOnEdges;
    }

    public Boolean isPassiveListeners() {
        return passiveListeners;
    }

    public Boolean isResistance() {
        return resistance;
    }

    public Boolean isPreventInteractionOnTransition() {
        return preventInteractionOnTransition;
    }

    public Boolean isAllowSlidePrev() {
        return allowSlidePrev;
    }

    public Boolean isAllowSlideNext() {
        return allowSlideNext;
    }

    public Boolean isNoSwiping() {
        return noSwiping;
    }

    public Boolean isPreventClicks() {
        return preventClicks;
    }

    public Boolean isPreventClicksPropagation() {
        return preventClicksPropagation;
    }

    public Boolean isSlideToClickedSlide() {
        return slideToClickedSlide;
    }

    public Boolean isFreeMode() {
        return freeMode;
    }

    public Boolean isFreeModeMomentum() {
        return freeModeMomentum;
    }

    public Boolean isFreeModeMomentumBounce() {
        return freeModeMomentumBounce;
    }

    public Boolean isFreeModeSticky() {
        return freeModeSticky;
    }

    public Boolean isWatchSlidesProgress() {
        return watchSlidesProgress;
    }

    public Boolean isWatchSlidesVisibility() {
        return watchSlidesVisibility;
    }

    public Boolean isPreloadImages() {
        return preloadImages;
    }

    public Boolean isUpdateOnImagesReady() {
        return updateOnImagesReady;
    }

    public Boolean isLoop() {
        return loop;
    }

    public Boolean isLoopFillGroupWithBlank() {
        return loopFillGroupWithBlank;
    }

    public Boolean isBreakpointsInverse() {
        return breakpointsInverse;
    }

    public Boolean isObserver() {
        return observer;
    }

    public Boolean isObserveParents() {
        return observeParents;
    }

    public Boolean isObserveSlideChildren() {
        return observeSlideChildren;
    }


    public Boolean getInit() {
        return init;
    }

    public Double getInitialSlide() {
        return initialSlide;
    }

    public Direction getDirection() {
        return direction;
    }

    public Double getSpeed() {
        return speed;
    }

    public Boolean getSetWrapperSize() {
        return setWrapperSize;
    }

    public Boolean getVirtualTranslate() {
        return virtualTranslate;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Boolean getAutoHeight() {
        return autoHeight;
    }

    public Boolean getRoundLengths() {
        return roundLengths;
    }

    public Boolean getNested() {
        return nested;
    }

    public Boolean getUniqueNavElements() {
        return uniqueNavElements;
    }

    public String getEffect() {
        return effect;
    }

    public Boolean getRunCallbacksOnInit() {
        return runCallbacksOnInit;
    }

    public Boolean getWatchOverflow() {
        return watchOverflow;
    }

    public Object getOn() {
        return on;
    }

    public Double getSpaceBetween() {
        return spaceBetween;
    }

    public Double getSlidesPerView() {
        return slidesPerView;
    }

    public Double getSlidesPerColumn() {
        return slidesPerColumn;
    }

    public String getSlidesPerColumnFill() {
        return slidesPerColumnFill;
    }

    public Double getSlidesPerGroup() {
        return slidesPerGroup;
    }

    public Boolean getCenteredSlides() {
        return centeredSlides;
    }

    public Double getSlidesOffsetBefore() {
        return slidesOffsetBefore;
    }

    public Double getSlidesOffsetAfter() {
        return slidesOffsetAfter;
    }

    public Boolean getNormalizeSlideIndex() {
        return normalizeSlideIndex;
    }

    public Boolean getCenterInsufficientSlides() {
        return centerInsufficientSlides;
    }

    public Boolean getGrabCursor() {
        return grabCursor;
    }

    public String getTouchEventsTarget() {
        return touchEventsTarget;
    }

    public Double getTouchRatio() {
        return touchRatio;
    }

    public Double getTouchAngle() {
        return touchAngle;
    }

    public Boolean getSimulateTouch() {
        return simulateTouch;
    }

    public Boolean getShortSwipes() {
        return shortSwipes;
    }

    public Boolean getLongSwipes() {
        return longSwipes;
    }

    public Double getLongSwipesRatio() {
        return longSwipesRatio;
    }

    public Double getLongSwipesMs() {
        return longSwipesMs;
    }

    public Boolean getFollowFinger() {
        return followFinger;
    }

    public Boolean getAllowTouchMove() {
        return allowTouchMove;
    }

    public Double getThreshold() {
        return threshold;
    }

    public Boolean getTouchStartPreventDefault() {
        return touchStartPreventDefault;
    }

    public Boolean getTouchStartForcePreventDefault() {
        return touchStartForcePreventDefault;
    }

    public Boolean getTouchMoveStopPropagation() {
        return touchMoveStopPropagation;
    }

    public Boolean getIOSEdgeSwipeDetection() {
        return iOSEdgeSwipeDetection;
    }

    public Double getIOSEdgeSwipeThreshold() {
        return iOSEdgeSwipeThreshold;
    }

    public Boolean getTouchReleaseOnEdges() {
        return touchReleaseOnEdges;
    }

    public Boolean getPassiveListeners() {
        return passiveListeners;
    }

    public Boolean getResistance() {
        return resistance;
    }

    public Double getResistanceRatio() {
        return resistanceRatio;
    }

    public Boolean getPreventInteractionOnTransition() {
        return preventInteractionOnTransition;
    }

    public Boolean getAllowSlidePrev() {
        return allowSlidePrev;
    }

    public Boolean getAllowSlideNext() {
        return allowSlideNext;
    }

    public Boolean getNoSwiping() {
        return noSwiping;
    }

    public String getNoSwipingClass() {
        return noSwipingClass;
    }

    public String getNoSwipingSelector() {
        return noSwipingSelector;
    }

    public String getSwipeHandler() {
        return swipeHandler;
    }

    public Boolean getPreventClicks() {
        return preventClicks;
    }

    public Boolean getPreventClicksPropagation() {
        return preventClicksPropagation;
    }

    public Boolean getSlideToClickedSlide() {
        return slideToClickedSlide;
    }

    public Boolean getFreeMode() {
        return freeMode;
    }

    public Boolean getFreeModeMomentum() {
        return freeModeMomentum;
    }

    public Double getFreeModeMomentumRatio() {
        return freeModeMomentumRatio;
    }

    public Double getFreeModeMomentumVelocityRatio() {
        return freeModeMomentumVelocityRatio;
    }

    public Boolean getFreeModeMomentumBounce() {
        return freeModeMomentumBounce;
    }

    public Double getFreeModeMomentumBounceRatio() {
        return freeModeMomentumBounceRatio;
    }

    public Double getFreeModeMinimumVelocity() {
        return freeModeMinimumVelocity;
    }

    public Boolean getFreeModeSticky() {
        return freeModeSticky;
    }

    public Boolean getWatchSlidesProgress() {
        return watchSlidesProgress;
    }

    public Boolean getWatchSlidesVisibility() {
        return watchSlidesVisibility;
    }

    public Boolean getPreloadImages() {
        return preloadImages;
    }

    public Boolean getUpdateOnImagesReady() {
        return updateOnImagesReady;
    }

    public Boolean getLoop() {
        return loop;
    }

    public Double getLoopAdditionalSlides() {
        return loopAdditionalSlides;
    }

    public Double getLoopedSlides() {
        return loopedSlides;
    }

    public Boolean getLoopFillGroupWithBlank() {
        return loopFillGroupWithBlank;
    }

    public Object getBreakpoints() {
        return breakpoints;
    }

    public Boolean getBreakpointsInverse() {
        return breakpointsInverse;
    }

    public Boolean getObserver() {
        return observer;
    }

    public Boolean getObserveParents() {
        return observeParents;
    }

    public Boolean getObserveSlideChildren() {
        return observeSlideChildren;
    }

    public String getContainerModifierClass() {
        return containerModifierClass;
    }

    public String getSlideClass() {
        return slideClass;
    }

    public String getSlideActiveClass() {
        return slideActiveClass;
    }

    public String getSlideDuplicateActiveClass() {
        return slideDuplicateActiveClass;
    }

    public String getSlideVisibleClass() {
        return slideVisibleClass;
    }

    public String getSlideDuplicateClass() {
        return slideDuplicateClass;
    }

    public String getSlideNextClass() {
        return slideNextClass;
    }

    public String getSlideDuplicateNextClass() {
        return slideDuplicateNextClass;
    }

    public String getSlidePrevClass() {
        return slidePrevClass;
    }

    public String getSlideDuplicatePrevClass() {
        return slideDuplicatePrevClass;
    }

    public String getWrapperClass() {
        return wrapperClass;
    }

    public void setInit(Boolean init) {
        this.init = init;
    }

    public void setInitialSlide(Double initialSlide) {
        this.initialSlide = initialSlide;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setSetWrapperSize(Boolean setWrapperSize) {
        this.setWrapperSize = setWrapperSize;
    }

    public void setVirtualTranslate(Boolean virtualTranslate) {
        this.virtualTranslate = virtualTranslate;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setAutoHeight(Boolean autoHeight) {
        this.autoHeight = autoHeight;
    }

    public void setRoundLengths(Boolean roundLengths) {
        this.roundLengths = roundLengths;
    }

    public void setNested(Boolean nested) {
        this.nested = nested;
    }

    public void setUniqueNavElements(Boolean uniqueNavElements) {
        this.uniqueNavElements = uniqueNavElements;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setRunCallbacksOnInit(Boolean runCallbacksOnInit) {
        this.runCallbacksOnInit = runCallbacksOnInit;
    }

    public void setWatchOverflow(Boolean watchOverflow) {
        this.watchOverflow = watchOverflow;
    }

    public void setOn(Object on) {
        this.on = on;
    }

    public void setSpaceBetween(Double spaceBetween) {
        this.spaceBetween = spaceBetween;
    }

    public void setSlidesPerView(Double slidesPerView) {
        this.slidesPerView = slidesPerView;
    }

    public void setSlidesPerColumn(Double slidesPerColumn) {
        this.slidesPerColumn = slidesPerColumn;
    }

    public void setSlidesPerColumnFill(String slidesPerColumnFill) {
        this.slidesPerColumnFill = slidesPerColumnFill;
    }

    public void setSlidesPerGroup(Double slidesPerGroup) {
        this.slidesPerGroup = slidesPerGroup;
    }

    public void setCenteredSlides(Boolean centeredSlides) {
        this.centeredSlides = centeredSlides;
    }

    public void setSlidesOffsetBefore(Double slidesOffsetBefore) {
        this.slidesOffsetBefore = slidesOffsetBefore;
    }

    public void setSlidesOffsetAfter(Double slidesOffsetAfter) {
        this.slidesOffsetAfter = slidesOffsetAfter;
    }

    public void setNormalizeSlideIndex(Boolean normalizeSlideIndex) {
        this.normalizeSlideIndex = normalizeSlideIndex;
    }

    public void setCenterInsufficientSlides(Boolean centerInsufficientSlides) {
        this.centerInsufficientSlides = centerInsufficientSlides;
    }

    public void setGrabCursor(Boolean grabCursor) {
        this.grabCursor = grabCursor;
    }

    public void setTouchEventsTarget(String touchEventsTarget) {
        this.touchEventsTarget = touchEventsTarget;
    }

    public void setTouchRatio(Double touchRatio) {
        this.touchRatio = touchRatio;
    }

    public void setTouchAngle(Double touchAngle) {
        this.touchAngle = touchAngle;
    }

    public void setSimulateTouch(Boolean simulateTouch) {
        this.simulateTouch = simulateTouch;
    }

    public void setShortSwipes(Boolean shortSwipes) {
        this.shortSwipes = shortSwipes;
    }

    public void setLongSwipes(Boolean longSwipes) {
        this.longSwipes = longSwipes;
    }

    public void setLongSwipesRatio(Double longSwipesRatio) {
        this.longSwipesRatio = longSwipesRatio;
    }

    public void setLongSwipesMs(Double longSwipesMs) {
        this.longSwipesMs = longSwipesMs;
    }

    public void setFollowFinger(Boolean followFinger) {
        this.followFinger = followFinger;
    }

    public void setAllowTouchMove(Boolean allowTouchMove) {
        this.allowTouchMove = allowTouchMove;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public void setTouchStartPreventDefault(Boolean touchStartPreventDefault) {
        this.touchStartPreventDefault = touchStartPreventDefault;
    }

    public void setTouchStartForcePreventDefault(Boolean touchStartForcePreventDefault) {
        this.touchStartForcePreventDefault = touchStartForcePreventDefault;
    }

    public void setTouchMoveStopPropagation(Boolean touchMoveStopPropagation) {
        this.touchMoveStopPropagation = touchMoveStopPropagation;
    }

    public void setIOSEdgeSwipeDetection(Boolean iOSEdgeSwipeDetection) {
        this.iOSEdgeSwipeDetection = iOSEdgeSwipeDetection;
    }

    public void setIOSEdgeSwipeThreshold(Double iOSEdgeSwipeThreshold) {
        this.iOSEdgeSwipeThreshold = iOSEdgeSwipeThreshold;
    }

    public void setTouchReleaseOnEdges(Boolean touchReleaseOnEdges) {
        this.touchReleaseOnEdges = touchReleaseOnEdges;
    }

    public void setPassiveListeners(Boolean passiveListeners) {
        this.passiveListeners = passiveListeners;
    }

    public void setResistance(Boolean resistance) {
        this.resistance = resistance;
    }

    public void setResistanceRatio(Double resistanceRatio) {
        this.resistanceRatio = resistanceRatio;
    }

    public void setPreventInteractionOnTransition(Boolean preventInteractionOnTransition) {
        this.preventInteractionOnTransition = preventInteractionOnTransition;
    }

    public void setAllowSlidePrev(Boolean allowSlidePrev) {
        this.allowSlidePrev = allowSlidePrev;
    }

    public void setAllowSlideNext(Boolean allowSlideNext) {
        this.allowSlideNext = allowSlideNext;
    }

    public void setNoSwiping(Boolean noSwiping) {
        this.noSwiping = noSwiping;
    }

    public void setNoSwipingClass(String noSwipingClass) {
        this.noSwipingClass = noSwipingClass;
    }

    public void setNoSwipingSelector(String noSwipingSelector) {
        this.noSwipingSelector = noSwipingSelector;
    }

    public void setSwipeHandler(String swipeHandler) {
        this.swipeHandler = swipeHandler;
    }

    public void setPreventClicks(Boolean preventClicks) {
        this.preventClicks = preventClicks;
    }

    public void setPreventClicksPropagation(Boolean preventClicksPropagation) {
        this.preventClicksPropagation = preventClicksPropagation;
    }

    public void setSlideToClickedSlide(Boolean slideToClickedSlide) {
        this.slideToClickedSlide = slideToClickedSlide;
    }

    public void setFreeMode(Boolean freeMode) {
        this.freeMode = freeMode;
    }

    public void setFreeModeMomentum(Boolean freeModeMomentum) {
        this.freeModeMomentum = freeModeMomentum;
    }

    public void setFreeModeMomentumRatio(Double freeModeMomentumRatio) {
        this.freeModeMomentumRatio = freeModeMomentumRatio;
    }

    public void setFreeModeMomentumVelocityRatio(Double freeModeMomentumVelocityRatio) {
        this.freeModeMomentumVelocityRatio = freeModeMomentumVelocityRatio;
    }

    public void setFreeModeMomentumBounce(Boolean freeModeMomentumBounce) {
        this.freeModeMomentumBounce = freeModeMomentumBounce;
    }

    public void setFreeModeMomentumBounceRatio(Double freeModeMomentumBounceRatio) {
        this.freeModeMomentumBounceRatio = freeModeMomentumBounceRatio;
    }

    public void setFreeModeMinimumVelocity(Double freeModeMinimumVelocity) {
        this.freeModeMinimumVelocity = freeModeMinimumVelocity;
    }

    public void setFreeModeSticky(Boolean freeModeSticky) {
        this.freeModeSticky = freeModeSticky;
    }

    public void setWatchSlidesProgress(Boolean watchSlidesProgress) {
        this.watchSlidesProgress = watchSlidesProgress;
    }

    public void setWatchSlidesVisibility(Boolean watchSlidesVisibility) {
        this.watchSlidesVisibility = watchSlidesVisibility;
    }

    public void setPreloadImages(Boolean preloadImages) {
        this.preloadImages = preloadImages;
    }

    public void setUpdateOnImagesReady(Boolean updateOnImagesReady) {
        this.updateOnImagesReady = updateOnImagesReady;
    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public void setLoopAdditionalSlides(Double loopAdditionalSlides) {
        this.loopAdditionalSlides = loopAdditionalSlides;
    }

    public void setLoopedSlides(Double loopedSlides) {
        this.loopedSlides = loopedSlides;
    }

    public void setLoopFillGroupWithBlank(Boolean loopFillGroupWithBlank) {
        this.loopFillGroupWithBlank = loopFillGroupWithBlank;
    }

    public void setBreakpoints(Object breakpoints) {
        this.breakpoints = breakpoints;
    }

    public void setBreakpointsInverse(Boolean breakpointsInverse) {
        this.breakpointsInverse = breakpointsInverse;
    }

    public void setObserver(Boolean observer) {
        this.observer = observer;
    }

    public void setObserveParents(Boolean observeParents) {
        this.observeParents = observeParents;
    }

    public void setObserveSlideChildren(Boolean observeSlideChildren) {
        this.observeSlideChildren = observeSlideChildren;
    }

    public void setContainerModifierClass(String containerModifierClass) {
        this.containerModifierClass = containerModifierClass;
    }

    public void setSlideClass(String slideClass) {
        this.slideClass = slideClass;
    }

    public void setSlideActiveClass(String slideActiveClass) {
        this.slideActiveClass = slideActiveClass;
    }

    public void setSlideDuplicateActiveClass(String slideDuplicateActiveClass) {
        this.slideDuplicateActiveClass = slideDuplicateActiveClass;
    }

    public void setSlideVisibleClass(String slideVisibleClass) {
        this.slideVisibleClass = slideVisibleClass;
    }

    public void setSlideDuplicateClass(String slideDuplicateClass) {
        this.slideDuplicateClass = slideDuplicateClass;
    }

    public void setSlideNextClass(String slideNextClass) {
        this.slideNextClass = slideNextClass;
    }

    public void setSlideDuplicateNextClass(String slideDuplicateNextClass) {
        this.slideDuplicateNextClass = slideDuplicateNextClass;
    }

    public void setSlidePrevClass(String slidePrevClass) {
        this.slidePrevClass = slidePrevClass;
    }

    public void setSlideDuplicatePrevClass(String slideDuplicatePrevClass) {
        this.slideDuplicatePrevClass = slideDuplicatePrevClass;
    }

    public void setWrapperClass(String wrapperClass) {
        this.wrapperClass = wrapperClass;
    }
}
