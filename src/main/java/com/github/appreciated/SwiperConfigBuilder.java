package com.github.appreciated;

import com.github.appreciated.config.Direction;

public class SwiperConfigBuilder {
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
    private Double slidesPerView;
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
    private String swipeHandler;
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

    private SwiperConfigBuilder() {
    }

    public static SwiperConfigBuilder get() {
        return new SwiperConfigBuilder();
    }

    public SwiperConfigBuilder withInit(Boolean init) {
        this.init = init;
        return this;
    }

    public SwiperConfigBuilder withInitialSlide(Double initialSlide) {
        this.initialSlide = initialSlide;
        return this;
    }

    public SwiperConfigBuilder withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    public SwiperConfigBuilder withSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    public SwiperConfigBuilder withSetWrapperSize(Boolean setWrapperSize) {
        this.setWrapperSize = setWrapperSize;
        return this;
    }

    public SwiperConfigBuilder withVirtualTranslate(Boolean virtualTranslate) {
        this.virtualTranslate = virtualTranslate;
        return this;
    }

    public SwiperConfigBuilder withWidth(Double width) {
        this.width = width;
        return this;
    }

    public SwiperConfigBuilder withHeight(Double height) {
        this.height = height;
        return this;
    }

    public SwiperConfigBuilder withAutoHeight(Boolean autoHeight) {
        this.autoHeight = autoHeight;
        return this;
    }

    public SwiperConfigBuilder withRoundLengths(Boolean roundLengths) {
        this.roundLengths = roundLengths;
        return this;
    }

    public SwiperConfigBuilder withNested(Boolean nested) {
        this.nested = nested;
        return this;
    }

    public SwiperConfigBuilder withUniqueNavElements(Boolean uniqueNavElements) {
        this.uniqueNavElements = uniqueNavElements;
        return this;
    }

    public SwiperConfigBuilder withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public SwiperConfigBuilder withRunCallbacksOnInit(Boolean runCallbacksOnInit) {
        this.runCallbacksOnInit = runCallbacksOnInit;
        return this;
    }

    public SwiperConfigBuilder withWatchOverflow(Boolean watchOverflow) {
        this.watchOverflow = watchOverflow;
        return this;
    }

    public SwiperConfigBuilder withOn(Object on) {
        this.on = on;
        return this;
    }

    public SwiperConfigBuilder withSpaceBetween(Double spaceBetween) {
        this.spaceBetween = spaceBetween;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerView(Double slidesPerView) {
        this.slidesPerView = slidesPerView;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerColumn(Double slidesPerColumn) {
        this.slidesPerColumn = slidesPerColumn;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerColumnFill(String slidesPerColumnFill) {
        this.slidesPerColumnFill = slidesPerColumnFill;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerGroup(Double slidesPerGroup) {
        this.slidesPerGroup = slidesPerGroup;
        return this;
    }

    public SwiperConfigBuilder withCenteredSlides(Boolean centeredSlides) {
        this.centeredSlides = centeredSlides;
        return this;
    }

    public SwiperConfigBuilder withSlidesOffsetBefore(Double slidesOffsetBefore) {
        this.slidesOffsetBefore = slidesOffsetBefore;
        return this;
    }

    public SwiperConfigBuilder withSlidesOffsetAfter(Double slidesOffsetAfter) {
        this.slidesOffsetAfter = slidesOffsetAfter;
        return this;
    }

    public SwiperConfigBuilder withNormalizeSlideIndex(Boolean normalizeSlideIndex) {
        this.normalizeSlideIndex = normalizeSlideIndex;
        return this;
    }

    public SwiperConfigBuilder withCenterInsufficientSlides(Boolean centerInsufficientSlides) {
        this.centerInsufficientSlides = centerInsufficientSlides;
        return this;
    }

    public SwiperConfigBuilder withGrabCursor(Boolean grabCursor) {
        this.grabCursor = grabCursor;
        return this;
    }

    public SwiperConfigBuilder withTouchEventsTarget(String touchEventsTarget) {
        this.touchEventsTarget = touchEventsTarget;
        return this;
    }

    public SwiperConfigBuilder withTouchRatio(Double touchRatio) {
        this.touchRatio = touchRatio;
        return this;
    }

    public SwiperConfigBuilder withTouchAngle(Double touchAngle) {
        this.touchAngle = touchAngle;
        return this;
    }

    public SwiperConfigBuilder withSimulateTouch(Boolean simulateTouch) {
        this.simulateTouch = simulateTouch;
        return this;
    }

    public SwiperConfigBuilder withShortSwipes(Boolean shortSwipes) {
        this.shortSwipes = shortSwipes;
        return this;
    }

    public SwiperConfigBuilder withLongSwipes(Boolean longSwipes) {
        this.longSwipes = longSwipes;
        return this;
    }

    public SwiperConfigBuilder withLongSwipesRatio(Double longSwipesRatio) {
        this.longSwipesRatio = longSwipesRatio;
        return this;
    }

    public SwiperConfigBuilder withLongSwipesMs(Double longSwipesMs) {
        this.longSwipesMs = longSwipesMs;
        return this;
    }

    public SwiperConfigBuilder withFollowFinger(Boolean followFinger) {
        this.followFinger = followFinger;
        return this;
    }

    public SwiperConfigBuilder withAllowTouchMove(Boolean allowTouchMove) {
        this.allowTouchMove = allowTouchMove;
        return this;
    }

    public SwiperConfigBuilder withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    public SwiperConfigBuilder withTouchStartPreventDefault(Boolean touchStartPreventDefault) {
        this.touchStartPreventDefault = touchStartPreventDefault;
        return this;
    }

    public SwiperConfigBuilder withTouchStartForcePreventDefault(Boolean touchStartForcePreventDefault) {
        this.touchStartForcePreventDefault = touchStartForcePreventDefault;
        return this;
    }

    public SwiperConfigBuilder withTouchMoveStopPropagation(Boolean touchMoveStopPropagation) {
        this.touchMoveStopPropagation = touchMoveStopPropagation;
        return this;
    }

    public SwiperConfigBuilder withIOSEdgeSwipeDetection(Boolean iOSEdgeSwipeDetection) {
        this.iOSEdgeSwipeDetection = iOSEdgeSwipeDetection;
        return this;
    }

    public SwiperConfigBuilder withIOSEdgeSwipeThreshold(Double iOSEdgeSwipeThreshold) {
        this.iOSEdgeSwipeThreshold = iOSEdgeSwipeThreshold;
        return this;
    }

    public SwiperConfigBuilder withTouchReleaseOnEdges(Boolean touchReleaseOnEdges) {
        this.touchReleaseOnEdges = touchReleaseOnEdges;
        return this;
    }

    public SwiperConfigBuilder withPassiveListeners(Boolean passiveListeners) {
        this.passiveListeners = passiveListeners;
        return this;
    }

    public SwiperConfigBuilder withResistance(Boolean resistance) {
        this.resistance = resistance;
        return this;
    }

    public SwiperConfigBuilder withResistanceRatio(Double resistanceRatio) {
        this.resistanceRatio = resistanceRatio;
        return this;
    }

    public SwiperConfigBuilder withPreventInteractionOnTransition(Boolean preventInteractionOnTransition) {
        this.preventInteractionOnTransition = preventInteractionOnTransition;
        return this;
    }

    public SwiperConfigBuilder withAllowSlidePrev(Boolean allowSlidePrev) {
        this.allowSlidePrev = allowSlidePrev;
        return this;
    }

    public SwiperConfigBuilder withAllowSlideNext(Boolean allowSlideNext) {
        this.allowSlideNext = allowSlideNext;
        return this;
    }

    public SwiperConfigBuilder withNoSwiping(Boolean noSwiping) {
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

    public SwiperConfigBuilder withPreventClicks(Boolean preventClicks) {
        this.preventClicks = preventClicks;
        return this;
    }

    public SwiperConfigBuilder withPreventClicksPropagation(Boolean preventClicksPropagation) {
        this.preventClicksPropagation = preventClicksPropagation;
        return this;
    }

    public SwiperConfigBuilder withSlideToClickedSlide(Boolean slideToClickedSlide) {
        this.slideToClickedSlide = slideToClickedSlide;
        return this;
    }

    public SwiperConfigBuilder withFreeMode(Boolean freeMode) {
        this.freeMode = freeMode;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentum(Boolean freeModeMomentum) {
        this.freeModeMomentum = freeModeMomentum;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumRatio(Double freeModeMomentumRatio) {
        this.freeModeMomentumRatio = freeModeMomentumRatio;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumVelocityRatio(Double freeModeMomentumVelocityRatio) {
        this.freeModeMomentumVelocityRatio = freeModeMomentumVelocityRatio;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumBounce(Boolean freeModeMomentumBounce) {
        this.freeModeMomentumBounce = freeModeMomentumBounce;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMomentumBounceRatio(Double freeModeMomentumBounceRatio) {
        this.freeModeMomentumBounceRatio = freeModeMomentumBounceRatio;
        return this;
    }

    public SwiperConfigBuilder withFreeModeMinimumVelocity(Double freeModeMinimumVelocity) {
        this.freeModeMinimumVelocity = freeModeMinimumVelocity;
        return this;
    }

    public SwiperConfigBuilder withFreeModeSticky(Boolean freeModeSticky) {
        this.freeModeSticky = freeModeSticky;
        return this;
    }

    public SwiperConfigBuilder withWatchSlidesProgress(Boolean watchSlidesProgress) {
        this.watchSlidesProgress = watchSlidesProgress;
        return this;
    }

    public SwiperConfigBuilder withWatchSlidesVisibility(Boolean watchSlidesVisibility) {
        this.watchSlidesVisibility = watchSlidesVisibility;
        return this;
    }

    public SwiperConfigBuilder withPreloadImages(Boolean preloadImages) {
        this.preloadImages = preloadImages;
        return this;
    }

    public SwiperConfigBuilder withUpdateOnImagesReady(Boolean updateOnImagesReady) {
        this.updateOnImagesReady = updateOnImagesReady;
        return this;
    }

    public SwiperConfigBuilder withLoop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    public SwiperConfigBuilder withLoopAdditionalSlides(Double loopAdditionalSlides) {
        this.loopAdditionalSlides = loopAdditionalSlides;
        return this;
    }

    public SwiperConfigBuilder withLoopedSlides(Double loopedSlides) {
        this.loopedSlides = loopedSlides;
        return this;
    }

    public SwiperConfigBuilder withLoopFillGroupWithBlank(Boolean loopFillGroupWithBlank) {
        this.loopFillGroupWithBlank = loopFillGroupWithBlank;
        return this;
    }

    public SwiperConfigBuilder withBreakpoints(Object breakpoints) {
        this.breakpoints = breakpoints;
        return this;
    }

    public SwiperConfigBuilder withBreakpointsInverse(Boolean breakpointsInverse) {
        this.breakpointsInverse = breakpointsInverse;
        return this;
    }

    public SwiperConfigBuilder withObserver(Boolean observer) {
        this.observer = observer;
        return this;
    }

    public SwiperConfigBuilder withObserveParents(Boolean observeParents) {
        this.observeParents = observeParents;
        return this;
    }

    public SwiperConfigBuilder withObserveSlideChildren(Boolean observeSlideChildren) {
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
