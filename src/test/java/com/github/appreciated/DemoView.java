package com.github.appreciated;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.config.Direction;
import com.github.appreciated.config.builder.PaginationBuilder;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        setSizeFull();
        addHeader("Horizontal Swiper");
        addHorizontal();
        addHeader("Horizontal Swiper w. Pagination");
        addHorizontalWithPagination();
        addHeader("Horizontal Swiper w. auto Slides");
        addHorizontalMulti();
        addHeader("Horizontal Swiper w. auto Slides");
        addHorizontalMultiCentered();
        addHeader("Vertical Swiper");
        addVertical();
        setPadding(false);
        setMargin(false);
    }

    private void addHeader(String header) {
        add(new H2(header));
    }

    private void addHorizontal() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withAllowSlidePrev(true)
                .withAllowSlideNext(true)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addHorizontalWithPagination() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withPagination(PaginationBuilder.get().withEl(".swiper-pagination").build())
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addHorizontalMulti() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withSlidesPerView("auto")
                .withSpaceBetween(30.0)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addHorizontalMultiCentered() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withSlidesPerView("auto")
                .withCenteredSlides(true)
                .withSpaceBetween(30.0)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addVertical() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.VERTICAL)
                .withLoop(true).build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    RippleClickableCard getSlide() {
        RippleClickableCard slide = new RippleClickableCard();
        slide.setElevationOnActionEnabled(true);
        slide.getTemplateDiv().setWidth("300px");
        slide.getTemplateDiv().setHeight("150px");
        slide.add(new Label("Meow"));
        slide.setAlignItems(FlexComponent.Alignment.CENTER);
        slide.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        return slide;
    }

}

