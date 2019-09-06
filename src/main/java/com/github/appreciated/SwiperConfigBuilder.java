package com.github.appreciated;

import com.github.appreciated.config.*;

public class SwiperConfigBuilder {
    private Autoplay autoplay;
    private Controller controller;
    private CoverflowEffect coverflowEffect;
    private CubeEffect cubeEffect;
    private FadeEffect fadeEffect;
    private FlipEffect flipEffect;
    private HistoryNavigation historyNavigation;
    private KeyboardControl keyboardControl;
    private LazyLoading lazyLoading;
    private MousewheelControl mousewheelControl;
    private Navigation navigation;
    private Pagination pagination;
    private Parallax parallax;
    private Scrollbar scrollbar;
    private Thumbs thumbs;
    private Zoom zoom;
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
    private String slidesPerView;
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
    private Accessibility accessibility;

    private SwiperConfigBuilder() {
    }

    public static SwiperConfigBuilder get() {
        return new SwiperConfigBuilder();
    }

    public SwiperConfigBuilder withAutoplay(Autoplay autoplay) {
        this.autoplay = autoplay;
        return this;
    }

    public SwiperConfigBuilder withController(Controller controller) {
        this.controller = controller;
        return this;
    }

    public SwiperConfigBuilder withCoverflowEffect(CoverflowEffect coverflowEffect) {
        this.coverflowEffect = coverflowEffect;
        return this;
    }

    public SwiperConfigBuilder withCubeEffect(CubeEffect cubeEffect) {
        this.cubeEffect = cubeEffect;
        return this;
    }

    public SwiperConfigBuilder withFadeEffect(FadeEffect fadeEffect) {
        this.fadeEffect = fadeEffect;
        return this;
    }

    public SwiperConfigBuilder withFlipEffect(FlipEffect flipEffect) {
        this.flipEffect = flipEffect;
        return this;
    }

    public SwiperConfigBuilder withHistoryNavigation(HistoryNavigation historyNavigation) {
        this.historyNavigation = historyNavigation;
        return this;
    }

    public SwiperConfigBuilder withKeyboardControl(KeyboardControl keyboardControl) {
        this.keyboardControl = keyboardControl;
        return this;
    }

    public SwiperConfigBuilder withLazyLoading(LazyLoading lazyLoading) {
        this.lazyLoading = lazyLoading;
        return this;
    }

    public SwiperConfigBuilder withMousewheelControl(MousewheelControl mousewheelControl) {
        this.mousewheelControl = mousewheelControl;
        return this;
    }

    public SwiperConfigBuilder withNavigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }

    public SwiperConfigBuilder withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    public SwiperConfigBuilder withParallax(Parallax parallax) {
        this.parallax = parallax;
        return this;
    }

    public SwiperConfigBuilder withScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
        return this;
    }

    public SwiperConfigBuilder withThumbs(Thumbs thumbs) {
        this.thumbs = thumbs;
        return this;
    }

    public SwiperConfigBuilder withZoom(Zoom zoom) {
        this.zoom = zoom;
        return this;
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

    public SwiperConfigBuilder withSlidesPerView(String slidesPerView) {
        this.slidesPerView = slidesPerView;
        return this;
    }

    public SwiperConfigBuilder withSlidesPerView(int slidesPerView) {
        this.slidesPerView = String.valueOf(slidesPerView);
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

    /**
     * Also know as infinite scrolling Do not use this method with Webcomponents that keep state in JS since these will lose their state! once they are swapped to the back/top
     *
     * @param loop whether the elements should be appended to the back / the front once these are not visible anymore
     * @return fluent builder
     */
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

    public SwiperConfigBuilder withAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
        return this;
    }

    public SwiperConfig build() {
        SwiperConfig swiperConfig = new SwiperConfig();
        swiperConfig.setAutoplay(autoplay);
        swiperConfig.setController(controller);
        swiperConfig.setCoverflowEffect(coverflowEffect);
        swiperConfig.setCubeEffect(cubeEffect);
        swiperConfig.setFadeEffect(fadeEffect);
        swiperConfig.setFlipEffect(flipEffect);
        swiperConfig.setHistoryNavigation(historyNavigation);
        swiperConfig.setKeyboardControl(keyboardControl);
        swiperConfig.setLazyLoading(lazyLoading);
        swiperConfig.setMousewheelControl(mousewheelControl);
        swiperConfig.setNavigation(navigation);
        swiperConfig.setPagination(pagination);
        swiperConfig.setParallax(parallax);
        swiperConfig.setScrollbar(scrollbar);
        swiperConfig.setThumbs(thumbs);
        swiperConfig.setZoom(zoom);
        swiperConfig.setInit(init);
        swiperConfig.setInitialSlide(initialSlide);
        swiperConfig.setDirection(direction);
        swiperConfig.setSpeed(speed);
        swiperConfig.setSetWrapperSize(setWrapperSize);
        swiperConfig.setVirtualTranslate(virtualTranslate);
        swiperConfig.setWidth(width);
        swiperConfig.setHeight(height);
        swiperConfig.setAutoHeight(autoHeight);
        swiperConfig.setRoundLengths(roundLengths);
        swiperConfig.setNested(nested);
        swiperConfig.setUniqueNavElements(uniqueNavElements);
        swiperConfig.setEffect(effect);
        swiperConfig.setRunCallbacksOnInit(runCallbacksOnInit);
        swiperConfig.setWatchOverflow(watchOverflow);
        swiperConfig.setOn(on);
        swiperConfig.setSpaceBetween(spaceBetween);
        swiperConfig.setSlidesPerView(slidesPerView);
        swiperConfig.setSlidesPerColumn(slidesPerColumn);
        swiperConfig.setSlidesPerColumnFill(slidesPerColumnFill);
        swiperConfig.setSlidesPerGroup(slidesPerGroup);
        swiperConfig.setCenteredSlides(centeredSlides);
        swiperConfig.setSlidesOffsetBefore(slidesOffsetBefore);
        swiperConfig.setSlidesOffsetAfter(slidesOffsetAfter);
        swiperConfig.setNormalizeSlideIndex(normalizeSlideIndex);
        swiperConfig.setCenterInsufficientSlides(centerInsufficientSlides);
        swiperConfig.setGrabCursor(grabCursor);
        swiperConfig.setTouchEventsTarget(touchEventsTarget);
        swiperConfig.setTouchRatio(touchRatio);
        swiperConfig.setTouchAngle(touchAngle);
        swiperConfig.setSimulateTouch(simulateTouch);
        swiperConfig.setShortSwipes(shortSwipes);
        swiperConfig.setLongSwipes(longSwipes);
        swiperConfig.setLongSwipesRatio(longSwipesRatio);
        swiperConfig.setLongSwipesMs(longSwipesMs);
        swiperConfig.setFollowFinger(followFinger);
        swiperConfig.setAllowTouchMove(allowTouchMove);
        swiperConfig.setThreshold(threshold);
        swiperConfig.setTouchStartPreventDefault(touchStartPreventDefault);
        swiperConfig.setTouchStartForcePreventDefault(touchStartForcePreventDefault);
        swiperConfig.setTouchMoveStopPropagation(touchMoveStopPropagation);
        swiperConfig.setIOSEdgeSwipeDetection(iOSEdgeSwipeDetection);
        swiperConfig.setIOSEdgeSwipeThreshold(iOSEdgeSwipeThreshold);
        swiperConfig.setTouchReleaseOnEdges(touchReleaseOnEdges);
        swiperConfig.setPassiveListeners(passiveListeners);
        swiperConfig.setResistance(resistance);
        swiperConfig.setResistanceRatio(resistanceRatio);
        swiperConfig.setPreventInteractionOnTransition(preventInteractionOnTransition);
        swiperConfig.setAllowSlidePrev(allowSlidePrev);
        swiperConfig.setAllowSlideNext(allowSlideNext);
        swiperConfig.setNoSwiping(noSwiping);
        swiperConfig.setNoSwipingClass(noSwipingClass);
        swiperConfig.setNoSwipingSelector(noSwipingSelector);
        swiperConfig.setSwipeHandler(swipeHandler);
        swiperConfig.setPreventClicks(preventClicks);
        swiperConfig.setPreventClicksPropagation(preventClicksPropagation);
        swiperConfig.setSlideToClickedSlide(slideToClickedSlide);
        swiperConfig.setFreeMode(freeMode);
        swiperConfig.setFreeModeMomentum(freeModeMomentum);
        swiperConfig.setFreeModeMomentumRatio(freeModeMomentumRatio);
        swiperConfig.setFreeModeMomentumVelocityRatio(freeModeMomentumVelocityRatio);
        swiperConfig.setFreeModeMomentumBounce(freeModeMomentumBounce);
        swiperConfig.setFreeModeMomentumBounceRatio(freeModeMomentumBounceRatio);
        swiperConfig.setFreeModeMinimumVelocity(freeModeMinimumVelocity);
        swiperConfig.setFreeModeSticky(freeModeSticky);
        swiperConfig.setWatchSlidesProgress(watchSlidesProgress);
        swiperConfig.setWatchSlidesVisibility(watchSlidesVisibility);
        swiperConfig.setPreloadImages(preloadImages);
        swiperConfig.setUpdateOnImagesReady(updateOnImagesReady);
        swiperConfig.setLoop(loop);
        swiperConfig.setLoopAdditionalSlides(loopAdditionalSlides);
        swiperConfig.setLoopedSlides(loopedSlides);
        swiperConfig.setLoopFillGroupWithBlank(loopFillGroupWithBlank);
        swiperConfig.setBreakpoints(breakpoints);
        swiperConfig.setBreakpointsInverse(breakpointsInverse);
        swiperConfig.setObserver(observer);
        swiperConfig.setObserveParents(observeParents);
        swiperConfig.setObserveSlideChildren(observeSlideChildren);
        swiperConfig.setContainerModifierClass(containerModifierClass);
        swiperConfig.setSlideClass(slideClass);
        swiperConfig.setSlideActiveClass(slideActiveClass);
        swiperConfig.setSlideDuplicateActiveClass(slideDuplicateActiveClass);
        swiperConfig.setSlideVisibleClass(slideVisibleClass);
        swiperConfig.setSlideDuplicateClass(slideDuplicateClass);
        swiperConfig.setSlideNextClass(slideNextClass);
        swiperConfig.setSlideDuplicateNextClass(slideDuplicateNextClass);
        swiperConfig.setSlidePrevClass(slidePrevClass);
        swiperConfig.setSlideDuplicatePrevClass(slideDuplicatePrevClass);
        swiperConfig.setWrapperClass(wrapperClass);
        swiperConfig.setAccessibility(accessibility);
        return swiperConfig;
    }
}