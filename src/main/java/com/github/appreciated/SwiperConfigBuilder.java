package com.github.appreciated;

public class SwiperConfigBuilder {
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
    private double slidesPerView;
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
    private String swipeHandler;
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

    private SwiperConfigBuilder() {
    }

    public static SwiperConfigBuilder get() {
        return new SwiperConfigBuilder();
    }

    public SwiperConfigBuilder withInit(boolean init) {
        this.init = init;
        return this;
    }

    public SwiperConfigBuilder withInitialSlide(double initialSlide) {
        this.initialSlide = initialSlide;
        return this;
    }

    public SwiperConfigBuilder withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public SwiperConfigBuilder withSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public SwiperConfigBuilder withSetWrapperSize(boolean setWrapperSize) {
        this.setWrapperSize = setWrapperSize;
        return this;
    }

    public SwiperConfigBuilder withVirtualTranslate(boolean virtualTranslate) {
        this.virtualTranslate = virtualTranslate;
        return this;
    }

    public SwiperConfigBuilder withWidth(double width) {
        this.width = width;
        return this;
    }

    public SwiperConfigBuilder withHeight(double height) {
        this.height = height;
        return this;
    }

    public SwiperConfigBuilder withAutoHeight(boolean autoHeight) {
        this.autoHeight = autoHeight;
        return this;
    }

    public SwiperConfigBuilder withRoundLengths(boolean roundLengths) {
        this.roundLengths = roundLengths;
        return this;
    }

    public SwiperConfigBuilder withNested(boolean nested) {
        this.nested = nested;
        return this;
    }

    public SwiperConfigBuilder withUniqueNavElements(boolean uniqueNavElements) {
        this.uniqueNavElements = uniqueNavElements;
        return this;
    }

    public SwiperConfigBuilder withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public SwiperConfigBuilder withRunCallbacksOnInit(boolean runCallbacksOnInit) {
        this.runCallbacksOnInit = runCallbacksOnInit;
        return this;
    }

    public SwiperConfigBuilder withWatchOverflow(boolean watchOverflow) {
        this.watchOverflow = watchOverflow;
        return this;
    }

    public SwiperConfigBuilder withOn(Object on) {
        this.on = on;
        return this;
    }

    public SwiperConfigBuilder withSpaceBetween(double spaceBetween) {
        this.spaceBetween = spaceBetween;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerView(double slidesPerView) {
        this.slidesPerView = slidesPerView;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerColumn(double slidesPerColumn) {
        this.slidesPerColumn = slidesPerColumn;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerColumnFill(String slidesPerColumnFill) {
        this.slidesPerColumnFill = slidesPerColumnFill;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerGroup(double slidesPerGroup) {
        this.slidesPerGroup = slidesPerGroup;
        return this;
    }

    public SwiperConfigBuilder withCenteredSlides(boolean centeredSlides) {
        this.centeredSlides = centeredSlides;
        return this;
    }

    public SwiperConfigBuilder withSlidesOffsetBefore(double slidesOffsetBefore) {
        this.slidesOffsetBefore = slidesOffsetBefore;
        return this;
    }

    public SwiperConfigBuilder withSlidesOffsetAfter(double slidesOffsetAfter) {
        this.slidesOffsetAfter = slidesOffsetAfter;
        return this;
    }

    public SwiperConfigBuilder withNormalizeSlideIndex(boolean normalizeSlideIndex) {
        this.normalizeSlideIndex = normalizeSlideIndex;
        return this;
    }

    public SwiperConfigBuilder withCenterInsufficientSlides(boolean centerInsufficientSlides) {
        this.centerInsufficientSlides = centerInsufficientSlides;
        return this;
    }

    public SwiperConfigBuilder withGrabCursor(boolean grabCursor) {
        this.grabCursor = grabCursor;
        return this;
    }

    public SwiperConfigBuilder withTouchEventsTarget(String touchEventsTarget) {
        this.touchEventsTarget = touchEventsTarget;
        return this;
    }

    public SwiperConfigBuilder withTouchRatio(double touchRatio) {
        this.touchRatio = touchRatio;
        return this;
    }

    public SwiperConfigBuilder withTouchAngle(double touchAngle) {
        this.touchAngle = touchAngle;
        return this;
    }

    public SwiperConfigBuilder withSimulateTouch(boolean simulateTouch) {
        this.simulateTouch = simulateTouch;
        return this;
    }

    public SwiperConfigBuilder withShortSwipes(boolean shortSwipes) {
        this.shortSwipes = shortSwipes;
        return this;
    }

    public SwiperConfigBuilder withLongSwipes(boolean longSwipes) {
        this.longSwipes = longSwipes;
        return this;
    }

    public SwiperConfigBuilder withLongSwipesRatio(double longSwipesRatio) {
        this.longSwipesRatio = longSwipesRatio;
        return this;
    }

    public SwiperConfigBuilder withLongSwipesMs(double longSwipesMs) {
        this.longSwipesMs = longSwipesMs;
        return this;
    }

    public SwiperConfigBuilder withFollowFinger(boolean followFinger) {
        this.followFinger = followFinger;
        return this;
    }

    public SwiperConfigBuilder withAllowTouchMove(boolean allowTouchMove) {
        this.allowTouchMove = allowTouchMove;
        return this;
    }

    public SwiperConfigBuilder withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    public SwiperConfigBuilder withTouchStartPreventDefault(boolean touchStartPreventDefault) {
        this.touchStartPreventDefault = touchStartPreventDefault;
        return this;
    }

    public SwiperConfigBuilder withTouchStartForcePreventDefault(boolean touchStartForcePreventDefault) {
        this.touchStartForcePreventDefault = touchStartForcePreventDefault;
        return this;
    }

    public SwiperConfigBuilder withTouchMoveStopPropagation(boolean touchMoveStopPropagation) {
        this.touchMoveStopPropagation = touchMoveStopPropagation;
        return this;
    }

    public SwiperConfigBuilder withIOSEdgeSwipeDetection(boolean iOSEdgeSwipeDetection) {
        this.iOSEdgeSwipeDetection = iOSEdgeSwipeDetection;
        return this;
    }

    public SwiperConfigBuilder withIOSEdgeSwipeThreshold(double iOSEdgeSwipeThreshold) {
        this.iOSEdgeSwipeThreshold = iOSEdgeSwipeThreshold;
        return this;
    }

    public SwiperConfigBuilder withTouchReleaseOnEdges(boolean touchReleaseOnEdges) {
        this.touchReleaseOnEdges = touchReleaseOnEdges;
        return this;
    }

    public SwiperConfigBuilder withPassiveListeners(boolean passiveListeners) {
        this.passiveListeners = passiveListeners;
        return this;
    }

    public SwiperConfigBuilder withResistance(boolean resistance) {
        this.resistance = resistance;
        return this;
    }

    public SwiperConfigBuilder withResistanceRatio(double resistanceRatio) {
        this.resistanceRatio = resistanceRatio;
        return this;
    }

    public SwiperConfigBuilder withPreventInteractionOnTransition(boolean preventInteractionOnTransition) {
        this.preventInteractionOnTransition = preventInteractionOnTransition;
        return this;
    }

    public SwiperConfigBuilder withAllowSlidePrev(boolean allowSlidePrev) {
        this.allowSlidePrev = allowSlidePrev;
        return this;
    }

    public SwiperConfigBuilder withAllowSlideNext(boolean allowSlideNext) {
        this.allowSlideNext = allowSlideNext;
        return this;
    }

    public SwiperConfigBuilder withNoSwiping(boolean noSwiping) {
        this.noSwiping = noSwiping;
        return this;
    }

    public SwiperConfigBuilder withNoSwipingClass(String noSwipingClass) {
        this.noSwipingClass = noSwipingClass;
        return this;
    }

    public SwiperConfigBuilder withNoSwipingSelector(String noSwipingSelector) {
        this.noSwipingSelector = noSwipingSelector;
        return this;
    }

    public SwiperConfigBuilder withSwipeHandler(String swipeHandler) {
        this.swipeHandler = swipeHandler;
        return this;
    }

    public SwiperConfigBuilder withPreventClicks(boolean preventClicks) {
        this.preventClicks = preventClicks;
        return this;
    }

    public SwiperConfigBuilder withPreventClicksPropagation(boolean preventClicksPropagation) {
        this.preventClicksPropagation = preventClicksPropagation;
        return this;
    }

    public SwiperConfigBuilder withSlideToClickedSlide(boolean slideToClickedSlide) {
        this.slideToClickedSlide = slideToClickedSlide;
        return this;
    }

    public SwiperConfigBuilder withFreeMode(boolean freeMode) {
        this.freeMode = freeMode;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentum(boolean freeModeMomentum) {
        this.freeModeMomentum = freeModeMomentum;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumRatio(double freeModeMomentumRatio) {
        this.freeModeMomentumRatio = freeModeMomentumRatio;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumVelocityRatio(double freeModeMomentumVelocityRatio) {
        this.freeModeMomentumVelocityRatio = freeModeMomentumVelocityRatio;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumBounce(boolean freeModeMomentumBounce) {
        this.freeModeMomentumBounce = freeModeMomentumBounce;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumBounceRatio(double freeModeMomentumBounceRatio) {
        this.freeModeMomentumBounceRatio = freeModeMomentumBounceRatio;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMinimumVelocity(double freeModeMinimumVelocity) {
        this.freeModeMinimumVelocity = freeModeMinimumVelocity;
        return this;
    }

    public SwiperConfigBuilder withFreeModeSticky(boolean freeModeSticky) {
        this.freeModeSticky = freeModeSticky;
        return this;
    }

    public SwiperConfigBuilder withWatchSlidesProgress(boolean watchSlidesProgress) {
        this.watchSlidesProgress = watchSlidesProgress;
        return this;
    }

    public SwiperConfigBuilder withWatchSlidesVisibility(boolean watchSlidesVisibility) {
        this.watchSlidesVisibility = watchSlidesVisibility;
        return this;
    }

    public SwiperConfigBuilder withPreloadImages(boolean preloadImages) {
        this.preloadImages = preloadImages;
        return this;
    }

    public SwiperConfigBuilder withUpdateOnImagesReady(boolean updateOnImagesReady) {
        this.updateOnImagesReady = updateOnImagesReady;
        return this;
    }

    public SwiperConfigBuilder withLoop(boolean loop) {
        this.loop = loop;
        return this;
    }

    public SwiperConfigBuilder withLoopAdditionalSlides(double loopAdditionalSlides) {
        this.loopAdditionalSlides = loopAdditionalSlides;
        return this;
    }

    public SwiperConfigBuilder withLoopedSlides(double loopedSlides) {
        this.loopedSlides = loopedSlides;
        return this;
    }

    public SwiperConfigBuilder withLoopFillGroupWithBlank(boolean loopFillGroupWithBlank) {
        this.loopFillGroupWithBlank = loopFillGroupWithBlank;
        return this;
    }

    public SwiperConfigBuilder withBreakpoints(Object breakpoints) {
        this.breakpoints = breakpoints;
        return this;
    }

    public SwiperConfigBuilder withBreakpointsInverse(boolean breakpointsInverse) {
        this.breakpointsInverse = breakpointsInverse;
        return this;
    }

    public SwiperConfigBuilder withObserver(boolean observer) {
        this.observer = observer;
        return this;
    }

    public SwiperConfigBuilder withObserveParents(boolean observeParents) {
        this.observeParents = observeParents;
        return this;
    }

    public SwiperConfigBuilder withObserveSlideChildren(boolean observeSlideChildren) {
        this.observeSlideChildren = observeSlideChildren;
        return this;
    }

    public SwiperConfigBuilder withContainerModifierClass(String containerModifierClass) {
        this.containerModifierClass = containerModifierClass;
        return this;
    }

    public SwiperConfigBuilder withSlideClass(String slideClass) {
        this.slideClass = slideClass;
        return this;
    }

    public SwiperConfigBuilder withSlideActiveClass(String slideActiveClass) {
        this.slideActiveClass = slideActiveClass;
        return this;
    }

    public SwiperConfigBuilder withSlideDuplicateActiveClass(String slideDuplicateActiveClass) {
        this.slideDuplicateActiveClass = slideDuplicateActiveClass;
        return this;
    }

    public SwiperConfigBuilder withSlideVisibleClass(String slideVisibleClass) {
        this.slideVisibleClass = slideVisibleClass;
        return this;
    }

    public SwiperConfigBuilder withSlideDuplicateClass(String slideDuplicateClass) {
        this.slideDuplicateClass = slideDuplicateClass;
        return this;
    }

    public SwiperConfigBuilder withSlideNextClass(String slideNextClass) {
        this.slideNextClass = slideNextClass;
        return this;
    }

    public SwiperConfigBuilder withSlideDuplicateNextClass(String slideDuplicateNextClass) {
        this.slideDuplicateNextClass = slideDuplicateNextClass;
        return this;
    }

    public SwiperConfigBuilder withSlidePrevClass(String slidePrevClass) {
        this.slidePrevClass = slidePrevClass;
        return this;
    }

    public SwiperConfigBuilder withSlideDuplicatePrevClass(String slideDuplicatePrevClass) {
        this.slideDuplicatePrevClass = slideDuplicatePrevClass;
        return this;
    }

    public SwiperConfigBuilder withWrapperClass(String wrapperClass) {
        this.wrapperClass = wrapperClass;
        return this;
    }

    public SwiperConfig build() {
        SwiperConfig swiper = new SwiperConfig();
        swiper.setInit(init);
        swiper.setInitialSlide(initialSlide);
        swiper.setDirection(direction);
        swiper.setSpeed(speed);
        swiper.setSetWrapperSize(setWrapperSize);
        swiper.setVirtualTranslate(virtualTranslate);
        swiper.setWidth(width);
        swiper.setHeight(height);
        swiper.setAutoHeight(autoHeight);
        swiper.setRoundLengths(roundLengths);
        swiper.setNested(nested);
        swiper.setUniqueNavElements(uniqueNavElements);
        swiper.setEffect(effect);
        swiper.setRunCallbacksOnInit(runCallbacksOnInit);
        swiper.setWatchOverflow(watchOverflow);
        swiper.setOn(on);
        swiper.setSpaceBetween(spaceBetween);
        swiper.setSlidesPerView(slidesPerView);
        swiper.setSlidesPerColumn(slidesPerColumn);
        swiper.setSlidesPerColumnFill(slidesPerColumnFill);
        swiper.setSlidesPerGroup(slidesPerGroup);
        swiper.setCenteredSlides(centeredSlides);
        swiper.setSlidesOffsetBefore(slidesOffsetBefore);
        swiper.setSlidesOffsetAfter(slidesOffsetAfter);
        swiper.setNormalizeSlideIndex(normalizeSlideIndex);
        swiper.setCenterInsufficientSlides(centerInsufficientSlides);
        swiper.setGrabCursor(grabCursor);
        swiper.setTouchEventsTarget(touchEventsTarget);
        swiper.setTouchRatio(touchRatio);
        swiper.setTouchAngle(touchAngle);
        swiper.setSimulateTouch(simulateTouch);
        swiper.setShortSwipes(shortSwipes);
        swiper.setLongSwipes(longSwipes);
        swiper.setLongSwipesRatio(longSwipesRatio);
        swiper.setLongSwipesMs(longSwipesMs);
        swiper.setFollowFinger(followFinger);
        swiper.setAllowTouchMove(allowTouchMove);
        swiper.setThreshold(threshold);
        swiper.setTouchStartPreventDefault(touchStartPreventDefault);
        swiper.setTouchStartForcePreventDefault(touchStartForcePreventDefault);
        swiper.setTouchMoveStopPropagation(touchMoveStopPropagation);
        swiper.setIOSEdgeSwipeDetection(iOSEdgeSwipeDetection);
        swiper.setIOSEdgeSwipeThreshold(iOSEdgeSwipeThreshold);
        swiper.setTouchReleaseOnEdges(touchReleaseOnEdges);
        swiper.setPassiveListeners(passiveListeners);
        swiper.setResistance(resistance);
        swiper.setResistanceRatio(resistanceRatio);
        swiper.setPreventInteractionOnTransition(preventInteractionOnTransition);
        swiper.setAllowSlidePrev(allowSlidePrev);
        swiper.setAllowSlideNext(allowSlideNext);
        swiper.setNoSwiping(noSwiping);
        swiper.setNoSwipingClass(noSwipingClass);
        swiper.setNoSwipingSelector(noSwipingSelector);
        swiper.setSwipeHandler(swipeHandler);
        swiper.setPreventClicks(preventClicks);
        swiper.setPreventClicksPropagation(preventClicksPropagation);
        swiper.setSlideToClickedSlide(slideToClickedSlide);
        swiper.setFreeMode(freeMode);
        swiper.setFreeModeMomentum(freeModeMomentum);
        swiper.setFreeModeMomentumRatio(freeModeMomentumRatio);
        swiper.setFreeModeMomentumVelocityRatio(freeModeMomentumVelocityRatio);
        swiper.setFreeModeMomentumBounce(freeModeMomentumBounce);
        swiper.setFreeModeMomentumBounceRatio(freeModeMomentumBounceRatio);
        swiper.setFreeModeMinimumVelocity(freeModeMinimumVelocity);
        swiper.setFreeModeSticky(freeModeSticky);
        swiper.setWatchSlidesProgress(watchSlidesProgress);
        swiper.setWatchSlidesVisibility(watchSlidesVisibility);
        swiper.setPreloadImages(preloadImages);
        swiper.setUpdateOnImagesReady(updateOnImagesReady);
        swiper.setLoop(loop);
        swiper.setLoopAdditionalSlides(loopAdditionalSlides);
        swiper.setLoopedSlides(loopedSlides);
        swiper.setLoopFillGroupWithBlank(loopFillGroupWithBlank);
        swiper.setBreakpoints(breakpoints);
        swiper.setBreakpointsInverse(breakpointsInverse);
        swiper.setObserver(observer);
        swiper.setObserveParents(observeParents);
        swiper.setObserveSlideChildren(observeSlideChildren);
        swiper.setContainerModifierClass(containerModifierClass);
        swiper.setSlideClass(slideClass);
        swiper.setSlideActiveClass(slideActiveClass);
        swiper.setSlideDuplicateActiveClass(slideDuplicateActiveClass);
        swiper.setSlideVisibleClass(slideVisibleClass);
        swiper.setSlideDuplicateClass(slideDuplicateClass);
        swiper.setSlideNextClass(slideNextClass);
        swiper.setSlideDuplicateNextClass(slideDuplicateNextClass);
        swiper.setSlidePrevClass(slidePrevClass);
        swiper.setSlideDuplicatePrevClass(slideDuplicatePrevClass);
        swiper.setWrapperClass(wrapperClass);
        return swiper;
    }
}
