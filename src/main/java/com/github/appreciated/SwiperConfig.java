package com.github.appreciated;

public class SwiperConfig {

    private boolean init;
    private double initialSlide;
    private String direction;
    private double speed;
    private boolean setWrapperSize;
    private boolean virtualTranslate;
    private double width;
    private double height;
    private boolean autoHeight;
    private boolean roundLengths;
    private boolean nested;
    private boolean uniqueNavElements;
    private String effect;
    private boolean runCallbacksOnInit;
    private boolean watchOverflow;
    private Object on;
    private double spaceBetween;
    private double slidesPerView; //TODO number or 'auto'
    private double slidesPerColumn;
    private String slidesPerColumnFill;
    private double slidesPerGroup;
    private boolean centeredSlides;
    private double slidesOffsetBefore;
    private double slidesOffsetAfter;
    private boolean normalizeSlideIndex;
    private boolean centerInsufficientSlides;
    private boolean grabCursor;
    private String touchEventsTarget;
    private double touchRatio;
    private double touchAngle;
    private boolean simulateTouch;
    private boolean shortSwipes;
    private boolean longSwipes;
    private double longSwipesRatio;
    private double longSwipesMs;
    private boolean followFinger;
    private boolean allowTouchMove;
    private double threshold;
    private boolean touchStartPreventDefault;
    private boolean touchStartForcePreventDefault;
    private boolean touchMoveStopPropagation;
    private boolean iOSEdgeSwipeDetection;
    private double iOSEdgeSwipeThreshold;
    private boolean touchReleaseOnEdges;
    private boolean passiveListeners;
    private boolean resistance;
    private double resistanceRatio;
    private boolean preventInteractionOnTransition;
    private boolean allowSlidePrev;
    private boolean allowSlideNext;
    private boolean noSwiping;
    private String noSwipingClass;
    private String noSwipingSelector;
    private String swipeHandler; //TODO string / HTMLElement
    private boolean preventClicks;
    private boolean preventClicksPropagation;
    private boolean slideToClickedSlide;
    private boolean freeMode;
    private boolean freeModeMomentum;
    private double freeModeMomentumRatio;
    private double freeModeMomentumVelocityRatio;
    private boolean freeModeMomentumBounce;
    private double freeModeMomentumBounceRatio;
    private double freeModeMinimumVelocity;
    private boolean freeModeSticky;
    private boolean watchSlidesProgress;
    private boolean watchSlidesVisibility;
    private boolean preloadImages;
    private boolean updateOnImagesReady;
    private boolean loop;
    private double loopAdditionalSlides;
    private double loopedSlides;
    private boolean loopFillGroupWithBlank;
    private Object breakpoints;
    private boolean breakpointsInverse;
    private boolean observer;
    private boolean observeParents;
    private boolean observeSlideChildren;
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

    public boolean isInit() {
        return init;
    }

    public boolean isSetWrapperSize() {
        return setWrapperSize;
    }

    public boolean isVirtualTranslate() {
        return virtualTranslate;
    }

    public boolean isAutoHeight() {
        return autoHeight;
    }

    public boolean isRoundLengths() {
        return roundLengths;
    }

    public boolean isNested() {
        return nested;
    }

    public boolean isUniqueNavElements() {
        return uniqueNavElements;
    }

    public boolean isRunCallbacksOnInit() {
        return runCallbacksOnInit;
    }

    public boolean isWatchOverflow() {
        return watchOverflow;
    }

    public boolean isCenteredSlides() {
        return centeredSlides;
    }

    public boolean isNormalizeSlideIndex() {
        return normalizeSlideIndex;
    }

    public boolean isCenterInsufficientSlides() {
        return centerInsufficientSlides;
    }

    public boolean isGrabCursor() {
        return grabCursor;
    }

    public boolean isSimulateTouch() {
        return simulateTouch;
    }

    public boolean isShortSwipes() {
        return shortSwipes;
    }

    public boolean isLongSwipes() {
        return longSwipes;
    }

    public boolean isFollowFinger() {
        return followFinger;
    }

    public boolean isAllowTouchMove() {
        return allowTouchMove;
    }

    public boolean isTouchStartPreventDefault() {
        return touchStartPreventDefault;
    }

    public boolean isTouchStartForcePreventDefault() {
        return touchStartForcePreventDefault;
    }

    public boolean isTouchMoveStopPropagation() {
        return touchMoveStopPropagation;
    }

    public boolean isiOSEdgeSwipeDetection() {
        return iOSEdgeSwipeDetection;
    }

    public void setiOSEdgeSwipeDetection(boolean iOSEdgeSwipeDetection) {
        this.iOSEdgeSwipeDetection = iOSEdgeSwipeDetection;
    }

    public double getiOSEdgeSwipeThreshold() {
        return iOSEdgeSwipeThreshold;
    }

    public void setiOSEdgeSwipeThreshold(double iOSEdgeSwipeThreshold) {
        this.iOSEdgeSwipeThreshold = iOSEdgeSwipeThreshold;
    }

    public boolean isTouchReleaseOnEdges() {
        return touchReleaseOnEdges;
    }

    public boolean isPassiveListeners() {
        return passiveListeners;
    }

    public boolean isResistance() {
        return resistance;
    }

    public boolean isPreventInteractionOnTransition() {
        return preventInteractionOnTransition;
    }

    public boolean isAllowSlidePrev() {
        return allowSlidePrev;
    }

    public boolean isAllowSlideNext() {
        return allowSlideNext;
    }

    public boolean isNoSwiping() {
        return noSwiping;
    }

    public boolean isPreventClicks() {
        return preventClicks;
    }

    public boolean isPreventClicksPropagation() {
        return preventClicksPropagation;
    }

    public boolean isSlideToClickedSlide() {
        return slideToClickedSlide;
    }

    public boolean isFreeMode() {
        return freeMode;
    }

    public boolean isFreeModeMomentum() {
        return freeModeMomentum;
    }

    public boolean isFreeModeMomentumBounce() {
        return freeModeMomentumBounce;
    }

    public boolean isFreeModeSticky() {
        return freeModeSticky;
    }

    public boolean isWatchSlidesProgress() {
        return watchSlidesProgress;
    }

    public boolean isWatchSlidesVisibility() {
        return watchSlidesVisibility;
    }

    public boolean isPreloadImages() {
        return preloadImages;
    }

    public boolean isUpdateOnImagesReady() {
        return updateOnImagesReady;
    }

    public boolean isLoop() {
        return loop;
    }

    public boolean isLoopFillGroupWithBlank() {
        return loopFillGroupWithBlank;
    }

    public boolean isBreakpointsInverse() {
        return breakpointsInverse;
    }

    public boolean isObserver() {
        return observer;
    }

    public boolean isObserveParents() {
        return observeParents;
    }

    public boolean isObserveSlideChildren() {
        return observeSlideChildren;
    }


    public boolean getInit() {
        return init;
    }

    public double getInitialSlide() {
        return initialSlide;
    }

    public String getDirection() {
        return direction;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean getSetWrapperSize() {
        return setWrapperSize;
    }

    public boolean getVirtualTranslate() {
        return virtualTranslate;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean getAutoHeight() {
        return autoHeight;
    }

    public boolean getRoundLengths() {
        return roundLengths;
    }

    public boolean getNested() {
        return nested;
    }

    public boolean getUniqueNavElements() {
        return uniqueNavElements;
    }

    public String getEffect() {
        return effect;
    }

    public boolean getRunCallbacksOnInit() {
        return runCallbacksOnInit;
    }

    public boolean getWatchOverflow() {
        return watchOverflow;
    }

    public Object getOn() {
        return on;
    }

    public double getSpaceBetween() {
        return spaceBetween;
    }

    public double getSlidesPerView() {
        return slidesPerView;
    }

    public double getSlidesPerColumn() {
        return slidesPerColumn;
    }

    public String getSlidesPerColumnFill() {
        return slidesPerColumnFill;
    }

    public double getSlidesPerGroup() {
        return slidesPerGroup;
    }

    public boolean getCenteredSlides() {
        return centeredSlides;
    }

    public double getSlidesOffsetBefore() {
        return slidesOffsetBefore;
    }

    public double getSlidesOffsetAfter() {
        return slidesOffsetAfter;
    }

    public boolean getNormalizeSlideIndex() {
        return normalizeSlideIndex;
    }

    public boolean getCenterInsufficientSlides() {
        return centerInsufficientSlides;
    }

    public boolean getGrabCursor() {
        return grabCursor;
    }

    public String getTouchEventsTarget() {
        return touchEventsTarget;
    }

    public double getTouchRatio() {
        return touchRatio;
    }

    public double getTouchAngle() {
        return touchAngle;
    }

    public boolean getSimulateTouch() {
        return simulateTouch;
    }

    public boolean getShortSwipes() {
        return shortSwipes;
    }

    public boolean getLongSwipes() {
        return longSwipes;
    }

    public double getLongSwipesRatio() {
        return longSwipesRatio;
    }

    public double getLongSwipesMs() {
        return longSwipesMs;
    }

    public boolean getFollowFinger() {
        return followFinger;
    }

    public boolean getAllowTouchMove() {
        return allowTouchMove;
    }

    public double getThreshold() {
        return threshold;
    }

    public boolean getTouchStartPreventDefault() {
        return touchStartPreventDefault;
    }

    public boolean getTouchStartForcePreventDefault() {
        return touchStartForcePreventDefault;
    }

    public boolean getTouchMoveStopPropagation() {
        return touchMoveStopPropagation;
    }

    public boolean getIOSEdgeSwipeDetection() {
        return iOSEdgeSwipeDetection;
    }

    public double getIOSEdgeSwipeThreshold() {
        return iOSEdgeSwipeThreshold;
    }

    public boolean getTouchReleaseOnEdges() {
        return touchReleaseOnEdges;
    }

    public boolean getPassiveListeners() {
        return passiveListeners;
    }

    public boolean getResistance() {
        return resistance;
    }

    public double getResistanceRatio() {
        return resistanceRatio;
    }

    public boolean getPreventInteractionOnTransition() {
        return preventInteractionOnTransition;
    }

    public boolean getAllowSlidePrev() {
        return allowSlidePrev;
    }

    public boolean getAllowSlideNext() {
        return allowSlideNext;
    }

    public boolean getNoSwiping() {
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

    public boolean getPreventClicks() {
        return preventClicks;
    }

    public boolean getPreventClicksPropagation() {
        return preventClicksPropagation;
    }

    public boolean getSlideToClickedSlide() {
        return slideToClickedSlide;
    }

    public boolean getFreeMode() {
        return freeMode;
    }

    public boolean getFreeModeMomentum() {
        return freeModeMomentum;
    }

    public double getFreeModeMomentumRatio() {
        return freeModeMomentumRatio;
    }

    public double getFreeModeMomentumVelocityRatio() {
        return freeModeMomentumVelocityRatio;
    }

    public boolean getFreeModeMomentumBounce() {
        return freeModeMomentumBounce;
    }

    public double getFreeModeMomentumBounceRatio() {
        return freeModeMomentumBounceRatio;
    }

    public double getFreeModeMinimumVelocity() {
        return freeModeMinimumVelocity;
    }

    public boolean getFreeModeSticky() {
        return freeModeSticky;
    }

    public boolean getWatchSlidesProgress() {
        return watchSlidesProgress;
    }

    public boolean getWatchSlidesVisibility() {
        return watchSlidesVisibility;
    }

    public boolean getPreloadImages() {
        return preloadImages;
    }

    public boolean getUpdateOnImagesReady() {
        return updateOnImagesReady;
    }

    public boolean getLoop() {
        return loop;
    }

    public double getLoopAdditionalSlides() {
        return loopAdditionalSlides;
    }

    public double getLoopedSlides() {
        return loopedSlides;
    }

    public boolean getLoopFillGroupWithBlank() {
        return loopFillGroupWithBlank;
    }

    public Object getBreakpoints() {
        return breakpoints;
    }

    public boolean getBreakpointsInverse() {
        return breakpointsInverse;
    }

    public boolean getObserver() {
        return observer;
    }

    public boolean getObserveParents() {
        return observeParents;
    }

    public boolean getObserveSlideChildren() {
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

    public void setInit(boolean init) {
        this.init = init;
    }

    public void setInitialSlide(double initialSlide) {
        this.initialSlide = initialSlide;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setSetWrapperSize(boolean setWrapperSize) {
        this.setWrapperSize = setWrapperSize;
    }

    public void setVirtualTranslate(boolean virtualTranslate) {
        this.virtualTranslate = virtualTranslate;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAutoHeight(boolean autoHeight) {
        this.autoHeight = autoHeight;
    }

    public void setRoundLengths(boolean roundLengths) {
        this.roundLengths = roundLengths;
    }

    public void setNested(boolean nested) {
        this.nested = nested;
    }

    public void setUniqueNavElements(boolean uniqueNavElements) {
        this.uniqueNavElements = uniqueNavElements;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setRunCallbacksOnInit(boolean runCallbacksOnInit) {
        this.runCallbacksOnInit = runCallbacksOnInit;
    }

    public void setWatchOverflow(boolean watchOverflow) {
        this.watchOverflow = watchOverflow;
    }

    public void setOn(Object on) {
        this.on = on;
    }

    public void setSpaceBetween(double spaceBetween) {
        this.spaceBetween = spaceBetween;
    }

    public void setSlidesPerView(double slidesPerView) {
        this.slidesPerView = slidesPerView;
    }

    public void setSlidesPerColumn(double slidesPerColumn) {
        this.slidesPerColumn = slidesPerColumn;
    }

    public void setSlidesPerColumnFill(String slidesPerColumnFill) {
        this.slidesPerColumnFill = slidesPerColumnFill;
    }

    public void setSlidesPerGroup(double slidesPerGroup) {
        this.slidesPerGroup = slidesPerGroup;
    }

    public void setCenteredSlides(boolean centeredSlides) {
        this.centeredSlides = centeredSlides;
    }

    public void setSlidesOffsetBefore(double slidesOffsetBefore) {
        this.slidesOffsetBefore = slidesOffsetBefore;
    }

    public void setSlidesOffsetAfter(double slidesOffsetAfter) {
        this.slidesOffsetAfter = slidesOffsetAfter;
    }

    public void setNormalizeSlideIndex(boolean normalizeSlideIndex) {
        this.normalizeSlideIndex = normalizeSlideIndex;
    }

    public void setCenterInsufficientSlides(boolean centerInsufficientSlides) {
        this.centerInsufficientSlides = centerInsufficientSlides;
    }

    public void setGrabCursor(boolean grabCursor) {
        this.grabCursor = grabCursor;
    }

    public void setTouchEventsTarget(String touchEventsTarget) {
        this.touchEventsTarget = touchEventsTarget;
    }

    public void setTouchRatio(double touchRatio) {
        this.touchRatio = touchRatio;
    }

    public void setTouchAngle(double touchAngle) {
        this.touchAngle = touchAngle;
    }

    public void setSimulateTouch(boolean simulateTouch) {
        this.simulateTouch = simulateTouch;
    }

    public void setShortSwipes(boolean shortSwipes) {
        this.shortSwipes = shortSwipes;
    }

    public void setLongSwipes(boolean longSwipes) {
        this.longSwipes = longSwipes;
    }

    public void setLongSwipesRatio(double longSwipesRatio) {
        this.longSwipesRatio = longSwipesRatio;
    }

    public void setLongSwipesMs(double longSwipesMs) {
        this.longSwipesMs = longSwipesMs;
    }

    public void setFollowFinger(boolean followFinger) {
        this.followFinger = followFinger;
    }

    public void setAllowTouchMove(boolean allowTouchMove) {
        this.allowTouchMove = allowTouchMove;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setTouchStartPreventDefault(boolean touchStartPreventDefault) {
        this.touchStartPreventDefault = touchStartPreventDefault;
    }

    public void setTouchStartForcePreventDefault(boolean touchStartForcePreventDefault) {
        this.touchStartForcePreventDefault = touchStartForcePreventDefault;
    }

    public void setTouchMoveStopPropagation(boolean touchMoveStopPropagation) {
        this.touchMoveStopPropagation = touchMoveStopPropagation;
    }

    public void setIOSEdgeSwipeDetection(boolean iOSEdgeSwipeDetection) {
        this.iOSEdgeSwipeDetection = iOSEdgeSwipeDetection;
    }

    public void setIOSEdgeSwipeThreshold(double iOSEdgeSwipeThreshold) {
        this.iOSEdgeSwipeThreshold = iOSEdgeSwipeThreshold;
    }

    public void setTouchReleaseOnEdges(boolean touchReleaseOnEdges) {
        this.touchReleaseOnEdges = touchReleaseOnEdges;
    }

    public void setPassiveListeners(boolean passiveListeners) {
        this.passiveListeners = passiveListeners;
    }

    public void setResistance(boolean resistance) {
        this.resistance = resistance;
    }

    public void setResistanceRatio(double resistanceRatio) {
        this.resistanceRatio = resistanceRatio;
    }

    public void setPreventInteractionOnTransition(boolean preventInteractionOnTransition) {
        this.preventInteractionOnTransition = preventInteractionOnTransition;
    }

    public void setAllowSlidePrev(boolean allowSlidePrev) {
        this.allowSlidePrev = allowSlidePrev;
    }

    public void setAllowSlideNext(boolean allowSlideNext) {
        this.allowSlideNext = allowSlideNext;
    }

    public void setNoSwiping(boolean noSwiping) {
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

    public void setPreventClicks(boolean preventClicks) {
        this.preventClicks = preventClicks;
    }

    public void setPreventClicksPropagation(boolean preventClicksPropagation) {
        this.preventClicksPropagation = preventClicksPropagation;
    }

    public void setSlideToClickedSlide(boolean slideToClickedSlide) {
        this.slideToClickedSlide = slideToClickedSlide;
    }

    public void setFreeMode(boolean freeMode) {
        this.freeMode = freeMode;
    }

    public void setFreeModeMomentum(boolean freeModeMomentum) {
        this.freeModeMomentum = freeModeMomentum;
    }

    public void setFreeModeMomentumRatio(double freeModeMomentumRatio) {
        this.freeModeMomentumRatio = freeModeMomentumRatio;
    }

    public void setFreeModeMomentumVelocityRatio(double freeModeMomentumVelocityRatio) {
        this.freeModeMomentumVelocityRatio = freeModeMomentumVelocityRatio;
    }

    public void setFreeModeMomentumBounce(boolean freeModeMomentumBounce) {
        this.freeModeMomentumBounce = freeModeMomentumBounce;
    }

    public void setFreeModeMomentumBounceRatio(double freeModeMomentumBounceRatio) {
        this.freeModeMomentumBounceRatio = freeModeMomentumBounceRatio;
    }

    public void setFreeModeMinimumVelocity(double freeModeMinimumVelocity) {
        this.freeModeMinimumVelocity = freeModeMinimumVelocity;
    }

    public void setFreeModeSticky(boolean freeModeSticky) {
        this.freeModeSticky = freeModeSticky;
    }

    public void setWatchSlidesProgress(boolean watchSlidesProgress) {
        this.watchSlidesProgress = watchSlidesProgress;
    }

    public void setWatchSlidesVisibility(boolean watchSlidesVisibility) {
        this.watchSlidesVisibility = watchSlidesVisibility;
    }

    public void setPreloadImages(boolean preloadImages) {
        this.preloadImages = preloadImages;
    }

    public void setUpdateOnImagesReady(boolean updateOnImagesReady) {
        this.updateOnImagesReady = updateOnImagesReady;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public void setLoopAdditionalSlides(double loopAdditionalSlides) {
        this.loopAdditionalSlides = loopAdditionalSlides;
    }

    public void setLoopedSlides(double loopedSlides) {
        this.loopedSlides = loopedSlides;
    }

    public void setLoopFillGroupWithBlank(boolean loopFillGroupWithBlank) {
        this.loopFillGroupWithBlank = loopFillGroupWithBlank;
    }

    public void setBreakpoints(Object breakpoints) {
        this.breakpoints = breakpoints;
    }

    public void setBreakpointsInverse(boolean breakpointsInverse) {
        this.breakpointsInverse = breakpointsInverse;
    }

    public void setObserver(boolean observer) {
        this.observer = observer;
    }

    public void setObserveParents(boolean observeParents) {
        this.observeParents = observeParents;
    }

    public void setObserveSlideChildren(boolean observeSlideChildren) {
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
